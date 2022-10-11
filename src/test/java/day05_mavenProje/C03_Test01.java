package day05_mavenProje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Test01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.google.com/ adresine gidin

        driver.get("https://www.google.com/");


       // 2-Sayfa basliginin “Google” ifadesi icerdigini test edin

        WebElement googleLogosu = driver.findElement(By.xpath("//img[@alt='Google']"));

        if (googleLogosu.equals("Google")){

            System.out.println("Google Logosu Test PASSED ");

        }else{

            System.out.println("Google Logosu Test FAILED ");
        }

       // 3- Arama cubuguna “Nutella” yazip aratin

        WebElement googleAramaBox = driver.findElement(By.xpath("//input[@type='text']"));
        googleAramaBox.sendKeys("Nutella"+ Keys.ENTER);

       //  4-Bulunan sonuc sayisini yazdirin

        WebElement sonuçSayısı = driver.findElement(By.id("result-stats"));
        System.out.println(sonuçSayısı.getText());
        String sonucSayisiStr=sonuçSayısı.getText();


       //  5-Sayfayi kapatin

        driver.close();
    }
}
