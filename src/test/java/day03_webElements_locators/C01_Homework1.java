package day03_webElements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Homework1 {

    public static void main(String[] args) throws InterruptedException {

        /*
        1. Let's create a new class (Homework)

       2. Using ChromeDriver, go to facebook page
       and verify (verify) that the page title is "facebook",
       if not, print the correct title.

       3. Verify that the page URL contains the word "facebook",
       If not, print the "actual" URL.

       4.Go to https://www.walmart.com/.

       5. Verify that the page title includes “Walmart.com”.

       6. Go back to the “facebook” page

       7. Refresh the page

       8. Maximize the page

       9. Close the browser
         */

        /*
       1.Yeni bir class olusturalim (Homework)

       2.ChromeDriver kullanarak, facebook sayfasina gidin
       ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
       degilse dogru basligi yazdirin.

       3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin,
       icermiyorsa “actual” URL’i yazdirin.

       4.https://www.walmart.com/ sayfasina gidin.

       5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

       6. Tekrar “facebook” sayfasina donun

       7. Sayfayi yenileyin

       8. Sayfayi tam sayfa (maximize) yapin

       9.Browser’i kapatin
         */


        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectedTıtleİçerik1 = "facebook";
        String expectedUrlİçerik =  "facebook";

        String actualTitle1 = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();


        /* Title Test */


        if (actualTitle1.contains(expectedTıtleİçerik1)){

            System.out.println("Title1 Test PASSED");

        }else {

            System.out.println("Title1 Test FAILED");
            System.out.println("Actual Title1 :" + actualTitle1);
        }


        /*  Url Test */


        if (actualUrl.contains(expectedUrlİçerik)){

            System.out.println("Url Test PASSED");

        }else {

            System.out.println("Url Test FAILED");
            System.out.println(" Actual Url :" + actualUrl);
        }


        Thread.sleep(3000);



        driver.get("https://www.walmart.com/");

        String expectedTitleİçerik2 = "Walmart.com";

        String actualTıtle2 = driver.getTitle();

        /* Walmart Test */

        if (actualTıtle2.contains(expectedTitleİçerik2)){

            System.out.println("Title2 Test PASSED");

        }else {

            System.out.println("Title2 test FAILED");
            System.out.println("Actual Title :" + actualTıtle2);
        }

        Thread.sleep(2000);


        /* Geri Facebook'a dönelim
         *  Back to Facebook */

        driver.navigate().back();

        Thread.sleep(2000);

        /* Sayfa Yenileme
        * Page Refresh */

        driver.navigate().refresh();

        Thread.sleep(2000);

        /* Sayfa Maxmizi Yapalım
        * Let's Maximize Our Page */

        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        Thread.sleep(2000);

        /* Browser'ı Kapatalım
        * Let's Close the Browser */

        driver.close();

    }





}
