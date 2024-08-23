package StepDefinitions;

import Pages.TopNavigation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class StepDef0301 {
    TopNavigation tn = new TopNavigation();

    @When("Click on Log out Button")
    public void clickOnLogOutButton() {
        tn.myJSClick(tn.logoutButton);
    }

    @Then("User should not be able to see his mail on top of the page")
    public void userShouldNotBeAbleToSeeHisMailOnTopOfThePage() {
        tn.wait.until(ExpectedConditions.visibilityOf(tn.registerButton));
        Assert.assertTrue(tn.registerButton.isDisplayed());
    }
}
