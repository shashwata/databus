/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.jobs;

@SuppressWarnings("all")
/** Auto-generated Avro schema for SY$JOB_MATCH_UPDATE. Generated at Jun 21, 2012 11:25:14 PM PDT */
public class JobMatchUpdate_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"JobMatchUpdate_V1\",\"namespace\":\"com.linkedin.events.jobs\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"state\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STATE;dbFieldPosition=2;\"},{\"name\":\"listDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=LIST_DATE;dbFieldPosition=3;\"},{\"name\":\"tmLastUpdatedTime\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TM_LAST_UPDATED_TIME;dbFieldPosition=4;\"}],\"meta\":\"dbFieldName=SY$JOB_MATCH_UPDATE;\"}");
  public java.lang.Long txn;
  public java.lang.Long key;
  public java.lang.CharSequence state;
  public java.lang.Long listDate;
  public java.lang.Long tmLastUpdatedTime;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return state;
    case 3: return listDate;
    case 4: return tmLastUpdatedTime;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: key = (java.lang.Long)value$; break;
    case 2: state = (java.lang.CharSequence)value$; break;
    case 3: listDate = (java.lang.Long)value$; break;
    case 4: tmLastUpdatedTime = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
