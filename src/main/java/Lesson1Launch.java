import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1Launch {
    public static void main(String[] args) {

        // --- 1. SETUP ---
        // "Hey Selenium, start a new Chrome window."
        // Note: You do NOT need to download chromedriver.exe manually anymore. 
        // Selenium Manager (built-in) does it for you.
        WebDriver driver = new ChromeDriver();

        // --- 2. ACTION ---
        // "Go to this specific URL."
        // .get() waits for the page to fully load before moving to the next line.
        driver.get("https://www.saucedemo.com/");

        // --- 3. VERIFICATION ---
        // "What is the title written on the browser tab?"
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        // A simple manual check
        if(title.equals("Swag Labs")) {
            System.out.println("PASS: We are on the right page.");
        } else {
            System.out.println("FAIL: Wrong page loaded.");
        }

        // --- 4. TEARDOWN ---
        // "Close the browser and kill the process."
        // Always use quit(), not close().
        driver.quit();
    }
}