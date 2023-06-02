package ru.praktikum.scooter.test.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class PageOrderAboutRent {
    WebDriver driver;

    public PageOrderAboutRent(WebDriver driver) {this.driver = driver;}

    private By pageOrderAboutRent = By.xpath(".//div[contains(text(), 'Про аренду')]");
    //Проверить, что открылась страница AppUrl/order "Про аренду"
    public void checkDisplayedAboutRent() {
        boolean isDisplayAboutRent = driver.findElement(pageOrderAboutRent).isDisplayed();
        assertTrue(isDisplayAboutRent);
    }
    private By deliveryDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By deliveryDateSet = By.className("react-datepicker__day--030");
    private By rentalTime = By.xpath(".//div[@class='Dropdown-root']");
    private By rentalTimeSet = By.xpath(".//div[(@class='Dropdown-option' and text()='сутки')]");
    private By scooterColorSet = By.id("black");

    private By getScooterColorSetGrey = By.xpath("//input[@id='grey']");
    private By orderComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public void clickDeliveryDate(){
        driver.findElement(deliveryDate).click();}

    public void clickDeliveryDateSet(){
        driver.findElement(deliveryDateSet).click();}

    public void clickRentalTime(){
        driver.findElement(rentalTime).click();}

    public void clickRentalTimeSet(){driver.findElement(rentalTimeSet).click();}

    public void clickScooterColorSet(){
        driver.findElement(scooterColorSet).click();}

    public void clickScooterColorGreySet(){
        driver.findElement(getScooterColorSetGrey).click();
    }

    public void fillOrderComment(String textComment){
        driver.findElement(orderComment).sendKeys(textComment);}

    public void clickOrderButton(){
        driver.findElement(orderButton).click();}

}
