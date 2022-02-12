package webdriverbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePassword {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium_WebDriver\\codebase\\webdriverbasics\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.makemytrip.com";
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
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
		
		//Thread.sleep(5000);
		String we8 = "//h3[text()='Login Details']/../../following-sibling::ul//li//div//span[text()='Change Password?']";
		//Thread.sleep(5000);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we8)));
		driver.findElement(By.xpath("//h3[text()='Login Details']/../../following-sibling::ul//li//div//span[text()='Change Password?']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		String we9 = "//label[text()='Old Password']/following-sibling::div/input";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we9))).sendKeys("testingtiger#321");
		
		String we10 = "//label[text()='New Password']/following-sibling::div/input";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we10))).sendKeys("mylin#321");
		
		String we11 = "//label[text()='Confirm New Password']/following-sibling::div/input";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we11))).sendKeys("mylin#321");
		
		String we12 = "//span[text()='Cancel']/following-sibling::button";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we12))).click();
		
		//WebElement elemen2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(we8)));
		
		//org.openqa.selenium.Point p = elemen2.getLocation();
		//System.out.println(p);
		
		//String s2 = elemen2.getText();
		//System.out.println(s2);
		
		//Actions act = new Actions(driver);
		//act.moveByOffset(1211, 956).build().perform();
		//act.click(elemen2).build().perform();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='+ Add your mobile number']"))).click();
		
		//System.out.println(ele.getText());
		//org.openqa.selenium.Point p2 = ele.getLocation();
		//System.out.println(p2);
		//for (int i = 0; i < 3; i++) {
			//ele.click();
		//}
		//Actions act = new Actions(driver);
		//act.moveToElement(e).build().perform();
	}

}
