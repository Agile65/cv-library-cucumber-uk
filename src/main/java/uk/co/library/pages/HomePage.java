package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    // 1.HomePage -
    //  Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
    //  Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
    //  enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
    //  clickOnFindJobsButton().
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(id = "location")
    WebElement location;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    public void setAcceptCookie() throws InterruptedException{
        switchToIframe(iframe);
        Thread.sleep(2000);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle1){
        sendTextToElement(jobTitle,jobTitle1);
        log.info("Enter job title : " + jobTitle1.toString());
    }
    public void enterLocation(String location1){
        sendTextToElement(location,location1);
        log.info("Enter location : " + location1.toString());
    }
    public void selectDistance(String distance1) throws Exception{
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(distanceDropDown,distance1);
        log.info("Select distance : " + distance1.toString());
    }
    public void clickOnMoreSearchLink(){
        clickOnElement(moreSearchOptionsLink);
        log.info("Click on search option : " + moreSearchOptionsLink.toString());
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
        log.info("Enter minimum salary : " +minSalary.toString());
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
        log.info("Enter maximum salary : " + maxSalary.toString());
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
        log.info("Click on salary type : " + sType.toString());
    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        log.info("Click on job type : " + jobType.toString());
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
        log.info("Click on jobs button : " + findJobsBtn.toString());
    }
}
