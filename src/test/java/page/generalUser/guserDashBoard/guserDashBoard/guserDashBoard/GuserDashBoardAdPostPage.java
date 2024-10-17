package page.generalUser.guserDashBoard.guserDashBoard.guserDashBoard;

import base.Base;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class GuserDashBoardAdPostPage extends Base {
    public GuserDashBoardAdPostPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }

   // @FindBy(xpath = " //p[normalize-space()='Nisha Tasrina']")
   // @FindBy(xpath = " //div[@class='partner_username']")
    @FindBy(className="partner_username")
    WebElement dashboardDisplyed;

    @FindBy(xpath = "//div[@class='user_dashboard_addpost_part']")
    WebElement PostAdclick;

    @FindBy(xpath = "//p[normalize-space()='Sell, Rent, property, service & Job']")
    WebElement ClickSellerPost;

         public String viewDashbord(){
          return dashboardDisplyed.getText();
             }


    public void clickOnPostAd() {
      PostAdclick.click();
    }
    public void clickOnSellerPost() {
        ClickSellerPost.click();
    }

    //properties ad Post

    @FindBy(xpath = "//a[normalize-space()='Properties']")
    WebElement ClickPropertiesPost;

    @FindBy(xpath = "//a[normalize-space()='Flat For Sale']")
    WebElement ClickFlatForSale;

    @FindBy(id="title")
    WebElement enterTitle;

    @FindBy(id="noOfBedroom")
    WebElement enterNoOfBedroom;

    @FindBy(id="noOfBathroom")
    WebElement enterNoOfBathroom;

    @FindBy(id="size")
    WebElement enterSize;

    @FindBy(id="carParkingId")
    WebElement CarParkingIdDropDown;

    @FindBy(id="apartmentFeature")
    WebElement ApartmentFeatureDropDown;

    @FindBy(id="facingDirection")
    WebElement FacingDirectionDropDown;

    @FindBy(id="completionStatus")
    WebElement completionStatusDropDown;

    @FindBy(id="address")
    WebElement enteraddress;

    @FindBy(id="description")
    WebElement enterDescription;

    @FindBy(id="price")
    WebElement enterPrice;

    @FindBy(id="priceUnitTypeId")
    WebElement priceunitTypeDropDown;

    @FindBy(id="isNegotiable")
    WebElement isNegotiableCheckbox;

    @FindBy(id="thana")
    WebElement thanaDropDown;

    @FindBy(id="phoneNumber")
    WebElement enterPhoneNumber;

    @FindBy(id="addImageButton")
    WebElement clickaddImage;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement submitButton;

    public void clickOnPropertiesPost() {
        ClickPropertiesPost.click();
    }
    public void clickOnFlatForSale() {
        ClickFlatForSale.click();
    }
    public void clickSignUpDropdown() {
        try {
            if (ClickFlatForSale.isDisplayed()) {
                ClickFlatForSale.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        }
    }

    public void EnterTitle(String title) {
        enterTitle.sendKeys(title);
    }
    public void EnterNoOfBedroom(String noOfBedroom) {
        enterNoOfBedroom.sendKeys(noOfBedroom);
    }
    public void EnterNoOfBathroom(String noOfBathroom) {
        enterNoOfBathroom.sendKeys(noOfBathroom);
    }
    public void EnterSize(String size) {
        enterSize.sendKeys(size);
    }

    public void selectCarParkingId(String carParkingId) {
        WebElement carParkingElement  = fluentWait(CarParkingIdDropDown);
        dropDownvalue(carParkingElement, carParkingId);

    }

    public void selectApartmentFeature(String apartmentFeature) {
        dropDownvalue(ApartmentFeatureDropDown, apartmentFeature);
    }

    public void selectFacingDirection(String facingDirection) {
        dropDownvalue(FacingDirectionDropDown, facingDirection);
    }
    public void selectCompletionStatus(String completionStatus) {
        dropDownvalue(completionStatusDropDown, completionStatus);
    }

    public void enterAddress(String address) {
        enteraddress.sendKeys(address);
    }

    public void EnterDescription(String description) {
        enterDescription.sendKeys(description);
    }

    public void EnterPrice(String price) {
        enterPrice.sendKeys(price);
    }

    public void selectPriceUnitType(String priceUnitType) {
        dropDownvalue(priceunitTypeDropDown, priceUnitType);
    }
    public void checkIsNegotiable() {
        isNegotiableCheckbox.click();
    }

    public void SelectThanas(String thanas) {
        dropDownvalue(thanaDropDown, thanas);

    }

    public void EnterPhoneNumber(String phoneNumber) {
        enterPhoneNumber.sendKeys(phoneNumber);
    }

    public void UploadAddImage(String imagePath) {
        File file = new File(imagePath  );
        if(file.exists()){
            clickaddImage.sendKeys(file.getAbsolutePath());
        } else {
            System.out.println("File does not exist: " + imagePath  );
        }
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    //Vehicles

    @FindBy(xpath = "//a[normalize-space()='Vehicles']")
    WebElement clickInVehicles;

    @FindBy(xpath = "//a[normalize-space()='Car']")
    WebElement clickInCar;

    @FindBy(id="title")
    WebElement entertitle;

    @FindBy(id="select2-condition-container")
    WebElement conditionDropDown;

    @FindBy(id="select2-brand-container")
    WebElement brandDropDown;

    @FindBy(className="select2-selection select2-selection--single")
    WebElement modelDropDown;

    @FindBy(id = "description")
    WebElement enterdescription;

    @FindBy(id = "address")
    WebElement enterAddress;

    @FindBy(id="select2-transmission-container")
    WebElement transmissionDropDown;

    @FindBy(id="edition")
    WebElement Enteredition;

    @FindBy(id="engineCapacity")
    WebElement enterEngineCapacity;

    @FindBy(id="manufectureYear")
    WebElement manufactureYearDropDown;

    @FindBy(id="mileage")
    WebElement entermileage;

    @FindBy(id="registrationYear")
    WebElement registrationYearDropDown;

    @FindBy(id="select2-bodyType-container")
    WebElement select2BodyTypeDropDown;

    @FindBy(id="435")
    WebElement checkFuelType;

    @FindBy(id="price")
    WebElement enterprice;

    public void clickOnVehicles() {
        clickInVehicles.click();
    }

    public void clickOnCar() {
        clickInCar.click();
    }

    public void enterTitle(String title) {
        entertitle.sendKeys(title);
    }
    public void selectConditions(String conditions) {
        dropDownvalue(conditionDropDown, conditions);
    }
    public void selectBrand(String brand) {
        dropDownvalue(brandDropDown, brand);
    }
    public void selectModel(String model) {
        dropDownvalue(modelDropDown, model);
    }



    public void enteraddress(String address) {
        enterAddress.sendKeys(address);
    }

    public void selectTransmission(String transmission) {
        dropDownvalue(transmissionDropDown, transmission);
    }

    public void enteredition(String edition) {
        Enteredition.sendKeys(edition);

    }

    public void EnterEngineCapacity(String capacity) {
        enterEngineCapacity.sendKeys(capacity);
    }

    public void  selectManufactureYear(String manufactureYear) {
        dropDownvalue(manufactureYearDropDown, manufactureYear);
    }

    public void Entermileage(String mileage) {
        entermileage.sendKeys(mileage);
    }
    public void selectRegistrationYear(String registrationYear) {
        dropDownvalue(registrationYearDropDown, registrationYear);

    }

    public void selectBodyType(String bodyType) {
        dropDownvalue(select2BodyTypeDropDown, bodyType);
    }

    public void selectFuelType(String fuelType) {
        checkFuelType.click();
    }

    public  void enterPrice(String price) {
        enterprice.sendKeys(price);

    }


    //electronics
    @FindBy(xpath = "//a[normalize-space()='Electronics']")
    WebElement clickInElectronics;

    @FindBy(xpath = "//a[normalize-space()='Mobile']")
    WebElement clickInMobile;

    @FindBy(id="ram")
    WebElement enterRam;

    @FindBy(id="processor")
    WebElement enterProcessor;

    public void clickOnElectronics() {
        clickInElectronics.click();
    }

    public void clickOnMobile() {
        clickInMobile.click();
    }

    public void EnterRam(String ram) {
        enterRam.sendKeys(ram);
    }

    public void EnterProcessor(String processor) {
        enterProcessor.sendKeys(processor);
    }
}
