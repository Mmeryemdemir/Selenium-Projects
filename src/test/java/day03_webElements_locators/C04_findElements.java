package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_findElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("Https://www.amazon.com");

        List<WebElement> yazılarElementListesi = driver.findElements(By.className("a-spacing-micro"));

        System.out.println(yazılarElementListesi.size());

        for (WebElement eachElement:yazılarElementListesi
             ) {
            System.out.println(eachElement.getSize());
        }


        driver.close();
    }
}
