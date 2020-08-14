package com.Nhs.pages;

import com.Nhs.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalesUserNhsCosts_page extends BasePage {

    @FindBy (id="next-button")
    public WebElement startButton;

    @FindBy (id="livingCountry_fieldset")
    public WebElement countryChooseRadioButton;

    @FindBy (id="label-england")
    public WebElement countryEngland;
    @FindBy (id="label-scotland")
    public WebElement countryScotland;
    @FindBy (id="label-wales")
    public WebElement countryWales;
    @FindBy (id="label-nire")
    public WebElement countryNorthernIreland;

    @FindBy (id="next-button")
    public WebElement nextButton;


    @FindBy (id="dob-day")
    public WebElement dobDay;

    @FindBy (id="dob-month")
    public WebElement dobMonth;

    @FindBy (id="dob-year")
    public WebElement dobYear;

    @FindBy (id="label-yes")
    public WebElement yes;

    @FindBy (id="label-no")
    public WebElement no;

    @FindBy (xpath = "//input[@id='yes-universal']")
    public WebElement yesUniversal;


    @FindBy (xpath = "//div[@class='done-panel']")
    public WebElement donePanel;

    @FindBy (id="result-explanation")
    public WebElement resultExplanation;







    public void chooseCountry (String countryName){

        switch (countryName){
            case "England":countryEngland.click();
            break;
            case "Scotland":countryScotland.click();
                break;
            case "Wales":countryWales.click();
                break;
            case "Northern Ireland":countryNorthernIreland.click();
                break;
        }

    }


}
