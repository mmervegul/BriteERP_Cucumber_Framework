package com.cybertek.step_definitions;

import com.cybertek.pages.ContactsPage;
import com.cybertek.utilities.*;
import cucumber.api.java.en.*;
import com.cybertek.utilities.ExcelUtil;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactsPageStepDefinitions {

    String data = "./src/test/resources/test_data/briteerp_modules.xlsx";
    String sheetName =  "Sheet 1";
    ExcelUtil userData = new ExcelUtil(data, sheetName);

    ContactsPage contactsPage = new ContactsPage();

    @When("the manager clicks on Contacts button")
    public void the_manager_clicks_on_Contacts_button() {
        contactsPage.contactsButton.click();
    }

    @Then("the manager clicks on Create button to create contacts")
    public void the_manager_clicks_on_Create_button_to_create_contacts() {
        contactsPage.createButton.click();
    }

    @Then("the manager enters {string} to contact name box")
    public void the_manager_enters_to_contact_name_box(String contactName) {
        contactsPage.contactNameBox.sendKeys(contactName);
    }

    @Then("the manager enters {string} to website box")
    public void the_manager_enters_to_website_box(String website) {
        contactsPage.websiteBox.sendKeys(website);
    }

    @Then("the manager enters {string} to job position box")
    public void the_manager_enters_to_job_position_box(String jobPosition) {
       // contactsPage.jobPositionBox.click();
        contactsPage.jobPositionBox.sendKeys(jobPosition);
     //   Driver.getDriver().findElement(By.xpath("//span[.='Create']")).click();
    }

    @Then("the manager enters {string} to email box")
    public void the_manager_enters_to_email_box(String email) {
      //  contactsPage.emailBox.click();
        contactsPage.emailBox.sendKeys(email);
    }

    @Then("the manager enters {string} to phone box")
    public void the_manager_enters_to_phone_box(String phoneNumber) {
       // contactsPage.phoneBox.click();
        contactsPage.phoneBox.sendKeys(phoneNumber);
    }

    @Then("the manager enters {string} to internal notes box")
    public void the_manager_enters_to_internal_notes_box(String notes) {
        contactsPage.internalNotesButton.click();
        contactsPage.internalNotesBox.click();
        contactsPage.internalNotesBox.sendKeys(notes);
    }

    @Then("the manager creates new contact when clicks on the Save button")
    public void the_manager_creates_new_contact_when_clicks_on_the_Save_button() {

        contactsPage.saveButton.click();
        BrowserUtilities.wait(5);
    }

    List<Object> contactNames;
    List<Object> contactWebsite;
    List<Object> contactJobPosition;
    List<Object> contactEmail;
    List<Object> contactPhoneNumber;
    List<Object> contactNote;
    @Then("the manager sees contact name, website, job position, email, phone number and notes from database")
    public void the_manager_sees_contact_name_website_job_position_email_phone_number_and_notes_from_database() {
        DatabaseUtility.createConnection();

        String contactsName = contactsPage.contactName.getText();
        String contactsWebsite = contactsPage.contactWebsite.getText();
        String contactsJobPosition = contactsPage.contactJobPosition.getText();
        String contactsEmail = contactsPage.contactEmail.getText();
        String contactsPhoneNumber = contactsPage.contactPhoneNumber.getText();
        String contactsNote = contactsPage.contactNote.getText();

        String sql = "SELECT name, website, function, email, phone, comment FROM res_partner WHERE name = '" + contactsName + "';";

        contactNames = DatabaseUtility.getColumnData(sql, "name");
        contactWebsite = DatabaseUtility.getColumnData(sql, "website");
        contactJobPosition = DatabaseUtility.getColumnData(sql, "function");
        contactEmail = DatabaseUtility.getColumnData(sql, "email");
        contactPhoneNumber = DatabaseUtility.getColumnData(sql, "phone");
        contactNote = DatabaseUtility.getColumnData(sql, "comment");

        System.out.println(contactNames + " | " + contactWebsite + " | " + contactJobPosition + " | " + contactEmail
                                            + " | " + contactPhoneNumber + " | " + contactNote);

        assertTrue(contactNames.contains(contactsName));
        assertTrue(contactWebsite.contains(contactsWebsite));
        assertTrue(contactJobPosition.contains(contactsJobPosition));
        assertTrue(contactEmail.contains(contactsEmail));
        assertTrue(contactPhoneNumber.contains(contactsPhoneNumber));
        assertTrue(contactNote.contains(contactsNote));

    }

    @Then("the manager sees contact name, website, job position, email, phone number and notes from excel sheet")
    public void the_manager_sees_contact_name_website_job_position_email_phone_number_and_notes_from_excel_sheet() {
        for(Map<String, String> user : userData.getDataList()){
            System.out.println(user.get("Contact_Name") + "\n" + user.get("Website") + "\n" + user.get("Job_Position")
                                        + "\n" + user.get("Email") + "\n" + user.get("Phone") + "\n" + user.get("Notes"));

        }

    }


}
