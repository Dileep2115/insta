Feature: Operating Instagram

  Scenario: 
    Given open "chrome" browserr
    And launch site usingg "http://www.instagram.com"
    When do login usingg "bellapudileep32@gmail.com" and "momndad143" credentials
    Then Instagram is displayedd
    When click on message icon and send message
      | message                           |
      | hii bro vadina bagunada           |
      | hii bro baagunava vadina baagunda |
    When do logoutt
    Then Login page should be redisplayedd
    When close sitee
