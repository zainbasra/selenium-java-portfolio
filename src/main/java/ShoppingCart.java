import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    public static void main(String args[]){ // Note: We removed "throws InterruptedException" because we don't use sleep!

        // Options Setuo
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

        // --- THE MAGIC LINE (Smart Wait) ---
        // This tells Selenium: "If you can't find an element, keep trying for 10 seconds."
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.saucedemo.com/");

        //Login
        driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        // Add to cart (Selenium will now wait dynamically if this button is slow to appear)
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

        // Click Cart
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();

        //Verify
        if(driver.getCurrentUrl().contains("cart.html")){
            System.out.println("✅ PASS: Smart Wait worked!");
        }
        driver.quit();
    }
}
