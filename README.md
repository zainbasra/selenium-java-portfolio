[//]: # (# Selenium Java Automation Portfolio 🚀)

[//]: # ()
[//]: # (This repository contains my automated testing scripts built using **Java** and **Selenium WebDriver**.)

[//]: # ()
[//]: # (## 🛠️ Tech Stack)

[//]: # (* **Language:** Java &#40;JDK 17&#41;)

[//]: # (* **Library:** Selenium WebDriver &#40;4.x&#41;)

[//]: # (* **Build Tool:** Maven)

[//]: # (* **IDE:** IntelliJ IDEA)

[//]: # ()
[//]: # (## 📂 Key Features Automate)

[//]: # (1.  **Login Functionality:** Verifies secure login using locators &#40;ID, XPath&#41;.)

[//]: # (2.  **E-commerce Flows:** Automates adding items to cart and checkout validation.)

[//]: # (3.  **Dynamic Waits:** Implemented `Implicit Wait` to handle synchronization issues.)

[//]: # (4.  **Pop-up Handling:** Managed Chrome security pop-ups using `ChromeOptions`.)

[//]: # (5.  **Dropdowns:** sorting logic validation using the `Select` class.)

[//]: # ()
[//]: # (## 🧪 Sample Code Strategy)

[//]: # (I utilize the **Page Object Model &#40;POM&#41;** design pattern &#40;Coming Soon&#41; to separate test logic from page elements.)

[//]: # ()
[//]: # (## 🏃‍♂️ How to Run)

[//]: # (1.  Clone the repo: `git clone [Your-Repo-Link-Here]`)

[//]: # (2.  Open in IntelliJ.)

[//]: # (3.  Run `mvn test` or execute individual classes.)

[//]: # ()
[//]: # (---)

[//]: # (*Created by [Zain Ul Rehman]*)

# Selenium Java Automation Portfolio 🚀

This repository documents my journey from **Linear Scripting** to building a **Professional Automation Framework**. It serves as a proof-of-work for my skills in **Java**, **Selenium WebDriver**, and **Test Automation Best Practices**.

## 🛠️ Tech Stack
* **Language:** Java (JDK 17+)
* **Library:** Selenium WebDriver (4.27.0)
* **Build Tool:** Maven
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub

## 📂 Projects & Scripts

### 1. End-to-End E-Commerce Flow (`CheckoutEndToEnd.java`) 🏆
* **Description:** A complete user journey automation on `saucedemo.com`.
* **Flow:** Login -> Add Items to Cart -> Checkout Form -> Validation.
* **Key Concepts:**
    * Chaining multiple user actions.
    * Dynamic XPath strategies.
    * Assertion of "Thank You" success message.

### 2. UI Component Handling (`Lesson4Dropdowns.java`)
* **Description:** Automating complex UI elements like `<select>` dropdowns.
* **Key Concepts:**
    * Using the `Select` class.
    * `selectByVisibleText` implementation.
    * Verifying sorting logic (Low to High Price).

### 3. Synchronization & Robustness (`Lesson3Waits.java`)
* **Description:** Replaced legacy `Thread.sleep` with professional synchronization.
* **Key Concepts:**
    * Implemented **Implicit Waits** (`Duration.ofSeconds(10)`).
    * Handled Chrome Security Popups using **ChromeOptions**.
    * Browser Profile preferences management.

## 🧠 Concepts Mastered So Far
* **Locator Strategies:** Priority handling (ID > XPath > CSS).
* **Waits:** Implicit vs. Explicit Wait concepts.
* **Browser Control:** `ChromeOptions` for popup suppression and headless execution.
* **Validation:** Text verification (`getText()`) and URL validation.

## 🔜 Coming Next (Phase 2)
* **TestNG Integration:** Moving from `main` methods to `@Test` annotations.
* **Page Object Model (POM):** Refactoring linear scripts into modular design patterns.
* **Reporting:** Integrating ExtentReports.

---
*Maintained by Zain*