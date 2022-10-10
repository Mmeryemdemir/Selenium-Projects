package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_findElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        // to use any web element on a website
        // we need to introduce that web element to our codes

        // bir web sitesinde herhangi bir web elementi kullanabilmek için
        // o web elementi kodlarımıza tanıtmamız gerekir

       //  WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));

        WebElement amazonSearchBox = driver.findElement(By.name("field-keywords"));
        amazonSearchBox.sendKeys("Nutella" + Keys.ENTER);

        Thread.sleep(5000);

        driver.close();

        /*
        Selenıum'da 8 adet Locatot vardır
        Bunlardan 6 tanesi HTML üzerindeki tag veya attribute'lere göredir
        2 tanesi ise daha spesifik olarak. ilk 6 tane locator ile bulamadığımız
        webElementleri locate etmek için kullanılır

         1- By.id

           id genelde unique verilir
           dolayısıyla bir HTML elementde id varsa önce By.id denenebilir

         2- className

            class attribute'u genelde aynı işlevi yapan webelementleri gruplandırmak için kullanılır.
            Bu gruplandırmalar sayesinde css ile gruptaki tüm webElementler tek yerden şekillendirilebilir
            Class attribute' u kullanılırken eğer class value'u space içeriyorsa,
            classname ile yapılan locate'ler hata verebilir

            genellikle classname ile yapılan locate'ler birden fazla webElement döndüreceğinden
            List<WebElement> şeklinde oluşturacağımız bir List'e kaydolur

            Bu List'edeki elementler WebElement olduğu için
            bu List'e direk yazdırılamaz,
            bunun yerine for-each loop kullanılarak webElement özellikleri yazdırılabilir

         3- name

            Eğer HTML kodunda name attribute varsa kullanılabilir

         4- tagname

            Tagname de classname gibi gruplandırmalar için kullanılabilir
            dolayısıyla tagname ile genelde bir element değil
            benzer özelliklerdeki bir listeye ulaşır

          5- LinkText

             Sadece Link'ler için kullanılır
             her link HTML elementinin üzerinde bir link yazısı olur
             bu yazı genelde kullanıcının front-end'de gördüğü yazı ile aynıdır
             bazen space gibi farkedemeyeceğimiz eklemeler olabilir.
             Locate ederken LinkText kullanılırsa, link yazısının tamamı kullanılmalıdır



         */


    }

}
