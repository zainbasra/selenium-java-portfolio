import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Lesson4Dropdowns {
    public static void main (String []args){

        // 1- Setup
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Login
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id = 'login-button']")).click();

        // --- HANDLING DROPDOWNS ---
        // Step A: Find the dropdown element
        WebElement dropdownBox = driver.findElement(By.className("product_sort_container"));

        //Step B: Wrap it in the special Select class
        Select sorter = new Select(dropdownBox);

        //Step C: Command it to change
        sorter.selectByVisibleText("Price (low to high)");

        // 3. Verify it worked
        // If sorted correctly, the first item should now be the "$7.99" Onesie.
        WebElement firstPrice = driver.findElement(By.className("inventory_item_price"));
        String priceText = firstPrice.getText();

        System.out.println("The cheapest item is: " + priceText);

        if(priceText.equals("$7.99")) {
            System.out.println("✅ PASS: Sorting worked!");
        } else {
            System.out.println("❌ FAIL: Sort failed. Found " + priceText);
        }


    }
}
