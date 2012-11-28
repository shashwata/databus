/**
 *
 */
package com.linkedin.databus.bootstrap.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.linkedin.databus.bootstrap.api.BootstrapProcessingException;
import com.linkedin.databus.bootstrap.api.BootstrapProducerStatus;
import com.linkedin.databus2.core.container.request.BootstrapDBException;
import com.linkedin.databus2.core.container.request.BootstrapDatabaseTooOldException;
import com.linkedin.databus2.util.DBHelper;

/**
 * @author ksurlake
 *
 */
// TODO: This shall be where the connection pooling is implemented and all bootstrap
// processor
// shall just have a handle to this connection pool instead of creating instances of this
// class
public class BootstrapConn
{
  private Connection         _bootstrapConn;
  private String             _url;
  private boolean            _autoCommit;
  private int                _isolationLevel;
  private PreparedStatement  _maxridStmt;

  public static final String MODULE = BootstrapConn.class.getName();
  public static final Logger LOG    = Logger.getLogger(MODULE);
  private static final String MAXRID_QUERY = "select maxrid from bootstrap_loginfo where srcid = ? and logid = ?";
  
  public BootstrapConn()
  {
    _bootstrapConn = null;
  }

  public Connection getDBConn()
  	throws SQLException
  {
	if ( (null == _bootstrapConn) || (_bootstrapConn.isClosed()))
	{
		createNewBootstrapConnection();
	}
    return _bootstrapConn;
  }

  public String getSrcTableName(int srcId)
  {
    return "tab_" + srcId;
  }

  public String getLogTableNameToProduce(int srcId) throws SQLException
  {
    return "log_" + srcId + "_" + getProducerLogId(srcId);
  }

  public String getLogTableNameToApply(int srcId) throws SQLException
  {
    return "log_" + srcId + "_" + getApplyLogId(srcId);
  }

  public String getLogTableName(int logId, int srcId)
  {
    return "log_" + srcId + "_" + logId;
  }

  private int getLogId(int srcId, String tab) throws SQLException
  {
    int logid = -1;
    Connection conn = getDBConn();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try
    {
      stmt =
          conn.prepareStatement("SELECT logid from " + tab + " where srcid = ?");
      stmt.setInt(1, srcId);
      stmt.executeQuery();

      rs = stmt.getResultSet();

      while (rs.next())
      {
        logid = rs.getInt(1);
      }
    }
    catch (SQLException e)
    {
      LOG.error("Error encountered while selecting logid from " + tab, e);
      throw e;
    } finally {
    	DBHelper.close(rs, stmt, null);
    }

    return logid;
  }

  private int getProducerLogId(int srcId) throws SQLException
  {
    return getLogId(srcId, "bootstrap_producer_state");
  }

  private int getApplyLogId(int srcId) throws SQLException
  {
    return getLogId(srcId, "bootstrap_applier_state");
  }
  
  public long executeQueryAndGetLong(String query, long defaultVal)
  	throws SQLException
  {
	  Statement stmt  = null;
	  Connection conn = getDBConn();
	  ResultSet rs = null;
	  
	  long res  = defaultVal;
	  try
	  {
		  stmt = conn.createStatement();
		  rs = stmt.executeQuery(query);
		  
		  if ( rs.next() )
		  {
			  res = rs.getLong(1);
		  }
	  } finally {
		  DBHelper.close(rs,stmt,null);
	  }
	  return res;
  }
  

  public void executeDDL(String sql)
		  throws SQLException
  {
	  Statement stmt = null;

	  LOG.info("Executing DDL command :" + sql);

	  try
	  {
		  stmt = _bootstrapConn.createStatement();
		  int rs = stmt.executeUpdate(sql);
		  _bootstrapConn.commit();
		  LOG.info("Executed Commmand (" + sql + ") with result " + rs);
	  } finally {
		  DBHelper.close(stmt);
	  }
  }
 

  public void executeUpdate(String sql)
		  throws SQLException
  {
	  Statement stmt = null;

	  LOG.info("Executing update command :" + sql);

	  try
	  {
		  stmt = _bootstrapConn.createStatement();
		  int rs = stmt.executeUpdate(sql);
		  _bootstrapConn.commit();
		  LOG.info("Executed Commmand (" + sql + ") with result " + rs);
	  } finally {
		  DBHelper.close(stmt);
	  }
  }
  

  public void initBootstrapConn(boolean autoCommit,
                                int isolationLevel,
                                String userName,
                                String password,
                                String hostName,
                                String dbName)
    throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
  {
	  StringBuilder urlStr = new StringBuilder();
	 
      urlStr.append("jdbc:mysql://" + hostName); 
      
      if ( null != dbName )
          urlStr.append("/" + dbName); 
      
      urlStr.append("?user=").append(userName).append("&password=").append(password);
       
      _url = urlStr.toString();
      _autoCommit  = autoCommit;
     _isolationLevel = isolationLevel;

    Class.forName("com.mysql.jdbc.Driver").newInstance();
    createNewBootstrapConnection();
  }

  private void createNewBootstrapConnection()
  	throws SQLException
  {
    _bootstrapConn = DriverManager.getConnection(_url);
    _bootstrapConn.setAutoCommit(_autoCommit);
    _bootstrapConn.setTransactionIsolation(_isolationLevel);
  }

  public void initBootstrapConn(boolean autoCommit,
                                String userName,
                                String password,
                                String hostName,
                                String dbName)
    throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
  {
    initBootstrapConn(autoCommit, java.sql.Connection.TRANSACTION_REPEATABLE_READ, userName, password, hostName, dbName);
  }

  public void recreateConnection()
  	throws SQLException
  {
	  close();
	  createNewBootstrapConnection();
  }
 
  public void close() 
  {
	 DBHelper.close(_bootstrapConn);
     _bootstrapConn = null;
  }

  /*
   * Execute a test Query on MySQL DB
   */
  public void executeDummyBootstrapDBQuery()
    throws SQLException
  {
	  ResultSet rs = null;
	  Statement stmt = null;
	  String query = "select * from bootstrap_sources";
	  try
	  {
		  stmt = _bootstrapConn.createStatement();
		  rs = stmt.executeQuery(query);
		  while(rs.next())
		  {}
	  } catch (SQLException ex) {
		  LOG.error("Got Exception when executing dummy Query :" + query, ex);
		  throw ex;
	  } finally {
		  DBHelper.close(rs,stmt, null);
	  }
  }

  /*
   * Find the max row id of the log table. 
   * This is an approximate measure of the number of rows in the log table
   */
  public long getMaxRowIdForLog(int logid, int srcid)
  	throws SQLException
  {
	  long maxrid = 0;
	  
	  if ( null == _maxridStmt)
	  {
		  _maxridStmt = getDBConn().prepareStatement(MAXRID_QUERY);
	  }
	  
	  _maxridStmt.setInt(1, srcid);
	  _maxridStmt.setInt(2, logid);
	  
	  ResultSet rs = null;
	  try
	  {
		  rs = _maxridStmt.executeQuery();
		  
		  if ( rs.next() )
		  {
			  maxrid = rs.getLong(1);
		  }
	  } finally {
		  DBHelper.close(rs);
	  }
	  return maxrid;
  }

}
