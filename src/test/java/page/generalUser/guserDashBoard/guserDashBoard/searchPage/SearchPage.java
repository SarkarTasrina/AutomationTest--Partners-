package page.generalUser.guserDashBoard.guserDashBoard.searchPage;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends Base {
    public SearchPage(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateUrl(String url) {
        navigateURL(url);
    }

    @FindBy(id = "searchText")
    WebElement searchBox;

    // Locator for the search result items//

    @FindBy(css = ".post_item_title h6")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//i[@onclick='SearchByText()']")
    WebElement searchButton;

// vehicles

    @FindBy(css = "div.overlayy[onclick^='DetailsView'][onclick*='Toyota-Corolla-Axio-Car-Dhaka-Banani-363']")
    WebElement carName;


    @FindBy(xpath = "//div[@class='details_des_left_body_desc']/p[2]/span[@class='body_desc_bold']")
    WebElement brandname;

    public String getbrandName() {
        return brandname.getText();
    }

    public void searchBox(String keyword) {
        searchBox.sendKeys(keyword);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickonCar() {
        fluentWaitClick(carName);
    }

    //for propertis

    @FindBy(xpath = "//div[@class=\"post_top_post\"]//div[@class=\"overlayy\"]")
    WebElement post_item_image;

    @FindBy(css = "div[id='detais_bg'] p:nth-child(2) span:nth-child(2)")
    WebElement landsize;

    public List<WebElement> getSearchResults() {
        return searchResults;
    }

    public void clickonlandpost() {
        fluentWaitClick(post_item_image);
    }

    public String getlandSize() {
        return landsize.getText();

    }

    /* Electronics */

    @FindBy(css = "div.overlayy[onclick^='DetailsView'][onclick*='iPhone-5S-Mobile-Dhaka-Banani-210']")
    WebElement iphoneTitleClick;

    public void clickonphone() {
        fluentWaitClick(iphoneTitleClick);

    }

    //Lifestyle

    @FindBy(css = "div.overlayy[onclick^='DetailsView'][onclick*='Just-Do-it-Printed-T-shirt-Fabric-Soft-And-Comfortable-T-Shirt-For-men-Mens-Clothes-Dhaka-Mirpur-320']")
    WebElement shirtTitleClick;

    @FindBy(xpath = "//h5[normalize-space()='BDT : 350']")
    WebElement shirtpriceBDT;

    public void clickOnShirt() {
        fluentWaitClick(shirtTitleClick);

    }

    public String getshirtpriceBDT() {

        return shirtpriceBDT.getText();
    }

    /////Search_item_Functionality_Category_Base///


    //properties

    @FindBy(xpath = "//div[@class=\"property_body\"]/div[@data-bs-target=\"#propertyTarget\"]")
    WebElement properties;

    @FindBy(xpath = "//div[@id=\"propertyTarget\"]/div/div/div[@class='modal-body']")
    WebElement modalDialogProperty;

    @FindBy(xpath = "//div[@onclick=\"Ad('PropertyService','Land For Sale')\"]")
    WebElement clickInLandForSale;

    @FindBy(xpath = "//div[@class='post_all_post']/div/a")
    private List<WebElement> searchResultList;

    @FindBy(css = "div.overlayy[onclick^='DetailsView'][onclick*='Madani-Avenue-100-feet-Dhaka-Land-For-Sale-Dhaka-Vatara-385']")
    WebElement postTitleClick;

    @FindBy(xpath = "//h5[normalize-space()='BDT : 200000000']")
    WebElement landPrice;

    public void propertiesbody() {
        properties.click();
    }

    public void isModalDialogOfPropertyDisplayed() {
        modalDialogProperty.isDisplayed();
    }

    public void clickOnLandForSale() {
        fluentWaitClick(clickInLandForSale);
    }

    public List<WebElement> getSearchResultsCatBase() {
        return searchResultList;
    }

    public void clickOnLandTitle() {
        fluentWaitClick(postTitleClick);
    }

    public String getprice() {
        return landPrice.getText();
    }

    //Vehicles

    @FindBy(xpath = "//div[@data-bs-target=\"#vehicalsTarget\"]")
    WebElement clickInVehicle;

    @FindBy(xpath = "//div[@onclick=\"Ad('VehicleService','Car')\"]")
    WebElement clickInCar;

    @FindBy(css = "div.overlayy[onclick^='DetailsView'][onclick*='Toyota-Aqua-2019-S-Car-Dhaka-Baridhara-J-Block-362']")
    WebElement postCarTitleClick;

    @FindBy(xpath = "//div[@class='details_des_left_body_desc']//span[@class='body_desc_bold'][normalize-space()='Toyota']")
    WebElement brandName;

    public void clickOnVehicle() {
        fluentWaitClick(clickInVehicle);
    }

    public void clickOnCar() {
        fluentWaitClick(clickInCar);
    }

    public void clickOnCarPostTitle() {
        fluentWaitClick(postCarTitleClick);

    }

    public String getBrandName() {
        return brandName.getText();

    }

    //Electronics

    @FindBy(xpath = "//div[@data-bs-target=\"#electronicsTarget\"]")
    WebElement clickInElectronics;


    @FindBy(xpath = "//div[@onclick=\"Ad('ElectronicService','Home Appliances')\"]")
    WebElement clickInHomeAppliance;

    @FindBy(css = "div.overlayy[onclick^='DetailsView'][onclick*='Commercial-GAS-OVEN-for-Bakery-400KG-Home-Appliances-Dhaka-Dhanmondi-27-215']")
    WebElement clickInHomeAppliances;

    @FindBy(xpath = "//div[@class='saller_name']//h6[contains(text(),'Robin Robin')]")
    static WebElement sellerName;

    public void clickOnElectronics() {
        fluentWaitClick(clickInElectronics);
    }

    public void clickOnHomeAppliance() {
        fluentWaitClick(clickInHomeAppliance);
    }

    public void clickOnHomeAppliances() {
        fluentWaitClick(clickInHomeAppliances);
    }

    public static String getSellerName() {
        return sellerName.getText();
    }
    //Lifestyle

    @FindBy(xpath = "//div[@data-bs-target=\"#accessoriesTarget\"]")
    WebElement clickInLifestyle;

    @FindBy(xpath = "//div[@onclick=\"Ad('LifeStyleService','Mens Bags Or Wallets')\"]")
    WebElement clickInMensProduct;

    @FindBy(css = "div.overlayy[onclick^='DetailsView'][onclick*='Lowepro-Pro-runner-450-aw-Camera-Bagpack-Mens-Bags-Or-Wallets-Khulna-Khulna-Sadar-319']")
    WebElement clickInBagTitle;


    @FindBy(xpath = "//div[@class='details_des_left_body_desc']//span[@class='body_desc_bold'][normalize-space()='Backpack']")
    WebElement itemName;

    public void clickOnLifestyle() {
        fluentWaitClick(clickInLifestyle);
    }
    public void clickOnMensProduct() {
        fluentWaitClick(clickInMensProduct);
    }
    public void clickOnBagTitle() {
        fluentWaitClick(clickInBagTitle);
    }

    public String getItemName() {
        return itemName.getText();
    }

    //Job

    @FindBy(xpath = "//div[@data-bs-target=\"#jobTarget\"]")
    WebElement clickInJobs;

    @FindBy(xpath = "//div[@onclick=\"Job('JobService','Marketing Executive')\"]")
    WebElement clickInMarketing;

    @FindBy(xpath = "//h6[normalize-space()='Sales & Marketing']")
    WebElement clickInJobPosts;

    @FindBy(xpath = "//div[@class='details_des_left_body_desc']//span[@class='body_desc_bold'][normalize-space()='Full Time']")
    WebElement  JobType;

    public void clickOnJobs() {
        fluentWaitClick(clickInJobs);
    }

    public void clickOnMarketing() {
        fluentWaitClick(clickInMarketing);
    }

    public  void clickInjobPosts() {
        fluentWaitClick(clickInJobPosts);
    }

    public String getJobType() {
        return JobType.getText();
    }

}


