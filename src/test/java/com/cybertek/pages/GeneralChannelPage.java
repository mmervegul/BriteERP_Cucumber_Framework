package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cybertek.utilities.Driver;

public class GeneralChannelPage {

    public GeneralChannelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='fa fa-plus o_add'])[1]")
    public WebElement channelsPlusSign;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement addAChannelBox;

    @FindBy(className = "ui-menu-item")
    public WebElement createChannel;

    @FindBy(xpath = "(//div[@title='new team'])[1]")
    public WebElement newTeam;

    @FindBy(xpath = "//div[@class='o_thread_message_content']")
    public WebElement createdChannelText;

    @FindBy(xpath = "(//span[@class='o_channel_name'])[3]")
    public WebElement discussionGroup;

    @FindBy(id = "ui-id-2")
    public WebElement clickName;

    @FindBy(xpath = "(//div[@title='general'])[1]")
    public WebElement generalChannel;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-link']")
    public WebElement showOlderMessages;

    @FindBy(xpath = "//button[@title='Invite people']")
    public WebElement inviteButton;

    @FindBy(xpath = "//li[@class='select2-search-field']")
    public WebElement inviteSearchBox;

    @FindBy(id = "select2-result-label-7")
    public WebElement EventsCRM_Manager4;

    @FindBy(id = "select2-result-label-48")
    public WebElement EventsCRM_Manager5;

    @FindBy(xpath = "//span[.='Invite']")
    public WebElement secondInviteButton;

    @FindBy(xpath = "(//*[@class='o_thread_author o_mail_redirect'])[1]")
    public WebElement manufacturingManager;

    @FindBy(xpath = "//div[.='EventsCRM_Manager4']")
    public WebElement selectedUser;



}
