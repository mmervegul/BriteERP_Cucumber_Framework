package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cybertek.utilities.Driver;

public class DirectMessagePage {

    public DirectMessagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='fa fa-plus o_add'])[2]")
    public WebElement directMessagePlusSign;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement usernameSearchBox;

    @FindBy(xpath = "//a[.='SalesManager4']")
    public WebElement salesManager4;

    @FindBy(xpath = "(//div[@class='o_composer_input']/textarea[@class='o_input o_composer_text_field'])[1]")
    public WebElement writeSomethingBoxForDirectMessage;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-icon fa fa-smile-o o_composer_button_emoji'])[1]")
    public WebElement directMessageEmojiButton;

    @FindBy(xpath = "//button[@title='Party']")
    public WebElement directMessagePartyEmoji;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_composer_button_send hidden-xs']")
    public WebElement directMessageSendButton;

    @FindBy(xpath = "//div[@title='SalesUser3']//span[@class='fa fa-times o_mail_partner_unpin ']")
    public WebElement leaveFromSalesManager3Channel;

}
