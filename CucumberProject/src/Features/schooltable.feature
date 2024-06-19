
@tag
Feature: school student information
  I want to registration all student information

  @tag1
  Scenario: open school maintain site 
    Given take student details from there parents 
    When now enter the student details one by one 
    | name  | class | age | roll no | phonenumber |
    | tejesh| 2nd year| 19 | 12 | 7036060404|
    |ramesh | 1st year | 18 | 10 | 886228604|
    | ajay  | 10th class | 15 | 01 | 916003660|
    | kamesh | 2nd year | 19 | 11 | 9374830481 | 
    Then filled student details successfully 
    
  @tag2
  Scenario: open school maintain site with column
    Given take student details from there parents 
    When now enter the student details one by one with column
    | name  | class | age | roll no | phonenumber |
    | tejesh| 2nd year| 19 | 12 | 7036060404|
    |ramesh | 1st year | 18 | 10 | 886228604|
    | ajay  | 10th class | 15 | 01 | 916003660|
    | kamesh | 2nd year | 19 | 11 | 9374830481 | 
    Then filled student details successfully 
