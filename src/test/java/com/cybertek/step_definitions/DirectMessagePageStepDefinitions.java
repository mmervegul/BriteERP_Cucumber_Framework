package com.cybertek.step_definitions;

import com.cybertek.pages.DirectMessagePage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.*;

public class DirectMessagePageStepDefinitions {

    @Then("click on direct message plus sign button")
    public void click_on_direct_message_plus_sign_button() {
        DirectMessagePage directMessagePage = new DirectMessagePage();
        BrowserUtilities.wait(5);
        directMessagePage.directMessagePlusSign.click();
    }

}
