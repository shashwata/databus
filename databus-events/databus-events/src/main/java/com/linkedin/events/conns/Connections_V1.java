/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.conns;

@SuppressWarnings("all")
/** Auto-generated Avro schema for conns.sy$connections. Generated at Sep 15, 2011 09:42:26 AM PDT */
public class Connections_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Connections_V1\",\"namespace\":\"com.linkedin.events.conns\",\"fields\":[{\"name\":\"txn\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"sourceId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=SOURCE_ID;dbFieldPosition=2;\"},{\"name\":\"destId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=DEST_ID;dbFieldPosition=3;\"},{\"name\":\"active\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVE;dbFieldPosition=4;\"},{\"name\":\"modifiedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MODIFIED_DATE;dbFieldPosition=5;\"},{\"name\":\"createDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATE_DATE;dbFieldPosition=6;\"}],\"meta\":\"dbFieldName=conns.sy$connections;\"}");
  public java.lang.Integer txn;
  public java.lang.CharSequence key;
  public java.lang.Integer sourceId;
  public java.lang.Integer destId;
  public java.lang.CharSequence active;
  public java.lang.Long modifiedDate;
  public java.lang.Long createDate;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return sourceId;
    case 3: return destId;
    case 4: return active;
    case 5: return modifiedDate;
    case 6: return createDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Integer)value$; break;
    case 1: key = (java.lang.CharSequence)value$; break;
    case 2: sourceId = (java.lang.Integer)value$; break;
    case 3: destId = (java.lang.Integer)value$; break;
    case 4: active = (java.lang.CharSequence)value$; break;
    case 5: modifiedDate = (java.lang.Long)value$; break;
    case 6: createDate = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}