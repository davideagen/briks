/* CREATE SEQUENCE */

CREATE SEQUENCE form_set_seq 
  INCREMENT BY 1 
  START WITH 5001; 
  
/* CREATE TABLE */

CREATE TABLE form_set
  ( 
     id            				NUMBER(18, 0) NOT NULL, 
     form_id        			NUMBER(18, 0) NOT NULL, 
     label          			VARCHAR2(40 CHAR) NOT NULL, 
     display_order   			NUMBER(4,0), 
     created_by    				NUMBER(18, 0) NOT NULL, 
     date_created  				TIMESTAMP DEFAULT current_timestamp NOT NULL, 
     modified_by   				NUMBER(18, 0), 
     date_modified 				TIMESTAMP DEFAULT current_timestamp, 
     version       				NUMBER(18, 0) DEFAULT 1, 
     CONSTRAINT form_set_pk 	PRIMARY KEY (id), 
     CONSTRAINT form_fk 		FOREIGN KEY (form_id) 
  ); 