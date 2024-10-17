package stepDefinitions.gUserDashBoard;

import base.Base;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import page.generalUser.guserDashBoard.guserDashBoard.guserDashBoard.GuserDashBoardAdPostPage;

import java.io.File;
import java.util.List;

public class GuserDashBoardAdPostStep extends Base {
    GuserDashBoardAdPostPage guserDashBoardAdPostPage = new GuserDashBoardAdPostPage(driver);

    @And("I See my General user Dashboard {string}")
    public void iSeeMyGeneralUserDashboard(String name) {
        delayOfElement(6);
        String dashboard = guserDashBoardAdPostPage.viewDashbord();
        Assert.assertEquals(name, dashboard);
    }

    @Then("I click on the ads Post Free")
    public void iClickOnTheAdsPostFree() {
        delayOfElement(2);
        guserDashBoardAdPostPage.clickOnPostAd();
    }

    @And("I click on Sell, Rent, property, service & Job")
    public void iClickOnSellRentPropertyServiceJob() {
        delayOfElement(2);
        guserDashBoardAdPostPage.clickOnSellerPost();
    }

    @Then("I click on Properties Category")
    public void iClickOnPropertiesCategory() {
        delayOfElement(2);
        guserDashBoardAdPostPage.clickOnPropertiesPost();
    }

    @And("I click on subcategory of flat for sale")
    public void iClickOnSubcategoryOfFlatForSale() {
        delayOfElement(2);
        guserDashBoardAdPostPage.clickOnFlatForSale();
    }

    @Then("I fill the title {string}")
    public void iFillTheTitle(String title) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterTitle(title);
    }

    @And("I fill the No Of Bedrooms {string}")
    public void iFillTheNoOfBedrooms(String bedrooms) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterNoOfBedroom(bedrooms);
    }

    @And("I fill the No Of Bathrooms{string}")
    public void iFillTheNoOfBathrooms(String bathrooms) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterNoOfBathroom(bathrooms);
    }

    @And("I fill the Size\\(sqft) {string}")
    public void iFillTheSizeSqft(String sizeSqft) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterSize(sizeSqft);
    }

    @And("I fill the Car Parking {string}")
    public void iFillTheCarParking(String carparks) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectCarParkingId(carparks);
    }

    @And("I fill the Apartment Features {string}")
    public void iFillTheApartmentFeatures(String apartment) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectApartmentFeature(apartment);
    }

    @And("I fill the Facing Direction {string}")
    public void iFillTheFacingDirection(String FacingDirection) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectFacingDirection(FacingDirection);
    }

    @And("I fill the Completion Status {string}")
    public void iFillTheCompletionStatus(String completionStatus) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectCompletionStatus(completionStatus);
    }

    @And("I fill the Address {string}")
    public void iFillTheAddress(String address) {
        delayOfElement(5);
        guserDashBoardAdPostPage.enterAddress(address);
    }

    @And("I fill the Description {string}")
    public void iFillTheDescription(String description) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterDescription(description);
    }

    @And("I fill the Price {string}")
    public void iFillThePrice(String price) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterPrice(price);
    }

    @And("I fill the Price Unit {string}")
    public void iFillThePriceUnit(String priceUnits) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectPriceUnitType(priceUnits);
    }

    @And("I fill the Is Negotiable button check")
    public void iFillTheIsNegotiableButtonCheck() {
        delayOfElement(2);
        guserDashBoardAdPostPage.checkIsNegotiable();
    }

    @And("I fill the Area  {string}")
    public void iFillTheArea(String thana) {
        delayOfElement(5);
        guserDashBoardAdPostPage.SelectThanas(thana);
    }

    @And("I fill the Phone Number {string}")
    public void iFillThePhoneNumber(String Phonenumber) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterPhoneNumber(Phonenumber);
    }

    @And("I upload the product images:")
    public void iUploadTheProductImages(DataTable dataTable) {
        delayOfElement(10);
        List<String> imagePaths = dataTable.asList(String.class);
        for (String imagePath : imagePaths) {
            System.out.println("Attempting to upload: " + imagePath);
            File file = new File(imagePath);
            if (file.exists()) {
                guserDashBoardAdPostPage.UploadAddImage(imagePath);
            } else {
                System.out.println("File not found: " + imagePath);
            }
        }
    }

    @Then("I click On the Submit Button")
    public void iClickOnTheSubmitButton() {
        guserDashBoardAdPostPage.clickSubmitButton();
    }

    @Given("I click on Vehicles Category")
    public void iClickOnVehiclesCategory() {
        guserDashBoardAdPostPage.clickOnVehicles();
    }

    @When("I click on subcategory of Car")
    public void iClickOnSubcategoryOfCar() {
        guserDashBoardAdPostPage.clickOnCar();
    }
// Vehicles

    @Then("I fill the title name {string}")
    public void iFillTheTitleName(String title) {
        delayOfElement(5);
        guserDashBoardAdPostPage.enterTitle(title);
    }

    @And("I fill the condition {string}")
    public void iFillTheCondition(String condition) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectConditions(condition);
    }

    @And("I fill the brand {string}")
    public void iFillTheBrand(String brand) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectBrand(brand);
    }

    @And("I fill the model {string}")
    public void iFillTheModel(String modelName) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectModel(modelName);
    }

    @And("I fill the Address{string}")
    public void iFilltheAddress(String address) {
        delayOfElement(5);
        guserDashBoardAdPostPage.enteraddress(address);
    }

    @And("I fill the transmission {string}")
    public void iFillTheTransmission(String transmission) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectTransmission(transmission);
    }

    @And("I fill the edition {string}")
    public void iFillTheEdition(String edition) {
        delayOfElement(5);
        guserDashBoardAdPostPage.enteredition(edition);
    }

    @And("I fill the EngineCapacity {string}")
    public void iFillTheEngineCapacity(String engineCapacity) {
        delayOfElement(5);
        guserDashBoardAdPostPage.EnterEngineCapacity(engineCapacity);
    }

    @And("I fill the manufactureYear {string}")
    public void iFillTheManufactureYear(String manufactureYear) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectManufactureYear(manufactureYear);
    }

    @And("I fill the mileage {string}")
    public void iFillTheMileage(String mileage) {
        delayOfElement(5);
        guserDashBoardAdPostPage.Entermileage(mileage);
    }

    @And("I fill the registrationYear {string}")
    public void iFillTheRegistrationYear(String registrationYear) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectRegistrationYear(registrationYear);
    }

    @And("I fill the BodyType {string}")
    public void iFillTheBodyType(String bodyType) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectBodyType(bodyType);
    }

    @And("I fill the FuelType {string}")
    public void iFillTheFuelType(String fuelType) {
        delayOfElement(5);
        guserDashBoardAdPostPage.selectFuelType(fuelType);
    }

    @And("I fill the price{string}")
    public void iFillTheprice(String price) {
        delayOfElement(5);
        guserDashBoardAdPostPage.enterPrice(price);
    }

    // electronics

    @Given("I click on Electronics Category")
    public void iClickOnElectronicsCategory() {
        guserDashBoardAdPostPage.clickOnElectronics();
    }

    @When("I click on subcategory of Mobile")
    public void iClickOnSubcategoryOfMobile() {
        guserDashBoardAdPostPage.clickOnMobile();
    }

    @Then("I fill the Title name {string}")
    public void ifillTheTitleName(String title) {
        delayOfElement(5);
        guserDashBoardAdPostPage.enterTitle(title);
    }

    @And("I fill the brand name {string}")
    public void iFillTheBrandName(String arg0) {
    }

    @And("I fill the address {string}")
    public void ifillTheAddress(String arg0) {
    }


    @And("I fill the Price{string}")
    public void iFillTheeePrice(String arg0) {
    }

    @Given("I click on Lifestyles Category")
    public void iClickOnLifestylesCategory() {
    }

    @When("I click on subcategory of Health And Beauty")
    public void iClickOnSubcategoryOfHealthAndBeauty() {
    }
// lifestyle

    @Then("I fill  title name {string}")
    public void iFillTitleName(String arg0) {
    }

    @And("I fill the Item Type {string}")
    public void iFillTheItemType(String arg0) {
    }

    @And("I fill the ram {string}")
    public void iFillTheRam(String arg0) {
    }

    @And("I fill the processor {string}")
    public void iFillTheProcessor(String arg0) {
    }

    @And("I fill the price {string}")
    public void iFillTheePrice(String arg0) {
    }

//jobs
    @Given("I click on Jobs Category")
    public void iClickOnJobsCategory() {
    }

    @When("I click on subcategory of Software Engineer")
    public void iClickOnSubcategoryOfSoftwareEngineer() {
    }

    @And("I fill the Job Type {string}")
    public void iFillTheJobType(String arg0) {
    }


}
