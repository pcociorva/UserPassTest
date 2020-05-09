import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserPasswordTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers\\geckodriver.exe");


        WebDriver driver = new FirefoxDriver();


        System.out.println("--");

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

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
