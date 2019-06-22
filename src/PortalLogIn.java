import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PortalLogIn {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String appUrl = "http://portal.aait.edu.et/";
        driver.get(appUrl);

        WebElement userName= driver.findElement(By.xpath("//*[@id=\"UserName\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));

        userName.sendKeys("ATR/7342/09");
        password.sendKeys("password");

        WebElement grade = driver.findElement(By.xpath("//*[@id=\"app_info\"]/div[3]/div/div[2]/p/i"));
        grade.toString();
        System.out.println(grade);

        WebElement button = driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[2]/form/div[4]/div/button"));
        //button.click();
    }
}
