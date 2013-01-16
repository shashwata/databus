/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.mbrpic;

@SuppressWarnings("all")
/** Auto-generated Avro schema for sy$MEMBER_PICTURE. Generated at Oct 15, 2012 03:52:21 PM PDT */
public class MemberPicture_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"MemberPicture_V1\",\"namespace\":\"com.linkedin.events.mbrpic\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"memberId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MEMBER_ID;dbFieldPosition=2;\"},{\"name\":\"masterPictureId\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MASTER_PICTURE_ID;dbFieldPosition=3;\"},{\"name\":\"croppedPictureId\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CROPPED_PICTURE_ID;dbFieldPosition=4;\"},{\"name\":\"changeCnt\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CHANGE_CNT;dbFieldPosition=5;\"},{\"name\":\"abuseCnt\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=ABUSE_CNT;dbFieldPosition=6;\"},{\"name\":\"pictureState\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PICTURE_STATE;dbFieldPosition=7;\"},{\"name\":\"hiddenByUsers\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=HIDDEN_BY_USERS;dbFieldPosition=8;\"},{\"name\":\"cropPointX\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CROP_POINT_X;dbFieldPosition=9;\"},{\"name\":\"cropPointY\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CROP_POINT_Y;dbFieldPosition=10;\"},{\"name\":\"cropXSize\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CROP_X_SIZE;dbFieldPosition=11;\"},{\"name\":\"cropYSize\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CROP_Y_SIZE;dbFieldPosition=12;\"},{\"name\":\"createdDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATED_DATE;dbFieldPosition=13;\"}],\"meta\":\"dbFieldName=sy$MEMBER_PICTURE;\"}");
  public java.lang.Long txn;
  public java.lang.Long key;
  public java.lang.Long memberId;
  public java.lang.CharSequence masterPictureId;
  public java.lang.CharSequence croppedPictureId;
  public java.lang.Long changeCnt;
  public java.lang.Long abuseCnt;
  public java.lang.CharSequence pictureState;
  public java.lang.CharSequence hiddenByUsers;
  public java.lang.Long cropPointX;
  public java.lang.Long cropPointY;
  public java.lang.Long cropXSize;
  public java.lang.Long cropYSize;
  public java.lang.Long createdDate;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return memberId;
    case 3: return masterPictureId;
    case 4: return croppedPictureId;
    case 5: return changeCnt;
    case 6: return abuseCnt;
    case 7: return pictureState;
    case 8: return hiddenByUsers;
    case 9: return cropPointX;
    case 10: return cropPointY;
    case 11: return cropXSize;
    case 12: return cropYSize;
    case 13: return createdDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: key = (java.lang.Long)value$; break;
    case 2: memberId = (java.lang.Long)value$; break;
    case 3: masterPictureId = (java.lang.CharSequence)value$; break;
    case 4: croppedPictureId = (java.lang.CharSequence)value$; break;
    case 5: changeCnt = (java.lang.Long)value$; break;
    case 6: abuseCnt = (java.lang.Long)value$; break;
    case 7: pictureState = (java.lang.CharSequence)value$; break;
    case 8: hiddenByUsers = (java.lang.CharSequence)value$; break;
    case 9: cropPointX = (java.lang.Long)value$; break;
    case 10: cropPointY = (java.lang.Long)value$; break;
    case 11: cropXSize = (java.lang.Long)value$; break;
    case 12: cropYSize = (java.lang.Long)value$; break;
    case 13: createdDate = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}