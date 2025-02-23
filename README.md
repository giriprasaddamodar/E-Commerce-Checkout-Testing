# E-Commerce-Checkout-Testing

Project: Automated E-commerce Checkout Testing
Objective: Ensure a seamless and bug-free experience by automating item addition, checkout flow, and order validation.

1. Agile Methodology: Scrum vs. Kanban
Scrum: If your project has fixed sprints (e.g., 2-week cycles), use Scrum with user stories and sprint planning.
Kanban: If your workflow is continuous (e.g., ongoing bug fixes and feature enhancements), use Kanban to track progress without fixed sprints.

2. JIRA Workflow (Kanban Example)
Columns in JIRA Board:

* Backlog: List of pending tasks
* To Do: Tasks selected for execution
* In Progress: Tasks currently being worked on
* Testing: Verification phase
* Done: Completed and validated tasks

3. JIRA User Stories & Tasks (Example)
User Stories & Tasks
* As a user, I want to add an item to my cart.	TASK - Automate item addition using Selenium.
  
* As a user, I want to proceed to checkout.	 TASK - Automate cart validation and checkout flow.
  
* As a user, I want my order details validated. TASK -	Automate order confirmation and summary validation.

4. Test Cases (Example)
Test Case,	Steps & 	Expected Result
* TEST CASE - Add item to cart	STEP - Select item, click "Add to Cart"	 RESULT - Item appears in cart
  
* TEST CASE - Checkout process STEP - 	Click "Buy Now", enter details	RESULT - User proceeds to payment
  
* TEST CASE - Order confirmation	STEP - Validate order summary	RESULT - Order placed successfully

   Selenium & Java Automation Code (Basic Example)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerceCheckoutTest {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to e-commerce site (e.g., Flipkart)
        driver.get("https://www.flipkart.com");

        // Select item and add to cart
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();
        
        WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
        addToCart.click();

        // Proceed to checkout
        WebElement checkout = driver.findElement(By.xpath("//button[text()='Buy Now']"));
        checkout.click();

        // Validate order summary
        WebElement orderSummary = driver.findElement(By.id("order-summary"));
        if (orderSummary.isDisplayed()) {
            System.out.println("Order successfully placed!");
        }

        // Close browser
        driver.quit();

5. Deployment and Integration
Use Jenkins for CI/CD to run tests automatically after code changes.
Use JIRA to track progress and move tasks across Kanban/Scrum boards.

6. Conclusion
This project ensures smooth checkout flow for an e-commerce platform.
Combines Selenium, Java, and JIRA with Agile (Scrum/Kanban) for efficient software testing.
