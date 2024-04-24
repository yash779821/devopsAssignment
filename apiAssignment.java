package apiAssignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class apiAssignment {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
        Select select = new Select(ddown);
        select.selectByVisibleText("Electronics");
        driver.findElement(By.id("nav-search-submit-button")).click();

        
    }
}
