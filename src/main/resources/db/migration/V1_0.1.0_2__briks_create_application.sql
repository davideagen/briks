/* CREATE SEQUENCE */

CREATE SEQUENCE application_seq 
  INCREMENT BY 1 
  START WITH 5001; 
  
/* CREATE TABLE */

CREATE TABLE application 
( 
     id            				INTEGER PRIMARY KEY, 
     org_id        				INTEGER NOT NULL REFERENCES ORGANIZATION( id ), 
     name          				CHAR(40) NOT NULL, 
     description   				CHAR(4000), 
     created_by    				INTEGER NOT NULL, 
     date_created  				TIMESTAMP DEFAULT current_timestamp NOT NULL, 
     modified_by   				INTEGER, 
     date_modified 				TIMESTAMP DEFAULT current_timestamp, 
     version       				INTEGER DEFAULT 1
); 