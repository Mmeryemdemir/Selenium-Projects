package day02_driverMathods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DrivernavigateMethodları {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().to("https://www.youtube.com");

        Thread.sleep(2000);

        // geri amazona dönelim
        driver.navigate().back();
        Thread.sleep(2000);


        // yeniden youtube gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.close();
    }
}
