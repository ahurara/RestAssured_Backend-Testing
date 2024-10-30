Feature: Verify different DELETE operations using REST Assured

  Scenario: Delete Operation for req res in
    Given Perform delete operation for '/api/users/2'
    Then Status code is 204

