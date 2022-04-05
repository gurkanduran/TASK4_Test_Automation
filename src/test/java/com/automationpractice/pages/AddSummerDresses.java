package com.automationpractice.pages;

import com.automationpractice.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddSummerDresses extends BasePage{

    public AddSummerDresses(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']")
    public WebElement dresses;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/ul//a[@title='Summer Dresses']")
    public WebElement summerDresses;

    @FindBy(xpath = "//div[@class='product-image-container'][1]")
    public WebElement firstItem;

    @FindBy(xpath = "//div[@id='center_column']/ul/li[1]/div[@class='product-container']//a[@title='Add to cart']/span[.='Add to cart']")
    public WebElement addCart;

}
