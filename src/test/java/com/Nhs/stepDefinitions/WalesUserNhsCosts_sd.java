package com.Nhs.stepDefinitions;

import com.Nhs.pages.WalesUserNhsCosts_page;
import com.Nhs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WalesUserNhsCosts_sd extends WalesUserNhsCosts_page {

    @Given("User is in landing page")
    public void user_is_in_landing_page() {

        String expectedTitle="Check what help you could get to pay for NHS costs";
        String actualTitle= Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("user clicks start button")
    public void user_clicks_start_button() {

        startButton.click();

    }

    @Then("user choose  {string} and click next button")
    public void user_choose_and_click_next_button(String country) {

        chooseCountry(country);
        nextButton.click();
    }


    @And("user write a date of birth as {string} {string} {string}")
    public void userWriteADateOfBirthAs(String day, String month, String year) {
        dobDay.sendKeys(day);
        dobMonth.sendKeys(month);
        dobYear.sendKeys(year);
        nextButton.click();
    }

    @And("user shouldn't live with a partner")
    public void userShouldnTLiveWithAPartner() {
        yes.click();
        nextButton.click();
    }

    @And("user or user's partner claim any benefits or tax credits")
    public void userOrUserSPartnerClaimAnyBenefitsOrTaxCredits() {
        yes.click();
        nextButton.click();
    }

    @And("user or user's partner recieve Universal Credit payments")
    public void userOrUserSPartnerRecieveUniversalCreditPayments() {
        WebDriverWait wait=new WebDriverWait(Driver.get(),20);
        yesUniversal.click();
        nextButton.click();
    }

    @And("user have as part of your joint Universal Credit")
    public void userHaveAsPartOfYourJointUniversalCredit() {
        yes.click();
        nextButton.click();
    }

    @And("user and user's partner had a combined take-home pay of £ or less in your last Universal Credit Period")
    public void userAndUserSPartnerHadACombinedTakeHomePayOf£OrLessInYourLastUniversalCreditPeriod() {
        yes.click();
        nextButton.click();
    }

    @And("user recieve this message contains {string}")
    public void userRecieveThisMessageContains(String arg0) {

        System.out.println(resultExplanation.getText());

    }
}
