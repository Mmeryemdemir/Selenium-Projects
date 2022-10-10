package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_LocatorText {

   /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.

   a. web sayfasına gidin. https://www.amazon.com/
   b. Search(ara) “city bike”
   c. Amazon’da görüntülenen ilgili sonuçların sayısını yazdırın
   d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));

        amazonSearchBox.sendKeys("city bike"+ Keys.ENTER);

        List<WebElement> sonuçWebElementList = driver.findElements(By.className("sg-col-inner"));
        // bu Listenin 1.elementi bulunan sonuç sayısı

        System.out.println(sonuçWebElementList.get(0).getText());


        driver.findElement(By.className("s-image")).click();
        /*
        Eğer bir locate ile birden fazla element buluuyorsa
        selenium ilk elementi kullanır
         */

        Thread.sleep(3000);
        driver.close();

    }
}
