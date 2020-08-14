package com.Nhs.stepDefinitions;

import com.Nhs.pages.WalesUserNhsCosts_page;
import com.Nhs.utilities.BrowserUtils;
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

    @And("user or user's partner claim any benefits or tax credits")
    public void userOrUserSPartnerClaimAnyBenefitsOrTaxCredits() {
        yes.click();
        nextButton.click();
    }

    @And("user or user's partner recieve Universal Credit payments")
    public void userOrUserSPartnerRecieveUniversalCreditPayments() {

        BrowserUtils.waitForElementVisible(yesUniversal);
        BrowserUtils.waitForElementClickable(yesUniversal,5);
        yesUniversal.click();
        nextButton.click();
    }

    @And("user have as part of your joint Universal Credit")
    public void userHaveAsPartOfYourJointUniversalCredit() {
        yes.click();
        nextButton.click();
    }

    @And("user and user's partner had a combined take-home pay of {string} or less in your last Universal Credit Period")
    public void userAndUserSPartnerHadACombinedTakeHomePayOfOrLessInYourLastUniversalCreditPeriod(String amount) {

       String[] str= questionHeading.getText().split(" ");
       String actualAmount=str[11];
       Assert.assertEquals(actualAmount,amount);
        yes.click();
        nextButton.click();

    }

    @Then("user should recieve this message contains {string}")
    public void userRecieveThisMessageContains(String message) {

        System.out.println(resultExplanation.getText());
        String expectedResult=message;
        String actualResult=resultExplanation.getText().trim();
        Assert.assertTrue(actualResult.contains(message));

    }

    @And("user does NOT live with a partner")
    public void userShouldNOTLiveWithAPartner() {
        no.click();
        nextButton.click();
    }
    @When("user lives with a partner")
    public void userLivesWithAPartner() {
        yes.click();
        nextButton.click();
    }

    @And("user does NOT claim any benefits or tax")
    public void userShouldNOTClaimAnyBenefitsOrTax() {
        no.click();
        nextButton.click();
    }

    @And("user is NOT pregnant or have you given birth in the last {string} months")
    public void userIsNOTPregnantOrHaveYouGivenBirthInTheLastMonths(String months) {
        String[] str= questionHeading.getText().split(" ");
        String actualMonths=str[11];
        Assert.assertEquals(actualMonths,months);

        no.click();
        nextButton.click();
    }

    @And("user does NOT have an injury or illness caused by serving in he armed forces")
    public void userShouldNOTHaveAnInjuryOrIllnessCausedByServingInHeArmedForces() {
        no.click();
        nextButton.click();
    }

    @And("user does NOT have diabetes")
    public void userShouldNOTHaveDiabetes() {
        no.click();
        nextButton.click();
    }

    @And("user does NOT have glaucoma")
    public void userShouldNOTHaveGlaucoma() {
        no.click();
        nextButton.click();
    }

    @And("user does NOT live permanently in a care home")
    public void userShouldLivePermanentlyInACareHome() {
        no.click();
        nextButton.click();
    }

    @And("user does NOT have more than {string} in savings, investments or property")
    public void userDoesNOTHaveMoreThanInSavingsInvestmentsOrProperty(String amount) {
        String[] str= questionHeading.getText().split(" ");
        String actualAmount=str[5];
        Assert.assertEquals(actualAmount,amount);

        no.click();
        nextButton.click();
    }



}
