import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiSearchTest {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");

        driver.findElement(By.id("searchInput")).sendKeys("Selenium Software");

        driver.findElement(By.xpath("//button")).sendKeys(Keys.ENTER);
        System.out.println(driver);
    }

}
