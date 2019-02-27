package com.cybertek.step_definitions;

import com.cybertek.pages.StarredMessagePage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StarredMessagePageStepDefinitions {

    StarredMessagePage starredMessagePage = new StarredMessagePage();

    @Then("the manager user clicks on Starred message button")
    public void the_manager_user_clicks_on_Starred_message_button() {
        starredMessagePage.starredMessageButton.click();
    }

    @Then("the general channel messages are displayed")
    public void the_general_channel_messages_are_displayed() {
        System.out.println("Displaying general channel messages");

        List<WebElement> messages = Driver.getDriver().findElements(By.xpath("//div[@class='o_thread_message_content']"));

        for(WebElement message : messages) {
            System.out.println(message.getText());
        }

    }

    @Then("the manager clicks on star icon")
    public void the_manager_clicks_on_star_icon() {
        System.out.println("Clicking on star icon");
        starredMessagePage.starIcon.click();
    }

    @Then("this message is displayed in starred message")
    public void this_message_is_displayed_in_starred_message() {
        System.out.println("Starred message is : " + starredMessagePage.starredMessageInGeneralChannel.getText());

        System.out.println("Verifying actual starred message is equal to expected starred message");
        assertEquals(starredMessagePage.starredMessageInStarredMessage.getText(), starredMessagePage.starredMessageInGeneralChannel.getText());

    }

    @Then("the starred message count is displayed")
    public void the_starred_message_count_is_displayed() {
        System.out.println("Starred message count is : " + starredMessagePage.starredMessageCount.getText());
    }


}
