// FlipkartLogin.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\path\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);

        WebElement userField = driver.findElement(By.cssSelector("input._2IX_2-"));
        userField.sendKeys("9876543210");

        WebElement passField = driver.findElement(By.cssSelector("input._3mctLh"));
        passField.sendKeys("dummyPassword");

        WebElement loginBtn = driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL"));
        loginBtn.click();

        System.out.println("Login attempt done");
        driver.quit();
    }
}
