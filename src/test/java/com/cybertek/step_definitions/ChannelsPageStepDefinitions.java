package com.cybertek.step_definitions;

import com.cybertek.pages.ChannelsPage;
import cucumber.api.java.en.Then;

public class ChannelsPageStepDefinitions {

    ChannelsPage channelsPage = new ChannelsPage();

    @Then("the manager user clicks on Channels button")
    public void the_manager_user_clicks_on_Channels_button() {
        System.out.println("Clicking on Channels button");
        channelsPage.channelsButton.click();
    }
}
