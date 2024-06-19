@All
Feature: car booking feature

@smoke
Scenario: book car volvo
Given user try to select the car type "volvo" from application
When user select car "volvo" and pick up point "hyderbad" and drop point "vizag"
Then driver starts the journey
Then driver ends the journey
Then user pay the bill 1300 rs

@Regression
Scenario: book car maruthi
Given user try to select the car type "maruthi" from application
When user select car "maruthi" and pick up point "tirupathi" and drop point "banglore"
Then driver starts the journey
Then driver ends the journey
Then user pay the bill 2000 rs

@sanity
Scenario: book car swift 
Given user try to select the car type "swift" from application
When user select car "swift" and pick up point "mumbai" and drop point "delhi"
Then driver starts the journey
Then driver ends the journey
Then user pay the bill 2500 rs
