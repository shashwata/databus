/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.databus.bootstrap.server.monitoring.events;
/*
 *
 * Copyright 2013 LinkedIn Corp. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/


@SuppressWarnings("all")
/** Metrics for http interfaces of Bootstrap service for Databus V2  */
public class DbusBootstrapHttpStatsEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"DbusBootstrapHttpStatsEvent\",\"namespace\":\"com.linkedin.databus.bootstrap.monitoring.events\",\"fields\":[{\"name\":\"ownerId\",\"type\":\"int\",\"doc\":\"The id of the owner that generated the event\"},{\"name\":\"timestampLastResetMs\",\"type\":\"long\",\"doc\":\"unix timestamp of the last reset() call\"},{\"name\":\"timeSinceLastResetMs\",\"type\":\"long\",\"doc\":\"time in ms since the last reset() call\"},{\"name\":\"dimension\",\"type\":\"string\",\"doc\":\"dimension\"},{\"name\":\"numReqBootstrap\",\"type\":\"long\",\"doc\":\"number of successful bootstrap requests (snapshot+catchup) \"},{\"name\":\"numReqSnapshot\",\"type\":\"long\",\"doc\":\"number of successful snapshot bootstrap requests \"},{\"name\":\"numReqCatchup\",\"type\":\"long\",\"doc\":\"number of successful catchup bootstrap requests \"},{\"name\":\"numErrReqBootstrap\",\"type\":\"long\",\"doc\":\"number of erroneous bootstrap requests\"},{\"name\":\"numErrReqDatabaseTooOld\",\"type\":\"long\",\"doc\":\"number of requests where bootstrap db is too old\"},{\"name\":\"numErrSqlException\",\"type\":\"long\",\"doc\":\"number of erroneous requests due to sql exception \"},{\"name\":\"numReqStartSCN\",\"type\":\"long\",\"doc\":\"number of successful startSCN requests\"},{\"name\":\"numReqTargetSCN\",\"type\":\"long\",\"doc\":\"number of successful targetSCN requests\"},{\"name\":\"numErrStartSCN\",\"type\":\"long\",\"doc\":\"number of erroneous targetSCN requests\"},{\"name\":\"numErrTargetSCN\",\"type\":\"long\",\"doc\":\"number of erroneous targetSCN requests\"},{\"name\":\"latencySnapshot\",\"type\":\"long\",\"doc\":\"time taken by successful snapshot bootstrap requests\"},{\"name\":\"latencyCatchup\",\"type\":\"long\",\"doc\":\"time taken by successful catchup bootstrap requests\"},{\"name\":\"latencyStartSCN\",\"type\":\"long\",\"doc\":\"time taken by successful startSCN requests\"},{\"name\":\"latencyTargetSCN\",\"type\":\"long\",\"doc\":\"time taken by successful targetSCN requests\"},{\"name\":\"sizeBatch\",\"type\":\"long\",\"doc\":\"requested batch size in bootstrap requests\"},{\"name\":\"minBootstrapSCN\",\"type\":\"long\",\"doc\":\"minimum scn seen in bootstrap requests\"},{\"name\":\"maxBootstrapSCN\",\"type\":\"long\",\"doc\":\"maximum scn seen in  bootstrap requests\"}]}");
  /** The id of the owner that generated the event */
  public int ownerId;
  /** unix timestamp of the last reset() call */
  public long timestampLastResetMs;
  /** time in ms since the last reset() call */
  public long timeSinceLastResetMs;
  /** dimension */
  public java.lang.CharSequence dimension;
  /** number of successful bootstrap requests (snapshot+catchup)  */
  public long numReqBootstrap;
  /** number of successful snapshot bootstrap requests  */
  public long numReqSnapshot;
  /** number of successful catchup bootstrap requests  */
  public long numReqCatchup;
  /** number of erroneous bootstrap requests */
  public long numErrReqBootstrap;
  /** number of requests where bootstrap db is too old */
  public long numErrReqDatabaseTooOld;
  /** number of erroneous requests due to sql exception  */
  public long numErrSqlException;
  /** number of successful startSCN requests */
  public long numReqStartSCN;
  /** number of successful targetSCN requests */
  public long numReqTargetSCN;
  /** number of erroneous targetSCN requests */
  public long numErrStartSCN;
  /** number of erroneous targetSCN requests */
  public long numErrTargetSCN;
  /** time taken by successful snapshot bootstrap requests */
  public long latencySnapshot;
  /** time taken by successful catchup bootstrap requests */
  public long latencyCatchup;
  /** time taken by successful startSCN requests */
  public long latencyStartSCN;
  /** time taken by successful targetSCN requests */
  public long latencyTargetSCN;
  /** requested batch size in bootstrap requests */
  public long sizeBatch;
  /** minimum scn seen in bootstrap requests */
  public long minBootstrapSCN;
  /** maximum scn seen in  bootstrap requests */
  public long maxBootstrapSCN;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ownerId;
    case 1: return timestampLastResetMs;
    case 2: return timeSinceLastResetMs;
    case 3: return dimension;
    case 4: return numReqBootstrap;
    case 5: return numReqSnapshot;
    case 6: return numReqCatchup;
    case 7: return numErrReqBootstrap;
    case 8: return numErrReqDatabaseTooOld;
    case 9: return numErrSqlException;
    case 10: return numReqStartSCN;
    case 11: return numReqTargetSCN;
    case 12: return numErrStartSCN;
    case 13: return numErrTargetSCN;
    case 14: return latencySnapshot;
    case 15: return latencyCatchup;
    case 16: return latencyStartSCN;
    case 17: return latencyTargetSCN;
    case 18: return sizeBatch;
    case 19: return minBootstrapSCN;
    case 20: return maxBootstrapSCN;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ownerId = (java.lang.Integer)value$; break;
    case 1: timestampLastResetMs = (java.lang.Long)value$; break;
    case 2: timeSinceLastResetMs = (java.lang.Long)value$; break;
    case 3: dimension = (java.lang.CharSequence)value$; break;
    case 4: numReqBootstrap = (java.lang.Long)value$; break;
    case 5: numReqSnapshot = (java.lang.Long)value$; break;
    case 6: numReqCatchup = (java.lang.Long)value$; break;
    case 7: numErrReqBootstrap = (java.lang.Long)value$; break;
    case 8: numErrReqDatabaseTooOld = (java.lang.Long)value$; break;
    case 9: numErrSqlException = (java.lang.Long)value$; break;
    case 10: numReqStartSCN = (java.lang.Long)value$; break;
    case 11: numReqTargetSCN = (java.lang.Long)value$; break;
    case 12: numErrStartSCN = (java.lang.Long)value$; break;
    case 13: numErrTargetSCN = (java.lang.Long)value$; break;
    case 14: latencySnapshot = (java.lang.Long)value$; break;
    case 15: latencyCatchup = (java.lang.Long)value$; break;
    case 16: latencyStartSCN = (java.lang.Long)value$; break;
    case 17: latencyTargetSCN = (java.lang.Long)value$; break;
    case 18: sizeBatch = (java.lang.Long)value$; break;
    case 19: minBootstrapSCN = (java.lang.Long)value$; break;
    case 20: maxBootstrapSCN = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
