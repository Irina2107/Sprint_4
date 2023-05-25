package ru.praktikum.scooter.test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum.scooter.test.pageobject.PageCreatedOrder;

import java.time.Duration;
import static org.junit.Assert.assertEquals;


    public class CheckAccordionTest extends BaseTestScooterOrder {
        // WebDriver driver;
        PageCreatedOrder pageCreatedOrder;


        @Test
        public void AccordionCommon1() {
            pageCreatedOrder = new PageCreatedOrder(driver);

            String expectedButton = "Сколько это стоит? И как оплатить?";
            String expectedTextOfAccordion = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

            //Согласиться с куками
            pageCreatedOrder.clickAgreeToCook();

            ////Ожидание прогрузки страницы
            By forWait = By.xpath(".//div[contains(text(),'Вопросы о важном')]");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                    && !driver.findElement(forWait).getText().isEmpty()
            ));
            // Получить текст на accordion__button
            By accordionButtonText = By.xpath(".//*[@id='accordion__heading-0']");
            String actualAccordionButtonText = driver.findElement(accordionButtonText).getText();

            //Подождать
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@aria-controls='accordion__panel-0']")));
            //Нажать на первый вопрос
            pageCreatedOrder.accordionButtonClick();
            //Подождать
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-0']/p")));
            //Получить текст
            By textOfAccordion = By.xpath(".//div[@id='accordion__panel-0']/p");
            String actualTextOfAccordion = driver.findElement(textOfAccordion).getText();

            assertEquals("Текст не совпадает", expectedButton, actualAccordionButtonText);
            assertEquals("Текст не совпадает", expectedTextOfAccordion, actualTextOfAccordion);
        }
        @Test
        public void AccordionCommon2() {
            pageCreatedOrder = new PageCreatedOrder(driver);

            String expectedButton = "Хочу сразу несколько самокатов! Так можно?";
            String expectedTextOfAccordion = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

            //Согласиться с куками
            pageCreatedOrder.clickAgreeToCook();

            ////Ожидание прогрузки страницы
            By forWait = By.xpath(".//div[contains(text(),'Вопросы о важном')]");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(forWait).getText() != null
                    && !driver.findElement(forWait).getText().isEmpty()
            ));
            // Получить текст на accordion__button
            By accordionButtonText1 = By.xpath(".//*[@id='accordion__heading-1']");
            String actualAccordionButtonText1 = driver.findElement(accordionButtonText1).getText();

            //Подождать
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@aria-controls='accordion__panel-1']")));
            //Нажать на второй вопрос
            pageCreatedOrder.accordionButtonClick1();
            //Подождать
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='accordion__panel-1']/p")));
            //Получить текст
            By textOfAccordion1 = By.xpath(".//div[@id='accordion__panel-1']/p");
            String actualTextOfAccordion1 = driver.findElement(textOfAccordion1).getText();

            assertEquals("Текст не совпадает", expectedButton, actualAccordionButtonText1);
            assertEquals("Текст не совпадает", expectedTextOfAccordion, actualTextOfAccordion1);
        }
 }




