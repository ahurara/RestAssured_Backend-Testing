Feature: Verify reqResN API;

  Scenario: Verify get api for all users
    Given Perform get operation for '/api/users?page'
    Then Status code is 200



  Scenario: Verify get api for a single user
    Given Perform get operation for '/api/users/2'
    Then Status code is 200


  Scenario: Verify get api for user not exist
    Given Perform get operation for '/api/users/23'
    Then Status code is 404

