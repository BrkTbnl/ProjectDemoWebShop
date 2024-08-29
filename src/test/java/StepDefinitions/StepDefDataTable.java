package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import Pages.TopNavigation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StepDefDataTable {

    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();
    LeftNavigation ln = new LeftNavigation();

    @And("Click on element in TopNavigation")
    public void clickOnElementInTopNavigation(DataTable links) {
        List<String> linksList = links.asList(String.class);

        for (int i = 0; i < linksList.size(); i++) {
            String link = linksList.get(i);
            WebElement webElement = tn.getWebElement(link);
            tn.myJSClick(webElement);

        }
    }

    @When("User sends the keys in DialogContent")
    public void userSendsTheKeysInDialogContent(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            WebElement webElement = dc.getWebElement(item.get(0));
            String text = item.get(1);
            dc.mySendKeys(webElement,text);

        }
    }

    @And("Click on element in DialogContent")
    public void clickOnElementInDialogContent(DataTable dataTable) {
        List<String> linksList = dataTable.asList(String.class);

        for (int i = 0; i < linksList.size(); i++) {
            String link = linksList.get(i);
            WebElement webElement = dc.getWebElement(link);
            dc.myJSClick(webElement);

        }
    }

    @Given("Click on element in LeftNavBar")
    public void clickOnElementInLeftNavBar(DataTable dataTable) {

        List<String> linksList = dataTable.asList(String.class);

        for (int i = 0; i < linksList.size(); i++) {
            String link = linksList.get(i);
            WebElement webElement = ln.getWebElement(link);
            ln.myJSClick(webElement);
        }
    }

    @And("Select item from select box")
    public void selectItemFromSelectBox(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            WebElement webElement = dc.getWebElement(item.get(0));
            String text = item.get(1);
            dc.mySelectBox(webElement,text);
        }
    }
}
