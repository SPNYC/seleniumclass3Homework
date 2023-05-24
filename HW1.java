package class03.Homework;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
HW1:
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form

 */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new SafariDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();


        WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Svetlana");
        WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Pisareva");
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("pisarevasvetlana84@gmail.com");
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("3472558264");
        WebElement address=driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("152 72nd Street");
        WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Brooklyn");
        WebElement state=driver.findElement(By.xpath("//option[text()='Illinois']"));
        state.click();
        WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
        zipCode.sendKeys("11209");
        WebElement a=driver.findElement(By.xpath("//input[@name='website']"));
        a.sendKeys("www.gmail.com");
        WebElement select=driver.findElement(By.xpath("//input[@value='yes']"));
        select.click();
        WebElement d= driver.findElement(By.xpath("//textarea[@name='comment']"));
        d.sendKeys("I like it");
        Thread.sleep(2000);
        driver.quit();

    }
}
