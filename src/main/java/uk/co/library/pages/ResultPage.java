package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    //2.ResultPage
    //  Locators - resultText
    //  Method - verifyTheResults(String expected)
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css=".search-header__title")
    WebElement resultText;
    public void verifyTheResults(String expected){
        Assert.assertEquals(resultText.getText(),expected,"Error");
        log.info("Result verified : " + resultText.toString());
    }

}
