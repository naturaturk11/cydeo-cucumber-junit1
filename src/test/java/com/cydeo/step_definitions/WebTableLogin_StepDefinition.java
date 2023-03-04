package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefinition {
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
    }
    @When("user enters username {string}")
    public void userEntersUsername(String string) {
        webTableLoginPage.inputUserName.sendKeys(string);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
     webTableLoginPage.inputLoginButton.click();
    }
    @Then("user see URL contains orders")
    public void user_see_url_contains_orders() {

       BrowserUtils.verifyUrlContains("orders");
    }


    @When("user enters username {string} password {string} logins")
    public void userEntersUsernamePasswordLogins(String username, String password) {
    webTableLoginPage.login(username,password);

    }
    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {

       // webTableLoginPage.inputUserName.sendKeys(credentials.get("username"));
        //webTableLoginPage.inputPassword.sendKeys("password");
        //webTableLoginPage.inputLoginButton.click();

        //we can call our loin utility
        webTableLoginPage.login("username","password");


    }
}
