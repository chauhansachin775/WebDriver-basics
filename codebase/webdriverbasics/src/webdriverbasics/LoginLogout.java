package webdriverbasics;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginLogout {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\codebase\\webdriverbasics\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.makemytrip.com";
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String s = "//div[contains(@class, 'landingContainer')]//ul//li/div/p[text()='Login or Create Account']//ancestor::li";
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
		
		for (int i = 0; i < 2; i++) {
			we.click();
		}
		
		String we1 = "//section/form//input[@id='username']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we1))).sendKeys("test.auto924@gmail.com");
		
		String we2 = "//section//span[text()='Continue']/parent::button";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we2))).click();
		
		String we3 = "//section//a[text()='Reset Password']/../input[@id='password']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we3))).sendKeys("testingtiger#321");
		
		String we4 = "//section//span[text()='Login']/parent::button";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we4))).click();
		
		String we5 = "//section//div[contains(@class, 'Close')]/span";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we5))).click();
		
		String we6 = "//div[@id='root']//ul/li[@data-cy='account']";
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we6)));
		Actions action = new Actions(driver);
		action.moveToElement(element1).build().perform();
		
		
		String we7 = "//p[text()='My Profile']/parent::div/parent::a";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we7))).click();
		
		String we8 = "//div[@id='root']//following-sibling::div/following-sibling::ul/li[text()='Logout']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we8))).click();
		
		
		
		
		
		
		
		
		
		
	}

}
