import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserPassChrome {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("--");

        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        driver.findElement( By.xpath ("//input[@class='btn_action']")).click();

        if (driver.findElement(By.id("inventory_container")).isDisplayed()){
            System.out.println("PASSED: " + driver.getTitle());
        }else {
            System.out.println("Smth goes wrong");
        }

        driver.quit();

    }
}