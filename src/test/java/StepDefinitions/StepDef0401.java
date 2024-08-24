package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import Pages.TopNavigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StepDef0401 {
    TopNavigation tn = new TopNavigation();
    LeftNavigation ln = new LeftNavigation();
    DialogContent dc = new DialogContent();


    @Given("user clicks on Computer and selects Desktops in the left navigation bar")
    public void userClicksOnComputerAndSelectsDesktopsInTheLeftNavigationBar() {
        ln.myJSClick(ln.computerButton);
        ln.myJSClick(ln.desktopsButton);
    }

    @And("selects a model from there and clicks on Add to Cart below the model")
    public void selectsAModelFromThereAndClicksOnAddToCartBelowTheModel() {
        dc.myJSClick(dc.computerSelectButton);
    }

    @And("clicks on the Add to Car button")
    public void clicksOnTheAddToCarButton() {
        dc.myJSClick(dc.addToCartButton);
    }

    @And("Success message displayed")
    public void successMessageDisplayed() {
        dc.verifyContainsText(dc.orderMessage,"The product has been added to your shopping cart");
    }

    @When("user clicks on Shopping Cart at the top of the window")
    public void userClicksOnShoppingCartAtTheTopOfTheWindow() {
        tn.myJSClick(tn.ShoppingCartButton);
    }


    @Then("user should be able to see his order in the shopping cart")
    public void userShouldBeAbleToSeeHisOrderInTheShoppingCart() {
        dc.verifyContainsText(dc.productPriceShoppingCart,"1815.00");
    }


}
