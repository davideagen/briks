/* CREATE SEQUENCE */

CREATE SEQUENCE form_element_value_seq 
  INCREMENT BY 1 
  START WITH 5001; 
  
/* CREATE TABLE */

CREATE TABLE form_element_value
  ( 
     id            						NUMBER(18, 0) NOT NULL, 
     form_element_id        			NUMBER(18, 0) NOT NULL, 
     label          					VARCHAR2(40 CHAR) NOT NULL,
     value          					VARCHAR2(40 CHAR) NOT NULL,
     display_order   					NUMBER(4,0), 
     created_by    						NUMBER(18, 0) NOT NULL, 
     date_created  						TIMESTAMP DEFAULT current_timestamp NOT NULL, 
     modified_by   						NUMBER(18, 0), 
     date_modified 						TIMESTAMP DEFAULT current_timestamp, 
     version       						NUMBER(18, 0) DEFAULT 1, 
     CONSTRAINT form_element_value_pk 	PRIMARY KEY (id), 
     CONSTRAINT form_element_fk 		FOREIGN KEY (form_element_id) 
  ); 