package com.demoBlaze.stepDefinitions;

import com.demoBlaze.pages.productPage;
import com.demoBlaze.utilities.BrowserUtils;
import com.demoBlaze.utilities.ConfigurationReader;
import com.demoBlaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestStepDefs {
    productPage productPage=new productPage();
    @Given("buyer is on the homepage of demoblaze")
    public void buyer_is_on_the_homepage_of_demoblaze() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("buyer adds from {string} category {string} product to cart")
    public void buyer_adds_from_category_product_to_cart(String category, String product) {
        productPage.getLink(category);
        productPage.getLink(product);
        productPage.getLink("add to cart");

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.alertIsPresent());
        BrowserUtils.sleep(1000);

        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();}
          @When("buyer clicks on {string} link")
        public void buyer_clicks_on_link(String link) {
       productPage.getLink(link);
        }

    }

