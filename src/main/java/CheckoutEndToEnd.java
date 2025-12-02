import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Map;
import java.util.HashMap;


public class CheckoutEndToEnd {
    public static void main(String args[]){

        // --- 1. SETUP ---
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // --- 2. LOGIN ---
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id= 'user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("// input[@ id = 'password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        // --- 3. ADD TO CART ---
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();

        // --- 4. GO TO CART ---
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();

        // --- 5. CHECKOUT ---
        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        // --- 6. FILL FORM ---
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Zain");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='continue']")).click();

        // --- 7. FINISH ---
        driver.findElement(By.xpath("//button[@id='finish']")).click();

        // --- 8. VERIFICATION ---
        String message = driver.findElement(By.className("complete-header")).getText();
        if(message.equals("Thank you for your order!")){
            System.out.println("✅ PASS: End To End Test Working!");
        }

        // --- 9. CLEANUP ---
        driver.quit();
    }
}
