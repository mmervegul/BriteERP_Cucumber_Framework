package com.cybertek.step_definitions;

import com.cybertek.pages.GeneralChannelPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class GeneralChannelPageStepDefinition {

    GeneralChannelPage generalChannelPage = new GeneralChannelPage();

    @Then("the manager user clicks on Channels button")
    public void the_manager_user_clicks_on_Channels_button() {
        System.out.println("Clicking on Channels button");
        generalChannelPage.channelsButton.click();
    }

    @When("the manager user clicks on channels plus sign")
    public void the_manager_user_clicks_on_channels_plus_sign() {
        System.out.println("Clicking on channels plus sign");
        generalChannelPage.channelsPlusSign.click();
    }

    @When("channels plus sign is clickable")
    public void channels_plus_sign_is_clickable() {
        System.out.println("Verifying channels plus sign is clickable");
        assertTrue(generalChannelPage.channelsPlusSign.isDisplayed());
    }

    @When("Add a channel box is displayed")
    public void add_a_channel_box_is_displayed() {
        System.out.println("Verifying add a channel box is displayed");
        assertTrue(generalChannelPage.addAChannelBox.isDisplayed());
    }

    @When("the manager user clicks on Add a channel box")
    public void the_manager_user_clicks_on_Add_a_channel_box() {
        System.out.println("Clicking on Add a channel box");
        generalChannelPage.addAChannelBox.click();
    }

    @Then("the manager user writes channel name to the Add a channel box")
    public void the_manager_user_writes_channel_name_to_the_Add_a_channel_box() {
        System.out.println("Writing new channel name to the Add a channel box");
        generalChannelPage.addAChannelBox.sendKeys("new team");
    }

    @Then("the manager clicks on Create link")
    public void the_manager_clicks_on_Create_link() {
        System.out.println("Clicking on Create button");
        generalChannelPage.createChannel.click();
    }

    @Then("the manager sees new channel name")
    public void the_manager_sees_new_channel_name() {
        System.out.println(generalChannelPage.newTeam.getText().substring(2) + " is created");
        assertTrue(generalChannelPage.newTeam.getText().substring(2).equals("new team"));
    }

    @Then("the manager clicks on channel name")
    public void the_manager_clicks_on_channel_name() {
        System.out.println("Clicking on new channel name");
        generalChannelPage.newTeam.click();

    }

    @Then("the manager sees created channel message when click on the channel name")
    public void the_manager_sees_created_channel_message_when_click_on_the_channel_name() {
        System.out.println("Clicking on new team channel");
        generalChannelPage.newTeam.click();

        System.out.println("Verifying message is : " + generalChannelPage.createdChannelText.getText());

        System.out.println("Verifying actual channel text is equals expected channel text");
        assertTrue(generalChannelPage.createdChannelText.getText().equals("created #new team"));
    }


}
