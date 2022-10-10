package day02_driverMathods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodları {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println(driver.getWindowHandle());
        // bize acılan browser'ın handle değerini dondurur

        driver.getWindowHandles();
        /*
        eğer testimiz sırasında birden fazla window acılırsa
        acılan tüm window'ları window handle değerlerini bir Set olarak dondurur
        window'lar arası gecisi bu handle değerleri ile yaparız
         */

        driver.get("https://amazon.com");
        System.out.println(driver.getPageSource());
        // websayfasının tüm kaynak kodlarını döndürür


        driver.close();


    }
}
