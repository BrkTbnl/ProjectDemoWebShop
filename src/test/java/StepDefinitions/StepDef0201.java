package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNavigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef0201 {
    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        tn.myJSClick(tn.loginButton);
    }

    @When("User enters username and password and click on login button")
    public void userEntersUsernameAndPasswordAndClickOnLoginButton() {
        dc.mySendKeys(dc.emailInput,"testerbob@gmail.com");
        dc.mySendKeys(dc.passwordInput,"123qwe123");
        dc.myJSClick(dc.loginButton);
    }

    @Then("User should see his mail address on top of the page")
    public void userShouldSeeHisMailAddressOnTopOfThePage() {
        tn.verifyContainsText(tn.customerInfoLabel, "testerbob");
    }
}
