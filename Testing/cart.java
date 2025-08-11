package Automation;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class cart {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Page\\for ml Project\\SQA\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ecommerce.intradocint.com/cart#");
	
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(3000);
	
		driver.findElement(By.name("keyword")).sendKeys("Mobile",Keys.ENTER);
		driver.findElement(By.className("header-category")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 300)");
		driver.findElement(By.xpath("//*[@id=\"grid-view\"]/div[3]/div/a/div")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 350)");
		driver.findElement(By.cssSelector("#myform > div > div > div.inc.qtybutton")).click();
		
		driver.findElement(By.cssSelector("a[href*='/category/boy']")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 250)");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href*='https://ecommerce.intradocint.com/boy-product-4']")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.inc.qtybutton")).click();
			Thread.sleep(5000);
		driver.findElement(By.className("add-to-cart-single-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href*='https://ecommerce.intradocint.com/customer/login']")).click();
		
		
		
		driver.findElement(By.className("cart__menu")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a[href*='https://ecommerce.intradocint.com/check-out']")).click();
		
		driver.findElement(By.className("product-btn")).click();
		
	}

}
