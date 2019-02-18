package com.cybertek.step_definitions;

import com.cybertek.pages.PrivateChannelPage;
import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.*;
import org.openqa.selenium.Keys;

public class PrivateChannelPageStepDefinitions {

    PrivateChannelPage privateChannelPage = new PrivateChannelPage();

    @Then("click on private message plus sign button")
    public void click_on_private_message_plus_sign_button() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.wait(5);
        System.out.println("Clicking on plus sign button");
        privateChannelPage.privateChannelPlusButton.click();
    }

    @Then("the manager enters private valid user name")
    public void the_manager_enters_private_valid_user_name() {
        System.out.println("Enters private valid user name");
        privateChannelPage.addAPrivateChannelBox.sendKeys("SalesManager4", Keys.ENTER);
        BrowserUtilities.wait(5);
    }

    @When("write something on private message Write something box")
    public void write_something_on_private_message_Write_something_box() {
        System.out.println("Writing something on private message write something box");
        privateChannelPage.writeSomethingBox.sendKeys("Good morning!");
    }

    @When("click on private message emoji button")
    public void click_on_private_message_emoji_button() {
        System.out.println("Clicking on private message emoji button");
        privateChannelPage.emojiButtonPrivateChannel.click();
    }

    @When("click on Thumbs Up emoji")
    public void click_on_Thumbs_Up_emoji() {
        System.out.println("Clicking on Thumbs up emoji");
        privateChannelPage.thumbsUpEmoji.click();
    }

    @Then("click on Send button to send private message")
    public void click_on_Send_button_to_send_private_message() {
        System.out.println("Clicking on Send button to send private message");
        privateChannelPage.sendButton.click();
    }


}
