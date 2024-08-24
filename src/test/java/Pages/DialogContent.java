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

    @FindBy(xpath = "//div[@class=\"validation-summary-errors\"]")
    public WebElement validationErrors;

    @FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
    public WebElement loginButton;

    @FindBy(xpath = "(//input[@class=\"button-2 product-box-add-to-cart-button\"])[3]")
    public WebElement computerSelectButton;

    @FindBy(xpath = "(//input[@id=\"add-to-cart-button-74\"])")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//p[@class=\"content\"])")
    public WebElement orderMessage;

    @FindBy(xpath = "//span[@class=\"product-unit-price\"]")
    public WebElement productPriceShoppingCart;

    @FindBy(xpath = "//input[@id=\"termsofservice\"]")
    public WebElement termsOfService;

    @FindBy(xpath = "//button[@id=\"checkout\"]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//select[@id=\"BillingNewAddress_CountryId\"]")
    public WebElement countrySelectBox;

    @FindBy(xpath = "//input[@id=\"BillingNewAddress_City\"]")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@id=\"BillingNewAddress_Address1\"]")
    public WebElement addressInput;

    @FindBy(xpath = "//input[@id=\"BillingNewAddress_ZipPostalCode\"]")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//input[@id=\"BillingNewAddress_PhoneNumber\"]")
    public WebElement phoneNumInput;

    @FindBy(xpath = "(//input[@class=\"button-1 new-address-next-step-button\"])[1]")
    public WebElement billingContinueButton;

    @FindBy(xpath = "(//input[@class=\"button-1 new-address-next-step-button\"])[2]")
    public WebElement shippingContinueButton;

    @FindBy(xpath = "//input[@class=\"button-1 shipping-method-next-step-button\"]")
    public WebElement shippingMethodContinueButton;

    @FindBy(xpath = "//input[@class=\"button-1 payment-method-next-step-button\"]")
    public WebElement paymentMethodContinueButton;

    @FindBy(xpath = "//input[@class=\"button-1 payment-info-next-step-button\"]")
    public WebElement paymentInfoContinueButton;

    @FindBy(xpath = "//input[@class=\"button-1 confirm-order-next-step-button\"]")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "(//div[@class=\"section order-completed\"]/div)[1]")
    public WebElement orderStatusMessageLabel;










    public WebElement getWebElement(String strElement) {
        switch (strElement) {

        }
        return null;
    }


}
