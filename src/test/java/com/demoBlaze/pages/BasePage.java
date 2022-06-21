package com.demoBlaze.pages;

import com.demoBlaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void getLink(String link){
        Driver.getDriver().findElement(By.partialLinkText(link)).click();
    }
}
