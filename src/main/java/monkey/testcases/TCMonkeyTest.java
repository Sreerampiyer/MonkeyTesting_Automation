package monkey.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import monkey.common.MonkeyWrapper;

public class TCMonkeyTest extends MonkeyWrapper {
	@Test(enabled = true, priority = 1)
	public void monkeyClick()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\files\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Student Registration Form')]")));
		int attackTimeInSeconds=10;
		String status=monkeyClick(driver,attackTimeInSeconds);
		if(status.equals("Passed")) {
				System.out.println("Click Monkey Test Completed");	
		}
		else
		{
		System.out.println("Monkey test failed");	
		}
		driver.quit();	
}
	
	
	@Test(enabled = true, priority = 2)
	public void monkeyTouch()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\files\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Student Registration Form')]")));
		int attackTimeInSeconds=10;
		String status=monkeyToucher(driver,attackTimeInSeconds);
		if(status.equals("Passed")) {
				System.out.println("Touch Monkey Test Completed");	
		}
		else
		{
		System.out.println("Monkey test failed");	
		}
		driver.quit();	
}
	@Test(enabled = true, priority = 3)
	public void monkeyEnterText()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\files\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Student Registration Form')]")));
		int attackTimeInSeconds=10;
		String status=monkeyEnterText(driver,attackTimeInSeconds);
		if(status.equals("Passed")) {
				System.out.println("Text Entry Monkey Test Completed");	
		}
		else
		{
		System.out.println("Monkey test failed");	
		}
		driver.quit();	
}
	@Test(enabled = true, priority = 4)
	public void monkeyScroller()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\files\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Student Registration Form')]")));
		int attackTimeInSeconds=10;
		String status=monkeyScroller(driver,attackTimeInSeconds);
		if(status.equals("Passed")) {
				System.out.println("Scroller Monkey Test Completed");	
		}
		else
		{
		System.out.println("Monkey test failed");	
		}
		driver.quit();	
}
	@Test(enabled = true, priority = 5)
	public void monkeyTyper()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\files\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Student Registration Form')]")));
		int attackTimeInSeconds=10;
		String status=monkeyTyper(driver,attackTimeInSeconds);
		if(status.equals("Passed")) {
				System.out.println("Keyboard Typer Monkey Test Completed");	
		}
		else
		{
		System.out.println("Monkey test failed");	
		}
		driver.quit();	
}
	@Test(enabled = true, priority = 6)
	public void monkeyAlltogetherAttack()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\files\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Student Registration Form')]")));
		int attackTimeInSeconds=10;
		String status=monkeyAttack(driver,attackTimeInSeconds);
		if(status.equals("Passed")) {
				System.out.println("All together Monkey Attck Test Completed");	
		}
		else
		{
		System.out.println("Monkey test failed");	
		}
		driver.quit();	
}
}
