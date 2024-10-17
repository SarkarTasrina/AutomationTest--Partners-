package stepDefinitions.guserStep;



import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.generalUser.GuserSingInSingupPage;


public class GuserSingInSingupStep extends Base {


    GuserSingInSingupPage guserSingInSingupPage = new GuserSingInSingupPage(driver);

//Singup


    @When("I am click on the Drop-Down toggle bar")
    public void iAmClickOnTheDropDownToggleBar() {
        guserSingInSingupPage.clickondropdwontoggleBar();
    }

    @Given("I click on the Sing up menu")
    public void iClickOnTheSingUpMenu() {
        guserSingInSingupPage.ClickonSingup();
    }

    @When("I click on the G-user Sing up menu")
    public void iClickOnTheGUserSingUpMenu() {
        delayOfElement(2);
        guserSingInSingupPage.clickonGuserSingupbtn();
    }

    @Then("I fill the first name {string}")
    public void iFillTheFirstName(String firstName) {
       guserSingInSingupPage.enterFirstname(firstName);
    }

    @And("I fill the last name {string}")
    public void iFillTheLastName(String lastName) {
        guserSingInSingupPage.enterlastname(lastName);

    }

    @And("I fill the user name {string}")
    public void iFillTheUserName(String userName) {
        guserSingInSingupPage.enterusername(userName);

    }

    @And("I fill the email id {string}")
    public void iFillTheEmailId(String EmailId) {
        guserSingInSingupPage.entermailId(EmailId);

    }

    @And("I fill the phone number {string}")
    public void iFillThePhoneNumber(String PhoneNumber) {
        guserSingInSingupPage.enterphonenumber(PhoneNumber);

    }

    @And("I fill the whatsapp number {string}")
    public void iFillTheWhatsappNumber(String WhatsappNumber) {
        guserSingInSingupPage.enterwhatsappNumber(WhatsappNumber);

    }

    @And("I fill the district name {string}")
    public void iFillTheDistrictName(String DistrictName) {

//       guserSingInSingupPage.clickSignUpDropdown();
        delayOfElement(1);
      guserSingInSingupPage.selectDistrict(DistrictName);
      //  guserSingInSingupPage.clickSignUpDropdown();

    }

    @And("I fill the area name {string}")
    public void iFillTheAreaName(String AreaName) {
        delayOfElement(1);
    guserSingInSingupPage.SelectThana(AreaName);


    }

    @And("I fill the password {string}")
    public void iFillThePassword(String Password) {
        guserSingInSingupPage.Enterpassword(Password);

    }

    @And("I fill the confirm password  {string}")
    public void iFillTheConfirmPassword(String ConfirmPassword) {
        guserSingInSingupPage.enterconfirmpassword(ConfirmPassword);

    }

    @Then("I fill the Reference code {string}")
    public void iFillTheReferenceCode(String ReferenceCode) {
        guserSingInSingupPage.enterreferenceCode(ReferenceCode);


    }

    @And("I click on agree cheackbox to terms & conditions")
    public void iClickOnAgreeCheackboxToTermsConditions() {
   guserSingInSingupPage.clickonisAgreeWithTermsAndConditions();
    }

    @Then("I click on the singup submit btn")
    public void iClickOnTheSingupSubmitBtn() {
        guserSingInSingupPage.clickSubmitBtnSingIn();
    }

 //SingIn


    @Given("I click on the sing In menu")
    public void iClickOnTheSingInMenu() {

        guserSingInSingupPage.clickOnSingIn();
    }

    @When("I click on the G-user Sing in menu")
    public void iClickOnTheGUserSingInMenu() {
        guserSingInSingupPage.clickongusersinginbtn();
    }

    @Then("I enter the user name {string}")
    public void iEnterTheUserName(String emailId) {
        guserSingInSingupPage.enterEmailId(emailId);
    }

    @And("I enter the  password {string}")
    public void iEnterThePassword(String password) {
        guserSingInSingupPage.enterpassword(password);
    }


    @Then("I click on the singin submit btn")
    public void iClickOnTheSinginSubmitBtn() {
        guserSingInSingupPage.btnSingin();
    }


}
