package day02_driverMathods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // driver objesi oluşturunca seleniım webdriver
        // bilgisayarımızdaki chrome browser'dan bir boş sayfa actırır.
        // eğer firefox gibi başka bir browser kullanmak istersek
        // Selenium sitesinden o browser'ın WebDriver'ını indirip projemize eklememiz gerekir

        driver.get("https://www.amazon.com");

        // eğer kodlarımızı belirli bir süre bekletmek istersek

        Thread.sleep(5000); // yazılan mili saniye kadar kosları bekletir

        System.out.println("sayfa url'i " +driver.getCurrentUrl());

        System.out.println("sayfanın başlığı : "+driver.getTitle());


        driver.close();


    }
}
