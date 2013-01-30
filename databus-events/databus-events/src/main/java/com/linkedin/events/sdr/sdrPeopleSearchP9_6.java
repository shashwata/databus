/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.sdr;
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
/** Auto-generated Avro schema for SY$SDR_PEOPLE_SEARCH_P9_6. Generated at May 06, 2011 05:11:14 PM PDT */
public class sdrPeopleSearchP9_6 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"sdrPeopleSearchP9_6\",\"namespace\":\"com.linkedin.events.sdr\",\"fields\":[{\"name\":\"txn\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"memberId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=MEMBER_ID;dbFieldPosition=2;\"},{\"name\":\"dateRegistered\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=DATE_REGISTERED;dbFieldPosition=3;\"},{\"name\":\"memberModifiedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MEMBER_MODIFIED_DATE;dbFieldPosition=4;\"},{\"name\":\"profileModifiedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=PROFILE_MODIFIED_DATE;dbFieldPosition=5;\"},{\"name\":\"lFirstName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_FIRST_NAME;dbFieldPosition=6;\"},{\"name\":\"lLastName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_LAST_NAME;dbFieldPosition=7;\"},{\"name\":\"lastNamePreference\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LAST_NAME_PREFERENCE;dbFieldPosition=8;\"},{\"name\":\"lHeadline\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_HEADLINE;dbFieldPosition=9;\"},{\"name\":\"userCreated\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=USER_CREATED;dbFieldPosition=10;\"},{\"name\":\"lSpecialties\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_SPECIALTIES;dbFieldPosition=11;\"},{\"name\":\"lExpertiseComment\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_EXPERTISE_COMMENT;dbFieldPosition=12;\"},{\"name\":\"active\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVE;dbFieldPosition=13;\"},{\"name\":\"lInterests\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_INTERESTS;dbFieldPosition=14;\"},{\"name\":\"lAssociations\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_ASSOCIATIONS;dbFieldPosition=15;\"},{\"name\":\"lHonors\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_HONORS;dbFieldPosition=16;\"},{\"name\":\"memberPositions1\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_POSITIONS_1;dbFieldPosition=17;\"},{\"name\":\"memberPositions2\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_POSITIONS_2;dbFieldPosition=18;\"},{\"name\":\"memberPositions3\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_POSITIONS_3;dbFieldPosition=19;\"},{\"name\":\"memberPositions\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_POSITIONS;dbFieldPosition=20;\"},{\"name\":\"memberEducations1\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_EDUCATIONS_1;dbFieldPosition=21;\"},{\"name\":\"memberEducations2\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_EDUCATIONS_2;dbFieldPosition=22;\"},{\"name\":\"memberEducations3\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_EDUCATIONS_3;dbFieldPosition=23;\"},{\"name\":\"memberEducations\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_EDUCATIONS;dbFieldPosition=24;\"},{\"name\":\"memberAnetIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"databusSdrAnetMbrT\",\"fields\":[{\"name\":\"membershipId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=MEMBERSHIP_ID;dbFieldPosition=0;\"},{\"name\":\"anetId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ANET_ID;dbFieldPosition=1;\"},{\"name\":\"anetIdType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ANET_ID_TYPE;dbFieldPosition=2;\"},{\"name\":\"isPrimaryAnet\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=IS_PRIMARY_ANET;dbFieldPosition=3;\"},{\"name\":\"state\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STATE;dbFieldPosition=4;\"},{\"name\":\"currency\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CURRENCY;dbFieldPosition=5;\"},{\"name\":\"currencyLock\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CURRENCY_LOCK;dbFieldPosition=6;\"},{\"name\":\"startDate\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=START_DATE;dbFieldPosition=7;\"},{\"name\":\"endDate\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=END_DATE;dbFieldPosition=8;\"},{\"name\":\"createdAt\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATED_AT;dbFieldPosition=9;\"},{\"name\":\"updatedAt\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=UPDATED_AT;dbFieldPosition=10;\"}],\"meta\":\"dbFieldName=MEMBER_ANET_IDS;dbFieldPosition=25;\"}}},{\"name\":\"industry\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=INDUSTRY;dbFieldPosition=26;\"},{\"name\":\"subscriberUntil\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=SUBSCRIBER_UNTIL;dbFieldPosition=27;\"},{\"name\":\"allowOpenlinkSearch\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ALLOW_OPENLINK_SEARCH;dbFieldPosition=28;\"},{\"name\":\"requireReferral\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=REQUIRE_REFERRAL;dbFieldPosition=29;\"},{\"name\":\"proposalAccepts\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=PROPOSAL_ACCEPTS;dbFieldPosition=30;\"},{\"name\":\"country\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COUNTRY;dbFieldPosition=31;\"},{\"name\":\"postalCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=POSTAL_CODE;dbFieldPosition=32;\"},{\"name\":\"geoPostalCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_POSTAL_CODE;dbFieldPosition=33;\"},{\"name\":\"regionCode\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=REGION_CODE;dbFieldPosition=34;\"},{\"name\":\"geoPlaceCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_PLACE_CODE;dbFieldPosition=35;\"},{\"name\":\"geoPlaceMaskCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_PLACE_MASK_CODE;dbFieldPosition=36;\"},{\"name\":\"latitudeDeg\",\"type\":[\"float\",\"null\"],\"meta\":\"dbFieldName=LATITUDE_DEG;dbFieldPosition=37;\"},{\"name\":\"longitudeDeg\",\"type\":[\"float\",\"null\"],\"meta\":\"dbFieldName=LONGITUDE_DEG;dbFieldPosition=38;\"},{\"name\":\"isEmailConfirmed\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=IS_EMAIL_CONFIRMED;dbFieldPosition=39;\"},{\"name\":\"numRecommenders\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=NUM_RECOMMENDERS;dbFieldPosition=40;\"},{\"name\":\"currentTitleIds\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CURRENT_TITLE_IDS;dbFieldPosition=41;\"},{\"name\":\"pastTitleIds\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PAST_TITLE_IDS;dbFieldPosition=42;\"},{\"name\":\"currentJobIds\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CURRENT_JOB_IDS;dbFieldPosition=43;\"},{\"name\":\"pastJobIds\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PAST_JOB_IDS;dbFieldPosition=44;\"},{\"name\":\"currentFareaIds\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CURRENT_FAREA_IDS;dbFieldPosition=45;\"},{\"name\":\"pastFareaIds\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PAST_FAREA_IDS;dbFieldPosition=46;\"},{\"name\":\"memberEmails\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"databusSdrEmailsMbrT\",\"fields\":[{\"name\":\"emailId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=EMAIL_ID;dbFieldPosition=0;\"},{\"name\":\"isPrimary\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=IS_PRIMARY;dbFieldPosition=1;\"},{\"name\":\"isConfirmed\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=IS_CONFIRMED;dbFieldPosition=2;\"},{\"name\":\"email\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=EMAIL;dbFieldPosition=3;\"}],\"meta\":\"dbFieldName=MEMBER_EMAILS;dbFieldPosition=47;\"}}},{\"name\":\"lMaidenName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=L_MAIDEN_NAME;dbFieldPosition=48;\"},{\"name\":\"restriction\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=RESTRICTION;dbFieldPosition=49;\"},{\"name\":\"hasPublicProfile\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=HAS_PUBLIC_PROFILE;dbFieldPosition=50;\"},{\"name\":\"seniorities\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SENIORITIES;dbFieldPosition=51;\"}],\"meta\":\"dbFieldName=SY$SDR_PEOPLE_SEARCH_P9_6;\"}");
  public java.lang.Integer txn;
  public java.lang.Integer key;
  public java.lang.Integer memberId;
  public java.lang.Long dateRegistered;
  public java.lang.Long memberModifiedDate;
  public java.lang.Long profileModifiedDate;
  public java.lang.CharSequence lFirstName;
  public java.lang.CharSequence lLastName;
  public java.lang.CharSequence lastNamePreference;
  public java.lang.CharSequence lHeadline;
  public java.lang.CharSequence userCreated;
  public java.lang.CharSequence lSpecialties;
  public java.lang.CharSequence lExpertiseComment;
  public java.lang.CharSequence active;
  public java.lang.CharSequence lInterests;
  public java.lang.CharSequence lAssociations;
  public java.lang.CharSequence lHonors;
  public java.lang.CharSequence memberPositions1;
  public java.lang.CharSequence memberPositions2;
  public java.lang.CharSequence memberPositions3;
  public java.lang.CharSequence memberPositions;
  public java.lang.CharSequence memberEducations1;
  public java.lang.CharSequence memberEducations2;
  public java.lang.CharSequence memberEducations3;
  public java.lang.CharSequence memberEducations;
  public java.util.List<com.linkedin.events.sdr.databusSdrAnetMbrT> memberAnetIds;
  public java.lang.Integer industry;
  public java.lang.Long subscriberUntil;
  public java.lang.CharSequence allowOpenlinkSearch;
  public java.lang.CharSequence requireReferral;
  public java.lang.Integer proposalAccepts;
  public java.lang.CharSequence country;
  public java.lang.CharSequence postalCode;
  public java.lang.CharSequence geoPostalCode;
  public java.lang.Integer regionCode;
  public java.lang.CharSequence geoPlaceCode;
  public java.lang.CharSequence geoPlaceMaskCode;
  public java.lang.Float latitudeDeg;
  public java.lang.Float longitudeDeg;
  public java.lang.CharSequence isEmailConfirmed;
  public java.lang.Integer numRecommenders;
  public java.lang.CharSequence currentTitleIds;
  public java.lang.CharSequence pastTitleIds;
  public java.lang.CharSequence currentJobIds;
  public java.lang.CharSequence pastJobIds;
  public java.lang.CharSequence currentFareaIds;
  public java.lang.CharSequence pastFareaIds;
  public java.util.List<com.linkedin.events.sdr.databusSdrEmailsMbrT> memberEmails;
  public java.lang.CharSequence lMaidenName;
  public java.lang.CharSequence restriction;
  public java.lang.CharSequence hasPublicProfile;
  public java.lang.CharSequence seniorities;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return memberId;
    case 3: return dateRegistered;
    case 4: return memberModifiedDate;
    case 5: return profileModifiedDate;
    case 6: return lFirstName;
    case 7: return lLastName;
    case 8: return lastNamePreference;
    case 9: return lHeadline;
    case 10: return userCreated;
    case 11: return lSpecialties;
    case 12: return lExpertiseComment;
    case 13: return active;
    case 14: return lInterests;
    case 15: return lAssociations;
    case 16: return lHonors;
    case 17: return memberPositions1;
    case 18: return memberPositions2;
    case 19: return memberPositions3;
    case 20: return memberPositions;
    case 21: return memberEducations1;
    case 22: return memberEducations2;
    case 23: return memberEducations3;
    case 24: return memberEducations;
    case 25: return memberAnetIds;
    case 26: return industry;
    case 27: return subscriberUntil;
    case 28: return allowOpenlinkSearch;
    case 29: return requireReferral;
    case 30: return proposalAccepts;
    case 31: return country;
    case 32: return postalCode;
    case 33: return geoPostalCode;
    case 34: return regionCode;
    case 35: return geoPlaceCode;
    case 36: return geoPlaceMaskCode;
    case 37: return latitudeDeg;
    case 38: return longitudeDeg;
    case 39: return isEmailConfirmed;
    case 40: return numRecommenders;
    case 41: return currentTitleIds;
    case 42: return pastTitleIds;
    case 43: return currentJobIds;
    case 44: return pastJobIds;
    case 45: return currentFareaIds;
    case 46: return pastFareaIds;
    case 47: return memberEmails;
    case 48: return lMaidenName;
    case 49: return restriction;
    case 50: return hasPublicProfile;
    case 51: return seniorities;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Integer)value$; break;
    case 1: key = (java.lang.Integer)value$; break;
    case 2: memberId = (java.lang.Integer)value$; break;
    case 3: dateRegistered = (java.lang.Long)value$; break;
    case 4: memberModifiedDate = (java.lang.Long)value$; break;
    case 5: profileModifiedDate = (java.lang.Long)value$; break;
    case 6: lFirstName = (java.lang.CharSequence)value$; break;
    case 7: lLastName = (java.lang.CharSequence)value$; break;
    case 8: lastNamePreference = (java.lang.CharSequence)value$; break;
    case 9: lHeadline = (java.lang.CharSequence)value$; break;
    case 10: userCreated = (java.lang.CharSequence)value$; break;
    case 11: lSpecialties = (java.lang.CharSequence)value$; break;
    case 12: lExpertiseComment = (java.lang.CharSequence)value$; break;
    case 13: active = (java.lang.CharSequence)value$; break;
    case 14: lInterests = (java.lang.CharSequence)value$; break;
    case 15: lAssociations = (java.lang.CharSequence)value$; break;
    case 16: lHonors = (java.lang.CharSequence)value$; break;
    case 17: memberPositions1 = (java.lang.CharSequence)value$; break;
    case 18: memberPositions2 = (java.lang.CharSequence)value$; break;
    case 19: memberPositions3 = (java.lang.CharSequence)value$; break;
    case 20: memberPositions = (java.lang.CharSequence)value$; break;
    case 21: memberEducations1 = (java.lang.CharSequence)value$; break;
    case 22: memberEducations2 = (java.lang.CharSequence)value$; break;
    case 23: memberEducations3 = (java.lang.CharSequence)value$; break;
    case 24: memberEducations = (java.lang.CharSequence)value$; break;
    case 25: memberAnetIds = (java.util.List<com.linkedin.events.sdr.databusSdrAnetMbrT>)value$; break;
    case 26: industry = (java.lang.Integer)value$; break;
    case 27: subscriberUntil = (java.lang.Long)value$; break;
    case 28: allowOpenlinkSearch = (java.lang.CharSequence)value$; break;
    case 29: requireReferral = (java.lang.CharSequence)value$; break;
    case 30: proposalAccepts = (java.lang.Integer)value$; break;
    case 31: country = (java.lang.CharSequence)value$; break;
    case 32: postalCode = (java.lang.CharSequence)value$; break;
    case 33: geoPostalCode = (java.lang.CharSequence)value$; break;
    case 34: regionCode = (java.lang.Integer)value$; break;
    case 35: geoPlaceCode = (java.lang.CharSequence)value$; break;
    case 36: geoPlaceMaskCode = (java.lang.CharSequence)value$; break;
    case 37: latitudeDeg = (java.lang.Float)value$; break;
    case 38: longitudeDeg = (java.lang.Float)value$; break;
    case 39: isEmailConfirmed = (java.lang.CharSequence)value$; break;
    case 40: numRecommenders = (java.lang.Integer)value$; break;
    case 41: currentTitleIds = (java.lang.CharSequence)value$; break;
    case 42: pastTitleIds = (java.lang.CharSequence)value$; break;
    case 43: currentJobIds = (java.lang.CharSequence)value$; break;
    case 44: pastJobIds = (java.lang.CharSequence)value$; break;
    case 45: currentFareaIds = (java.lang.CharSequence)value$; break;
    case 46: pastFareaIds = (java.lang.CharSequence)value$; break;
    case 47: memberEmails = (java.util.List<com.linkedin.events.sdr.databusSdrEmailsMbrT>)value$; break;
    case 48: lMaidenName = (java.lang.CharSequence)value$; break;
    case 49: restriction = (java.lang.CharSequence)value$; break;
    case 50: hasPublicProfile = (java.lang.CharSequence)value$; break;
    case 51: seniorities = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
