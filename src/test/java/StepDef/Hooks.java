package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    //driver
    public static WebDriver driver;

    //Before
    @Before
    public void StartTest(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    //After
    @After
    public void EndTest() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
