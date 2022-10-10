package day02_driverMathods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) {

        /*
        Gerekli ayarlamaları yapıp amazon anasayfaya gidin
        1- sayfa başlığı "amazon" kelimesi içermeli
        2- sayfa url'ınde "Amazon" kelimesi olmalı
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        String expectedTitleIçerik = "amazon";
        String expectedUrlİçerik = "Amazon";

        String actualUrl = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        // test yapalım

        if (actualUrl.contains(expectedUrlİçerik)){
            System.out.println("Url test PASSED");
        }else {
            System.out.println("Url test FAILED");
            System.out.println("Actual Url : " + actualUrl);
            System.out.println("Actual Url aranan " + expectedUrlİçerik + " kelimesini içermiyor");

        }

        // title test

        if (actualTitle.contains(expectedTitleIçerik)){
            System.out.println("Title Test PASSED");
        }else {
            System.out.println("Title test FAILED");
            System.out.println("Actual Title : " + actualTitle);
            System.out.println("Actual Title aranan " + expectedTitleIçerik + " kelimesini içermiyor");
        }

        driver.close();
        /*
        driver.close() sadece acık olan browser'ı kapatır
        driver.quit() ise test çalışırken acılan tüm browser'ları kapatır
         */
    }
}
