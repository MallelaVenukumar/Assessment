package TestNG_frame;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Second_Test {
@Test
public void Myntra() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone14",Keys.ENTER);
	Thread.sleep(4000);
	driver.quit(); 

	
}
public class Second_Tes {
	@Test
public void Flipkart() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("i phone14",Keys.ENTER);
	Thread.sleep(4000);
	driver.quit();

}
	public class Second_Te {
		@Test
public void Amazon() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in//");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone14",Keys.ENTER);
	Thread.sleep(4000);
	driver.quit();
}
		public class Second_T {
			@Test
public void Jiomart() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jiomart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='aa-Input search_input']")).sendKeys("i phone14",Keys.ENTER);
	Thread.sleep(4000);
	driver.quit();
}
}
}
}
}


