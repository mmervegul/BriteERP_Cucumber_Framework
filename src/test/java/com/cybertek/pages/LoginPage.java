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

    public void managerUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("managerUserName"));
        password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
        loginButton.click();
    }

    public void salesUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("salesUserName"));
        password.sendKeys(ConfigurationReader.getProperty("salesPassword"));
        loginButton.click();
    }


    public void negativeManagerUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("managerUserName"));
        password.sendKeys(ConfigurationReader.getProperty("managerWrongPassword"));
        loginButton.click();
    }

    public void negativeSalesUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("salesUserName"));
        password.sendKeys(ConfigurationReader.getProperty("salesWrongPassword"));
        loginButton.click();
    }

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


}
