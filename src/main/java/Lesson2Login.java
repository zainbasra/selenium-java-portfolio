import org.openqa.selenium.By; // Import the "By" class (The locator strategy)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Lesson2Login {
    public static void main(String []args) throws InterruptedException{ // Added "throws" for Thread.sleep

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // 1. Find the Username box by its ID, and type "standard_user"
        // syntax: driver.findElement(By.LOCATOR_TYPE("VALUE")).ACTION();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // 2. Find the Password box by its ID, and type "secret_sauce"
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // 3. Find the Login button by its ID, and click it
        driver.findElement(By.id("login-button")).click();

        // 4. Find the Add to Cart Button by its ID using xpath
        driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();

        // 4. Verification
        // We pause for 2 seconds just so you can see the result with your eyes

        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();

        // "inventory" is the name of the product page
        if(currentUrl.contains("inventory")){
            System.out.println("✅ PASS: Login Successful! We are on the inventory page.");
        } else {
            System.out.println("❌ FAIL: Still on login page.");
        }

        driver.quit();
    }
}
