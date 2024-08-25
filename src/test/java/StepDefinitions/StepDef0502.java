package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
        dc.myJSClick(dc.paymentViaCheck);
        dc.myJSClick(dc.paymentMethodContinueButton);
    }

    @When("User clicks on Continue each steps and Confirm his order")
    public void userClicksOnContinueEachStepsAndConfirmHisOrder() {
        dc.myJSClick(dc.paymentInfoContinueButton);
        dc.myJSClick(dc.confirmOrderButton);
    }

    @And("User selects Credit Cart from the payment method section and clicks Continue")
    public void userSelectsCreditCartFromThePaymentMethodSectionAndClicksContinue() {
        dc.myJSClick(dc.paymentViaCreditCart);
        dc.myJSClick(dc.paymentMethodContinueButton);
    }

    @And("User enters his cart information and clicks on Continue")
    public void userEntersHisCartInformationAndClicksOnContinue() {
        dc.mySendKeys(dc.cardholderNameInput,"bob tester");
        dc.mySendKeys(dc.cardNumberInput,"1234567890123456");
        dc.mySelectBox(dc.expireMonthInput,"10");
        dc.mySelectBox(dc.expiryYearInput,"2025");
        dc.mySendKeys(dc.cardCodeInput,"123");
        dc.myJSClick(dc.paymentInfoContinueButton);
    }

    @Then("payment type should not be accepted")
    public void paymentTypeShouldNotBeAccepted() {
        dc.verifyContainsText(dc.paymentErrorMessage,"Wrong card number");
    }

    @And("User selects Purchase Order from the payment method section and clicks Continue")
    public void userSelectsPurchaseOrderFromThePaymentMethodSectionAndClicksContinue() {
        dc.myJSClick(dc.paymentViaPurchaseOrder);
        dc.myJSClick(dc.paymentMethodContinueButton);
    }

    @When("User enters his  information and clicks on Continue")
    public void userEntersHisInformationAndClicksOnContinue() {
        dc.mySendKeys(dc.poNumberInput,"123456");
        dc.myJSClick(dc.paymentInfoContinueButton);
        dc.myJSClick(dc.confirmOrderButton);
    }
}
