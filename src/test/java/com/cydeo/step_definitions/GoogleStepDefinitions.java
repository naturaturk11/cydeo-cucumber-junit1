package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

   GoogleSearchPages googleSearchPages=new GoogleSearchPages();
    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter1() {
        googleSearchPages.searchBox.sendKeys("apple"+Keys.ENTER);

    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchPages.searchBox.sendKeys(searchKeyword+Keys.ENTER);

    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle=string+" - Google'da Ara";
        String actualTitle=Driver.getDriver().getTitle();
        //Junit assertion accepts first arg as espected,second arg as actual
        Assert.assertEquals("Title is not as expected!",expectedTitle,actualTitle);
        //Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

            Driver.getDriver().get("https:google.com");

    }


    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle="Google";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
       Driver.closeDriver();

    }



    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        String expectedTitle="apple - Google'da Ara";
        String actualTitle=Driver.getDriver().getTitle();
        //Junit assertion accepts first arg as espected,second arg as actual
        Assert.assertEquals("Title is not as expected!",expectedTitle,actualTitle);
        //Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
}
