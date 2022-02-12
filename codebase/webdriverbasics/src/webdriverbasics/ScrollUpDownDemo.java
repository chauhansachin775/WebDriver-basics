package webdriverbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollUpDownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\codebase\\webdriverbasics\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.makemytrip.com";
		driver.get(url);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeAsyncScript("window.scrollBy(0, 200)", "");
		//js.executeAsyncScript("window.scrollBy(0, -200)", "");
		//js.executeScript("window.scrollBy(0,-200)", "");
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.javaScriptThrowsNoExceptions("window.scrollBy(0, -250)"));
		System.out.println("hello");
		

	}

}
