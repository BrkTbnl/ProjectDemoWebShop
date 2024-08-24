package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNavigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef0501 {
    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();

    @Given("the user clicks on the Shopping Cart at the top of the window")
    public void theUserClicksOnTheShoppingCartAtTheTopOfTheWindow() {
        tn.myJSClick(tn.ShoppingCartButton);
    }

    @And("clicks on the accept terms button and then clicks on Checkout")
    public void clicksOnTheAcceptTermsButtonAndThenClicksOnCheckout() {
        dc.myJSClick(dc.termsOfService);
        dc.myJSClick(dc.checkoutButton);
    }

    @And("the user enters their billing address and clicks on Continue")
    public void theUserEntersTheirBillingAddressAndClicksOnContinue() {
        dc.mySelectBox(dc.countrySelectBox,"Poland");
        dc.mySendKeys(dc.cityInput,"none");
        dc.mySendKeys(dc.addressInput,"none");
        dc.mySendKeys(dc.zipCodeInput,"123123");
        dc.mySendKeys(dc.phoneNumInput,"123123123");
        dc.myJSClick(dc.billingContinueButton);
    }

    @And("the user checks and selects Continue at every step")
    public void theUserChecksAndSelectsContinueAtEveryStep() {
        dc.myJSClick(dc.shippingContinueButton);
        dc.myJSClick(dc.shippingMethodContinueButton);
        dc.myJSClick(dc.paymentMethodContinueButton);
        dc.myJSClick(dc.paymentInfoContinueButton);
    }

    @When("the user clicks on Confirm in the confirm order section")
    public void theUserClicksOnConfirmInTheConfirmOrderSection() {
        dc.myJSClick(dc.confirmOrderButton);
    }

    @Then("a success message for the order should be displayed")
    public void aSuccessMessageForTheOrderShouldBeDisplayed() {
        dc.verifyContainsText(dc.orderStatusMessageLabel,"successfully processed!");
    }
}
