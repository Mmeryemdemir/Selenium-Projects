package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();


       // 2- https://www.amazon.com/ adresine gidin

        driver.get("https://www.amazon.com/");


       //  3- Browseri tam sayfa yapin

        driver.manage().window().maximize();


       //   4-Sayfayi “refresh” yapin

        driver.navigate().refresh();


       //   5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        String exceptionTitle = "Spend less";
        String actualTitle = driver.getTitle();

       if (actualTitle.contains(exceptionTitle)){

           System.out.println("Actual Test PASSED");

       }else {

           System.out.println("Actual test FAILED");
       }


       //  6- Gift Cards sekmesine basin

       driver.findElement(By.linkText("Gift Cards")).click();

       //  7- Birthday butonuna basin

        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();

       //  8- Best Seller bolumunden ilk urunu tiklayin

        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

       //  9- Gift card details’den 25 $’i  secin

        driver.findElement(By.xpath("//button[@value='25']")).click();

       Thread.sleep(3000);

       //  10-Urun ucretinin 25$ oldugunu test edin

       WebElement ücretElementi = driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));

        String actualUcretStr = ücretElementi.getText();
        String exceptedUcretStr = "$25.00";

        if (actualUcretStr.equals(exceptedUcretStr)){

            System.out.println("Gift card test PASSED");

        }else {

            System.out.println("Gift card test FAILED");
        }

       //  11-Sayfayi kapatin

        driver.close();



    }
}
