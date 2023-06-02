package ru.praktikum.scooter.test;

import org.junit.Test;
import ru.praktikum.scooter.test.page_object.MainPage;
import ru.praktikum.scooter.test.page_object.PageOrderAboutRent;
import ru.praktikum.scooter.test.page_object.PageOrderForWhom;
import ru.praktikum.scooter.test.page_object.PageStatusOrder;


public class TestScooterOrderYesModalOrderDisplayed extends BaseTestScooterOrder {
    MainPage mainPage;
    PageOrderForWhom pageOrderForWhom;
    PageOrderAboutRent pageOrderAboutRent;
    PageStatusOrder pageStatusOrder;
    String namePerson = "Ира";
    String SurnamePerson = "Гладкова";
    String AdressPerson = "Санкт-Петербург, Павлова 3";
    String PhoneNumber = "+79650084939";
    String OrderCommentText = "После 22:00";
    @Test
    //throws Exception
    public void orderButtonUpOrderCreate()  {
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
        mainPage.clickConfirmOrderYes();
        pageStatusOrder = new PageStatusOrder(driver);
        pageStatusOrder.checkDisplayModalStatusOrder();

    }

    @Test
    //throws Exception
    public void orderButtonDownOrderCreate()  {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Нажать на кнопку "Заказать" вверху страницы
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
        mainPage.clickConfirmOrderYes();
        pageStatusOrder = new PageStatusOrder(driver);
        pageStatusOrder.checkDisplayModalStatusOrder();

    }


}


