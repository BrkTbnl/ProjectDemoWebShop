package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation extends Parent{
    public TopNavigation() {
        PageFactory.initElements(GWD.getDriver(), this);
    }



    public WebElement getWebElement(String strElement) {
        switch (strElement){

        }
        return null;
    }
}
