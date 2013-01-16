/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.fuse;

@SuppressWarnings("all")
/** Auto-generated Avro schema for sy$MEMBER_RESTRICTION. Generated at May 09, 2012 10:38:40 AM PDT */
public class MemberRestriction_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"MemberRestriction_V1\",\"namespace\":\"com.linkedin.events.fuse\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"memberId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MEMBER_ID;dbFieldPosition=1;\"},{\"name\":\"spamRestricted\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=SPAM_RESTRICTED;dbFieldPosition=2;\"},{\"name\":\"tsUtms\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TS_UTMS;dbFieldPosition=3;\"}],\"meta\":\"dbFieldName=sy$MEMBER_RESTRICTION;pk=memberId;\"}");
  public java.lang.Long txn;
  public java.lang.Long memberId;
  public java.lang.Long spamRestricted;
  public java.lang.Long tsUtms;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return memberId;
    case 2: return spamRestricted;
    case 3: return tsUtms;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: memberId = (java.lang.Long)value$; break;
    case 2: spamRestricted = (java.lang.Long)value$; break;
    case 3: tsUtms = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}