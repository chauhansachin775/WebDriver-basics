package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelBooking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\codebase\\webdriverbasics\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.makemytrip.com";
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		String s = "//div[contains(@class, 'landingContainer')]//ul//li/div/p[text()='Login or Create Account']//ancestor::li";
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", we);
		
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
		
		String we6 = "//span[text()='From']/../input";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we6))).click();
		
		String we7 = "//span[text()='From']/..//following-sibling::div//input";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we7))).sendKeys("Gwalior");
		
		String we8= "//span[text()='From']/..//following-sibling::div//ul/li//p[contains(text(), 'Gwalior')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we8))).click();
		
		//Thread.sleep(3000);
		//String we9 = "//span[text()='To']/../input";
		//span[text()='To']/..
		//span[text()='To']/../input
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we9))).click();
		
		String we10 = "//span[text()='To']/..//following-sibling::div//input";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we10))).sendKeys("Bengaluru");
		
		String we11= "//span[text()='To']/..//following-sibling::div//ul/li//p[contains(text(), 'Bengaluru')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we11))).click();
		
		
		
		String we12 = "//div[contains(@aria-label, 'Oct 25 2021')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we12))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()= 'RETURN']"))).click();
		
		String we13 = "//div[contains(@aria-label, 'Oct 26 2021')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we13))).click();
		
		String we14 = "//a[text()= 'Search']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we14))).click();

	}

}
