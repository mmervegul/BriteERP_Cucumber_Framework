package com.cybertek.step_definitions;

import com.cybertek.pages.DirectMessagePage;
import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

public class DirectMessagePageStepDefinitions {

    DirectMessagePage directMessagePage = new DirectMessagePage();

    @Then("click on direct message plus sign button")
    public void click_on_direct_message_plus_sign_button() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.wait(5);
        System.out.println("Clicking on plus sign button");
        directMessagePage.directMessagePlusSign.click();
    }

    @Then("the search box needs to be displayed")
    public void the_search_box_needs_to_be_displayed() {
        System.out.println("Verifying direct message search boc is displayed");
        assertTrue(directMessagePage.writeSomethingBoxForDirectMessage.isDisplayed());
    }

    @Then("the manager enters valid user name")
    public void the_manager_enters_valid_user_name() {
        System.out.println("Writing 'SalesManager4' user");
        directMessagePage.usernameSearchBox.sendKeys("SalesManager4");
    }

    @When("the manager clicks on user")
    public void the_manager_clicks_on_user() {
        System.out.println("Clicking on 'SalesManager4' user");
        BrowserUtilities.wait(5);
        directMessagePage.salesManager4.click();
    }

    @And("click on Write something box")
    public void click_on_Write_something_box() {
        System.out.println("Clicking on Write something box");
        BrowserUtilities.wait(5);
        directMessagePage.writeSomethingBoxForDirectMessage.click();
    }

    @When("write something on Write something box")
    public void write_something_on_Write_something_box() {
        System.out.println("Writing something on Write something box");
        directMessagePage.writeSomethingBoxForDirectMessage.sendKeys("Hello");
    }


    @When("click on emoji button")
    public void click_on_emoji_button() {
        System.out.println("Clicking on emoji button");
        directMessagePage.directMessageEmojiButton.click();
    }

    @When("click on party emoji")
    public void click_on_party_emoji() {
        System.out.println("Clicking on party emoji");
        directMessagePage.directMessagePartyEmoji.click();
    }

    @When("click on Send button")
    public void click_on_Send_button() {
        System.out.println("Clicking on Send button");
        directMessagePage.directMessageSendButton.click();

        System.out.println("Verifying actual message contains expected message");
        assertTrue(directMessagePage.getMessage.getText().contains("Hello"));

    }

    @Then("click on x sign")
    public void click_on_x_sign() {
        directMessagePage.leaveFromSalesManager4Channel.click();
    }




}
