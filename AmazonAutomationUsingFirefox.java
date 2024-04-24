package apiAssignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAutomationUsingFirefox {
	public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\SeleniumSoft\\geckodriver-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
        Select select = new Select(ddown);
        select.selectByVisibleText("Electronics");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
