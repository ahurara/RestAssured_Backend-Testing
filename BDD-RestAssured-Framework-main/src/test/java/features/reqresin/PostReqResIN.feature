Feature: Verify different POST operations using REST Assured;

  Scenario Outline:  Create users using  Success
    When Add user with <name> and <job> for '/api/users' using <body_type>
    Then Status code is 201
    And Print id
    #And Print createdAt
    Examples:
      | name  | job | body_type  | id |
      | user1 | QA  | jsonString | 1  |
#      | user2 | Dev | jsonString | 2  |
#      | user3 | Eng | hashmap    | 3  |
#      | user4 | Sec | hashmap    | 4  |



  Scenario Outline: <id> Successful user register
    When Add user with <email> and <password> for '/api/register'
    Then Status code is 200
    And Print token
    Examples:
      |email              |password  |id|
      |eve.holt@reqres.in |pistol  |1 |




  Scenario Outline: <id> register using only email
    When Add user with <email> and <password> for '/api/register'
    Then Status code is 200
    And Print error
    Examples:
      |email                |id|
      |eve.holt@reqres.in   |1 |


#
#  Scenario Outline:  Create register
#    When Add user with <email> and <pass> for '/api/register' using <body_type>
#    Then Status code is 400
#    And Print token
#    And Print id
#    Examples:
#      | email  | pass | body_type  | id |
#      | eve.holt@reqres.in | pistol  | jsonString | 1  |
##      | user2 | Dev | jsonString | 2  |   /api/register
##      | user3 | Eng | hashmap    | 3  |
##      | user4 | Sec | hashmap    | 4  |




  Scenario Outline:  Create register with name only
    When Add user with <email> and <pass> for '/api/register' using <body_type>
    Then Status code is 400
    And Print error
    Examples:
      | email  |  body_type  | id |
      | eve.holt@reqres |  jsonString | 1  |
#      | user2 | Dev | jsonString | 2  |   /api/register
#      | user3 | Eng | hashmap    | 3  |
#      | user4 | Sec | hashmap    | 4  |



  Scenario Outline:  Create for suc login
    When Add user with <email> and <pass> for '/api/login' using <body_type>
    Then Status code is 400
    Then Print token
    Examples:
      | email  | pass| body_type  | id |
      | eve.holt@reqres.in| cityslicka| jsonString | 1  |