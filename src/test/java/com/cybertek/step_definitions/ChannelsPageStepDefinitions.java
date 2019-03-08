package com.cybertek.step_definitions;

import com.cybertek.pages.ChannelsPage;
import com.cybertek.utilities.DatabaseUtility;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.cybertek.utilities.DatabaseUtility.createConnection;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

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

    @When("the manager clicks on sales channel")
    public void the_manager_clicks_on_sales_channel() {
        System.out.println("Clicking on sales channel name");
        channelsPage.firstSalesChannel.click();
    }

    @When("the channel name is equal to the sales channel name")
    public void the_channel_name_is_equal_to_the_sales_channel_name() {
        System.out.println("Expected channel name is : " + channelsPage.firstSalesChannel.getText());

        System.out.println("Verifying actual channel name equals to expected channel name");
        assertEquals(channelsPage.firstSalesChannel.getText(), channelsPage.salesChannelName.getText());

    }

    @Then("the manager clicks on sales channel user name")
    public void the_manager_clicks_on_sales_channel_user_name() {
        System.out.println("Clicking on ManufacturingManager4 user");
        channelsPage.manufacturingManager4User.click();

        System.out.println("Clicking on ManufacturingManager5 user");
        channelsPage.manufacturingManager5User.click();

        System.out.println("Clicking on SalesManager user");
        channelsPage.salesManagerUser.click();
    }

    @Then("the expected user names are equal to actual user names")
    public void the_expected_user_names_are_equal_to_actual_user_names() {
        System.out.println("Verifying actual user names equals to expected "
                                + channelsPage.manufacturingManager4User.getText() + " user");

        assertEquals(channelsPage.manufacturingManager4User.getText(), channelsPage.expectedManufacturingManager4User.getText());

        System.out.println("Verifying actual user names equals to expected "
                                + channelsPage.manufacturingManager5User.getText() + " user");

        assertEquals(channelsPage.manufacturingManager5User.getText(), channelsPage.expectedManufacturingManager5User.getText());

        System.out.println("Verifying actual user names equals to expected "
                                + channelsPage.salesManagerUser.getText() + " user");

        assertEquals(channelsPage.salesManagerUser.getText(), channelsPage.expectedSalesManagerUser.getText());

    }

    @Then("the manager sees sales channel members recipient and email")
    public void the_manager_sees_sales_channel_members_recipient_and_email() {
        System.out.println("Getting sales channel members recipient and email");

        List<WebElement> allUsers = Driver.getDriver().findElements(By.xpath("//tbody[@class='ui-sortable']"));

        for (WebElement str : allUsers) {
            System.out.println(str.getText());
        }
    }

    @Then("the manager clicks on Create button to create new channel")
    public void the_manager_clicks_on_Create_button_to_create_new_channel() {
        channelsPage.createButton.click();
    }

    @When("the manager writes channel name")
    public void the_manager_writes_channel_name() {
        channelsPage.channelNameBox.click();
        channelsPage.channelNameBox.sendKeys("New Group");
    }

    @When("the manager writes channel description to Description box")
    public void the_manager_writes_channel_description_to_Description_box() {
        channelsPage.descriptionBox.sendKeys("Welcome to the New Group");
    }

    @Then("the manager clicks on Save button to crete new channel")
    public void the_manager_clicks_on_Save_button_to_crete_new_channel() {
        channelsPage.saveButton.click();
    }

    @Then("the manager clicks on new channel")
    public void the_manager_clicks_on_new_channel() {
        channelsPage.teamName.click();
    }

    List<Object> names;
    @Then("the manager sees channel name in database")
    public void the_manager_sees_channel_name_in_database() {
        DatabaseUtility.createConnection();

        String teamName = channelsPage.teamName.getText();

        String sql = "SELECT name FROM mail_channel WHERE name = '" + teamName + "';";

        names = DatabaseUtility.getColumnData(sql, "name");
        System.out.println(names);
    }

    List<Object> description;
    @Then("the manager sees channel description in database")
    public void the_manager_sees_channel_description_in_database() {
        DatabaseUtility.createConnection();

        String teamDescription = channelsPage.teamDescription.getText();
        System.out.println(teamDescription);

        String sql = "SELECT description FROM mail_channel WHERE name = '" + teamDescription + "';";

        description = DatabaseUtility.getColumnData(sql, "description");
        System.out.println(description);

    }


}
