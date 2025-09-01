package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;

//Constructor

	public loginPage(WebDriver driver) {

		this.driver = driver;
	}

//By txt_userName_loc = By.xpath("//input[@placeholder='Username']");
	By txt_userName_loc = By.name("username");
	By txt_password_loc = By.xpath("//input[@type='password']");
	By btn_login_loc = By.xpath("//button[@type='submit']");

	public void setUserName(String userName) {

		driver.findElement(txt_userName_loc).sendKeys(userName);
	}

	public void setPassword(String password) {

		driver.findElement(txt_password_loc).sendKeys(password);
	}

	public void click() {

		driver.findElement(btn_login_loc).click();
	}

}
