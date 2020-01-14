import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selwebdriver {
	
	private static String fileWithPath;
	
	public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login/");
		
		//driver.findElement(By.id("user_login")).click();
		WebElement username=driver.findElement(By.id("login_field"));
		username.sendKeys("lab5deloittemumbai");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("qwerty@2048");
		
		driver.findElement(By.className("btn-primary")).click();
		
       //CheckBox
		driver.get("https://www.github.com/new");
		WebElement check_box=driver.findElement(By.id("repository_auto_init"));
		check_box.click();
		if(check_box.isSelected()) {
			System.out.println("Checkbox is Selected!!!");
		}else {
			System.out.println("Checkbox is Not Selected!!!");
		}
		
		//RadioButton
				WebElement radioButton = driver.findElement(By.id("repository_visibility_private"));
				radioButton.click();
				if(radioButton.isSelected())
				{
					System.out.println("RadioButton is Selected!!");
				}
				else
				{
					System.out.println("RadioButton is Not Selected!!");
				}
				//DropDownBox
				driver.get("https://github.com/settings/profile");
				WebElement dropDown = driver.findElement(By.id("user_profile_spoken_language_preference_code"));
				Select lang = new Select(dropDown);
				lang.selectByVisibleText("Marathi");
	}
	

}
