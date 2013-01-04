/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.company;

@SuppressWarnings("all")
/** Auto-generated Avro schema for SY$COMPANY_NAME_SEARCH. Generated at Jun 21, 2012 11:29:33 PM PDT */
public class CompanyNameSearch_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"CompanyNameSearch_V1\",\"namespace\":\"com.linkedin.events.company\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"companyId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_ID;dbFieldPosition=2;\"},{\"name\":\"universalName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=UNIVERSAL_NAME;dbFieldPosition=3;\"},{\"name\":\"industry\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=INDUSTRY;dbFieldPosition=4;\"},{\"name\":\"companyUrl\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COMPANY_URL;dbFieldPosition=5;\"},{\"name\":\"companySize\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COMPANY_SIZE;dbFieldPosition=6;\"},{\"name\":\"exactSize\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=EXACT_SIZE;dbFieldPosition=7;\"},{\"name\":\"companyType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COMPANY_TYPE;dbFieldPosition=8;\"},{\"name\":\"symbol\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SYMBOL;dbFieldPosition=9;\"},{\"name\":\"exchangeSymbol\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=EXCHANGE_SYMBOL;dbFieldPosition=10;\"},{\"name\":\"active\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVE;dbFieldPosition=11;\"},{\"name\":\"companyNames\",\"type\":{\"type\":\"record\",\"name\":\"DATABUS_COMPANY_NAMES_T\",\"fields\":[{\"name\":\"companyNames\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"databusCompanyNameT\",\"fields\":[{\"name\":\"companyNameId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_NAME_ID;dbFieldPosition=0;\"},{\"name\":\"companyId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_ID;dbFieldPosition=1;\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=NAME;dbFieldPosition=2;\"},{\"name\":\"locale\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LOCALE;dbFieldPosition=3;\"},{\"name\":\"nameType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=NAME_TYPE;dbFieldPosition=4;\"},{\"name\":\"active\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVE;dbFieldPosition=5;\"}],\"meta\":\"dbFieldName=COMPANY_NAMES;dbFieldPosition=0;\"}}}]},\"meta\":\"dbFieldName=COMPANY_NAMES;dbFieldPosition=12;\"},{\"name\":\"companyRelationships\",\"type\":{\"type\":\"record\",\"name\":\"DATABUS_COMPANY_RELS_T\",\"fields\":[{\"name\":\"companyRelationships\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"databusCompanyRelT\",\"fields\":[{\"name\":\"relationshipId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=RELATIONSHIP_ID;dbFieldPosition=0;\"},{\"name\":\"companyId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_ID;dbFieldPosition=1;\"},{\"name\":\"relatedCompanyId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=RELATED_COMPANY_ID;dbFieldPosition=2;\"},{\"name\":\"startDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=START_DATE;dbFieldPosition=3;\"},{\"name\":\"endDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=END_DATE;dbFieldPosition=4;\"},{\"name\":\"relationshipType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=RELATIONSHIP_TYPE;dbFieldPosition=5;\"},{\"name\":\"state\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STATE;dbFieldPosition=6;\"},{\"name\":\"active\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVE;dbFieldPosition=7;\"}],\"meta\":\"dbFieldName=COMPANY_RELATIONSHIPS;dbFieldPosition=0;\"}}}]},\"meta\":\"dbFieldName=COMPANY_RELATIONSHIPS;dbFieldPosition=13;\"}],\"meta\":\"dbFieldName=SY$COMPANY_NAME_SEARCH;\"}");
  public java.lang.Long txn;
  public java.lang.Long key;
  public java.lang.Long companyId;
  public java.lang.CharSequence universalName;
  public java.lang.Long industry;
  public java.lang.CharSequence companyUrl;
  public java.lang.CharSequence companySize;
  public java.lang.Long exactSize;
  public java.lang.CharSequence companyType;
  public java.lang.CharSequence symbol;
  public java.lang.CharSequence exchangeSymbol;
  public java.lang.CharSequence active;
  public com.linkedin.events.company.DATABUS_COMPANY_NAMES_T companyNames;
  public com.linkedin.events.company.DATABUS_COMPANY_RELS_T companyRelationships;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return companyId;
    case 3: return universalName;
    case 4: return industry;
    case 5: return companyUrl;
    case 6: return companySize;
    case 7: return exactSize;
    case 8: return companyType;
    case 9: return symbol;
    case 10: return exchangeSymbol;
    case 11: return active;
    case 12: return companyNames;
    case 13: return companyRelationships;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: key = (java.lang.Long)value$; break;
    case 2: companyId = (java.lang.Long)value$; break;
    case 3: universalName = (java.lang.CharSequence)value$; break;
    case 4: industry = (java.lang.Long)value$; break;
    case 5: companyUrl = (java.lang.CharSequence)value$; break;
    case 6: companySize = (java.lang.CharSequence)value$; break;
    case 7: exactSize = (java.lang.Long)value$; break;
    case 8: companyType = (java.lang.CharSequence)value$; break;
    case 9: symbol = (java.lang.CharSequence)value$; break;
    case 10: exchangeSymbol = (java.lang.CharSequence)value$; break;
    case 11: active = (java.lang.CharSequence)value$; break;
    case 12: companyNames = (com.linkedin.events.company.DATABUS_COMPANY_NAMES_T)value$; break;
    case 13: companyRelationships = (com.linkedin.events.company.DATABUS_COMPANY_RELS_T)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}