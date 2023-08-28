@tag
Feature: Login functionality

  @LoginFun
  Scenario Outline: valiadtion of login fun
    Given user Launch URL
    When Enter  the data "<username>" and "<password>"
    And user click Login link
    Then logout the app

    
    Examples: 
      
      | username | password |
      | admin    | manager  |
      | trainee  | trainee  |
      | admin    | trainee  |
