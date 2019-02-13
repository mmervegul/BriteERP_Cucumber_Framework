package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//a[@href='/web?db=BriteErpDemo']")
    public WebElement BriteErpDemoButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginPasswordMessage;

    public void managerUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("managerUserName"));
        password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
        login.click();
    }

    public void salesUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("salesUserName"));
        password.sendKeys(ConfigurationReader.getProperty("salesPassword"));
        login.click();
    }


    public void negativeManagerUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("managerUserName"));
        password.sendKeys(ConfigurationReader.getProperty("managerWrongPassword"));
        login.click();
    }

    public void negativeSalesUserLogin() {
        userName.sendKeys(ConfigurationReader.getProperty("salesUserName"));
        password.sendKeys(ConfigurationReader.getProperty("salesWrongPassword"));
        login.click();
    }

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


}
