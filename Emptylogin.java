package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emptylogin {

	public static void main(String[] args){
		
				
				
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			
			
			
			WebElement loginLink = driver.findElement(By.linkText("Log in"));
			String location = loginLink.getAttribute("href");
			System.out.println("The link will take you to " + location);
			loginLink.click();
		
			
			
			WebElement userName = driver.findElement(By.name("email"));
			userName.sendKeys("abcd@gmail.com");
			
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("AbcD@1234");
			
			WebElement Login = driver.findElement(By.name("login"));
			Login.click();		
	}
	
	

}
