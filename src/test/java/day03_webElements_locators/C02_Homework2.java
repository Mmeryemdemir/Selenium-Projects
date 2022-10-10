package day03_webElements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Homework2 {

    public static void main(String[] args) throws InterruptedException {

        /*
      1. Yeni bir class olusturun (TekrarTesti)

      2. Youtube web sayfasına gidin
      ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
      eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

      3. Sayfa URL’sinin “youtube” içerip içermediğini (contains) doğrulayın,
      içermiyorsa doğru URL’yi yazdırın.

      4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

      5. Youtube sayfasina geri donun

      6. Sayfayi yenileyin

      7. Amazon sayfasina donun

      8. Sayfayi tamsayfa yapin

      9. Ardından sayfa başlığının “Amazon” içerip içermediğini (contains) doğrulayın,
      Yoksa doğru başlığı(Actual Title) yazdırın.

      10.Sayfa URL’sinin https://www.amazon.com/ olup olmadığını doğrulayın,
      degilse doğru URL’yi yazdırın

      11.Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        /* Youtube Title Test */

        String expectedTitleİçerik = "youtube";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleİçerik)){

            System.out.println("Title Test PASSED");

        }else {

            System.out.println("Title Test FAILED");
            System.out.println("Actual Title : " + actualTitle);
        }



        /* Youtube Url Test */

        String expectedUrlİçeriik = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlİçeriik)){

            System.out.println("Url Test PASSED");

        }else {

            System.out.println("Url Test FAILED");
            System.out.println("Actual Url :" + actualUrl);
        }


        Thread.sleep(2000);


        /* Amazona gidelim */

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        /* Geri Youtube dönelim */

        driver.navigate().back();
        Thread.sleep(2000);

        /* Sayfa Yenileme */

        driver.navigate().refresh();
        Thread.sleep(2000);

        /* Amazon Sayfasına ileri koduyla gidelim */

        driver.navigate().forward();
        Thread.sleep(2000);

        /* Sayfayı Fulscreen yapalım */

        driver.manage().window().fullscreen();


        /* Amazon Title Test */

        String expectedTitleİçerik2 = "Amazon";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitleİçerik2)){

            System.out.println("Tittle Test PASSED");

        }else {
            System.out.println("Title test FAILED");
            System.out.println("Atual Title :" + actualTitle2);
        }


        /* Amazon Url Test */

        String expectedUrlİçerik2 = "https://www.amazon.com/";
        String actualUrl2 = driver.getCurrentUrl();

        if (actualUrl2.contains(expectedUrlİçerik2)){

            System.out.println("Url Test PASSED");

        }else {

            System.out.println("Url Test FAILED");
            System.out.println("Actual Url :" + actualUrl2);
        }


        Thread.sleep(2000);

        driver.close();
    }

}
