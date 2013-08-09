package sameer.jbehave.webdriver.pages.google;

import org.jbehave.web.selenium.WebDriverProvider;
import sameer.jbehave.webdriver.pages.PageTemplate;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 12:01
 */
public class ResultsPage extends PageTemplate {

    public ResultsPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    @Override
    public void atPage() {
        found(getTitle(), "Google Search");
    }
}
