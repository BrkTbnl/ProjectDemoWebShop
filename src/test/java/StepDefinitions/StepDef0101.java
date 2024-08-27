package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNavigation;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StepDef0101 {

    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();

    @Given("Navigate to Webpage")
    public void navigateToWebpage() {
        GWD.getDriver().get("https://demowebshop.tricentis.com/");
    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        tn.myJSClick(tn.registerButton);
    }

    @When("Enter all required information and Click Register button")
    public void enterAllRequiredInformationAndClickRegisterButton() {
        dc.myJSClick(dc.selectBoxMale);
        dc.mySendKeys(dc.nameInput,"bob");
        dc.mySendKeys(dc.lastNameInput,"tester");
        dc.mySendKeys(dc.emailInput,"testerbob1@gmail.com");
        dc.mySendKeys(dc.passwordInput,"123qwe123");
        dc.mySendKeys(dc.confirmPasswordInput,"123qwe123");
        dc.myJSClick(dc.registerConfirmButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.result,"completed");
    }



    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.validationErrors));
        dc.verifyContainsText(dc.validationErrors,"already exists");
    }
}
