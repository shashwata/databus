REGISTER avro-1.4.1.jar;
REGISTER json-simple-1.1.jar;
REGISTER  jackson-mapper-asl-1.6.0.jar;
REGISTER  jackson-core-asl-1.6.0.jar;

ANETS = LOAD '$anets_infile' USING AvroStorage('schema','{"type":"record","name":"ANETS","namespace":"ANET","fields":[{"name":"ANET_ID","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':true,\'nullable\':false}"},{"name":"ANET_TYPE","type":"string","doc":"","default":"","attributes_json":"{\'type\':\'CHAR\',\'size\':4,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"ENTITY_ID","type":["null","long"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"STATE","type":"string","doc":"","default":"","attributes_json":"{\'type\':\'CHAR\',\'size\':4,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"NAME","type":"string","doc":"","default":"","attributes_json":"{\'type\':\'NVARCHAR2\',\'size\':300,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"LOCALE","type":"string","doc":"","default":"","attributes_json":"{\'type\':\'CHAR\',\'size\':4,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"IS_BETA_PARTICIPANT","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'CHAR\',\'size\':4,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"CREATED_AT","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'DATE\',\'size\':7,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"UPDATED_AT","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'DATE\',\'size\':7,\'delta\':true,\'pk\':false,\'nullable\':false}"},{"name":"TXN","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"OWNER_ID","type":["null","long"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"VISIBILITY","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"CONTACTABILITY","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"MAX_SIZE","type":["null","long"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"DIRECTORY_PRESENCE","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"URL_KEY","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"PRIVATE_KEY","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"SHORT_DESCRIPTION","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'NVARCHAR2\',\'size\':300,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"DESCRIPTION","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'NVARCHAR2\',\'size\':300,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"LARGE_LOGO_ID","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"SMALL_LOGO_ID","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"VANITY_URL","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'NVARCHAR2\',\'size\':300,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"CATEGORY","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'CHAR\',\'size\':4,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"OTHER_CATEGORY","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'NVARCHAR2\',\'size\':300,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"CONTACT_EMAIL","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"HOME_SITE","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'NVARCHAR2\',\'size\':300,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"COUNTRY","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'CHAR\',\'size\':4,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"POSTAL_CODE","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"GEO_PLACE_CODE","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"LATITUDE_DEG","type":["null","double"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"LONGITUDE_DEG","type":["null","double"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"REGION_CODE","type":["null","long"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"GEO_POSTAL_CODE","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"GEO_PLACE_MASK_CODE","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"ANET_SIZE","type":["null","long"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"HIDE_DISCUSSIONS","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'CHAR\',\'size\':4,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"PARENT_ANET_ID","type":["null","long"],"doc":"","default":null,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"RULES","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"},{"name":"URL_PATH","type":["null","string"],"doc":"","default":null,"attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':true}"}],"attributes_json":"{\'instance\':\'PANET\',\'dumpdate\':\'20120207221802\',\'isFull\':false,\'begin_date\':\'20120207180348\',\'end_date\':\'20120207221334\',\'total_records\':-1,\'oracle_scn\':\'\',\'oracle_time\':-1}"}');

SETTINGS = LOAD '$settings_infile' Using AvroStorage('schema', '{"type":"record","name":"MEMBER_ANET_SETTINGS","namespace":"ANET","fields":[{"name":"MEMBER_ID","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':true,\'nullable\':false}"},{"name":"ANET_ID","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':true,\'nullable\':false}"},{"name":"SETTING_ID","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'NUMBER\',\'size\':22,\'prec\':2,\'scale\':0,\'delta\':false,\'pk\':true,\'nullable\':false}"},{"name":"SETTING_VALUE","type":"string","doc":"","default":"","attributes_json":"{\'type\':\'VARCHAR2\',\'size\':100,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"DATE_CREATED","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'DATE\',\'size\':7,\'delta\':false,\'pk\':false,\'nullable\':false}"},{"name":"DATE_MODIFIED","type":"long","doc":"","default":0,"attributes_json":"{\'type\':\'DATE\',\'size\':7,\'delta\':true,\'pk\':false,\'nullable\':false}"}],"attributes_json":"{\'instance\':\'PANET\',\'dumpdate\':\'20120208064122\',\'isFull\':false,\'begin_date\':\'20120208022852\',\'end_date\':\'20120208063857\',\'total_records\':-1,\'oracle_scn\':\'\',\'oracle_time\':-1}"}');

-- Join 
j2 = join ANETS by ANET_ID LEFT OUTER, SETTINGS by ANET_ID PARALLEL 400;

-- txn,key, anetId, anetType, entityId, state, name, locale, CreatedAt, UpdatedAt, urlKey, privateKey, ownerId, shortDesc, desc ,largeLogo, smallLogo, vanityUrl,category, otherCategory, contactEmail, homeSite, geo.country, geo.postalCode,geo.geoPostalCode, geo.regionCode,geo.geoPlaceCode,geo.geoPlaceMaskCode, geo.latitudeDeg,geo.longitudeDeg,anetSize,settings.entityId,settings.settingId,settings.settingValue,settings.dateCreated,settings.dateModified,parentAnetId
D = foreach j2 generate ANETS::TXN,ANETS::ANET_ID as key,ANETS::ANET_ID,ANETS::ANET_TYPE,ANETS::ENTITY_ID,ANETS::STATE,ANETS::NAME,ANETS::LOCALE,(long) ANETS::CREATED_AT*1000,(long) ANETS::UPDATED_AT*1000,ANETS::URL_KEY,ANETS::PRIVATE_KEY,ANETS::OWNER_ID,ANETS::SHORT_DESCRIPTION,ANETS::DESCRIPTION,ANETS::LARGE_LOGO_ID,ANETS::SMALL_LOGO_ID,ANETS::VANITY_URL,ANETS::CATEGORY,ANETS::OTHER_CATEGORY,ANETS::CONTACT_EMAIL,ANETS::HOME_SITE,ANETS::COUNTRY,ANETS::POSTAL_CODE,ANETS::GEO_POSTAL_CODE,(int)ANETS::REGION_CODE,ANETS::GEO_PLACE_CODE,ANETS::GEO_PLACE_MASK_CODE,(float)ANETS::LATITUDE_DEG,(float)ANETS::LONGITUDE_DEG, ANETS::ANET_SIZE,SETTINGS::ANET_ID,SETTINGS::SETTING_ID,SETTINGS::SETTING_VALUE,(long) SETTINGS::DATE_CREATED*1000,(long) SETTINGS::DATE_MODIFIED*1000,ANETS::PARENT_ANET_ID;

describe D;

E = order D by key parallel 400;

store E into '$outfile' Using AvroStorage('schema', '{ "name" : "Anets_V6_Intermediate",  "doc" : "Auto-generated Avro schema for anet.sy\$anets_5. Generated at Feb 10, 2012 05:41:10 PM PST",  "type" : "record",  "meta" : "dbFieldName=anet.sy\$anets_5;",  "namespace" : "com.linkedin.events.anet",  "fields" : [ {    "name" : "txn",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=TXN;dbFieldPosition=0;"  }, {    "name" : "key",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=KEY;dbFieldPosition=1;"  }, {    "name" : "anetId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ANET_ID;dbFieldPosition=2;"  }, {    "name" : "anetType",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=ANET_TYPE;dbFieldPosition=3;"  }, {    "name" : "entityId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ENTITY_ID;dbFieldPosition=4;"  }, {    "name" : "state",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=STATE;dbFieldPosition=5;"  }, {    "name" : "name",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=NAME;dbFieldPosition=6;"  }, {    "name" : "locale",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=LOCALE;dbFieldPosition=7;"  }, {    "name" : "createdAt",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=CREATED_AT;dbFieldPosition=8;"  }, {    "name" : "updatedAt",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=UPDATED_AT;dbFieldPosition=9;"  }, {    "name" : "urlKey",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=URL_KEY;dbFieldPosition=10;"  }, {    "name" : "privateKey",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=PRIVATE_KEY;dbFieldPosition=11;"  }, {    "name" : "ownerId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=OWNER_ID;dbFieldPosition=12;"  }, {    "name" : "shortDescription",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=SHORT_DESCRIPTION;dbFieldPosition=13;"  }, {    "name" : "description",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=DESCRIPTION;dbFieldPosition=14;"  }, {    "name" : "largeLogoId",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=LARGE_LOGO_ID;dbFieldPosition=15;"  }, {    "name" : "smallLogoId",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=SMALL_LOGO_ID;dbFieldPosition=16;"  }, {    "name" : "vanityUrl",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=VANITY_URL;dbFieldPosition=17;"  }, {    "name" : "category",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=CATEGORY;dbFieldPosition=18;"  }, {    "name" : "otherCategory",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=OTHER_CATEGORY;dbFieldPosition=19;"  }, {    "name" : "contactEmail",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=CONTACT_EMAIL;dbFieldPosition=20;"  }, {    "name" : "homeSite",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=HOME_SITE;dbFieldPosition=21;"  }, {    "name" : "country",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=COUNTRY;dbFieldPosition=0;"  }, {    "name" : "postalCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=POSTAL_CODE;dbFieldPosition=1;"  }, {    "name" : "geoPostalCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=GEO_POSTAL_CODE;dbFieldPosition=2;"  }, {    "name" : "regionCode",    "type" : [ "int", "null" ],    "meta" : "dbFieldName=REGION_CODE;dbFieldPosition=3;"  }, {    "name" : "geoPlaceCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=GEO_PLACE_CODE;dbFieldPosition=4;"  }, {    "name" : "geoPlaceMaskCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=GEO_PLACE_MASK_CODE;dbFieldPosition=5;"  }, {    "name" : "latitudeDeg",    "type" : [ "float", "null" ],    "meta" : "dbFieldName=LATITUDE_DEG;dbFieldPosition=6;"  }, {    "name" : "longitudeDeg",    "type" : [ "float", "null" ],    "meta" : "dbFieldName=LONGITUDE_DEG;dbFieldPosition=7;"  }, {    "name" : "anetSize",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ANET_SIZE;dbFieldPosition=23;"  }, {    "name" : "settingsEntityId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ENTITY_ID;dbFieldPosition=0;"  }, {    "name" : "settingsSettingId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=SETTING_ID;dbFieldPosition=1;"  }, {    "name" : "settingsSettingValue",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=SETTING_VALUE;dbFieldPosition=2;"  }, {    "name" : "settingsDateCreated",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=DATE_CREATED;dbFieldPosition=3;"  }, {    "name" : "settingsDateModified",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=DATE_MODIFIED;dbFieldPosition=4;"  }, {    "name" : "parentAnetId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=PARENT_ANET_ID;dbFieldPosition=25;"  } ]}');

-- Dump 30 records to STDOUT
check = LOAD '$outfile' Using AvroStorage('schema', '{ "name" : "Anets_V6_Intermediate",  "doc" : "Auto-generated Avro schema for anet.sy\$anets_5. Generated at Feb 10, 2012 05:41:10 PM PST",  "type" : "record",  "meta" : "dbFieldName=anet.sy\$anets_5;",  "namespace" : "com.linkedin.events.anet",  "fields" : [ {    "name" : "txn",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=TXN;dbFieldPosition=0;"  }, {    "name" : "key",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=KEY;dbFieldPosition=1;"  }, {    "name" : "anetId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ANET_ID;dbFieldPosition=2;"  }, {    "name" : "anetType",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=ANET_TYPE;dbFieldPosition=3;"  }, {    "name" : "entityId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ENTITY_ID;dbFieldPosition=4;"  }, {    "name" : "state",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=STATE;dbFieldPosition=5;"  }, {    "name" : "name",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=NAME;dbFieldPosition=6;"  }, {    "name" : "locale",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=LOCALE;dbFieldPosition=7;"  }, {    "name" : "createdAt",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=CREATED_AT;dbFieldPosition=8;"  }, {    "name" : "updatedAt",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=UPDATED_AT;dbFieldPosition=9;"  }, {    "name" : "urlKey",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=URL_KEY;dbFieldPosition=10;"  }, {    "name" : "privateKey",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=PRIVATE_KEY;dbFieldPosition=11;"  }, {    "name" : "ownerId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=OWNER_ID;dbFieldPosition=12;"  }, {    "name" : "shortDescription",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=SHORT_DESCRIPTION;dbFieldPosition=13;"  }, {    "name" : "description",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=DESCRIPTION;dbFieldPosition=14;"  }, {    "name" : "largeLogoId",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=LARGE_LOGO_ID;dbFieldPosition=15;"  }, {    "name" : "smallLogoId",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=SMALL_LOGO_ID;dbFieldPosition=16;"  }, {    "name" : "vanityUrl",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=VANITY_URL;dbFieldPosition=17;"  }, {    "name" : "category",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=CATEGORY;dbFieldPosition=18;"  }, {    "name" : "otherCategory",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=OTHER_CATEGORY;dbFieldPosition=19;"  }, {    "name" : "contactEmail",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=CONTACT_EMAIL;dbFieldPosition=20;"  }, {    "name" : "homeSite",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=HOME_SITE;dbFieldPosition=21;"  }, {    "name" : "country",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=COUNTRY;dbFieldPosition=0;"  }, {    "name" : "postalCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=POSTAL_CODE;dbFieldPosition=1;"  }, {    "name" : "geoPostalCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=GEO_POSTAL_CODE;dbFieldPosition=2;"  }, {    "name" : "regionCode",    "type" : [ "int", "null" ],    "meta" : "dbFieldName=REGION_CODE;dbFieldPosition=3;"  }, {    "name" : "geoPlaceCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=GEO_PLACE_CODE;dbFieldPosition=4;"  }, {    "name" : "geoPlaceMaskCode",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=GEO_PLACE_MASK_CODE;dbFieldPosition=5;"  }, {    "name" : "latitudeDeg",    "type" : [ "float", "null" ],    "meta" : "dbFieldName=LATITUDE_DEG;dbFieldPosition=6;"  }, {    "name" : "longitudeDeg",    "type" : [ "float", "null" ],    "meta" : "dbFieldName=LONGITUDE_DEG;dbFieldPosition=7;"  }, {    "name" : "anetSize",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ANET_SIZE;dbFieldPosition=23;"  }, {    "name" : "settingsEntityId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=ENTITY_ID;dbFieldPosition=0;"  }, {    "name" : "settingsSettingId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=SETTING_ID;dbFieldPosition=1;"  }, {    "name" : "settingsSettingValue",    "type" : [ "string", "null" ],    "meta" : "dbFieldName=SETTING_VALUE;dbFieldPosition=2;"  }, {    "name" : "settingsDateCreated",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=DATE_CREATED;dbFieldPosition=3;"  }, {    "name" : "settingsDateModified",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=DATE_MODIFIED;dbFieldPosition=4;"  }, {    "name" : "parentAnetId",    "type" : [ "long", "null" ],    "meta" : "dbFieldName=PARENT_ANET_ID;dbFieldPosition=25;"  } ]}');
val = limit check 30;
dump val;