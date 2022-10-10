package day05_mavenProje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ZeroText {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        // 2. Signin buttonuna tiklayin

        driver.findElement(By.id("signin_button")).click();

        // 3. Login alanine  “username” yazdirin

        WebElement loginUsurnameKutusu = driver.findElement(By.id("user_login"));
        loginUsurnameKutusu.sendKeys("username");

        // 4. Password alanine “password” yazdirin

        WebElement passwordElementKutusu = driver.findElement(By.id("user_password"));
        passwordElementKutusu.sendKeys("password");

        // 5. Sign in buttonuna tiklayin

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        driver.navigate().back();

        // 6. Online Banking menusunden Pay Bills sayfasina gidin

        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();

        // 7. amount kismina yatirmak istediginiz herhangi bir miktari yazin

        WebElement amountKutusu = driver.findElement(By.id("sp_amount"));
        amountKutusu.sendKeys("200");

        // 8. tarih kismina “2022-10-10” yazdirin

        WebElement tarihKutusu = driver.findElement(By.id("sp_date"));
        tarihKutusu.sendKeys("2022-10-10");

        // 9. Pay buttonuna tiklayin

        WebElement payButonu = driver.findElement(By.id("pay_saved_payees"));
        payButonu.click();

        // 10. “The payment was successfully submitted.” mesajinin ciktigini control edin

        WebElement basarılıYazısıElementi = driver.findElement(By.id("alert_content"));

        String actualbasarılıYazısı = basarılıYazısıElementi.getText();
        String expectedBaşarılıyazısı = "The payment was successfully submitted.";

        if (actualbasarılıYazısı.equals(expectedBaşarılıyazısı)){

            System.out.println("Başarılı Yazısı Görünüyor Test PASSED");

        }else {

            System.out.println("Başarılı Yazısı Görünmüyor Test FAILED");
        }

    }

}
