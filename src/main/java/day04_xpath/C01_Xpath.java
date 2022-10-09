package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Şu ana kadar öğrendiğimiz 6 adet locator HTML koduna baglıdır
        xpath ve cssSelector sadece bir attribute' tag'e baglı olmadan
        her web elementi locate etmemize yarar

        Her HTML element'de
        1- tag
        2- attribute(s)
        3- attribute value

         xpath ve cssSelector bu 3 maddenin kombinasyonu ile oluşur
         // tagİsmi[@attributeİsmi='value']
         */




        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //  2- Add Element butonuna basin

        WebElement addButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButonu.click();

        // 3- Delete butonu’nun gorunur oldugunu test edin

        Thread.sleep(2000);
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()){

            System.out.println("Delete butonu görünme testi PASSED");

        }else {

            System.out.println("Delete butonu görünme testi FAILED");
        }

        // 4- Delete tusuna basin

        deleteButonu.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin


        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//h3"));
        // = driver.findElement(By.name("h3"));

        if (addRemoveYaziElementi.isDisplayed()){

            System.out.println("Add Remove yazısı görünüyor test PASSED");

        }else {

            System.out.println("Add Remove yazısı görünmüyor test FAILED");
        }

        Thread.sleep(5000);
        driver.close();




    }
}
