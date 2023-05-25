package ru.praktikum.scooter.test;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.io.File;
import static ru.praktikum.scooter.test.config.AppConfig.AppUrl;

public class BaseTestScooterOrder {
    WebDriver driver;
    @Before
    public void setUp() {
                ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("C:/Users/IGladkova/projects/chromedriver/chromedriver"))
                .build();
        driver = new ChromeDriver(service);
        driver.get(AppUrl);
        //   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


            }
@After
public void close(){driver.quit();}
    }


