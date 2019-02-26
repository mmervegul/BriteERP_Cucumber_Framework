package com.cybertek.step_definitions;

import com.cybertek.pages.ChannelsPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChannelsPageStepDefinitions {

    ChannelsPage channelsPage = new ChannelsPage();

    @Then("the manager clicks on Channels button")
    public void the_manager_clicks_on_Channels_button() {
        System.out.println("Clicking on Channels button");
        channelsPage.channelsButton.click();
    }

    @Then("all valid channels are displayed")
    public void all_valid_channels_are_displayed() {
        System.out.println("Displaying all valid channels");

        List<WebElement> channels = Driver.getDriver().findElements
                                        (By.xpath("//div[@class='oe_module_vignette oe_kanban_global_click o_kanban_record']"));

        for(WebElement channel : channels) {
            System.out.println(channel.getText());
        }
    }

    @When("the manager clicks on join button")
    public void the_manager_clicks_on_join_button() {
        System.out.println("Clicking on join button");
        channelsPage.joinButtonForEventChannel.click();
    }

    @When("the manager clicks on Discussion button")
    public void the_manager_clicks_on_Discussion_button() {
        System.out.println("Clicking on Discussion button");
        channelsPage.discussionButton.click();
    }

    @When("the manager clicks on Events channel")
    public void the_manager_clicks_on_Events_channel() {
        System.out.println("Clicking on Events channel name");
        channelsPage.eventsChannel.click();
    }

    @Then("the manager clicks on Members button")
    public void the_manager_clicks_on_Members_button() {
        System.out.println("Clicking on Members button");
        channelsPage.membersButton.click();
    }

    @Then("the manager clicks on Edit button")
    public void the_manager_clicks_on_Edit_button() {
        System.out.println("Clicking on Edit button");
        channelsPage.editButton.click();
    }

    @Then("the manager clicks on trash can icon")
    public void the_manager_clicks_on_trash_can_icon() {
        System.out.println("Clicking on trash can icon");
        channelsPage.trashcanIconForSalesManager3.click();
    }





}
