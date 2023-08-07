CREATE TABLE health(
  file_id INTEGER(11) NOT NULL,
  BMI INTEGER(11) NOT NULL,
  person_id NOT NULL,
  PRIMARY KEY (file_id),
  FOREIGN KEY (person_id) REFERENCES person (person_id)  
);