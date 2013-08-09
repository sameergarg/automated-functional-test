package sameer.jbehave.webdriver.pages.google;

import org.jbehave.web.selenium.WebDriverProvider;
import sameer.jbehave.webdriver.pages.google.HomePage;
import sameer.jbehave.webdriver.pages.google.ResultsPage;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 11:20
 */
public class GooglePages {

    private WebDriverProvider driverProvider;

    private HomePage homePage;

    private ResultsPage resultsPage;

    public GooglePages(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    public HomePage homePage(){

        if(homePage == null){
            driverProvider.get().get("http://google.co.uk");
            homePage = new HomePage(driverProvider);
        }

        return homePage;
    }

    public ResultsPage resultsPage(){

        if(resultsPage()==null){
            resultsPage = new ResultsPage(driverProvider);
        }

        return resultsPage;
    }


}
