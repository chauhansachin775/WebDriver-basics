package webdriverbasics;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExMultipleWindowsHandling   {

	public static void main(String[] args) throws InterruptedException{
		
		

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\codebase\\webdriverbasics\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		String url = "https://yourstory.com/";
		driver.get(url);
		
		String mainWindow = driver.getWindowHandle();
		
		//System.out.println();
		
		
		//Thread.sleep(5000);
		
		
		//String msg = driver.switchTo().alert().getText();
		//System.out.println(msg);
		Thread.sleep(3000);
		
		WebElement cookieBtn = driver.findElement(By.xpath("//div[text()='Got it!']"));
		if(cookieBtn.isDisplayed()) {
			cookieBtn.click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='playstore icon']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			if(! window.contains(mainWindow)) {
				driver.switchTo().window(window);
			}
		}
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Git Hub");
		driver.findElement(By.xpath("//button[@aria-label='Google Search']")).click();
		driver.close();
		driver.switchTo().window(mainWindow);
		
		
		
		
		
		
		

	}

}
