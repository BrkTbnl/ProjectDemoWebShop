package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id=\"gender-male\"]")
    public WebElement selectBoxMale;

    @FindBy(xpath = "//input[@id=\"FirstName\"]")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@id=\"LastName\"]")
    public WebElement lastNameInput;

    @FindBy(xpath="//input[@id=\"Email\"]")
    public WebElement emailInput;

    @FindBy(xpath="//input[@id=\"Password\"]")
    public WebElement passwordInput;

    @FindBy(xpath="//input[@id=\"ConfirmPassword\"]")
    public WebElement confirmPasswordInput;

    @FindBy(xpath="//input[@id=\"register-button\"]")
    public WebElement registerConfirmButton;

    @FindBy(xpath = "//div[@class=\"result\"]")
    public WebElement result;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {

        }
        return null;
    }


}
