--------------------------------------------------------
--  File created - Wednesday-June-14-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table APP_USER
--------------------------------------------------------

  CREATE TABLE "APP_USER" 
   (	"ID" NUMBER, 
	"AGE" NUMBER, 
	"NAME" VARCHAR2(20 BYTE), 
	"SALARY" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table TRAINING_CATALOGUE
--------------------------------------------------------

  CREATE TABLE "TRAINING_CATALOGUE" 
   (	"TC_ID" NUMBER(*,0), 
	"TC_CODE" VARCHAR2(100 BYTE), 
	"TC_DESCRIPTION" VARCHAR2(100 BYTE), 
	"TC_TYPE" NUMBER(*,0), 
	"TC_STATUS" NUMBER(*,0), 
	"TC_CREATED_BY" VARCHAR2(100 BYTE), 
	"TC_CREATED_TS" TIMESTAMP (6), 
	"TC_UPDATED_BY" VARCHAR2(100 BYTE), 
	"TC_UPDATED_TS" TIMESTAMP (6), 
	"TC_UPDATEDBY" RAW(255)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_CATALOGUE"."TC_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_CATALOGUE"."TC_TYPE" IS 'Type object ';
   COMMENT ON COLUMN "TRAINING_CATALOGUE"."TC_STATUS" IS 'Status object';
   COMMENT ON COLUMN "TRAINING_CATALOGUE"."TC_CREATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_CATALOGUE"."TC_CREATED_TS" IS 'Timestamp';
   COMMENT ON COLUMN "TRAINING_CATALOGUE"."TC_UPDATED_BY" IS 'FK Integer';
   COMMENT ON COLUMN "TRAINING_CATALOGUE"."TC_UPDATED_TS" IS 'Timestamp';
--------------------------------------------------------
--  DDL for Table TRAINING_CATEGORY
--------------------------------------------------------

  CREATE TABLE "TRAINING_CATEGORY" 
   (	"TC_ID" NUMBER(*,0), 
	"TC_CODE" VARCHAR2(100 BYTE), 
	"TC_DESCRIPTION" VARCHAR2(100 BYTE), 
	"TC_STATUS" NUMBER(*,0), 
	"TC_NAME" VARCHAR2(100 BYTE), 
	"TC_TYPE" NUMBER(*,0), 
	"TIT_ID" NUMBER(*,0), 
	"TC_CREATED_BY" VARCHAR2(100 BYTE), 
	"TC_CREATED_TS" TIMESTAMP (6), 
	"TC_UPDATED_BY" VARCHAR2(100 BYTE), 
	"TC_UPDATED_TS" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_DESCRIPTION" IS 'description';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_STATUS" IS 'FK Status obj';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_TYPE" IS 'FK Type Obj';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TIT_ID" IS 'FK Traing_item_tmplt';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_CREATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_CREATED_TS" IS 'Timestamp';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_UPDATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_CATEGORY"."TC_UPDATED_TS" IS 'Timestamp';
--------------------------------------------------------
--  DDL for Table TRAINING_COMPONENT
--------------------------------------------------------

  CREATE TABLE "TRAINING_COMPONENT" 
   (	"TC_ID" NUMBER(*,0), 
	"TC_CODE" VARCHAR2(100 BYTE), 
	"TC_DESCRIPTION" VARCHAR2(100 BYTE), 
	"TC_TYPE" NUMBER(*,0), 
	"TC_STATUS" NUMBER(*,0), 
	"TIT_ID" NUMBER(*,0), 
	"TC_CREATED_BY" VARCHAR2(100 BYTE), 
	"TC_CREATED_TS" TIMESTAMP (6), 
	"TC_UPDATED_BY" VARCHAR2(100 BYTE), 
	"TC_UPDATED_TS" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_COMPONENT"."TC_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_COMPONENT"."TC_TYPE" IS 'FK Type obj';
   COMMENT ON COLUMN "TRAINING_COMPONENT"."TC_STATUS" IS 'FK Status obj';
   COMMENT ON COLUMN "TRAINING_COMPONENT"."TIT_ID" IS 'FK_training_item_tem';
   COMMENT ON COLUMN "TRAINING_COMPONENT"."TC_CREATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_COMPONENT"."TC_CREATED_TS" IS 'Timestamp';
   COMMENT ON COLUMN "TRAINING_COMPONENT"."TC_UPDATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_COMPONENT"."TC_UPDATED_TS" IS 'Timestamp';
--------------------------------------------------------
--  DDL for Table TRAINING_GROUP
--------------------------------------------------------

  CREATE TABLE "TRAINING_GROUP" 
   (	"GROUP_ID" NUMBER(*,0), 
	"GROUP_CODE" VARCHAR2(100 BYTE), 
	"GROUP_DESCRIPTION" VARCHAR2(100 BYTE), 
	"GROUP_ACTIVATION_TS" TIMESTAMP (6), 
	"GROUP_EXPIRATION_TS" TIMESTAMP (6), 
	"GROUP_ACTIVITY_TS" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_GROUP"."GROUP_ID" IS 'PK';
--------------------------------------------------------
--  DDL for Table TRAINING_ITEM
--------------------------------------------------------

  CREATE TABLE "TRAINING_ITEM" 
   (	"TI_ID" NUMBER(*,0), 
	"TI_CODE" VARCHAR2(100 BYTE), 
	"TI_DESCRIPTION" VARCHAR2(100 BYTE), 
	"TI_TYPE" NUMBER(*,0), 
	"TI_STATUS" NUMBER(*,0), 
	"TC_ID" NUMBER(*,0), 
	"TIT_ID" NUMBER(*,0), 
	"TI_CREATED_BY" VARCHAR2(100 BYTE), 
	"TI_CREATED_TS" TIMESTAMP (6), 
	"TI_UPDATED_BY" VARCHAR2(20 BYTE), 
	"TI_UPDATED_TS" TIMESTAMP (6), 
	"TI_CREATEDBY" RAW(255), 
	"TI_ITEMTEMPLATEENTITY" RAW(255), 
	"TI_TRAININGCATALOGUEENTITY" RAW(255), 
	"TI_TRAININGSTATUSENTITY" RAW(255), 
	"TI_TRAININGTYPEENTITY" RAW(255), 
	"TI_UPDATEDBY" RAW(255)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_ITEM"."TI_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_ITEM"."TI_TYPE" IS 'FK TYPE obj';
   COMMENT ON COLUMN "TRAINING_ITEM"."TI_STATUS" IS 'FK STATUS obj';
   COMMENT ON COLUMN "TRAINING_ITEM"."TC_ID" IS 'FK Training_catalogue';
   COMMENT ON COLUMN "TRAINING_ITEM"."TIT_ID" IS 'FK_Training_item_Tmp';
   COMMENT ON COLUMN "TRAINING_ITEM"."TI_CREATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_ITEM"."TI_CREATED_TS" IS 'Timestamp';
   COMMENT ON COLUMN "TRAINING_ITEM"."TI_UPDATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_ITEM"."TI_UPDATED_TS" IS 'Timestamp';
--------------------------------------------------------
--  DDL for Table TRAINING_ITEM_TEMPLATES
--------------------------------------------------------

  CREATE TABLE "TRAINING_ITEM_TEMPLATES" 
   (	"TIT_ID" NUMBER(*,0), 
	"TIT_ITEM_TEMPLATE_NAME" VARCHAR2(100 BYTE), 
	"TIT_ITEM_TEMPLATE_ICON" VARCHAR2(100 BYTE), 
	"TIT_ITEM_CATEGORY" VARCHAR2(100 BYTE), 
	"TIT_CATEGORY_TYPE" NUMBER(*,0), 
	"TIT_CODE" VARCHAR2(100 BYTE), 
	"TIT_DESCRIPTION" VARCHAR2(100 BYTE), 
	"TIT_STATUS" NUMBER(*,0), 
	"TR_ID" VARCHAR2(100 BYTE), 
	"TIT_CREATED_BY" VARCHAR2(100 BYTE), 
	"TIT_CREATED_TS" TIMESTAMP (6), 
	"TIT_UPDATED_BY" VARCHAR2(100 BYTE), 
	"TIT_UPDATED_TS" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TIT_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TIT_CATEGORY_TYPE" IS 'FK Type Obj';
   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TIT_STATUS" IS 'FK Status obj';
   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TR_ID" IS 'FK Training_Record';
   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TIT_CREATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TIT_CREATED_TS" IS 'Timestamp';
   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TIT_UPDATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_ITEM_TEMPLATES"."TIT_UPDATED_TS" IS 'Timestamp';
--------------------------------------------------------
--  DDL for Table TRAINING_RECORD
--------------------------------------------------------

  CREATE TABLE "TRAINING_RECORD" 
   (	"TR_ID" VARCHAR2(100 BYTE), 
	"TR_CODE" VARCHAR2(100 BYTE), 
	"TR_DESCRIPTION" VARCHAR2(100 BYTE), 
	"ECI_ID" NUMBER(*,0), 
	"TR_TYPE" NUMBER(*,0), 
	"TR_STATUS" NUMBER(*,0), 
	"TIT_ID" NUMBER(*,0), 
	"TR_CREATED_BY" VARCHAR2(100 BYTE), 
	"TR_CREATED_TS" TIMESTAMP (6), 
	"TR_UPDATED_BY" VARCHAR2(100 BYTE), 
	"TR_UPDATED_TS" TIMESTAMP (6), 
	"USER_ID" NUMBER(*,0), 
	"TC_ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_RECORD"."TR_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_RECORD"."ECI_ID" IS 'FS.emp.commonId';
   COMMENT ON COLUMN "TRAINING_RECORD"."TR_TYPE" IS 'FK type obj';
   COMMENT ON COLUMN "TRAINING_RECORD"."TR_STATUS" IS 'FK Status obj';
   COMMENT ON COLUMN "TRAINING_RECORD"."TIT_ID" IS 'FK Traing_item_temp';
   COMMENT ON COLUMN "TRAINING_RECORD"."TR_CREATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_RECORD"."TR_UPDATED_BY" IS 'FK';
   COMMENT ON COLUMN "TRAINING_RECORD"."USER_ID" IS 'FK USER ID';
   COMMENT ON COLUMN "TRAINING_RECORD"."TC_ID" IS 'FK TRNG_CTLG';
--------------------------------------------------------
--  DDL for Table TRAINING_STATUS
--------------------------------------------------------

  CREATE TABLE "TRAINING_STATUS" 
   (	"STATUS_ID" NUMBER(*,0), 
	"STATUS_CODE" VARCHAR2(100 BYTE), 
	"STATUS_DESCRIPTION" VARCHAR2(100 BYTE), 
	"STATUS_ACTIVATION_TS" TIMESTAMP (6), 
	"STATUS_EXPIRATION_TS" TIMESTAMP (6), 
	"STATUS_ACTIVITY_TS" TIMESTAMP (6), 
	"GROUP_ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_STATUS"."STATUS_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_STATUS"."GROUP_ID" IS 'FK TrainingGroup';
--------------------------------------------------------
--  DDL for Table TRAINING_TYPE
--------------------------------------------------------

  CREATE TABLE "TRAINING_TYPE" 
   (	"TYPE_ID" NUMBER(*,0), 
	"TYPE_CODE" VARCHAR2(100 BYTE), 
	"TYPE_DESCRIPTION" VARCHAR2(100 BYTE), 
	"TYPE_ACTIVATION_TS" TIMESTAMP (6), 
	"TYPE_EXPIRATION_TS" TIMESTAMP (6), 
	"TYPE_ACTIVITY_TS" TIMESTAMP (6), 
	"GROUP_ID" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_TYPE"."TYPE_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_TYPE"."GROUP_ID" IS 'FK Training Group';
--------------------------------------------------------
--  DDL for Table TRAINING_USER
--------------------------------------------------------

  CREATE TABLE "TRAINING_USER" 
   (	"USER_ID" NUMBER(*,0), 
	"USER_FIRST_NAME" VARCHAR2(100 BYTE), 
	"USER_MIDDLE_NAME" VARCHAR2(100 BYTE), 
	"USER_LAST_NAME" VARCHAR2(100 BYTE), 
	"USER_EMAIL" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "TRAINING_USER"."USER_ID" IS 'PK';
   COMMENT ON COLUMN "TRAINING_USER"."USER_EMAIL" IS 'UNIQUE KEY';
REM INSERTING into APP_USER
SET DEFINE OFF;
Insert into APP_USER (ID,AGE,NAME,SALARY) values (1,11,'hi','500');
Insert into APP_USER (ID,AGE,NAME,SALARY) values (2,52,'name1','1000');
REM INSERTING into TRAINING_CATALOGUE
SET DEFINE OFF;
REM INSERTING into TRAINING_CATEGORY
SET DEFINE OFF;
REM INSERTING into TRAINING_COMPONENT
SET DEFINE OFF;
REM INSERTING into TRAINING_GROUP
SET DEFINE OFF;
Insert into TRAINING_GROUP (GROUP_ID,GROUP_CODE,GROUP_DESCRIPTION,GROUP_ACTIVATION_TS,GROUP_EXPIRATION_TS,GROUP_ACTIVITY_TS) values (100,'grp_code1','grp_desc_1',null,null,null);
REM INSERTING into TRAINING_ITEM
SET DEFINE OFF;
REM INSERTING into TRAINING_ITEM_TEMPLATES
SET DEFINE OFF;
Insert into TRAINING_ITEM_TEMPLATES (TIT_ID,TIT_ITEM_TEMPLATE_NAME,TIT_ITEM_TEMPLATE_ICON,TIT_ITEM_CATEGORY,TIT_CATEGORY_TYPE,TIT_CODE,TIT_DESCRIPTION,TIT_STATUS,TR_ID,TIT_CREATED_BY,TIT_CREATED_TS,TIT_UPDATED_BY,TIT_UPDATED_TS) values (1,'template2','tit_icon','cat2',1,'tit_code2','tit_description',null,null,null,to_timestamp('14-JUN-17 11.42.39.506000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'santosh@rigil.in',to_timestamp('14-JUN-17 06.31.37.591000000 AM','DD-MON-RR HH.MI.SSXFF AM'));
Insert into TRAINING_ITEM_TEMPLATES (TIT_ID,TIT_ITEM_TEMPLATE_NAME,TIT_ITEM_TEMPLATE_ICON,TIT_ITEM_CATEGORY,TIT_CATEGORY_TYPE,TIT_CODE,TIT_DESCRIPTION,TIT_STATUS,TR_ID,TIT_CREATED_BY,TIT_CREATED_TS,TIT_UPDATED_BY,TIT_UPDATED_TS) values (2,'TEMPLATE1','tit_icon1','item_category1',1,'tit_code1','Description',null,null,null,to_timestamp('21-JUN-17 06.31.54.076000000 AM','DD-MON-RR HH.MI.SSXFF AM'),null,to_timestamp('15-JUN-17 06.31.43.279000000 AM','DD-MON-RR HH.MI.SSXFF AM'));
REM INSERTING into TRAINING_RECORD
SET DEFINE OFF;
REM INSERTING into TRAINING_STATUS
SET DEFINE OFF;
Insert into TRAINING_STATUS (STATUS_ID,STATUS_CODE,STATUS_DESCRIPTION,STATUS_ACTIVATION_TS,STATUS_EXPIRATION_TS,STATUS_ACTIVITY_TS,GROUP_ID) values (1,'code01','StatusDesc',to_timestamp('14-JUN-17 06.20.30.507000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('14-JUN-17 06.20.37.185000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('15-JUN-17 06.20.45.999000000 AM','DD-MON-RR HH.MI.SSXFF AM'),null);
REM INSERTING into TRAINING_TYPE
SET DEFINE OFF;
Insert into TRAINING_TYPE (TYPE_ID,TYPE_CODE,TYPE_DESCRIPTION,TYPE_ACTIVATION_TS,TYPE_EXPIRATION_TS,TYPE_ACTIVITY_TS,GROUP_ID) values (1,'code','desc',null,null,null,null);
REM INSERTING into TRAINING_USER
SET DEFINE OFF;
Insert into TRAINING_USER (USER_ID,USER_FIRST_NAME,USER_MIDDLE_NAME,USER_LAST_NAME,USER_EMAIL) values (1,'santosh','kumar','gupta','santosh@rigil.in');
--------------------------------------------------------
--  Constraints for Table APP_USER
--------------------------------------------------------

  ALTER TABLE "APP_USER" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_CATALOGUE
--------------------------------------------------------

  ALTER TABLE "TRAINING_CATALOGUE" ADD CONSTRAINT "TC_ID" PRIMARY KEY ("TC_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_CATALOGUE" MODIFY ("TC_CREATED_BY" NOT NULL ENABLE);
  ALTER TABLE "TRAINING_CATALOGUE" MODIFY ("TC_STATUS" NOT NULL ENABLE);
  ALTER TABLE "TRAINING_CATALOGUE" MODIFY ("TC_TYPE" NOT NULL ENABLE);
  ALTER TABLE "TRAINING_CATALOGUE" MODIFY ("TC_CODE" NOT NULL ENABLE);
  ALTER TABLE "TRAINING_CATALOGUE" MODIFY ("TC_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_CATEGORY
--------------------------------------------------------

  ALTER TABLE "TRAINING_CATEGORY" ADD CONSTRAINT "TC_ID_PK" PRIMARY KEY ("TC_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_CATEGORY" MODIFY ("TC_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_COMPONENT
--------------------------------------------------------

  ALTER TABLE "TRAINING_COMPONENT" ADD CONSTRAINT "TRNG_COMPNT_PK" PRIMARY KEY ("TC_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_COMPONENT" MODIFY ("TC_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_GROUP
--------------------------------------------------------

  ALTER TABLE "TRAINING_GROUP" ADD CONSTRAINT "TRNG_GRP_PK" PRIMARY KEY ("GROUP_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TRAINING_ITEM
--------------------------------------------------------

  ALTER TABLE "TRAINING_ITEM" ADD CONSTRAINT "TI_ID_PK" PRIMARY KEY ("TI_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_ITEM" MODIFY ("TI_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_ITEM_TEMPLATES
--------------------------------------------------------

  ALTER TABLE "TRAINING_ITEM_TEMPLATES" ADD CONSTRAINT "TRNG_ITEM_TMPLT_PK" PRIMARY KEY ("TIT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_ITEM_TEMPLATES" MODIFY ("TIT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_RECORD
--------------------------------------------------------

  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "TRNG_RECORD_PK" PRIMARY KEY ("TR_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TRAINING_STATUS
--------------------------------------------------------

  ALTER TABLE "TRAINING_STATUS" ADD CONSTRAINT "TRNG_STATUS_PK" PRIMARY KEY ("STATUS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_STATUS" MODIFY ("STATUS_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_TYPE
--------------------------------------------------------

  ALTER TABLE "TRAINING_TYPE" ADD CONSTRAINT "TRNG_TYPE_PK" PRIMARY KEY ("TYPE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_TYPE" MODIFY ("TYPE_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TRAINING_USER
--------------------------------------------------------

  ALTER TABLE "TRAINING_USER" ADD CONSTRAINT "USER_EMAIL_UNIQUE_KEY" UNIQUE ("USER_EMAIL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_USER" ADD CONSTRAINT "TRNG_USER_PK" PRIMARY KEY ("USER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "TRAINING_USER" MODIFY ("USER_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_CATALOGUE
--------------------------------------------------------

  ALTER TABLE "TRAINING_CATALOGUE" ADD CONSTRAINT "TC_CREATED_BY_FK_TRNG_CTLG" FOREIGN KEY ("TC_CREATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_CATALOGUE" ADD CONSTRAINT "TC_UPDATED_BY_FK_TRNG_CTLG" FOREIGN KEY ("TC_UPDATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_CATALOGUE" ADD CONSTRAINT "TRNG_STATUS_FK" FOREIGN KEY ("TC_STATUS")
	  REFERENCES "TRAINING_STATUS" ("STATUS_ID") ENABLE;
  ALTER TABLE "TRAINING_CATALOGUE" ADD CONSTRAINT "TRNG_TYPE_FK" FOREIGN KEY ("TC_TYPE")
	  REFERENCES "TRAINING_TYPE" ("TYPE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_CATEGORY
--------------------------------------------------------

  ALTER TABLE "TRAINING_CATEGORY" ADD CONSTRAINT "TC_CREATED_BY_FK_TRNG_CAT" FOREIGN KEY ("TC_CREATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_CATEGORY" ADD CONSTRAINT "TC_UPDATED_FK_TRNG_CAT" FOREIGN KEY ("TC_UPDATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_CATEGORY" ADD CONSTRAINT "TRNG_ITEM_TMPLT_FK" FOREIGN KEY ("TIT_ID")
	  REFERENCES "TRAINING_ITEM_TEMPLATES" ("TIT_ID") ENABLE;
  ALTER TABLE "TRAINING_CATEGORY" ADD CONSTRAINT "TRNG_STATUS_FK_TRNG_CAT" FOREIGN KEY ("TC_STATUS")
	  REFERENCES "TRAINING_STATUS" ("STATUS_ID") ENABLE;
  ALTER TABLE "TRAINING_CATEGORY" ADD CONSTRAINT "TRNG_TYPE_FK_TRNG_CAT" FOREIGN KEY ("TC_TYPE")
	  REFERENCES "TRAINING_TYPE" ("TYPE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_COMPONENT
--------------------------------------------------------

  ALTER TABLE "TRAINING_COMPONENT" ADD CONSTRAINT "TC_CREATED_BY_FK_TRNG_COMP" FOREIGN KEY ("TC_CREATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_COMPONENT" ADD CONSTRAINT "TC_UPDATED_BY_FK_TRNG_COMP" FOREIGN KEY ("TC_UPDATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_COMPONENT" ADD CONSTRAINT "TRNG_STATUS_FK_TRNG_COMPNT" FOREIGN KEY ("TC_STATUS")
	  REFERENCES "TRAINING_STATUS" ("STATUS_ID") ENABLE;
  ALTER TABLE "TRAINING_COMPONENT" ADD CONSTRAINT "TRNG_TIT_FK_TIT" FOREIGN KEY ("TIT_ID")
	  REFERENCES "TRAINING_ITEM_TEMPLATES" ("TIT_ID") ENABLE;
  ALTER TABLE "TRAINING_COMPONENT" ADD CONSTRAINT "TRNG_TYPE_FK_TRNG_COMPNT" FOREIGN KEY ("TC_TYPE")
	  REFERENCES "TRAINING_TYPE" ("TYPE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_ITEM
--------------------------------------------------------

  ALTER TABLE "TRAINING_ITEM" ADD CONSTRAINT "TIT_FK_TRNG_ITRM" FOREIGN KEY ("TIT_ID")
	  REFERENCES "TRAINING_ITEM_TEMPLATES" ("TIT_ID") ENABLE;
  ALTER TABLE "TRAINING_ITEM" ADD CONSTRAINT "TI_CREATED_BY_FK_TRNG_ITEM" FOREIGN KEY ("TI_CREATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_ITEM" ADD CONSTRAINT "TI_UPDATED_BY_FK_TRNG_ITEM" FOREIGN KEY ("TI_UPDATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_ITEM" ADD CONSTRAINT "TRNG_CATLG_FK_TRNG_ITEM" FOREIGN KEY ("TC_ID")
	  REFERENCES "TRAINING_CATALOGUE" ("TC_ID") ENABLE;
  ALTER TABLE "TRAINING_ITEM" ADD CONSTRAINT "TRNG_STATUS_TRNG_ITEM" FOREIGN KEY ("TI_STATUS")
	  REFERENCES "TRAINING_STATUS" ("STATUS_ID") ENABLE;
  ALTER TABLE "TRAINING_ITEM" ADD CONSTRAINT "TRNG_TYPE_FK_TRNG_ITEM" FOREIGN KEY ("TI_TYPE")
	  REFERENCES "TRAINING_TYPE" ("TYPE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_ITEM_TEMPLATES
--------------------------------------------------------

  ALTER TABLE "TRAINING_ITEM_TEMPLATES" ADD CONSTRAINT "TIT_CREATED_BY_FK_TIT" FOREIGN KEY ("TIT_CREATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_ITEM_TEMPLATES" ADD CONSTRAINT "TIT_UPDATED_BY_FK_TIT" FOREIGN KEY ("TIT_UPDATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_ITEM_TEMPLATES" ADD CONSTRAINT "TRNG_RECORD_FK_TIT" FOREIGN KEY ("TR_ID")
	  REFERENCES "TRAINING_RECORD" ("TR_ID") ENABLE;
  ALTER TABLE "TRAINING_ITEM_TEMPLATES" ADD CONSTRAINT "TRNG_STATUS_FK_TIT" FOREIGN KEY ("TIT_STATUS")
	  REFERENCES "TRAINING_STATUS" ("STATUS_ID") ENABLE;
  ALTER TABLE "TRAINING_ITEM_TEMPLATES" ADD CONSTRAINT "TRNG_TYPE_FK_TIT" FOREIGN KEY ("TIT_CATEGORY_TYPE")
	  REFERENCES "TRAINING_TYPE" ("TYPE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_RECORD
--------------------------------------------------------

  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "TIT_FK_TRNG_RECORD" FOREIGN KEY ("TIT_ID")
	  REFERENCES "TRAINING_ITEM_TEMPLATES" ("TIT_ID") ENABLE;
  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "TRNG_CTLG_FK_TRNG_RECORD" FOREIGN KEY ("TC_ID")
	  REFERENCES "TRAINING_CATALOGUE" ("TC_ID") ENABLE;
  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "TRNG_STATUS_FK_TRNG_RECORD" FOREIGN KEY ("TR_STATUS")
	  REFERENCES "TRAINING_STATUS" ("STATUS_ID") ENABLE;
  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "TRNG_TYPE_FK_TRNG_RECORD" FOREIGN KEY ("TR_TYPE")
	  REFERENCES "TRAINING_TYPE" ("TYPE_ID") ENABLE;
  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "TR_CREATED_BY_FK_TRNG_RECORD" FOREIGN KEY ("TR_CREATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "TR_UPDATED_BY_FK_TRNG_RECORD" FOREIGN KEY ("TR_UPDATED_BY")
	  REFERENCES "TRAINING_USER" ("USER_EMAIL") ENABLE;
  ALTER TABLE "TRAINING_RECORD" ADD CONSTRAINT "USER_ID_FK_TRNG_RECORD" FOREIGN KEY ("USER_ID")
	  REFERENCES "TRAINING_USER" ("USER_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_STATUS
--------------------------------------------------------

  ALTER TABLE "TRAINING_STATUS" ADD CONSTRAINT "GROUP_ID_FK_TRNG_STATUS" FOREIGN KEY ("GROUP_ID")
	  REFERENCES "TRAINING_GROUP" ("GROUP_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TRAINING_TYPE
--------------------------------------------------------

  ALTER TABLE "TRAINING_TYPE" ADD CONSTRAINT "GROUP_ID_TRNG_TYPE" FOREIGN KEY ("GROUP_ID")
	  REFERENCES "TRAINING_GROUP" ("GROUP_ID") ENABLE;
