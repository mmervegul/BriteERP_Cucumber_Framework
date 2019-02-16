package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.*;

public class LoginPageStepDefinitions {

    // MANAGER USER
    LoginPage loginPage = new LoginPage();

    @Given("the manager is on the landing page")
    public void the_manager_is_on_the_landing_page() {
        System.out.println("Going to the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the manager clicks on BriteErpDemo button")
    public void the_manager_clicks_on_BriteErpDemo_button() {
        System.out.println("Clicking on BriteErp Demo button");
        loginPage.BriteErpDemoButton.click();
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



}