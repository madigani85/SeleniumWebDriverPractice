package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {
	
	WebDriver driver;
	
	//Constructor
		
		public landingPage (WebDriver driver)
		{
		
			this.driver = driver;
		}
		

		
		By logout_drpdwn = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
		
		By logout = By.xpath("//a[normalize-space()='Logout']");
		
		public void logoutClick()
		{
			
			driver.findElement(logout_drpdwn).click();
		}
		
		public void logout() {
			driver.findElement(logout).click();

			
		}
}
