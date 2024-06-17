package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookieclickautomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Wistrom/Desktop/Projects/Cookie%20Clicker%20Automation/index.html");
        WebElement cookie = driver.findElement(By.id("cookie"));

        for (int i = 0; i < 100; i++){
            cookie.click();
        }

        driver.quit();
    }
}
