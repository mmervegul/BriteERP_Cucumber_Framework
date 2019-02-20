package com.cybertek.step_definitions;

import com.cybertek.pages.GeneralChannelPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;

public class GeneralChannelPageStepDefinition {

    GeneralChannelPage generalChannelPage = new GeneralChannelPage();

    @Then("the manager user clicks on Channels button")
    public void the_manager_user_clicks_on_Channels_button() {
        System.out.println("Clicking on Channels button");
        generalChannelPage.channelsButton.click();
    }


}
