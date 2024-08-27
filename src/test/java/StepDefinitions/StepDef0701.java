package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef0701 {
    DialogContent dc = new DialogContent();

    @When("User enters his promo code")
    public void userEntersHisPromoCode() {
        dc.mySendKeys(dc.discountCode,"happyTester");
    }

    @And("clicks on Apply Coupon button")
    public void clicksOnApplyCouponButton() {
        dc.myJSClick(dc.applyDiscountCode);
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.messageText,"couldn't be applied");
    }
}
