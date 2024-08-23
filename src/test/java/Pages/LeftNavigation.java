package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavigation extends Parent{
    public LeftNavigation(){
        PageFactory.initElements(GWD.getDriver(),this);
    }





    public WebElement getWebElement(String strElement){
        switch (strElement){

        }
        return null;
    }




}
