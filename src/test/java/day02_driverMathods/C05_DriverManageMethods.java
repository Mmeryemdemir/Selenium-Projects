package day02_driverMathods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        /*
        waits konusu ilerde daha geniş anlatılacak

        Implicitly wait driver'in aradığı elementleri bulabilmesi için
        kendisine verdiğimiz araştırma suresidir
        o sure içerisinde aradığı elementi bulamassa hata verir
         */

        driver.manage().window().fullscreen();

        System.out.println(" fullscreen position" +driver.manage().window().getPosition());
        System.out.println("fullscreen size" +driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().maximize();

        System.out.println(" maximiz position" +driver.manage().window().getPosition());
        System.out.println("maximix size" +driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().minimize();

        System.out.println(" minimize position" +driver.manage().window().getPosition());
        System.out.println("minimize size" +driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.close();
    }
}
