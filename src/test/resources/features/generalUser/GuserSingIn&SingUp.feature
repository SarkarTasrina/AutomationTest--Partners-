
Feature: GeneralUser Functionality
  "As a General User I want to Sing up Successfully without any error
  So That I Can Sing In As a general user successfuly"

  Background:
    Given I am on the homepage
    When I am click on the Drop-Down toggle bar

  Scenario: user can Sing Up succesfully
    Given I click on the Sing up menu
    When I click on the G-user Sing up menu
    Then I fill the first name "Tasrina"
    And I fill the last name "sarkar"
    And I fill the user name "sarkar1012"
    And I fill the email id "tasrina891.sarkar@gmail.com"
    And I fill the phone number "01982122456"
    And I fill the whatsapp number "01982122451"
    And I fill the district name "Dhaka"
    And I fill the area name "Badda"
    And I fill the password "MMnn22##"
    And I fill the confirm password  "MMnn22##"
    Then I fill the Reference code "RC-2526202496"
    And I click on agree cheackbox to terms & conditions
    Then I click on the singup submit btn

  Scenario: User can sing  with successfully
    Given I click on the sing In menu
    When  I click on the G-user Sing in menu
    Then  I enter the user name "@nisha1"
    And   I enter the  password "MMnn22##"
    Then  I click on the singin submit btn