package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_webElementMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella");

        Thread.sleep(2000);
        aramaKutusu.clear();

        aramaKutusu.sendKeys("Java");

        System.out.println(aramaKutusu.getTagName()); // input
        System.out.println(aramaKutusu.getAttribute("name")); // field-keywords
        System.out.println(aramaKutusu.getRect().getX()); // 279

        System.out.println(aramaKutusu.isDisplayed()); // görünüyor mu ? true
        System.out.println(aramaKutusu.isEnabled()); // kullanılabiliyor mu ? true
        aramaKutusu.isSelected();



        driver.close();
    }
}
