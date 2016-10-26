/* CREATE SEQUENCE */

CREATE SEQUENCE application_seq 
  INCREMENT BY 1 
  START WITH 5001; 
  
/* CREATE TABLE */

CREATE TABLE application 
  ( 
     id            				NUMBER(18, 0) NOT NULL, 
     org_id        				NUMBER(18, 0) NOT NULL, 
     name          				VARCHAR2(40 CHAR) NOT NULL, 
     description   				VARCHAR2(40 CHAR), 
     created_by    				NUMBER(18, 0) NOT NULL, 
     date_created  				TIMESTAMP DEFAULT current_timestamp NOT NULL, 
     modified_by   				NUMBER(18, 0), 
     date_modified 				TIMESTAMP DEFAULT current_timestamp, 
     version       				NUMBER(18, 0) DEFAULT 1, 
     CONSTRAINT application_pk 	PRIMARY KEY (id), 
     CONSTRAINT org_fk 			FOREIGN KEY (org_id) 
  ); 