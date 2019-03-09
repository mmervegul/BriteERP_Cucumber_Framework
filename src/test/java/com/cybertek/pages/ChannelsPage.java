package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cybertek.utilities.Driver;

public class ChannelsPage {

    public ChannelsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "o_mail_open_channels")
    public WebElement channelsButton;

    @FindBy(xpath = "//span[.='Events']")
    public WebElement eventsChannel;

    @FindBy(xpath = "(//button[@class='btn btn-primary pull-right btn-sm oe_kanban_action oe_kanban_action_button'])[7]")
    public WebElement joinButtonForEventChannel;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[1]")
    public WebElement discussionButton;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editButton;

    @FindBy(xpath = "(//button[@class='fa fa-trash-o o_list_record_delete_btn'])[2]")
    public WebElement trashcanIconForSalesManager3;

    @FindBy(xpath = "//td[contains(text(),'ManufacturingManager4')]")
    public WebElement manufacturingManager4User;

    @FindBy(xpath = "//a[contains(text(),'ManufacturingManager4')]")
    public WebElement expectedManufacturingManager4User;

    @FindBy(xpath = "//a[contains(text(),'ManufacturingManager5')]")
    public WebElement expectedManufacturingManager5User;

    @FindBy(xpath = "(//a[contains(text(),'SalesManager')])[2]")
    public WebElement expectedSalesManagerUser;

    @FindBy(xpath = "//td[contains(text(),'ManufacturingManager5')]")
    public WebElement manufacturingManager5User;

    @FindBy(xpath = "//td[contains(text(),'SalesManager')]")
    public WebElement salesManagerUser;

    @FindBy(xpath = "(//span[.='sales'])[1]")
    public WebElement firstSalesChannel;

    @FindBy(xpath = "//a[.='Members']")
    public WebElement membersButton;

    @FindBy(xpath = "(//span[contains(text(), 'sales')])[1]")
    public WebElement salesChannelName;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement channelNameBox;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='New Group']")
    public WebElement teamName;

    @FindBy(xpath = "//span[@class='o_field_text o_field_widget']")
    public WebElement teamDescription;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement verifyChannelName;

    @FindBy(xpath = "//span[@class='o_field_text o_field_widget']")
    public WebElement verifyDescription;


}
