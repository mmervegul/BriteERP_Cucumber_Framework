package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/web?db=BriteErpDemo']")
    public WebElement BriteErpDemoButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginPasswordMessage;




}
