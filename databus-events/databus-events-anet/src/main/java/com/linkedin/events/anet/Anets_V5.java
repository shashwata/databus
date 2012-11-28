/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.anet;

@SuppressWarnings("all")
/** Auto-generated Avro schema for anet.sy$anets_5. Generated at Sep 15, 2011 03:21:33 AM PDT */
public class Anets_V5 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Anets_V5\",\"namespace\":\"com.linkedin.events.anet\",\"fields\":[{\"name\":\"txn\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"anetId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ANET_ID;dbFieldPosition=2;\"},{\"name\":\"anetType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ANET_TYPE;dbFieldPosition=3;\"},{\"name\":\"entityId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ENTITY_ID;dbFieldPosition=4;\"},{\"name\":\"state\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STATE;dbFieldPosition=5;\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=NAME;dbFieldPosition=6;\"},{\"name\":\"locale\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LOCALE;dbFieldPosition=7;\"},{\"name\":\"createdAt\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATED_AT;dbFieldPosition=8;\"},{\"name\":\"updatedAt\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=UPDATED_AT;dbFieldPosition=9;\"},{\"name\":\"urlKey\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=URL_KEY;dbFieldPosition=10;\"},{\"name\":\"privateKey\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PRIVATE_KEY;dbFieldPosition=11;\"},{\"name\":\"ownerId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=OWNER_ID;dbFieldPosition=12;\"},{\"name\":\"shortDescription\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SHORT_DESCRIPTION;dbFieldPosition=13;\"},{\"name\":\"description\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DESCRIPTION;dbFieldPosition=14;\"},{\"name\":\"largeLogoId\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LARGE_LOGO_ID;dbFieldPosition=15;\"},{\"name\":\"smallLogoId\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SMALL_LOGO_ID;dbFieldPosition=16;\"},{\"name\":\"vanityUrl\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=VANITY_URL;dbFieldPosition=17;\"},{\"name\":\"category\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CATEGORY;dbFieldPosition=18;\"},{\"name\":\"otherCategory\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=OTHER_CATEGORY;dbFieldPosition=19;\"},{\"name\":\"contactEmail\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CONTACT_EMAIL;dbFieldPosition=20;\"},{\"name\":\"homeSite\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=HOME_SITE;dbFieldPosition=21;\"},{\"name\":\"geo\",\"type\":[{\"type\":\"record\",\"name\":\"DATABUS_GEO_T\",\"fields\":[{\"name\":\"country\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COUNTRY;dbFieldPosition=0;\"},{\"name\":\"postalCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=POSTAL_CODE;dbFieldPosition=1;\"},{\"name\":\"geoPostalCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_POSTAL_CODE;dbFieldPosition=2;\"},{\"name\":\"regionCode\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=REGION_CODE;dbFieldPosition=3;\"},{\"name\":\"geoPlaceCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_PLACE_CODE;dbFieldPosition=4;\"},{\"name\":\"geoPlaceMaskCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_PLACE_MASK_CODE;dbFieldPosition=5;\"},{\"name\":\"latitudeDeg\",\"type\":[\"float\",\"null\"],\"meta\":\"dbFieldName=LATITUDE_DEG;dbFieldPosition=6;\"},{\"name\":\"longitudeDeg\",\"type\":[\"float\",\"null\"],\"meta\":\"dbFieldName=LONGITUDE_DEG;dbFieldPosition=7;\"}]},\"null\"],\"meta\":\"dbFieldName=GEO;dbFieldPosition=22;\"},{\"name\":\"anetSize\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ANET_SIZE;dbFieldPosition=23;\"},{\"name\":\"settings\",\"type\":[{\"type\":\"record\",\"name\":\"SETTINGS_T\",\"fields\":[{\"name\":\"settings\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"settingT\",\"fields\":[{\"name\":\"entityId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ENTITY_ID;dbFieldPosition=0;\"},{\"name\":\"settingId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=SETTING_ID;dbFieldPosition=1;\"},{\"name\":\"settingValue\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SETTING_VALUE;dbFieldPosition=2;\"},{\"name\":\"dateCreated\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=DATE_CREATED;dbFieldPosition=3;\"},{\"name\":\"dateModified\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=DATE_MODIFIED;dbFieldPosition=4;\"}],\"meta\":\"dbFieldName=SETTINGS;dbFieldPosition=0;\"}}}]},\"null\"],\"meta\":\"dbFieldName=SETTINGS;dbFieldPosition=24;\"},{\"name\":\"parentAnetId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=PARENT_ANET_ID;dbFieldPosition=25;\"}],\"meta\":\"dbFieldName=anet.sy$anets_5;\"}");
  public java.lang.Integer txn;
  public java.lang.Integer key;
  public java.lang.Integer anetId;
  public java.lang.CharSequence anetType;
  public java.lang.Integer entityId;
  public java.lang.CharSequence state;
  public java.lang.CharSequence name;
  public java.lang.CharSequence locale;
  public java.lang.Long createdAt;
  public java.lang.Long updatedAt;
  public java.lang.CharSequence urlKey;
  public java.lang.CharSequence privateKey;
  public java.lang.Integer ownerId;
  public java.lang.CharSequence shortDescription;
  public java.lang.CharSequence description;
  public java.lang.CharSequence largeLogoId;
  public java.lang.CharSequence smallLogoId;
  public java.lang.CharSequence vanityUrl;
  public java.lang.CharSequence category;
  public java.lang.CharSequence otherCategory;
  public java.lang.CharSequence contactEmail;
  public java.lang.CharSequence homeSite;
  public com.linkedin.events.anet.DATABUS_GEO_T geo;
  public java.lang.Integer anetSize;
  public com.linkedin.events.anet.SETTINGS_T settings;
  public java.lang.Integer parentAnetId;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return anetId;
    case 3: return anetType;
    case 4: return entityId;
    case 5: return state;
    case 6: return name;
    case 7: return locale;
    case 8: return createdAt;
    case 9: return updatedAt;
    case 10: return urlKey;
    case 11: return privateKey;
    case 12: return ownerId;
    case 13: return shortDescription;
    case 14: return description;
    case 15: return largeLogoId;
    case 16: return smallLogoId;
    case 17: return vanityUrl;
    case 18: return category;
    case 19: return otherCategory;
    case 20: return contactEmail;
    case 21: return homeSite;
    case 22: return geo;
    case 23: return anetSize;
    case 24: return settings;
    case 25: return parentAnetId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Integer)value$; break;
    case 1: key = (java.lang.Integer)value$; break;
    case 2: anetId = (java.lang.Integer)value$; break;
    case 3: anetType = (java.lang.CharSequence)value$; break;
    case 4: entityId = (java.lang.Integer)value$; break;
    case 5: state = (java.lang.CharSequence)value$; break;
    case 6: name = (java.lang.CharSequence)value$; break;
    case 7: locale = (java.lang.CharSequence)value$; break;
    case 8: createdAt = (java.lang.Long)value$; break;
    case 9: updatedAt = (java.lang.Long)value$; break;
    case 10: urlKey = (java.lang.CharSequence)value$; break;
    case 11: privateKey = (java.lang.CharSequence)value$; break;
    case 12: ownerId = (java.lang.Integer)value$; break;
    case 13: shortDescription = (java.lang.CharSequence)value$; break;
    case 14: description = (java.lang.CharSequence)value$; break;
    case 15: largeLogoId = (java.lang.CharSequence)value$; break;
    case 16: smallLogoId = (java.lang.CharSequence)value$; break;
    case 17: vanityUrl = (java.lang.CharSequence)value$; break;
    case 18: category = (java.lang.CharSequence)value$; break;
    case 19: otherCategory = (java.lang.CharSequence)value$; break;
    case 20: contactEmail = (java.lang.CharSequence)value$; break;
    case 21: homeSite = (java.lang.CharSequence)value$; break;
    case 22: geo = (com.linkedin.events.anet.DATABUS_GEO_T)value$; break;
    case 23: anetSize = (java.lang.Integer)value$; break;
    case 24: settings = (com.linkedin.events.anet.SETTINGS_T)value$; break;
    case 25: parentAnetId = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
