package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
		public WebDriver driver;
		By email = By.id("user_email");
		By password = By.id("user_password");
		By login = By.name("commit");
		
		
		
		public loginpage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		public WebElement getmail()
		{
			return driver.findElement(email);
		}
		public WebElement getpassword()
		{
			return driver.findElement(password);
			
		}
		public WebElement getlogin()
		{
			return driver.findElement(login);
		}
		

		
}
