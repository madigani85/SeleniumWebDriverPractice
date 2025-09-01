package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjectModel.landingPage;
import pageObjectModel.loginPage;

public class firstTestCase {

	WebDriver driver = new ChromeDriver();

	/*
	 * @Test(priority=3)
	 * 
	 * void Open() {
	 * 
	 * System.out.println("Opening the URL"); }
	 * 
	 * @Test(priority=2)
	 * 
	 * void login() {
	 * 
	 * System.out.println("Login using username and password");
	 * 
	 * }
	 * 
	 * @Test(priority=1) void logout() { System.out.println("Logging out");
	 */
	@Test
	public void login() throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is " + pageTitle);

		loginPage lp = new loginPage(driver);

		landingPage landPage = new landingPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait and enter username
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		// username.sendKeys("Admin");

		lp.setUserName("Admin");

		lp.setPassword("admin123");
		lp.click();

		WebElement logoutdrp = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));

		landPage.logoutClick();
		landPage.logout();

	}

	@AfterTest

	public void tearDown() {

		driver.quit();

	}

}
