package com.cybertek.step_definitions;

import com.cybertek.pages.PrivateChannelPage;
import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;
import org.openqa.selenium.Keys;

public class PrivateChannelPageStepDefinitions {

    PrivateChannelPage privateChannelPage = new PrivateChannelPage();

    @Then("the manager user clicks on private message plus sign button")
    public void the_manager_user_clicks_on_private_message_plus_sign_button() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.wait(5);

        System.out.println("Clicking on plus sign button");
        privateChannelPage.privateChannelPlusButton.click();

    }

    @Then("private channel plus sign is displayed")
    public void private_channel_plus_sign_is_displayed() {
        System.out.println("Verifying private channel plus button is displayed");
        assertTrue(privateChannelPage.privateChannelPlusButton.isDisplayed());
    }

    @Then("the manager user enters private valid user name")
    public void the_manager_user_enters_private_valid_user_name() {
        System.out.println("Adding new private valid user name to private channel");
        privateChannelPage.addAPrivateChannelBox.sendKeys("SalesManager4", Keys.ENTER);
    }

    @When("the manager user writes something on private message Write something box")
    public void the_manager_user_writes_something_on_private_message_Write_something_box() {
        System.out.println("Writing something on private message write something box");
        privateChannelPage.writeSomethingBox.sendKeys("Good morning!");
    }

    @Then("add a private channel box is displayed")
    public void add_a_private_channel_box_is_displayed() {
        System.out.println("Verifying add a private channel box is displayed");
        privateChannelPage.addAPrivateChannelBox.isDisplayed();
    }

    @When("the manager user clicks on private message emoji button")
    public void the_manager_user_clicks_on_private_message_emoji_button() {
        System.out.println("Clicking on private message emoji button");
        privateChannelPage.emojiButtonPrivateChannel.click();
    }

    @When("the manager user clicks on Thumbs Up emoji")
    public void the_manager_user_clicks_on_Thumbs_Up_emoji() {
        System.out.println("Clicking on Thumbs up emoji");
        privateChannelPage.thumbsUpEmoji.click();
    }

    @Then("the manager user clicks on Send button to send private message")
    public void the_manager_user_clicks_on_Send_button_to_send_private_message() {
        System.out.println("Clicking on Send button to send private message");
        privateChannelPage.sendButton.click();
    }

    @Then("the manager user clicks on Unsubscribe button")
    public void the_manager_user_clicks_on_Unsubscribe_button() {
        System.out.println("Clicking on Unsubscribe button");
        privateChannelPage.unsubscribeButton.click();
    }

    @Then("the manager user see messages date from any private channel")
    public void the_manager_user_see_messages_date_from_any_private_channel() {
        System.out.println("Messages date : " + privateChannelPage.date.getText());
    }


}
