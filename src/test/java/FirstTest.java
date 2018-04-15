import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

/**
 * Created by Admin on 15.04.2018.
 */
public class FirstTest {

    @Test
    public void firstTest(){
        ChromeDriverManager.getInstance().setup();
        ChromeDriver drv = new ChromeDriver();
        drv.manage().window().maximize();
        drv.get("https://www.google.com.ua/");
        drv.quit();
    }
}
