package ru.praktikum.scooter.test;

import org.junit.Test;
import ru.praktikum.scooter.test.page_object.MainPage;
import ru.praktikum.scooter.test.page_object.PageOrderAboutRent;
import ru.praktikum.scooter.test.page_object.PageOrderForWhom;

public class TestScooterOrderNoModalOrderNotDisplayed extends BaseTestScooterOrder {
    MainPage mainPage;
    PageOrderForWhom pageOrderForWhom;
    PageOrderAboutRent pageOrderAboutRent;
    String namePerson = "Ира";
    String SurnamePerson = "Гладкова";
    String AdressPerson = "Санкт-Петербург, Павлова 3";
    String PhoneNumber = "+79650084939";
    String OrderCommentText = "После 22:00";
    @Test
        public void OrderButtonUpOrderNotCreated()  {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Нажать на кнопку "Заказать" вверху страницы
        mainPage.clickUpOrderButton();
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
      // Для No, проверить, что открылось окно "Про аренду"
        mainPage.clickConfirmOrderNo();
       pageOrderAboutRent.checkDisplayedAboutRent();
    }


    @Test
    public void OrderButtonDownOrderNotCreated()  {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Нажать на кнопку "Заказать" внизу страницы
        mainPage.clickDownOrderButton();
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
        // Для No, проверить, что открылось окно "Про аренду"
        mainPage.clickConfirmOrderNo();
        pageOrderAboutRent.checkDisplayedAboutRent();
    }
}



