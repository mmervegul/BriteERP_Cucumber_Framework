package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[4]")
    public WebElement contactsButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement contactNameBox;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement websiteBox;

    @FindBy(xpath = "//input[@name='function']")
    public WebElement jobPositionBox;

    @FindBy(xpath = "//input[@class='o_field_phone o_field_widget o_input']")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//a[.='Internal Notes']")
    public WebElement internalNotesButton;

    @FindBy(xpath = "//textarea[@name='comment']")
    public WebElement internalNotesBox;

    @FindBy(xpath = "//div//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement contactName;

    @FindBy(xpath = "//a[@class='o_field_url o_field_widget o_form_uri o_text_overflow']")
    public WebElement contactWebsite;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget']")
    public WebElement contactJobPosition;

    @FindBy(xpath = "//a[@class='o_field_email o_field_widget o_form_uri o_text_overflow']")
    public WebElement contactEmail;

    @FindBy(xpath = "//span[@class='o_field_phone o_field_widget']")
    public WebElement contactPhoneNumber;

    @FindBy(xpath = "//span[@class='o_field_text o_field_widget']")
    public WebElement contactNote;

}
