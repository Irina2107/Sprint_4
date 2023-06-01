package ru.praktikum.scooter.test;
import org.junit.Test;
import ru.praktikum.scooter.test.page_object.MainPage;
import static org.junit.Assert.assertEquals;


public class TestAccordionTextAnswerMappig extends BaseTestScooterOrder {
      MainPage mainPage;
      static final String EXPECTEDFIRSTQUESTIONTEXT = "Сколько это стоит? И как оплатить?";
      static final String EXPECTEDFIRSTANSWERTEXT = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
      static final String EXPECTEDSECONDQUESTIONTEXT = "Хочу сразу несколько самокатов! Так можно?";
      static final String EXPECTEDSECONDANSWERTEXT = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
      static final String EXPECTEDTHIRDQUESTIONTEXT = "Как рассчитывается время аренды?";
      static final String EXPECTEDTHIRDANSWERTEXT = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
      static final String EXPECTEDFOURTHDQUESTIONTEXT = "Можно ли заказать самокат прямо на сегодня?";
      static final String EXPECTEDFOURTHANSWERTEXT = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
      static final String EXPECTEDFIFTHQUESTIONTEXT = "Можно ли продлить заказ или вернуть самокат раньше?";
      static final String EXPECTEDFIFTHANSWERTEXT = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
      static final String EXPECTEDSIXTHQUESTIONTEXT = "Вы привозите зарядку вместе с самокатом?";
      static final String EXPECTEDSIXTHANSWERTEXT = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
      static final String EXPECTEDSEVENTHQUESTIONTEXT = "Можно ли отменить заказ?";
      static final String EXPECTEDSEVENTHANSWERTEXT = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
      static final String EXPECTEDEIGHTHQUESTIONTEXT = "Я живу за МКАДом, привезёте?";
      static final String EXPECTEDEIGHTHANSWERTEXT = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    @Test
    public void testFirstAnswerText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Кликнуть на первый вопрос
        mainPage.accordionButtonClick();
        //Получить ответ
        String actualAnswerFirstText = mainPage.getActualAccordionFirstAnswerText();
        assertEquals("Текст не совпадает", EXPECTEDFIRSTANSWERTEXT, actualAnswerFirstText);
    }
    @Test
    public void testFirstButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на первой кнопке
        String actualQuestionFirstText = mainPage.getActualAccordionFirstButtonText();
        assertEquals("Текст не совпадает", EXPECTEDFIRSTQUESTIONTEXT, actualQuestionFirstText);
    }
     @Test
      public void testSecondAnswerText() {
          mainPage = new MainPage(driver);
          //Согласиться с куками
          mainPage.clickAgreeToCook();
          //Кликнуть на второй вопрос
          mainPage.accordionButtonClickSecond();
          //Получить ответ
          String actualAnswerSecondText = mainPage.getActualAccordionSecondAnswerText();
          assertEquals("Текст не совпадает", EXPECTEDSECONDANSWERTEXT, actualAnswerSecondText);
      }
    @Test
    public void testSecondButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на второй кнопке
        String actualQuestionSecondText = mainPage.getActualAccordionSecondButtonText();
        assertEquals("Текст не совпадает", EXPECTEDSECONDQUESTIONTEXT, actualQuestionSecondText);
    }
    @Test
    public void testThirdAnswerText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Кликнуть на третий вопрос
        mainPage.accordionButtonClickThird();
        //Получить ответ
        String actualAnswerThirdText = mainPage.getActualAccordionThirdAnswerText();
        assertEquals("Текст не совпадает", EXPECTEDTHIRDANSWERTEXT, actualAnswerThirdText);
    }
    @Test
    public void testThirdButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на третьей кнопке
        String actualQuestionThirdText = mainPage.getActualAccordionThirdButtonText();
        assertEquals("Текст не совпадает", EXPECTEDTHIRDQUESTIONTEXT, actualQuestionThirdText);
    }
    @Test
    public void testFourthAnswerText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Кликнуть на первый вопрос
        mainPage.accordionButtonClickFourth();
        //Получить ответ
        String actualAnswerFourthText = mainPage.getActualAccordiontFourthAnswerText();
        assertEquals("Текст не совпадает", EXPECTEDFOURTHANSWERTEXT, actualAnswerFourthText);
    }
    @Test
    public void testFourthButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на первой кнопке
        String actualQuestionFourthText = mainPage.getActualAccordionFourthButtonText();
        assertEquals("Текст не совпадает", EXPECTEDFOURTHDQUESTIONTEXT, actualQuestionFourthText);
    }
    @Test
    public void testFifthAnswerText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Кликнуть на первый вопрос
        mainPage.accordionButtonClickFifth();
        //Получить ответ
        String actualAnswerFifthText = mainPage.getActualAccordiontFifthAnswerText();
        assertEquals("Текст не совпадает", EXPECTEDFIFTHANSWERTEXT, actualAnswerFifthText);
    }
    @Test
    public void testFifthButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на первой кнопке
        String actualQuestionFifthText = mainPage.getActualAccordionFifthButtonText();
        assertEquals("Текст не совпадает", EXPECTEDFIFTHQUESTIONTEXT, actualQuestionFifthText);
    }
    @Test
    public void testSixthAnswerText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Кликнуть на первый вопрос
        mainPage.accordionButtonClickSixth();
        //Получить ответ
        String actualAnswerSixthText = mainPage.getActualAccordiontSixthAnswerText();
        assertEquals("Текст не совпадает", EXPECTEDSIXTHANSWERTEXT, actualAnswerSixthText);
    }
    @Test
    public void testSixthButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на первой кнопке
        String actualQuestionSixthText = mainPage.getActualAccordionSixthButtonText();
        assertEquals("Текст не совпадает", EXPECTEDSIXTHQUESTIONTEXT, actualQuestionSixthText);
    }
    @Test
    public void testSeventhAnswerText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Кликнуть на первый вопрос
        mainPage.accordionButtonClickSeventh();
        //Получить ответ
        String actualAnswerSeventhText = mainPage.getActualAccordiontSeventhAnswerText();
        assertEquals("Текст не совпадает", EXPECTEDSEVENTHANSWERTEXT, actualAnswerSeventhText);
    }
    @Test
    public void testSeventhButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на первой кнопке
        String actualQuestionSeventhText = mainPage.getActualAccordionSeventhButtonText();
        assertEquals("Текст не совпадает", EXPECTEDSEVENTHQUESTIONTEXT, actualQuestionSeventhText);
    }
    @Test
    public void testEightAnswerText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Кликнуть на первый вопрос
        mainPage.accordionButtonClickEighth();
        //Получить ответ
        String actualAnswerEightText = mainPage.getActualAccordiontEighthAnswerText();
        assertEquals("Текст не совпадает", EXPECTEDEIGHTHANSWERTEXT, actualAnswerEightText);
    }
    @Test
    public void testEighthButtonText() {
        mainPage = new MainPage(driver);
        //Согласиться с куками
        mainPage.clickAgreeToCook();
        //Получить текст на первой кнопке
        String actualQuestionEighthText = mainPage.getActualAccordionEighthButtonText();
        assertEquals("Текст не совпадает", EXPECTEDEIGHTHQUESTIONTEXT , actualQuestionEighthText);
    }
  }

  /*  @RunWith(Parameterized.class) //тесты будет запускать Parameterized
    public class testtestAccordionTextAnswerMappig extends BaseTestScooterOrder {
        MainPage mainPage;
        //private final String expectedFirstQuestionText;
        String expectedFirstAnswerText;

        public TestAccordionTextAnswerMappig(String expectedFirstAnswerText) {
            this.expectedFirstAnswerText = expectedFirstAnswerText;

        }

        @Parameterized.Parameters
        public static Object[][] getText() {

            return new Object[][]{
                    {"Сутки — 400 рублей. Оплата курьеру — наличными или картой."},

              };
        }

        @Test
        public void testMappingTextFirstAnswer() {

            mainPage = new MainPage(driver);
            //Согласиться с куками
            mainPage.clickAgreeToCook();
            //Получить текст на первой кнопке
            mainPage.getActualAccordionFirstButtonText();
            //Кликнуть на первый вопрос
            mainPage.accordionButtonClick();
            String actualAnswerFirstText = mainPage.getActualAccordionFirstAnswerText();
            assertEquals("Текст не совпадает", expectedFirstAnswerText, actualAnswerFirstText);

        }

    }
*/
