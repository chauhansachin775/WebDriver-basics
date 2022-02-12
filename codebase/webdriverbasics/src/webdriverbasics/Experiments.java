package webdriverbasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Experiments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\codebase\\webdriverbasics\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://www.makemytrip.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		String s = "//div[contains(@class, 'landingContainer')]//ul//li/div/p[text()='Login or Create Account']//ancestor::li";
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
		//WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		for (int i = 0; i < 2; i++) {
			we.click();
		}
		String s2 = "//div[contains(@class, 'landingContainer')]//section//div//span[text()='Login with Google']/../parent::div/.."; 
		String s3 = "//div[contains(@class, 'landingContainer')]//section//div//span[text()='Login with Google']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s3))).click();
		
		ArrayList<String> windowsCount = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowsCount);
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		driver.switchTo().window(windowsCount.get(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Email or phone']"))).sendKeys("testauto924@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']/parent::button"))).click();
		//wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		//Alert al = driver.switchTo().alert();
		//al.sendKeys("hello");
		
		
		
		//span[text()='Next']/parent::button
		//driver.findElement(By.xpath("//div[contains(@class, 'landingContainer')]//ul//li/div/p[text()='Login or Create Account']//ancestor::li")).click();
		
		
		System.out.println("hello");
		

	}

}
