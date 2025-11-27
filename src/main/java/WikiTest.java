import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiTest{
    public static void main(String args[]){

        // --- 1. SETUP ---
        // "Hey Selenium, start a new Chrome window."
        WebDriver driver = new ChromeDriver();


        // --- 2. ACTION ---
        // "Go to this specific URL."
        // .get() waits for the page to fully load before moving to the next line.

        driver.get("https://www.wikipedia.org");


        // --- 3. VERIFICATION ---
        // "What is the URL written on the browser?"

        String url = driver.getCurrentUrl();
        System.out.println("The URL is " + url);

        // --- 4. TEARDOWN ---
        // "Close the browser and kill the process."
        // Always use quit(), not close().
        driver.quit();
    }
}