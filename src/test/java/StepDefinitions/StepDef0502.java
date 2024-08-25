package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class StepDef0502 {
    DialogContent dc = new DialogContent();

    @And("the user chooses his billing address and click on Continue until payment method")
    public void theUserChoosesHisBillingAddressAndClickOnContinueUntilPaymentMethod() {
        dc.myJSClick(dc.billingContinueButton);
        dc.myJSClick(dc.shippingContinueButton);
        dc.myJSClick(dc.shippingMethodContinueButton);
    }

    @And("User selects Check-Money Order from the payment method section and clicks Continue")
    public void userSelectsCheckMoneyOrderFromThePaymentMethodSectionAndClicksContinue() {
        dc.myJSClick(dc.CheckPaymentMethod);
        dc.myJSClick(dc.paymentMethodContinueButton);
    }

    @When("User clicks on Continue each steps and Confirm his order")
    public void userClicksOnContinueEachStepsAndConfirmHisOrder() {
        dc.myJSClick(dc.paymentInfoContinueButton);
        dc.myJSClick(dc.confirmOrderButton);
    }
}
