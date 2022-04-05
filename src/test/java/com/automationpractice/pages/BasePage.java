package com.automationpractice.pages;

import com.automationpractice.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


    public abstract class BasePage {
        public BasePage() {

            PageFactory.initElements(Driver.getDriver(), this);
        }
    }