package browsertesting3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseurl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name :");
        }
        //open the url into Browser
        driver.get(baseurl);
        // Maximise the browser
        driver.manage().window().maximize();
        //printing Title
        System.out.println(driver.getTitle());
        //find the username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        //Enter the username
        usernameField.sendKeys("Admin124@gmail.com");
        //find the password field elements and type the password
        driver.findElement(By.name("password")).sendKeys("password");
        //close the browser
        driver.close();

    }

}
