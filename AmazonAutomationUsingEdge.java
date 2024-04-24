package apiAssignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAutomationUsingEdge {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.edge.driver", "E:\\SeleniumSoft\\Driver_Notes\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
        Select select = new Select(ddown);
        select.selectByVisibleText("Electronics");
        driver.findElement(By.id("nav-search-submit-button")).click();

    }
}
