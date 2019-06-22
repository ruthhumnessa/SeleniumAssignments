import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailLogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String appUrl = "https://accounts.google.com/signin/v2/sl/pwd?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward";
        driver.get(appUrl);

        //WebElement userName= driver.findElement(By.xpath("//*[@id=\"UserName\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form"));


        //userName.sendKeys("ATR/7342/09");
        password.sendKeys("password");



        WebElement button = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]"));
        button.click();
    }

}
