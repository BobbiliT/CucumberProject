
@tag
Feature: facebook browser login feature
  
  
  @tag1
  Scenario Outline: facebook browser loging test scenario outline
    Given user navigate to login page
    When check the title of the page
    Then user credincails "<username>" and "<password>"
    Then click on the loging button
    Then close the browser
    Examples: 
      | username    | password |
      | 7036060404  | 201210   |
      |    tejesh   | btejesh  |
      |   teju      | tejesh   |
      
 #how to do the datadriven testing in cucumber? 
 #with the help of sceanrio outline and example keyword to do the datadriven test in cucumebr. 
  
  
   