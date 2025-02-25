Feature: Create account of facebook
  As a user you need to open facebook home page and to the validations

  Scenario: Validate first name field
    Given User need to be on facebook login page
    When User enters user first name
    Then User checks user first name is present

#  Scenario: Validate create user multiple fields
#    Given User need to be on facebook login page
#    When User enters user first name
#    And Users enters user surname
#    Then User checks user first name is present
#    But User mobile field should be blank