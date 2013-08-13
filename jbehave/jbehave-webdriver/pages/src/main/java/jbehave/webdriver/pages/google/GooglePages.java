package jbehave.webdriver.pages.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 11:20
 */
public class GooglePages {

    private WebDriver webDriver;

    private HomePage homePage;

    private ResultsPage resultsPage;

    public GooglePages() {
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("javascript.enabled", false);
        this.webDriver = new FirefoxDriver(firefoxProfile);
    }

    public HomePage homePage(){

        if(homePage == null){
            webDriver.get("http://google.co.uk");
            homePage = new HomePage(webDriver);
        }

        return homePage;
    }

    public ResultsPage resultsPage(){

        if(resultsPage == null){
            resultsPage = new ResultsPage(webDriver);
        }

        return resultsPage;
    }

    public void closeBrowser(){
        webDriver.quit();
    }


}
