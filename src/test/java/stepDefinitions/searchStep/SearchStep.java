package stepDefinitions.searchStep;

import base.Base;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import page.searchPage.SearchPage;

import java.util.List;

public class SearchStep extends Base {
    SearchPage searchPage = new SearchPage(driver);


    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        searchPage.navigateUrl(host);
    }


    @When("I search for {string} in search bar")
    public void iSearchForInSearchBar(String keyword) {
        searchPage.searchBox(keyword);
    }

    @Then("Click on search btn")
    public void clickOnSearchBtn() {
        searchPage.clickSearchButton();
    }

    // vehicles
    @And("I click on the Toyota Corolla Axio")
    public void iClickOnTheToyotaCorollaAxio() {

        searchPage.clickonCar();
    }


    @Then("I should see the brand name {string}")
    public void iShouldSeeTheBrandName(String BrandName) {
        String name = searchPage.getbrandName();
        Assert.assertEquals(BrandName, name);
    }

    //properties

    @Then("I click on the purabachal {int} katha land sale")
    public void iClickOnThePurabachalKathaLandSale(int arg0) {

        searchPage.clickonlandpost();
    }

    @And("I should see the land size  {string}")
    public void iShouldSeeTheLandSize(String Landsize) {
        String size = searchPage.getlandSize();
        Assert.assertEquals(Landsize, size);
    }


    //electronics

    @Then("I click on the iPhone {int}S phone")
    public void iClickOnTheIPhoneSPhone(int arg0) {
        searchPage.clickonphone();
    }

    @Then("I should see the Model name {string}")
    public void iShouldSeeTheModelName(String arg) {


    }
    //lifestyle

    @Then("I click on the Just Do it Printed T-shirt Fabric Soft And Comfortable-T Shirt For men for sale")
    public void iClickOnTheJustDoItPrintedTShirtFabricSoftAndComfortableTShirtForMenForSale() {
        searchPage.clickOnShirt();
    }

    @And("I should see the price BDT name {string}")
    public void iShouldSeeThePriceBDTName(String shirtprice) {
        String price = searchPage.getshirtpriceBDT();
        Assert.assertEquals(shirtprice, price);
    }

    //jobs

    @Then("I click on the Senior Data Engineer job post")
    public void iClickOnTheSeniorDataEngineerJobPost() {

    }

    @And("I should see the Job details")
    public void iShouldSeeTheJobDetails() {
    }

    @Then("the search results should contain {string}")
    public void theSearchResultsShouldContain(String expectedSearchKeyword) {
        List<WebElement> searchResults = searchPage.getSearchResults();

        // Check if at least one result matches the expected term
        boolean anyResultMatches = searchResults.stream()
                .anyMatch(result -> result.getText().toLowerCase().contains(expectedSearchKeyword.toLowerCase()));
        System.out.println("Result:" + anyResultMatches);
        Assert.assertTrue("None of the search results matched the expected term: " + expectedSearchKeyword, anyResultMatches);
    }

//Search_item_Functionality_Category_Base///

    //SearchResults//

    @Then("The Search results should be contain {string}")
    public void theSearchResultsShouldBeContain(String expectedSearchKeyword) {
        List<WebElement> searchResults = searchPage.getSearchResultsCatBase();
        boolean anyResultMatches = searchResults.stream()
                .anyMatch(result -> result.getText().toLowerCase().contains(expectedSearchKeyword.toLowerCase()));
        System.out.println("Result:" + anyResultMatches);
        Assert.assertTrue("None of the search results matched the expected term: " + expectedSearchKeyword, anyResultMatches);
    }

    //for Propertics

    @Given("I click on the category of Properties")
    public void iClickOnTheCategoryOfProperties() {
        searchPage.propertiesbody();
    }

    @When("I should see the subcategory window for Related category")
    public void iShouldSeeTheSubcategoryWindowForRelatedCategory() {
        searchPage.isModalDialogOfPropertyDisplayed();
    }

    @Then("I click on the subcategory title Land for Sale")
    public void iClickOnTheSubcategoryTitleLandForSale() {
        searchPage.clickOnLandForSale();
    }

    @Then("I click the post title name Madani Avenue 100 feet, Dhaka")
    public void iClickThePostTitleNameLandPlotSalesBashundharaResidentialArea() {
        searchPage.clickOnLandTitle();
    }

    @And("I  should see the land price {string}")
    public void iShouldSeeTheLandPrice(String price) {
        String landPrice = searchPage.getprice();
        Assert.assertEquals(price, landPrice);
    }

    // Vehicles

    @Given("I click on the category of Vehicles")
    public void iClickOnTheCategoryOfVehicles() {
        searchPage.clickOnVehicle();

    }

    @Then("I click on the subcategory title Car")
    public void iClickOnTheSubcategoryTitleCar() {
        searchPage.clickOnCar();
    }


    @Then("I click the post title Toyota Aqua {int} S")
    public void iClickThePostTitleToyotaAquaS(int arg0) {
        searchPage.clickOnCarPostTitle();
    }

    @And("I  should see the Brand {string}")
    public void iShouldSeeTheBrand(String BrandName) {
        String brandName = searchPage.getBrandName();
        Assert.assertEquals(BrandName, brandName);
    }

    //Electronics

    @Given("I click on the category of Electronics")
    public void iClickOnTheCategoryOfElectronics() {
        searchPage.clickOnElectronics();
    }

    @Then("I click on the subcategory title Home Appliances")
    public void iClickOnTheSubcategoryTitleHomeAppliances() {
        searchPage.clickOnHomeAppliance();
    }

    @Then("I click on Home Appliances the post Commercial GAS OVEN for Bakery {int} KG")
    public void iClickOnHomeAppliancesThePostCommercialGASOVENForBakeryKG(int arg0) {
        searchPage.clickOnHomeAppliances();
    }

    @And("I  should see the Ad Posted By {string}")
    public void iShouldSeeTheAdPostedBy(String Name) {
        String sellerName = SearchPage.getSellerName();
        Assert.assertEquals(Name, sellerName);
    }

    //Lifestyle

    @Given("I click on the category of Lifestyle")
    public void iClickOnTheCategoryOfLifestyle() {
        searchPage.clickOnLifestyle();
    }

    @Then("I click on the subcategory title Mens Bags Or Wallets")
    public void iClickOnTheSubcategoryTitleMensBagsOrWallets() {
        searchPage.clickOnMensProduct();
    }

    @Then("I click on the Mens Bags Or Wallets post Lowepro Pro runner {int}  aw Camera Bagpack")
    public void iClickOnTheMensBagsOrWalletsPostLoweproProRunnerAwCameraBagpack(int arg0) {
        searchPage.clickOnBagTitle();
    }

    @And("I  should see the  Item Type{string}")
    public void iShouldSeeTheItemType(String name) {
        String itemName = searchPage.getItemName();
        Assert.assertEquals(name, itemName);
    }

    //Job
    @Given("I click on the category of Jobs")
    public void iClickOnTheCategoryOfJobs() {
        searchPage.clickOnJobs();
    }

    @Then("I click on the subcategory title Marketing Executive")
    public void iClickOnTheSubcategoryTitleMarketingExecutive() {
        searchPage.clickOnMarketing();
    }

    @Then("I click on the Marketing Executive post Sales & Marketing")
    public void iClickOnTheMarketingExecutivePostSalesMarketing() {
        searchPage.clickInjobPosts();
    }

    @And("I  should see the  Job Type : {string}")
    public void iShouldSeeTheJobType(String time) {
        String FullTime = searchPage.getJobType();
        Assert.assertEquals(time, FullTime);

    }

}






