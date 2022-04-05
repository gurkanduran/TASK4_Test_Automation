package com.automationpractice.step_definitions;

import com.automationpractice.pages.AddSummerDresses;
import com.automationpractice.utilities.BrowserUtils;
import com.automationpractice.utilities.ConfigurationReader;
import com.automationpractice.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class AddSummerDressStepDefs {

    WebDriver driver;

    @Given("User is on home page")
    public void user_is_on_home_page() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("practice.url"));
    }
    @When("User goes to dresses link")
    public void user_goes_to_dresses_link() {
        AddSummerDresses dresses = new AddSummerDresses();
        Actions action = new Actions(driver);
        action.moveToElement(dresses.dresses).perform();

    }
    @And("clicks on summer dresses")
    public void clicks_on_summer_dresses() {

        AddSummerDresses summerDresses = new AddSummerDresses();
        summerDresses.summerDresses.click();
        BrowserUtils.scrollDown(700);
        BrowserUtils.sleep(2);

    }
    @And("click first item")
    public void click_first_item() {
        AddSummerDresses firstItem = new AddSummerDresses();
        BrowserUtils.hover(firstItem.firstItem);
      }

    @And("click add cart")
    public void clickAddCart() {
        AddSummerDresses addItem = new AddSummerDresses();
        addItem.addCart.click();

        BrowserUtils.switchToWindow(driver.getWindowHandle());

    }


    @Then("click Proceed to checkout")
    public void clickProceedToCheckout() {

        WebElement checkOut = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        checkOut.click();

        WebElement proceedToCheckOut = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"));
        proceedToCheckOut.click();
        BrowserUtils.scrollDown(300);
    }
}
