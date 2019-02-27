package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cybertek.utilities.Driver;

public class StarredMessagePage {

    public StarredMessagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='o_channel_name'])[2]")
    public WebElement starredMessageButton;

    @FindBy(xpath = "(//i[@title='Mark as Todo'])[11]")
    public WebElement starIcon;

    @FindBy(xpath = "//i[@title='Mark as Todo']")
    public WebElement deleteStarredMessage;

    @FindBy(xpath = "//p[.='world.....................']")
    public WebElement starredMessageInStarredMessage;

    @FindBy(xpath = "//div[@class='o_thread_message_content']//p[.='world.....................']")
    public WebElement starredMessageInGeneralChannel;

    @FindBy(xpath = "//div[.='No starred message']")
    public WebElement emptyStarredMessageText;

    @FindBy(xpath = "//p[@class='o_mail_info']//strong[@class='o_thread_author o_mail_redirect']")
    public WebElement starredMessageUserName;

    @FindBy(xpath = "//span[@class='o_thread_date']")
    public WebElement starredMessageDate;

    @FindBy(xpath = "//span[@class='o_mail_sidebar_needaction badge ']")
    public WebElement starredMessageCount;



}
