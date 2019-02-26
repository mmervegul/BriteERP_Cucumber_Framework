package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

public class LoginPageStepDefinitions {

    // MANAGER USER
    LoginPage loginPage = new LoginPage();

    @Given("the manager is on the landing page")
    public void the_manager_is_on_the_landing_page() {
        System.out.println("Going to the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the manager enters valid email address")
    public void the_manager_enters_valid_email_address() {
        System.out.println("Entering manager username");
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("managerUserName"));
    }

    @When("the manager enters valid password")
    public void the_manager_enters_valid_password() {
        System.out.println("Entering manager password");
        loginPage.password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
    }

    @Then("the manager clicks on Login button")
    public void the_manager_clicks_on_Login_button() {
        System.out.println("Clicking on login button");
        loginPage.loginButton.click();
    }

    @When("the manager enters invalid password")
    public void the_manager_enters_invalid_password() {
        System.out.println("Entering manager wrong password");
       loginPage.password.sendKeys(ConfigurationReader.getProperty("managerWrongPassword"));
    }

    @Then("the manager sees {string} message")
    public void the_manager_sees_message(String message) {
        System.out.println("Invalid login error message : " + loginPage.wrongLoginPasswordMessage.getText());
        System.out.println("Verifying actual invalid login message equals to expected invalid login message");
        assertEquals(message, loginPage.wrongLoginPasswordMessage.getText());
    }

    // USER LOGIN

    @Given("the user is on the landing page")
    public void the_user_is_on_the_landing_page() {
        System.out.println("Going to the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks on BriteErpDemo button")
    public void the_user_clicks_on_BriteErpDemo_button() {
        System.out.println("Clicking on BriteErp Demo button");
        loginPage.BriteErpDemoButton.click();
    }

    @When("the user enters valid email address")
    public void the_user_enters_valid_email_address() {
        System.out.println("Entering sales username");
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("salesUserName"));
    }

    @When("the user enters valid password")
    public void the_user_enters_valid_password() {
        System.out.println("Entering sales password");
        loginPage.password.sendKeys(ConfigurationReader.getProperty("salesPassword"));
    }

    @Then("the user clicks on Login button")
    public void the_user_clicks_on_Login_button() {
        System.out.println("Clicking on login button");
        loginPage.loginButton.click();
    }

    @When("the user enters invalid password")
    public void the_user_enters_invalid_password() {
        System.out.println("Entering sales wrong password");
        loginPage.password.sendKeys(ConfigurationReader.getProperty("salesWrongPassword"));
    }

    @Then("the user sees {string} message")
    public void the_user_sees_message(String message) {
        System.out.println("Invalid login error message : " + loginPage.wrongLoginPasswordMessage.getText());

        System.out.println("Verifying actual invalid login message equals to expected invalid login message");
        assertEquals(message, loginPage.wrongLoginPasswordMessage.getText());
    }






}
