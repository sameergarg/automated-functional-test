package sameer.jbehave.webdriver.pages.google;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sameer.jbehave.webdriver.pages.PageTemplate;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 11:39
 */
public class HomePage extends PageTemplate {

    @FindBy(id="gbqfq")
    private WebElement searchBox;

    @FindBy(id="gbqfba")
    private WebElement searchButton;

    public HomePage(WebDriverProvider driverProvider) {
        super(driverProvider);
        PageFactory.initElements(driverProvider.get(), this);
    }

    @Override
    public void atPage() {
        found(getTitle(), "Google");
    }

    public void search(String keyword) {
        searchBox.sendKeys(keyword);

        //searchButton.click();
    }
}
