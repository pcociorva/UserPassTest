import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple store locations");

        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();

        driver.findElement(By.xpath("//input[@class='TbwUpd NJjxre']")).click();

        driver.findElement(By.id("//input[@id='search']")).sendKeys("Roseville, Ca");

        driver.findElement(By.id("//input[@id='item0']")).click();



    }
}
