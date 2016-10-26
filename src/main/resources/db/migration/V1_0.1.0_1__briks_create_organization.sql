/* CREATE SEQUENCE */

CREATE SEQUENCE org_seq 
  INCREMENT BY 1 
  START WITH 5001; 
  
/* CREATE TABLE */

CREATE TABLE organization 
  ( 
     id            				NUMBER(18, 0) NOT NULL, 
     org_name          			VARCHAR2(40 CHAR) NOT NULL, 
     org_code   				VARCHAR2(40 CHAR), 
     created_by    				NUMBER(18, 0) NOT NULL, 
     date_created  				TIMESTAMP DEFAULT current_timestamp NOT NULL, 
     modified_by   				NUMBER(18, 0), 
     date_modified 				TIMESTAMP DEFAULT current_timestamp, 
     version       				NUMBER(18, 0) DEFAULT 1, 
     CONSTRAINT org_pk 			PRIMARY KEY (id)
  );