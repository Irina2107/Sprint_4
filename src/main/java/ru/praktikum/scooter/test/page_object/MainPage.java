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
    //  private By getAccordionNdButton = By.xpath(".//div[@id='accordion__heading-i']");

    //private By aboutRentPage= By.xpath(".//div[contains(text(), 'Про аренду')];
    //Локатор 0-го элемента на accordion__button
    private By accordionFirstButton = By.xpath(".//div[(@id='accordion__heading-0' and @role='button')]");
    private By accordionSecondButton = By.xpath(".//div[(@id='accordion__heading-1' and @role='button')]");
    private By accordionThirdButton = By.xpath(".//div[(@id='accordion__heading-2' and @role='button')]");
    private By accordionFourthdButton = By.xpath(".//div[(@id='accordion__heading-3' and @role='button')]");
    private By accordionFifthButton = By.xpath(".//div[(@id='accordion__heading-4' and @role='button')]");
    private By accordionSixthButton = By.xpath(".//div[(@id='accordion__heading-5' and @role='button')]");
    private By accordionSeventhButton = By.xpath(".//div[(@id='accordion__heading-6' and @role='button')]");
    private By accordionEighthButton = By.xpath(".//div[(@id='accordion__heading-7' and @role='button')]");
    private By textFirstOfAccordion = By.xpath(".//div[@id='accordion__panel-0']/p");
    private By textSecondOfAccordion = By.xpath(".//div[@id='accordion__panel-1']/p");
    private By textThirdOfAccordion = By.xpath(".//div[@id='accordion__panel-2']/p");
    private By textFourthOfAccordion = By.xpath(".//div[@id='accordion__panel-3']/p");
    private By textFifthOfAccordion = By.xpath(".//div[@id='accordion__panel-4']/p");
    private By textSixthOfAccordion = By.xpath(".//div[@id='accordion__panel-5']/p");
    private By textSeventhOfAccordion = By.xpath(".//div[@id='accordion__panel-6']/p");
    private By textEighthOfAccordion = By.xpath(".//div[@id='accordion__panel-7']/p");

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
    //Получить текст на третей кнопке
    public String getActualAccordionThirdButtonText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        String thirdButtonText = driver.findElement(accordionThirdButton).getText();
        return thirdButtonText;
    }
    //Получить текст на четвертой кнопке
    public String getActualAccordionFourthButtonText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        String fourthButtonText = driver.findElement(accordionFourthdButton).getText();
        return fourthButtonText;
    }
    //Получить текст на пятой кнопке
    public String getActualAccordionFifthButtonText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        String fifthButtonText = driver.findElement(accordionFifthButton).getText();
        return fifthButtonText;
    }
    //Получить текст на шестой кнопке
    public String getActualAccordionSixthButtonText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        String sixthButtonText = driver.findElement(accordionSixthButton).getText();
        return sixthButtonText;
    }
    //Получить текст на седьмой кнопке
    public String getActualAccordionSeventhButtonText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        String seventhButtonText = driver.findElement(accordionSeventhButton).getText();
        return seventhButtonText;
    }
    //Получить текст на восьмой кнопке
    public String getActualAccordionEighthButtonText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                && !driver.findElement(forWait).getText().isEmpty()
        ));
        String eighthButtonText = driver.findElement(accordionEighthButton).getText();
        return eighthButtonText;
    }
    //Получить ответ на первый вопрос
    public String getActualAccordionFirstAnswerText() {
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-0']/p")));
        String firstAnswerText = driver.findElement(textFirstOfAccordion).getText();
        return firstAnswerText;
    }
    //Получить ответ на второй вопрос
    public String getActualAccordionSecondAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-1']/p")));
        String secondAnswerText = driver.findElement(textSecondOfAccordion).getText();
        return secondAnswerText;
    }
    //Получить ответ на третий вопрос
    public String getActualAccordionThirdAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-2']/p")));
        String thirdAnswerText = driver.findElement(textThirdOfAccordion).getText();
        return thirdAnswerText;
    }
    //Получить ответ на четвертый вопрос
    public String getActualAccordiontFourthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-3']/p")));
        String fourthAnswerText = driver.findElement(textFourthOfAccordion).getText();
        return fourthAnswerText;
    }
    //Получить ответ на пятый вопрос
    public String getActualAccordiontFifthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-4']/p")));
        String fifthAnswerText = driver.findElement(textFifthOfAccordion).getText();
        return fifthAnswerText;
    }
    //Получить ответ на шестой вопрос
    public String getActualAccordiontSixthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-5']/p")));
        String sixthAnswerText = driver.findElement(textSixthOfAccordion).getText();
        return sixthAnswerText;
    }
    //Получить ответ на седьмой вопрос
    public String getActualAccordiontSeventhAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-6']/p")));
        String seventhAnswerText = driver.findElement(textSeventhOfAccordion).getText();
        return seventhAnswerText;
    }
    //Получить ответ на восьмой вопрос
    public String getActualAccordiontEighthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-7']/p")));
        String eighthAnswerText = driver.findElement(textEighthOfAccordion).getText();
        return eighthAnswerText;
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
    public void accordionButtonClickSecond() {
        //Проскролить  до блока с вопросами
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionSecondButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionSecondButton));
        driver.findElement(accordionSecondButton).click();
    }
    //Нажать на третью кнопку аккордеона
    public void accordionButtonClickThird() {
        //Проскролить  до блока с вопросами
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionThirdButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionThirdButton));
        driver.findElement(accordionThirdButton).click();
    }
    //Нажать на четвертую кнопку аккордеона
    public void accordionButtonClickFourth() {
        //Проскролить  до блока с вопросами
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionFourthdButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionFourthdButton));
        driver.findElement(accordionFourthdButton).click();
    }
    //Нажать на пятую кнопку аккордеона
    public void accordionButtonClickFifth() {
        //Проскролить  до блока с вопросами
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionFifthButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionFifthButton));
        driver.findElement(accordionFifthButton).click();
    }
    //Нажать на шестую кнопку аккордеона
    public void accordionButtonClickSixth() {
        //Проскролить  до блока с вопросами
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionSixthButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionSixthButton));
        driver.findElement(accordionSixthButton).click();
    }
    //Нажать на седьмую кнопку аккордеона
    public void accordionButtonClickSeventh() {
        //Проскролить  до блока с вопросами
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionSeventhButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionSeventhButton));
        driver.findElement(accordionSeventhButton).click();
    }
    //Нажать на восьмую кнопку аккордеона
    public void accordionButtonClickEighth() {
        //Проскролить  до блока с вопросами
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionEighthButton));
        //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accordionEighthButton));
        driver.findElement(accordionEighthButton).click();
    }

}
