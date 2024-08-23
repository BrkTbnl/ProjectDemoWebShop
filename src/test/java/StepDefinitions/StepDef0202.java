package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef0202 {
    DialogContent dc = new DialogContent();

    @When("User leaves e-mail and password part empty.")
    public void userLeavesEMailAndPasswordPartEmpty() {
        dc.mySendKeys(dc.emailInput,"");
        dc.mySendKeys(dc.passwordInput,"");
        dc.myJSClick(dc.loginButton);
    }

    @And("Clicks on Login Button below")
    public void clicksOnLoginButtonBelow() {
        dc.myJSClick(dc.loginButton);
    }


    @When("User writes valid email and leave password empty")
    public void userWritesValidEmailAndLeavePasswordEmpty() {
        dc.mySendKeys(dc.emailInput,"testerbob@gmail.com");
        dc.mySendKeys(dc.passwordInput,"");
        dc.myJSClick(dc.loginButton);
    }



    @When("User writes valid password but leaves email empty")
    public void userWritesValidPasswordButLeavesEmailEmpty() {
        dc.mySendKeys(dc.emailInput,"");
        dc.mySendKeys(dc.passwordInput,"123qwe123");
        dc.myJSClick(dc.loginButton);
    }


    @Then("Error Message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.validationErrors,"Login was unsuccessful.");
    }
}
