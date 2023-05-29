package ru.praktikum.scooter.test.page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;}


      private By agreeToCook = By.id("rcc-confirm-button");
    //Заказать вверху страницы
    private By upOrderButton = By.className("Button_Button__ra12g");

    //Заказать внизу страницы
    private By downOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']");

    private By confirmOrderNo = By.xpath(".//button[contains(text(),'Нет')]");
    private By confirmOrderYes = By.xpath(".//button[contains(text(),'Да')]");

    //Локатор 0-го элемента на accordion__button
    // private By accordionButton = By.xpath(".//div[@id='accordion__heading-0']");

    //Локатор 1-го элемента на accordion__button
    private By accordionSecondButton = By.xpath(".//div[(@id='accordion__heading-1' and @role='button')]");

    private By getAccordionNdButton = By.xpath(".//div[@id='accordion__heading-i']");

    //private By aboutRentPage= By.xpath(".//div[contains(text(), 'Про аренду')];
    //Локатор 0-го элемента на accordion__button
    private By accordionFirstButton = By.xpath(".//div[(@id='accordion__heading-0' and @role='button')]");
    private By textFirstOfAccordion = By.xpath(".//div[@id='accordion__panel-0']/p");

    private By textSecondTextOfAccordion = By.xpath(".//div[@id='accordion__panel-1']/p");

    private By elementFaq = By.className("Home_FAQ__3uVm4");

    //для ожидания загрузки страницы
    private By forWait = By.xpath(".//div[contains(text(),'Вопросы о важном')]");


    public void clickAgreeToCook(){
        driver.findElement(agreeToCook).click();
    }

    public void clickUpOrderButton(){
        driver.findElement(upOrderButton).click();
    }

    public void clickDownOrderButton() {driver.findElement(downOrderButton).click();};
     public void clickConfirmOrderNo() {
         //Подождать
         new WebDriverWait(driver, Duration.ofSeconds(15))
                 .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Modal__YZ-d3")));
        driver.findElement(confirmOrderNo).click();}

    public void clickConfirmOrderYes(){
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Modal__YZ-d3")));
        driver.findElement(confirmOrderYes).click();
    }

    public String getActualAccordionFirstButtonText() {
        //Ожидание прогрузки страницы
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        //Получить текст на первой кнопке
        String firstButtonText = driver.findElement(accordionFirstButton).getText();
        return firstButtonText;
    }

        //Получить текст на второй кнопке
    public String getActualAccordionSecondButtonText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        String secondButtonText = driver.findElement(accordionSecondButton).getText();
        return secondButtonText;
    }

    public String getActualAccordionFirstAnswerText() {
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-0']/p")));
        String firstAnswerText = driver.findElement(textFirstOfAccordion).getText();
        return firstAnswerText;
    }

    public String getActualAccordionSecondAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-1']/p")));
        String secondAnswerText = driver.findElement(textSecondTextOfAccordion).getText();
        return secondAnswerText;
    }

    //Нажать на первую кнопку аккордеона
    public void accordionButtonClick() {
        //Проскролить  до блока с вопросами
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionFirstButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated (accordionFirstButton));
        driver.findElement(accordionFirstButton).click();
    }

    //Нажать на вторую кнопку аккордеона
    public void accordionButtonClick1() {
        //Проскролить  до блока с вопросами
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionSecondButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionSecondButton));
        driver.findElement(accordionSecondButton).click();
    }


}
