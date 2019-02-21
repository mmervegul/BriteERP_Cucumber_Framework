package com.cybertek.step_definitions;

import com.cybertek.pages.GeneralChannelPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    @When("the manager clicks Discussion Group channel")
    public void the_manager_clicks_Discussion_Group_channel() {
        System.out.println("Clicking on Discussion Group channel");
        generalChannelPage.discussionGroup.click();
    }

    @Then("the manager clicks on Invite button")
    public void the_manager_clicks_on_Invite_button() {
        System.out.println("Clicking on Invite button");
        generalChannelPage.inviteButton.click();
    }

    @Then("the manager clicks on Invite search box")
    public void the_manager_clicks_on_Invite_search_box() {
        System.out.println("Clicking on Invite search box");
        generalChannelPage.inviteSearchBox.click();
    }

    @Then("Invite search box is displayed")
    public void invite_search_box_is_displayed() {
        System.out.println("Verifying invite search box is displayed");
        assertTrue(generalChannelPage.inviteSearchBox.isDisplayed());

    }

    @Then("the manager writes valid username")
    public void the_manager_writes_valid_username() {
        System.out.println("Writing valid username to invite search box");
        generalChannelPage.EventsCRM_Manager4.click();
    }

    @Then("the manager writes second valid username")
    public void the_manager_writes_second_valid_username() {
        System.out.println("Writing second valid username to invite search");
        generalChannelPage.EventsCRM_Manager5.click();
    }

    @Then("the manager clicks on second Invite button")
    public void the_manager_clicks_on_second_Invite_button() {
        System.out.println("Clicking on second Invite button to channel");
        generalChannelPage.secondInviteButton.click();
    }

    @Then("all valid username is displayed")
    public void all_valid_username_is_displayed() {
        System.out.println("Displaying all valid username");

        List<WebElement> allUsers = Driver.getDriver().findElements(By.xpath("//div[@id='select2-drop']"));

        for (WebElement str : allUsers) {
            System.out.println(str.getText());
        }
    }






}
