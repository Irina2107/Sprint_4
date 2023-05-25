package ru.praktikum.scooter.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum.scooter.test.pageobject.PageCreatedOrder;
import ru.praktikum.scooter.test.pageobject.PageOrderAboutRent;
import ru.praktikum.scooter.test.pageobject.PageOrderForWhom;
import java.time.Duration;
import static org.junit.Assert.assertTrue;

public class TestScooterOrderYes extends BaseTestScooterOrder {
    PageCreatedOrder pageCreatedOrder;
    PageOrderForWhom pageOrderForWhom;
    PageOrderAboutRent pageOrderAboutRent;
    String namePerson = "Ира";
    String SurnamePerson = "Гладкова";
    String AdressPerson = "Санкт-Петербург, Павлова 3";
    String PhoneNumber = "+79650084939";
    String OrderCommentText = "После 22:00";
    @Test
    //throws Exception
    public void checkOrderCreate()  {
        pageCreatedOrder = new PageCreatedOrder(driver);
        //Согласиться с куками
        pageCreatedOrder.clickAgreeToCook();
        //Нажать на кнопку "Заказать" вверху страницы
        pageCreatedOrder.clickUpOrderButton();
        //Проверить, что открылась страница AppUrl/order "Для кого самокат"
        pageOrderForWhom = new PageOrderForWhom(driver);
        pageOrderForWhom.checkDisplayedForWhom();
        //Заполнить "Для кого самокат"
        pageOrderForWhom.fillName(namePerson);
        pageOrderForWhom.fillSurname(SurnamePerson);
        pageOrderForWhom.fillAdress(AdressPerson);
        pageOrderForWhom.clickMetroStationButton();
        pageOrderForWhom.clickMetroStationAdd();
        pageOrderForWhom.fillPhoneInput(PhoneNumber);
        // Нажать на далее
        pageOrderForWhom.clickNextButton();
        pageOrderAboutRent = new PageOrderAboutRent(driver);
        //Проверить, что открылась страница AppUrl/order "Про аренду"
        pageOrderAboutRent.checkDisplayedAboutRent();
        //Заполнить "Про аренду"
        pageOrderAboutRent.clickDeliveryDate();
        pageOrderAboutRent.clickDeliveryDateSet();
        pageOrderAboutRent.clickRentalTime();
        pageOrderAboutRent.clickRentalTimeSet();
        pageOrderAboutRent.clickScooterColorSet();
        pageOrderAboutRent.fillOrderComment(OrderCommentText);
        pageOrderAboutRent.clickOrderButton();
       //Подождать
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Modal__YZ-d3")));
        //для Yes проверить, что открылось модальное окно "Заказ оформлен"
        pageCreatedOrder.clickConfirmOrderYes();
       var ModalOrderDisplayed =  driver.findElement(By.xpath(".//div[@class='Order_Text__2broi']"));

        assertTrue("Нет окна. Ошибка", ModalOrderDisplayed.isDisplayed());
    }

}


