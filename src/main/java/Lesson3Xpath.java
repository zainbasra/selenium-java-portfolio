import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  // 1. Import this
import java.util.HashMap;
import java.util.Map;


public class Lesson3Xpath {
    public static void main(String args[]) throws InterruptedException{

        // --- 1. SETUP OPTIONS ---
        ChromeOptions options = new ChromeOptions();

        // Create a map to store preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

        // Disable "Save Password" prompt
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        // Disable "Password Leak Detection" (The popup you see)
        prefs.put("profile.password_manager_leak_detection", false);

        // Add these prefs to ChromeOptions
        options.setExperimentalOption("prefs", prefs);

        // --- 2. LAUNCH BROWSER WITH OPTIONS ---
        // Pass 'options' inside the constructor
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");

        // 3. Find the Username box by its ID using xpath, and type "standard_user"
        driver.findElement(By.xpath("//input[@id= 'user-name']")).sendKeys("standard_user");

        // 4. Find the Password box by xpath, and type "secret_sauce"
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");

        // 5. Find the Login button by xpath, and click it
        driver.findElement(By.xpath("//input[@id = 'login-button']")).click();

        // 6. Find the Add to cart button by xpath, and click it
        driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();

        // 7. Find the Shopping Cart Icon by xpath, and click it
        driver.findElement(By.xpath("//div[@id = 'shopping_cart_container']/a")).click();

        // 8. Verification
        // We pause for 2 seconds just so you can see the result with your eyes

        Thread.sleep(3000);
        String currentUrl = driver.getCurrentUrl();

       //current URL contains cart.html

        if(currentUrl.contains("cart.html")){
            System.out.println("✅ PASS: We are on the cart.html page.");
        } else {
            System.out.println("❌ FAIL: Still on listing page.");
        }

        driver.quit();
        System.out.println("The OutPut: " + currentUrl);



    }
}
