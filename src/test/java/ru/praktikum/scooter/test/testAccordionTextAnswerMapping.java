package ru.praktikum.scooter.test;
import org.junit.Test;
import ru.praktikum.scooter.test.page_object.MainPage;
import static org.junit.Assert.assertEquals;


public class testAccordionTextAnswerMapping extends baseTestScooterOrder {
      MainPage mainPage;
      static final String expectedFirstQuestionText = "Сколько это стоит? И как оплатить?";
      static final String expectedFirstAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
      static final String expectedSecondQuestionText = "Хочу сразу несколько самокатов! Так можно?";
      static final String expectedSecondAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

      @Test
      public void testAnswerByFirstButton() {
          mainPage = new MainPage(driver);


          //Согласиться с куками
          mainPage.clickAgreeToCook();
          //Получить текст на первой кнопке
          mainPage.getActualAccordionFirstButtonText();
          //Кликнуть на первый вопрос
          mainPage.accordionButtonClick();
          //Получить ответ
          String actualAnswerFirstText = mainPage.getActualAccordionFirstAnswerText();

          assertEquals("Текст не совпадает",  expectedFirstAnswerText, actualAnswerFirstText);
      }

     @Test
      public void testAnswerBySecondButton() {
          mainPage = new MainPage(driver);
          //Согласиться с куками
          mainPage.clickAgreeToCook();
          //Получить текст на второй кнопке
          mainPage.getActualAccordionSecondButtonText();
          //Кликнуть на второй вопрос
          mainPage.accordionButtonClick1();
          //Получить ответ
          String actualAnswerSecondText = mainPage.getActualAccordionSecondAnswerText();

          assertEquals("Текст не совпадает", expectedSecondAnswerText, actualAnswerSecondText);

      }

  }

  /*  @RunWith(Parameterized.class) //тесты будет запускать Parameterized
    public class testAccordionTextAnswerMapping extends baseTestScooterOrder {
        MainPage mainPage;
        //private final String expectedFirstQuestionText;
        String expectedFirstAnswerText;

        public AccordionTextFirstAnswerMappig(String expectedFirstAnswerText) {
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
