package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {

        /*
        1- https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        2- relativeLocators kullanarak Boston webElementini 3 farklı şekilde locate edin
        */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // london'ın sagı, berlin'in solu şeklinde tarif edelim

        WebElement london = driver.findElement(By.id("pid5_price"));
        WebElement berlin = driver.findElement(By.id("pid7_price"));

        WebElement boston1 = driver.findElement(RelativeLocator
                                                 .with(By.tagName("p"))
                                                  .toRightOf(london)
                                                   .toLeftOf(berlin));

        System.out.println(boston1.getAttribute("id")); // pid6_price



        // toronto'nun altı

        WebElement toronto = driver.findElement(By.id("pid2_thumb"));

        WebElement boston2 = driver.findElement(RelativeLocator
                                                .with(By.className("ui-li-aside"))
                                                 .below(toronto));


        System.out.println(boston2.getAttribute("id")); // pid6_price

        // Mountie'nin üstünde Amsterdam yakınında

        WebElement mountie = driver.findElement(By.id("pid10_thumb"));

        WebElement amsterdam = driver.findElement(By.className("ui-li-thumb"));

        WebElement boston3 = driver.findElement(RelativeLocator
                                                .with(By.id("pid6_thumb"))
                                                 .above(mountie)
                                                  .near(amsterdam));

        System.out.println(boston3.getAttribute("className")); // ui-li-thumb

        driver.close();

    }
}
