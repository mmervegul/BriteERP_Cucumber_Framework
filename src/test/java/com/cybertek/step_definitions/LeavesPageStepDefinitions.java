package com.cybertek.step_definitions;

import com.cybertek.pages.LeavesPage;
import com.cybertek.utilities.BrowserUtilities;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.ExcelUtil;
import cucumber.api.java.en.*;
import java.io.FileNotFoundException;
import java.util.Map;
import static org.junit.Assert.*;

public class LeavesPageStepDefinitions {

    String data = "./src/test/resources/test_data/briteerp_module.xlsx";
    String sheetName =  "Sheet 1";
    ExcelUtil userData = new ExcelUtil(data, sheetName);

    LeavesPage leavesPage = new LeavesPage();

    @When("the manager clicks on Leaves button")
    public void the_manager_clicks_on_Leaves_button() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.wait(5);

        leavesPage.leavesModule.click();
    }

    @Then("the manager enters valid {string} description")
    public void the_manager_enters_valid_description(String description) {
        System.out.println("Column names : " + userData.getColumnsNames());

        System.out.println(description);
        for(Map<String, String> allData : userData.getDataList()) {
            System.out.println(allData.get("Description"));
            assertEquals(description, allData.get("Description"));
        }
    }

    @Then("the manager selects valid {string} type")
    public void the_manager_selects_valid_type(String LeaveType) {
        for(Map<String, String> allData : userData.getDataList()) {
            System.out.println(allData.get("Leave Type"));

            assertEquals(LeaveType, allData.get("Leave Type"));
        }
    }

    @Then("the manager selects valid {string} date and time")
    public void the_manager_selects_valid_date_and_time(String string) {

    }

    @Then("the manager enters valid duration {string}")
    public void the_manager_enters_valid_duration(String string) {

    }

    @Then("the manager clicks on Save button")
    public void the_manager_clicks_on_Save_button() {

    }

}
