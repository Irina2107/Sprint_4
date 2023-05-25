package ru.praktikum.scooter.test.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCreatedOrder {
    WebDriver driver;

    public PageCreatedOrder(WebDriver driver) {
        this.driver = driver;}
    private By agreeToCook = By.id("rcc-confirm-button");
    private By upOrderButton = By.className("Button_Button__ra12g");

    private By confirmOrderNo = By.xpath(".//button[contains(text(),'Нет')]");
    private By confirmOrderYes = By.xpath(".//button[contains(text(),'Да')]");

    //Локатор 0-го элемента на accordion__button
    private By accordionButton = By.xpath(".//div[@id='accordion__heading-0']");

    //Локатор 1-го элемента на accordion__button
    private By accordionButton1 = By.xpath(".//div[@id='accordion__heading-1']");

    public void clickAgreeToCook(){
        driver.findElement(agreeToCook).click();
    }

    public void clickUpOrderButton(){
        driver.findElement(upOrderButton).click();
    }
     public void clickConfirmOrderNo() {driver.findElement(confirmOrderNo).click();}

    public void clickConfirmOrderYes(){
        driver.findElement(confirmOrderYes).click();
    }

    //Нажать на первую кнопку аккордеона
    public void accordionButtonClick() {driver.findElement(accordionButton).click();
    }

    //Нажать на вторую кнопку аккордеона
    public void accordionButtonClick1() {driver.findElement(accordionButton1).click();
    }

}
