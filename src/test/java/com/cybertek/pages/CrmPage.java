package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmPage {

    public CrmPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[contains(text(),'CRM')]")
    public WebElement crmModule;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement opportunityTitle;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement customer;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement expectedRevenue;

    @FindBy(xpath = "//td//div//a[@title='Low']")
    public WebElement highPriority;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement lastCreateButton;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[32]")
    public WebElement salesChannels;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement salesChannelCreateButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement salesChannelTeamNameBox;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement channelLeaderBox;

    @FindBy(xpath = "//a[.='EventsCRM_Manager4']")
    public WebElement EventsCRM_Manager4;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input oe_inline']")
    public WebElement emailAliasBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement SalesSaveButton;

    //td[contains(text(),'NewTeam')]

    @FindBy(xpath = "//td[.='NewTeam']")
    public WebElement createdChannelName;

    @FindBy(xpath = "//td[contains(text(),'EventsCRM_Manager4')]")
    public WebElement selectedChannelLeader;

}
