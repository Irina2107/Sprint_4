package ru.praktikum.scooter.test.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class PageOrderForWhom {
    WebDriver driver;
    public PageOrderForWhom(WebDriver driver) {
        this.driver = driver;}
    private By pageOrderForWhom = By.xpath(".//div[contains(text(), 'Для кого самокат')]");
    //Проверить, что открылась страница AppUrl/order "Для кого самокат"
    public void checkDisplayedForWhom(){
           boolean isDisplayForWhom = driver.findElement(pageOrderForWhom).isDisplayed();
            assertTrue(isDisplayForWhom);}
    //Локаторы
        private By nameInput = By.xpath(".//input[@placeholder='* Имя']");
        private By surnameInput = By.xpath(".//input[@placeholder='* Фамилия']");
        private By adressInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
        private By metroStationButton = By.xpath(".//input[@placeholder='* Станция метро']");
        private By metroStationAdd = By.xpath(".//li[@data-index = '3']");
        private By phoneInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
        private By nextButton = By.xpath(".//button[contains(text(), 'Далее')]");

    public void fillName(String name){
        driver.findElement(nameInput).sendKeys(name);
        }
    //Методы
    public void fillSurname(String surname){
        driver.findElement(surnameInput).sendKeys(surname);
    }
    public void fillAdress(String adress){
        driver.findElement(adressInput).sendKeys(adress);
    }
    public void clickMetroStationButton(){
        driver.findElement(metroStationButton).click();
    }
    public void clickMetroStationAdd(){
        driver.findElement(metroStationAdd).click();
    }
    public void fillPhoneInput(String phoneNumber){
        driver.findElement(phoneInput).sendKeys(phoneNumber);
    }
    // Нажать на кнопку далее
    public void clickNextButton(){
    driver.findElement(nextButton).click();
}

    }

