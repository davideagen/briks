/* CREATE SEQUENCE */

CREATE SEQUENCE org_seq 
  INCREMENT BY 1 
  START WITH 5001; 
  
/* CREATE TABLE */

CREATE TABLE organization 
  ( 
     id            				INTEGER NOT NULL, 
     org_name          			CHAR(40) NOT NULL, 
     org_code   				CHAR(40), 
     created_by    				INTEGER NOT NULL, 
     date_created  				TIMESTAMP DEFAULT current_timestamp NOT NULL, 
     modified_by   				INTEGER, 
     date_modified 				TIMESTAMP DEFAULT current_timestamp, 
     version       				INTEGER DEFAULT 1, 
     CONSTRAINT org_pk 			PRIMARY KEY (id)
  );