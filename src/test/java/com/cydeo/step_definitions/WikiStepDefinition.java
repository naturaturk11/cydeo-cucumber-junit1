package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefinition {


    WikiSearchPages wikiSearchPages=new WikiSearchPages();
    @Given("User is on wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");



    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

        wikiSearchPages.searchBox.sendKeys(string);


    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

        wikiSearchPages.searchButton.click();

    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
  //in one single line verification of actual title contains string(coming from feature file
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }




    @Then("User sees {string} is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String string) {

        Assert.assertTrue(wikiSearchPages.mainHeader.isDisplayed());
        Assert.assertTrue(wikiSearchPages.mainHeader.getText().equals(string));
    }
}
