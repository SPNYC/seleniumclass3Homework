package class03.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

/*
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
 */
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new SafariDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.cssSelector(" input[id='txtUsername']"));
        username.sendKeys("Svetlana");

        WebElement button=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        button.click();
        WebElement password=driver.findElement(By.cssSelector("span[id='spanMessage']"));
        password.getText();
     
        Thread.sleep(2000);
        driver.quit();
    }
}
