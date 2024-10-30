Feature: Verify different POST operations using REST Assured for req/resin

  Scenario: <id> Create users using <body_type> - Success
    When Add user with <name> and <job> for '/api/users' using <body_type>
    Then Status code is 201
    And Print id
    And Print createdAt