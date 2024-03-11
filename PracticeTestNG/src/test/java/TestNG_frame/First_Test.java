package TestNG_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class First_Test {
@Test
public void TestGoogel() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14",Keys.ENTER);
	Thread.sleep(4000);
	System.out.println(driver.getTitle());
	driver.quit();
}


@Test
public void TestFlipkart() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14",Keys.ENTER);
	Thread.sleep(4000);
	System.out.println(driver.getTitle());
	driver.quit();
}
}
