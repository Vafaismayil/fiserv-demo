package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ResultPage;
import pages.SearchPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SearchPageStepDefs {
    SearchPage searchPage = new SearchPage();
    ResultPage resultPage = new ResultPage();

    @Given("user lands on search engine")
    public void user_lands_on_search_engine() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user search for given {string}")
    public void user_search_for_given(String str) {
        searchPage.searchFor(str);
    }

    @Then("user verifies first item from search result is {string}")
    public void userVerifiesFirstItemFromResultPageIs(String str) {
        String actual = resultPage.getSearchResultTextList().get(0);
        Assert.assertEquals(str, actual);
    }
}
