package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cybertek.utilities.Driver;

public class PrivateChannelPage {

    public PrivateChannelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='fa fa-plus o_add'])[3]")
    public WebElement privateChannelPlusButton;

    @FindBy(xpath = "(//input[@class='o_input'])[1]")
    public WebElement addAPrivateChannelBox;

    @FindBy(xpath = "(//div[@class='o_composer_input'])[1]")
    public WebElement writeSomethingBox;

    @FindBy(xpath = "//div[@class='o_chat_composer o_chat_inline_composer']//div/div/div/textarea[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@title='New team']")
    public WebElement newTeamPrivateChannel;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-icon fa fa-smile-o o_composer_button_emoji'])[1]")
    public WebElement emojiButtonPrivateChannel;

    @FindBy(linkText = "Thumbs Up")
    public WebElement thumbsUpEmoji;

}
