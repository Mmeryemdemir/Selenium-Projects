package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C07_noSuchElementExc {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");



        /*
        findElement ile locate edilen webelementlerde locator'da sorun olursa
        driver istenen webelementi bulamaz ve NoSuchElementException fırlatır

        Buna karşın findElements method'u ile locate edilen Liste
        locator hatalı olsa bile exception vermez
        boş bir List döndürür
         */

    }
}
