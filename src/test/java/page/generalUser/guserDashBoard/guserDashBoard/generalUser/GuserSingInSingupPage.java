package page.generalUser.guserDashBoard.guserDashBoard.generalUser;

import base.Base;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuserSingInSingupPage extends Base {


    public GuserSingInSingupPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);


    }
    //singup

    @FindBy(xpath = "//span[@class='navbar-toggler-icon']")
    WebElement clickondropdwonToggleBar;

    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    WebElement clickonSingup;

    @FindBy(xpath = "//a[@href='/general-user/registration-from/']")
    WebElement ClickonGuserSingupbtn;


    @FindBy(id = "firstName")
    static WebElement enterfirstname;

    @FindBy(id = "lastName")
    WebElement enterlastname;

    @FindBy(id = "userName")
    WebElement enterusername;

    @FindBy(id = "emailId")
    WebElement entermailId;

    @FindBy(id = "phone")
    WebElement enterphonenumber;

    @FindBy(id = "whatsappNumber")
    WebElement enterwhatsappNumber;

    @FindBy(id = "district")
    WebElement districtDropdown;

    @FindBy(id = "thana")
    WebElement thanaDropdown;

    @FindBy(id = "password")
    WebElement enterpassword;

    @FindBy(id = "confirmPassword")
    WebElement enterconfirmpassword;

    @FindBy(id = "referenceCode")
    WebElement enterreferenceCode;

    @FindBy(id = "isAgreeWithTermsAndConditions")
    WebElement clickonisAgreeWithTermsAndConditions;

    @FindBy(id = "btnSignUp")
    WebElement clickSubmitBtnSingUp;


    //singIn

    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    WebElement clickSingIn;

    @FindBy(xpath = "//a[@href='/general-user/logIn/']")
    WebElement clickonGusersinginbtn;

    @FindBy(id = "emailId")
    static WebElement enteremailId;

    @FindBy(id = "password")
    WebElement enterPassword;

    @FindBy(xpath = "//button[@id='btnLogin']")
    WebElement btnsingin;


    public void clickondropdwontoggleBar() {
        clickondropdwonToggleBar.click();
    }


    //singup

    public void ClickonSingup() {
        clickonSingup.click();
    }

    public void clickonGuserSingupbtn() {
        ClickonGuserSingupbtn.click();
    }

    public void clickSignUpDropdown() {
        try {
            if (clickonSingup.isDisplayed()) {
                clickonSingup.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        }
    }

    public void enterFirstname(String firstname) {
        enterfirstname.sendKeys(firstname);
    }

    public void enterlastname(String lastname) {
        enterlastname.sendKeys(lastname);
    }

    public void enterusername(String username) {
        enterusername.sendKeys(username);

    }

    public void entermailId(String emailId) {
        entermailId.sendKeys(emailId);
    }

    public void enterphonenumber(String phonenumber) {
        enterphonenumber.sendKeys(phonenumber);
    }

    public void enterwhatsappNumber(String whatsappNumber) {
        enterwhatsappNumber.sendKeys(whatsappNumber);
    }

    public void selectDistrict(String district) {
        WebElement districtElement = fluentWait(districtDropdown);
        dropDownvalue(districtElement, district);
    }

    public void SelectThana(String thana) {
        dropDownvalue(thanaDropdown, thana);
    }

    public void Enterpassword(String password) {
        enterpassword.sendKeys(password);
    }

    public void enterconfirmpassword(String confirmpassword) {
        enterconfirmpassword.sendKeys(confirmpassword);
    }

    public void enterreferenceCode(String referenceCode) {
        enterreferenceCode.sendKeys(referenceCode);
    }

    public void clickonisAgreeWithTermsAndConditions() {
        clickonisAgreeWithTermsAndConditions.click();
    }

    public void clickSubmitBtnSingIn() {
        clickSubmitBtnSingUp.click();
    }

    //singin

    public void clickOnSingIn() {
        fluentWaitClick(clickSingIn);
    }

    public void clickongusersinginbtn() {
        clickonGusersinginbtn.click();
    }

    public void enterEmailId(String emailid) {
        enteremailId.sendKeys(emailid);

    }

    public void enterpassword(String password) {
        enterPassword.sendKeys(password);
    }

    public void btnSingin() {
        btnsingin.click();

    }

}

