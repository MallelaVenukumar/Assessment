package TestNG_frame;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@Test
	public void LuncahApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		}
	@Test
	public void EnterLoginDetails() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.close();
	}
	//@Test
	//public void NavigateToMyInfo () {
	//	driver.findElement(By.id("//a[@class='oxd-main-menu-item active']")).click();
	//	driver.quit();
		
	//}
	@Test
	public void Openflipkart () {
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
	

}
