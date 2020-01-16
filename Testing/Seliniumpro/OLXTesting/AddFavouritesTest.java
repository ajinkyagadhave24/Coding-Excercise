package OLXTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddFavouritesTest {

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
		// Add to Favorites
		driver.get("https://mumbai.craigslist.org/search/hhh");
		List<WebElement> list = driver.findElements(By.className("result-info"));
		
		for (int i = 0; i < 5; i++) {
			list.get(i).findElement(By.className("icon-star")).click();
		}

		
		//Remove from Favorites
		driver.findElement(By.className("favlink")).click();
		List<WebElement> listToRemove = driver.findElements(By.className("result-info"));
		
		for (WebElement webElement : listToRemove) {
			webElement.findElement(By.className("icon-star")).click();
		}
	}
}
