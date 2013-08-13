package jbehave.webdriver.steps;

import jbehave.webdriver.pages.google.GooglePages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 11:22
 */
public class GoogleSearchSteps {

    private GooglePages googlePages;

    public GoogleSearchSteps(GooglePages googlePages) {
        this.googlePages = googlePages;
    }

    @Given("I go to google home page")
    public void toGoogle(){
        googlePages.homePage();
    }

    @When("I enter $keyword to search")
    public void searchGoogle(String keyword){
        googlePages.homePage().search(keyword);
    }

    @Then("I see results for $keyword")
    public void verifyResults(String keyword){
        googlePages.resultsPage();
        googlePages.resultsPage().found(keyword);
    }
}
