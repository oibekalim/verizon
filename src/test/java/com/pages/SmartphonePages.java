package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartphonePages {

    public SmartphonePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(text(),\"Phones\")])[1]")
    public WebElement phones;

    @FindBy(xpath = "//a[contains(@id,'thirdLevel00')]")
    public WebElement smartphones;

    @FindBy(xpath = "//img[@alt='Apple iPhone&reg; 11 Pro Max Colour Space Gray']")
    public WebElement appleIphone11ProMax;

    @FindBy(xpath = "//div[@style='background-color: rgb(207, 190, 169);']")
    public WebElement goldColor;

    @FindBy(xpath = "//p[contains(text(),\"256GB\")]")
    public WebElement memory256GB;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div/div/div[3]/div/div[2]/p/span")
    public WebElement price;

    @FindBy(xpath = "//*[@id=\"tile_container\"]/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/span")
    public WebElement price1Page;

    //@FindBy(xpath = "//button[@class='addToCartBtn ']")
    @FindBy(id = "ATC-Btn")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@name='zipcode']")
    public WebElement enterZipCode;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement confirmLocation;

    @FindBy(xpath = "//button[contains(text(),\"New Customer\")]")
    public WebElement newCustomer;



}
