/* CREATE SEQUENCE */

CREATE SEQUENCE form_element_seq 
  INCREMENT BY 1 
  START WITH 5001; 
  
/* CREATE TABLE */

CREATE TABLE form_element
  ( 
     id            				INTEGER PRIMARY KEY, 
     form_set_id        		INTEGER NOT NULL REFERENCES FORM_SET( ID ), 
     element_type          		CHAR(40) NOT NULL,
     label          			CHAR(40) NOT NULL,
     name          				CHAR(40) NOT NULL,
     display_order   			INTEGER, 
     created_by    				INTEGER NOT NULL, 
     date_created  				TIMESTAMP DEFAULT current_timestamp NOT NULL, 
     modified_by   				INTEGER, 
     date_modified 				TIMESTAMP DEFAULT current_timestamp, 
     version       				INTEGER DEFAULT 1 
  ); 