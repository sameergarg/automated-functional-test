package jbehave.webdriver.pages.google;

import jbehave.webdriver.pages.PageTemplate;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 12:01
 */
//@Page
public class ResultsPage extends PageTemplate {

    @Autowired
    public ResultsPage(WebDriver webDriver) {
        super(webDriver);
    }


    @Override
    public void atPage() {
        found(webDriver.getTitle(), "Google Search");
    }
}
