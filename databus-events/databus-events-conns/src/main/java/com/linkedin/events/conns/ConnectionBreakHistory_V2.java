/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.conns;
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
/** Auto-generated Avro schema for conns.sy$connection_break_history. Generated at Feb 10, 2012 05:39:48 PM PST */
public class ConnectionBreakHistory_V2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"ConnectionBreakHistory_V2\",\"namespace\":\"com.linkedin.events.conns\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"breakerId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=BREAKER_ID;dbFieldPosition=2;\"},{\"name\":\"breakeeId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=BREAKEE_ID;dbFieldPosition=3;\"},{\"name\":\"isFromCs\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=IS_FROM_CS;dbFieldPosition=4;\"},{\"name\":\"createDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATE_DATE;dbFieldPosition=5;\"}],\"meta\":\"dbFieldName=conns.sy$connection_break_history;\"}");
  public java.lang.Long txn;
  public java.lang.CharSequence key;
  public java.lang.Long breakerId;
  public java.lang.Long breakeeId;
  public java.lang.CharSequence isFromCs;
  public java.lang.Long createDate;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return breakerId;
    case 3: return breakeeId;
    case 4: return isFromCs;
    case 5: return createDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: key = (java.lang.CharSequence)value$; break;
    case 2: breakerId = (java.lang.Long)value$; break;
    case 3: breakeeId = (java.lang.Long)value$; break;
    case 4: isFromCs = (java.lang.CharSequence)value$; break;
    case 5: createDate = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
