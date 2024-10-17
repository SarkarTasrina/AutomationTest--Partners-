
Feature: Ads Post Functionality
  "As a General User I want to post my product from the AdsPostFree
  So that I can Post my Product Category wise without any error Successfully"

  Background:
    Given I am on the homepage
    When  I am click on the Drop-Down toggle bar
    Then  I click on the sing In menu
    And   I click on the G-user Sing in menu
    Then  I enter the user name "@nisha1"
    And   I enter the  password "MMnn22##"
    Then  I click on the singin submit btn
    And   I See my General user Dashboard "Nisha Tasrina"
    Then  I click on the ads Post Free
    And   I click on Sell, Rent, property, service & Job



  Scenario: As a G-user want to post properties category
    Given I click on Properties Category
    When  I click on subcategory of flat for sale
    Then I fill the title " Gulshan,Dhaka Flat for Sale"
    And I fill the No Of Bedrooms "4"
    And I fill the No Of Bathrooms"3"
    And I fill the Size(sqft) " 2100"
    And I fill the Car Parking "Yes"
    And I fill the Apartment Features "Not Furnished"
    And I fill the Facing Direction "North"
    And I fill the Completion Status "Ready"
    And I fill the Address "Gulshan,Dhaka"
    And I fill the Description "Any kinds of information contact this number"
    And I fill the Price "9500000"
    And I fill the Price Unit "Per Shotok"
    And I fill the Is Negotiable button check
    And I fill the district name "Dhaka"
    And I fill the Area  "Gulshan 1"
    Then I fill the Phone Number "01715139289"
    And I upload the product images:
      | imagePath           |
      | C:\images\flat1.png |
      | C:\images\flat2.png |
    Then I click On the Submit Button


  Scenario: As a G-user want to post Vehicles category
    Given I click on Vehicles Category
    When I click on subcategory of Car
    Then I fill the title name " Toyota Car for Sale"
    And I fill the condition "New"
    And I fill the brand "Toyota"
    And I fill the model " "
    And I fill the Address"Badda"
    And I fill the transmission "Automatic "
    And I fill the edition " "
    And I fill the EngineCapacity "1500 cc "
    And I fill the manufactureYear " 2019"
    And I fill the mileage " 5000"
    And I fill the registrationYear " 2022"
    And I fill the BodyType "SUV / 4x4 "
    And I fill the FuelType "Octane"
    And I fill the price" 750000"


  Scenario: As a G-user want to post Electronics category
    Given I click on Electronics Category
    When I click on subcategory of Mobile
    Then I fill the Title name " Iphone 16 for sale"
    And I fill the brand name "iPhone"
    And I fill the address " Badda 1 "
    And I fill the ram " 132gb "
    And I fill the processor " 64 "
    And I fill the Price" 150000"


  Scenario: As a G-user want to post Lifestyles category
    Given I click on Lifestyles Category
    When I click on subcategory of Health And Beauty
    Then I fill  title name " Facewash For sale"
    And I fill the Item Type "Skin and Body Care"
    And I fill the price " 750"


  Scenario: As a G-user want to post Jobs category
    Given I click on Jobs Category
    When I click on subcategory of Software Engineer
    Then I fill the title name " WE ARE HIRING FOR FRONTEND-DEVELOPER"
    And I fill the Job Type "FULL TIME"
