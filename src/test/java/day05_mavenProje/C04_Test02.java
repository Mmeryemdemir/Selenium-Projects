package day05_mavenProje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Test02 {


 public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    // 1. “https://www.saucedemo.com” Adresine gidin

    driver.get("https://www.saucedemo.com");

    // 2. Username kutusuna “standard_user” yazdirin

    WebElement usernameKutusu = driver.findElement(By.id("user-name"));
    usernameKutusu.sendKeys("standard_user");

    // 3. Password kutusuna “secret_sauce” yazdirin

    WebElement passwordKutusu = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
    passwordKutusu.sendKeys("secret_sauce");

    // 4. Login tusuna basin

    WebElement loginButonu = driver.findElement(By.id("login-button"));
    loginButonu.click();

    // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

     WebElement ilkÜrün = driver.findElement(By.id("item_4_title_link"));
     System.out.println(ilkÜrün.getText()); // Sauce Labs Backpack
     ilkÜrün.click();


    // 6. Add to Cart butonuna basin

     WebElement addToCartButonu = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
         addToCartButonu.click();

    // 7. Alisveris sepetine tiklayin

     WebElement alışverişSepeti = driver.findElement(By.id("shopping_cart_container"));
     alışverişSepeti.click();

    // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin

     WebElement sepetKontrol = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));

     if (sepetKontrol.isDisplayed()){

         System.out.println("Test PASSED");

     }else {

         System.out.println("Test FAILED");
     }

    // 9. Sayfayi kapatin

     driver.close();

 }

}
