package ru.praktikum.scooter.test.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class PageStatusOrder {
    WebDriver driver;

    public PageStatusOrder(WebDriver driver) {
        this.driver = driver;
    }

    private final By modalStatusOrder = By.xpath(".//div[@class='Order_NextButton__1_rCA']");

    //Проверить, что открылась страница AppUrl/order "Заказ оформлен"
    public void checkDisplayModalStatusOrder() {

        boolean isDisplayModalStatusOrder = driver.findElement(modalStatusOrder).isDisplayed();
        assertTrue("Нет модального окна со статусом",isDisplayModalStatusOrder);

    }
}
