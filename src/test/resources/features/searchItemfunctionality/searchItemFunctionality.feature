Feature: Search Item Functionality
  "As a Customer, I want to search for a product
  so that I can view the search results related to my search."

  Background:
    Given I am on the homepage
  @car
  Scenario: Search for category vehicles item for car without any error
    Given I search for "Toyota" in search bar
    When  Click on search btn
    Then  the search results should contain "Toyota"
    And I click on the Toyota Corolla Axio
    Then  I should see the brand name "Toyota"

@properties
  Scenario: Search for category Properties item for Land without any error

    Given I search for "Land" in search bar
    When  Click on search btn
    Then  the search results should contain " land "
    Then I click on the purabachal 5 katha land sale
    And  I should see the land size  "5"

@Electronics
  Scenario: Search for category Electronics item for Phone without any error

    Given I search for "iPhone" in search bar
    When Click on search btn
    Then the search results should contain "iPhone"
    And I click on the iPhone 5S phone
    Then  I should see the Model name " 5s "

  @lifestyle
  Scenario: Search for category Lifestyle item for Phone without any error

    Given I search for "T-shirt" in search bar
    When  Click on search btn
    Then the search results should contain "T-shirt"
    Then I click on the Just Do it Printed T-shirt Fabric Soft And Comfortable-T Shirt For men for sale
    And  I should see the price BDT name "BDT : 350"

##Bug should appear to see the keyword search result but not showing search result
  @Job
  Scenario: Search for category Jobs item for Senior Data Engineer without any error
    Given I search for "Senior Data Engineer " in search bar
    When  Click on search btn
    Then the search results should contain "Senior Data Engineer"
    Then I click on the Senior Data Engineer job post
    And  I should see the Job details


