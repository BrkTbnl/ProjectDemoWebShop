package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import Pages.TopNavigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef0801 {
    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();
    LeftNavigation ln = new LeftNavigation();

    @Given("User clicks on his mail address on top navigation bar to see his profile")
    public void userClicksOnHisMailAddressOnTopNavigationBarToSeeHisProfile() {
        tn.myJSClick(tn.customerInfoLabel);
    }

    @And("clicks on Orders button on left navigation bar")
    public void clicksOnOrdersButtonOnLeftNavigationBar() {
        ln.myJSClick(ln.ordersButton);
    }

    @When("clicks on Details button to inspect his last order")
    public void clicksOnDetailsButtonToInspectHisLastOrder() {
        dc.myJSClick(dc.orderDetails);
    }

    @Then("Order status should be visible")
    public void orderStatusShouldBeVisible() {
        dc.verifyContainsText(dc.orderStatus,"Pending");
    }

    @And("PDF Invoice button should be clickable")
    public void pdfInvoiceButtonShouldBeClickable() {
        Assert.assertTrue(dc.pdfOrderButton.isDisplayed());
    }
}
