package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavigation extends Parent{
    public LeftNavigation(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href=\"/computers\"])[3]")
    public WebElement computerButton;

    @FindBy(xpath = "(//a[@href=\"/desktops\"])[3]")
    public WebElement desktopsButton;

    @FindBy(xpath = "(//a[@href=\"/customer/orders\"])[1]")
    public WebElement ordersButton;




    public WebElement getWebElement(String strElement){
        switch (strElement){

        }
        return null;
    }




}
