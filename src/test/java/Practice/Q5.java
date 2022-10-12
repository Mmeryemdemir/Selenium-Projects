package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class Q5 {

    public static void main(String[] args) throws InterruptedException {

      /*
      .......Exercise5........

       Navigate to website https://testpages.herokuapp.com/styled/index.html
       Under the ORIGINAL CONTENTS
       click on Alerts
       print the URL
       navigate back
       print the URL
       Click on Basic Ajax
       print the URL
       enter value 20 and ENTER
       and then verify Submitted Values is displayed open page
       close driver

     */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.xpath("//a[@id='alerts']")).click();

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='lteq30']")).sendKeys("20"+ Keys.ENTER);
        Thread.sleep(1000);

        String expectedText = "Submitted Values";
        String actualText = driver.findElement(By.xpath("//p[text()='Submitted Values']")).getText();

           if (expectedText.equals(actualText)){
               System.out.println("Test PASSED");

           }else {
               System.out.println("Test FAILED");
           }

           driver.close();
    }
}
