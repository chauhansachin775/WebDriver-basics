package webdriverbasics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Experiment {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\codebase\\webdriverbasics\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//driver.get("https://aptimatrix.wordpress.com/");
		//driver.navigate().to("https://aptimatrix.wordpress.com/");
		URL url = new URL("https://aptimatrix.wordpress.com/");
		
		driver.navigate().to(url);
		
		WebElement ele = driver.findElement(By.xpath("ez"));
		Select select = new Select(ele);
		
		//driver.navigate().forward();
		//driver.navigate().back();
		//driver.navigate().refresh();
		
		
		
		
		
		
		
	}

}
