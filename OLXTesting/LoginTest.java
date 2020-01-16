package OLXTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Login
	driver.get("https://accounts.craigslist.org/login?rt=L&rp=%2Flogin%2Fhome");
	
	WebElement email = driver.findElement(By.id("inputEmailHandle"));
	email.sendKeys("lab5deloittemumbai@gmail.com");
	
	WebElement password = driver.findElement(By.id("inputPassword"));
	password.sendKeys("seed@2048#");
	driver.findElement(By.id("login")).click();	
	}
	
}

