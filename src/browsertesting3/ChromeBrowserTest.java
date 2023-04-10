package browsertesting3;
/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open the Url into Browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // get current url
        driver.getCurrentUrl();
       // print current url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        // get page source
        System.out.println("Page Source :" + driver.getPageSource());
        WebElement username = driver.findElement(By.id("username"));
        // find the username field and type the username
        username.sendKeys("Admin12@gmail.com");
        // enter the Password into the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Password");
        // close Browser
        driver.close();






    }
}
