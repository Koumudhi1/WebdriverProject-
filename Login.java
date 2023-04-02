package Test1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			// step-1 : Launch chrome browser and open simplilearn website
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.simplilearn.com/");
			
			
			// step-2: Maximize the browser
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			
			
			// step-3: click  on the Login link on top right corner
			
			System.out.println("The title of the page is " + driver.getTitle());
			
			WebElement loginLink = driver.findElement(By.linkText("Log in"));
			String location = loginLink.getAttribute("href");
			System.out.println("The link will take you to " + location);
			loginLink.click();
			
			
			//step-4: Enter the user name
			
			WebElement userName = driver.findElement(By.name("user_login"));
			userName.sendKeys("abc@xyz.com");
			
			
			// step-5: Enter the password
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("Abc@12345");
			
			// step-6 : Click on the Login button
			
			WebElement loginBtn = driver.findElement(By.name("btn_login"));
			loginBtn.click();
			
			
			// step-7 : Validate the login was successful 
		}

	


	}








	


