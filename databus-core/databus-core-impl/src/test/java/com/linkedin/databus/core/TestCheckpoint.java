package com.linkedin.databus.core;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.testng.annotations.Test;

public class TestCheckpoint
{


  @Test
  public void testCheckpoint()
  {
      try
      {
        @SuppressWarnings("unused")
		Checkpoint cp = new Checkpoint("{\"scn\":1234, \"scnMessageOffset\":34}");
      }
      catch (JsonParseException e)
      {
        fail("Should not throw JSON parse exception");
        e.printStackTrace();
      }
      catch (JsonMappingException e)
      {
        fail("Should not throw JSON parse exception");
        e.printStackTrace();
      }
      catch (IOException e)
      {
        fail("Should not throw JSON parse exception");
        e.printStackTrace();
      }

  }

  //@Test
  public void testSetScn()
  {
    fail("Not yet implemented");
  }

  //@Test
  public void testSetScnMessageOffset()
  {
    fail("Not yet implemented");
  }

  //@Test
  public void testGetScn()
  {
    fail("Not yet implemented");
  }

  //@Test
  public void testGetScnMessageOffset()
  {
    fail("Not yet implemented");
  }

  @Test
  public void testInit() {
    Checkpoint cp = new Checkpoint();
    assertEquals(cp.getInit(), true);
    cp.setWindowScn(1234L);
    cp.setWindowOffset(123);
    cp.setConsumptionMode(DbusClientMode.ONLINE_CONSUMPTION);
    assertEquals(cp.getInit(), false);
    cp.init();
    assertEquals(cp.getInit(), true);
  }

  @Test
  public void testSerialize() throws JsonParseException, JsonMappingException, IOException
  {
    Checkpoint cp = new Checkpoint();
    cp.setWindowScn(1234L);
    cp.setWindowOffset(5677);
    cp.setSnapshotOffset(23342L);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    cp.serialize(baos);
    //System.out.println("Serialized String="+ baos.toString());
    Checkpoint newCp = new Checkpoint(baos.toString());
    assertEquals(cp.getWindowScn(),newCp.getWindowScn());
    assertEquals(cp.getWindowOffset(), newCp.getWindowOffset());
    assertEquals(cp.getSnapshotOffset(), newCp.getSnapshotOffset());
  }

  @Test
  public void testLargeOffsets()
  {
	    Checkpoint cp = new Checkpoint();
	    cp.setConsumptionMode(DbusClientMode.BOOTSTRAP_SNAPSHOT);
	    cp.setWindowScn(1234L);
	    cp.setWindowOffset(Long.MAX_VALUE-1);
	    cp.onSnapshotEvent(Long.MAX_VALUE-2);
	    cp.bootstrapCheckPoint();
	    String expected = 
	    		"{\"windowOffset\":9223372036854775806,\"prevScn\":-1,\"snapshot_offset\":9223372036854775805,\"windowScn\":1234,\"consumption_mode\":\"BOOTSTRAP_SNAPSHOT\"}";
	    
	    Assert.assertEquals("Checkpoint with large bootstrap offsets",expected, cp.toString());
	    System.out.println(cp);
  }
}
