package com.cybertek.step_definitions;

import com.cybertek.pages.CrmPage;
import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.DatabaseUtility;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.ExcelUtil;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CRMPageStepDefinitions {

    String data = "./src/test/resources/test_data/briteerp_modules.xlsx";
    String sheetName =  "Sheet 2";
    ExcelUtil userData = new ExcelUtil(data, sheetName);

    CrmPage crmPage = new CrmPage();

    @When("the manager clicks on CRM button")
    public void the_manager_clicks_on_CRM_button() {
        BrowserUtilities.wait(5);
        crmPage.crmModule.click();
    }

    @Then("the manager clicks on Crm Create button")
    public void the_manager_clicks_on_Crm_Create_button() {
        crmPage.createButton.click();
    }

    @Then("the manager enters opportunity title to {string}")
    public void the_manager_enters_opportunity_title_to(String opportunityTitle) {
        BrowserUtilities.wait(5);
        crmPage.opportunityTitle.sendKeys(opportunityTitle);
    }

    @Then("the manager enters customer title to {string}")
    public void the_manager_enters_customer_title_to(String customer) {
        crmPage.customer.sendKeys(customer);
        crmPage.lastCreateButton.click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[3]")).click();
    }

    @Then("the manager enters expected revenue to {string}")
    public void the_manager_enters_expected_revenue_to(String expectedRevenue) {
        BrowserUtilities.wait(5);
        crmPage.expectedRevenue.click();
        crmPage.expectedRevenue.clear();
        crmPage.expectedRevenue.sendKeys(expectedRevenue);
    }

    @Then("the manager selects priority from {string}")
    public void the_manager_selects_priority_from(String priority) {
        crmPage.highPriority.click();
    }

    @Then("the manager clicks on create button")
    public void the_manager_clicks_on_create_button() {
        BrowserUtilities.wait(5);
        crmPage.lastCreateButton.click();
    }

    @Then("the manager should be able to see {string} opportunity")
    public void the_manager_should_be_able_to_see_opportunity(String opportunityTitle) {
        List<WebElement> opportunities = Driver.getDriver().findElements(By.className("o_kanban_record_title"));
        for(WebElement opportunity : opportunities){
            System.out.println(opportunity.getText());
        }

    }

    @Then("the manager should be able to see {string} customer title")
    public void the_manager_should_be_able_to_see_customer_title(String customer) {
        List<WebElement> customers = Driver.getDriver().findElements(By.xpath("//span[@class='o_field_monetary o_field_number o_field_widget']"));
        for(WebElement allCustomer : customers){
            System.out.println(allCustomer.getText());
        }
    }

    @Then("the manager should be able to see {string} expected revenue")
    public void the_manager_should_be_able_to_see_expected_revenue(String expectedRevenue) {
        List<WebElement> expectedRevenues = Driver.getDriver().findElements(By.xpath("//div[@class='text-muted o_kanban_record_subtitle']//span[3]"));
        for(WebElement allExpectedRevenue : expectedRevenues){
            System.out.println(allExpectedRevenue.getText());
        }
    }

    @Then("the manager should be able to see {string} priority")
    public void the_manager_should_be_able_to_see_priority(String priority) {
        BrowserUtilities.wait(5);
        List<WebElement> priorities = Driver.getDriver().findElements(By.xpath("//a[@title='Low']"));
        for(WebElement allPriority : priorities){
            System.out.println(allPriority.getText());
        }
    }

    @Then("the manager should be able to see {string} opportunity title from excel sheet")
    public void the_manager_should_be_able_to_see_opportunity_title_from_excel_sheet(String opportunityTitle) {
        for(Map<String, String> user : userData.getDataList()){
            System.out.println(user.get("Opportunity_Title"));
        }
    }

    @Then("the manager should be able to see {string} customer from excel sheet")
    public void the_manager_should_be_able_to_see_customer_from_excel_sheet(String customer) {
        for(Map<String, String> user : userData.getDataList()){
            System.out.println(user.get("Customer"));

        }
    }

    @Then("the manager should be able to see {string} expected revenue from excel sheet")
    public void the_manager_should_be_able_to_see_expected_revenue_from_excel_sheet(String expectedRevenue) {
        for(Map<String, String> user : userData.getDataList()){
            System.out.println(user.get("Expected_Revenue"));
        }
    }

    @Then("the manager should be able to see {string} priority from excel sheet")
    public void the_manager_should_be_able_to_see_priority_from_excel_sheet(String priority) {
        for(Map<String, String> user : userData.getDataList()){
            System.out.println(user.get("Priority"));
        }
    }

    @Then("the manager clicks on Sales Channels button")
    public void the_manager_clicks_on_Sales_Channels_button() {
        crmPage.salesChannels.click();
    }

    @When("the manager clicks on Create button to the create sales channel")
    public void the_manager_clicks_on_Create_button_to_the_create_sales_channel() {
        crmPage.salesChannelCreateButton.click();
    }

    @Then("the manager enters sales team name to the sales channel box")
    public void the_manager_enters_sales_team_name_to_the_sales_channel_box() {
        crmPage.salesChannelTeamNameBox.sendKeys("NewTeam");
    }

    @Then("the manager selects valid channel leader")
    public void the_manager_selects_valid_channel_leader() {
        crmPage.channelLeaderBox.click();
        crmPage.EventsCRM_Manager4.click();
    }

    @Then("the manager enters email address to the email alias box")
    public void the_manager_enters_email_address_to_the_email_alias_box() {
        BrowserUtilities.wait(5);
        crmPage.emailAliasBox.click();
        crmPage.emailAliasBox.sendKeys("account123@gmail.com");
    }

    @Then("the manager creates new sales channel when create Save button")
    public void the_manager_creates_new_sales_channel_when_create_Save_button() {
        System.out.println("Clicking on save button");
        crmPage.SalesSaveButton.click();
        crmPage.salesChannels.click();
    }

    List<Object> channels;
    @Then("the manager sees all sales channel name in database and contains new sales channel name")
    public void the_manager_sees_all_sales_channel_name_in_database_and_contains_new_sales_channel_name() {
        DatabaseUtility.createConnection();

        String channelsName = crmPage.createdChannelName.getText();
        System.out.println(channelsName);

        String sql = "SELECT name FROM crm_team;";

        channels = DatabaseUtility.getColumnData(sql, "name");
        System.out.println(channels);

        assertTrue(channels.contains(channelsName));
    }

}
