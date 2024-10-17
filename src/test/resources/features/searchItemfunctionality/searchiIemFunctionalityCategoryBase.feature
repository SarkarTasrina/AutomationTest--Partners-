Feature: Category Base Item Search
   "As a Customer, I want to  click on a category
    so that I can view the Sub-Category window page of related product
    then i can access all the product of the Sub-Category"

  Background:
     Given I am on the homepage

  Scenario: Search for Category of Properties & Sub-Category Base item without any error
    Given I click on the category of Properties
    When  I should see the subcategory window for Related category
    Then  I click on the subcategory title Land for Sale
    Then  The Search results should be contain "Land"
    Then  I click the post title name Madani Avenue 100 feet, Dhaka
    And   I  should see the land price "BDT : 200000000"

  Scenario: Search for Category of Vehicles & Sub-Category Base item without any error
    Given I click on the category of Vehicles
    When  I should see the subcategory window for Related category
    Then  I click on the subcategory title Car
    Then  The Search results should be contain "Toyota"
    Then  I click the post title Toyota Aqua 2019 S
    And   I  should see the Brand "Toyota"

  Scenario: Search for Category of Electronics & Sub-Category Base item without any error
    Given I click on the category of Electronics
    When  I should see the subcategory window for Related category
    Then  I click on the subcategory title Home Appliances
    Then  The Search results should be contain "GAS OVEN"
    Then  I click on Home Appliances the post Commercial GAS OVEN for Bakery 400 KG
    And   I  should see the Ad Posted By "Robin Robin"

  Scenario: Search for Category of Lifestyle & Sub-Category Base item without any error
    Given I click on the category of Lifestyle
    When  I should see the subcategory window for Related category
    Then  I click on the subcategory title Mens Bags Or Wallets
    Then  The Search results should be contain "Bagpack"
    Then  I click on the Mens Bags Or Wallets post Lowepro Pro runner 450  aw Camera Bagpack
    And   I  should see the  Item Type"Backpack"

  Scenario: Search for Category of Jobs & Sub-Category Base item without any error
    Given I click on the category of Jobs
    When  I should see the subcategory window for Related category
    Then  I click on the subcategory title Marketing Executive
    Then  The Search results should be contain "Sales"
    Then  I click on the Marketing Executive post Sales & Marketing
    And   I  should see the  Job Type : "Full Time"

