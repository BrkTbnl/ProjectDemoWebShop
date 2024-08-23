package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation extends Parent{
    public TopNavigation() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/register\"]")
    public WebElement registerButton;

    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@href=\"/customer/info\"])[1]")
    public WebElement customerInfoLabel;

    @FindBy(xpath = "(//a[@href=\"/logout\"])[1]")
    public WebElement logoutButton;

    public WebElement getWebElement(String strElement) {
        switch (strElement){

        }
        return null;
    }
}
