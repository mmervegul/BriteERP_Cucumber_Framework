package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavesPage {

    public LeavesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[contains(text(),'Leaves')]")
    public WebElement leavesModule;

    @FindBy(id = "o_field_input_16")
    public WebElement description;

    @FindBy(id = "o_field_input_19")
    public WebElement duration1;

    @FindBy(id = "o_field_input_21")
    public WebElement duration2;

    @FindBy(id = "o_field_input_18")
    public WebElement days;

    @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
    public WebElement saveButton;



}
