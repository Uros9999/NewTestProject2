import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.Test;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //setovanje browsera
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");




        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");




        Thread.sleep(300000000);
        driver.manage().window().maximize();


        //driver pokrece program,komunicira sa browserom,daje komande...

        //u ovaj veb element smo stavili drajver odnosno na sta se ovaj veb element tacno odnosi
        WebElement usernameField=driver.findElement(By.cssSelector("input[name='username']"));
        usernameField.sendKeys("tomsmith");
        //pristupili smo direktno polju username i ukucali nesto

        WebElement passwordField=driver.findElement(By.id("password"));
        //WebElement passwordField1=driver.findElement(By.cssSelector("input[id='password']"));
        passwordField.sendKeys("SuperSecretPassword!");

        WebElement loginButton=driver.findElement(By.className("fa fa-2x fa-sign-in"));
        //WebElement loginButton1=driver.findElement(By.cssSelector(".fa"));

        loginButton.click();









    }
}