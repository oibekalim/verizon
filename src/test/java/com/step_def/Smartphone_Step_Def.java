package com.step_def;

import com.pages.SmartphonePages;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Smartphone_Step_Def {

    String firstPrice;

    SmartphonePages smartphonePages =new SmartphonePages();

    @Given("Go to verizon.com")
    public void go_to_verizon_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("hover over phone")
    public void hover_over_phone() {
        BrowserUtils.wait(1);
        BrowserUtils.hover(smartphonePages.phones);
       // Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(smartphonePages.phones).perform();

        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//*[@id=\"secondLevel0\"]/div/div/div/ul[1]/li"));
        int total=links.size();

        for(int i=0; i<total; i++) {
            WebElement element = links.get(i);
            String text =element.getAttribute("innerHTML");
            System.out.println("---->  " + text);
        }
    }

    @Then("click on Smartphone")
    public void click_on_Smartphone() {
        smartphonePages.smartphones.click();
    }

    @Then("Click on Apple Iphone 11Pro Max")
    public void Click_on_Apple_Iphone_11Pro_Max(){
        smartphonePages.appleIphone11ProMax.click();
    }

    @Then("Click on Gold color")
    public void click_on_Gold_color() {
    smartphonePages.goldColor.click();
    }

    @Then("Click on {int}GB")
    public void click_on_GB(Integer int1) {
        smartphonePages.memory256GB.click();
    }




    @Then("Click on Continue Button")
    public void click_on_Continue_Button() {
        smartphonePages.continueButton.click();
    }

    @Then("Enter zipcode")
    public void enter_zipcode() {
        smartphonePages.enterZipCode.sendKeys("77477");
        firstPrice =smartphonePages.price1Page.getText();
    }

    @Then("Click on Confirm Location")
    public void click_on_Confirm_Location() {
       smartphonePages.confirmLocation.click();

    }

    @Then("Click on New Customer button")
    public void click_on_New_Customer_button() {
       smartphonePages.newCustomer.click();
    }

    @Then("Verify the price")
    public void verify_the_price() {
        Assert.assertEquals(smartphonePages.price.getText(),firstPrice);
    }




}
