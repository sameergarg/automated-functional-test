package jbehave.webdriver.pages.google;

import jbehave.webdriver.pages.PageTemplate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 11:39
 */
//@Page
public class HomePage extends PageTemplate {

    @FindBy(id="gbqfq")
    private WebElement searchBox;

    @FindBy(id="gbqfba")
    private WebElement searchButton;

    @Autowired
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @Override
    public void atPage() {
        found(webDriver.getTitle(), "Google");
    }

    public void search(String keyword) {
        searchBox.sendKeys(keyword);

        searchButton.click();
    }
}
