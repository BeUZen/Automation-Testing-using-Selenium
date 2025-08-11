package Automation;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class Xpath {
	public static void main (String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Page\\for ml Project\\SQA\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://ecommerce.intradocint.com/cart#");
			JavascriptExecutor js= (JavascriptExecutor)driver;
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"inlineFormInputGroupUsername\"]")).sendKeys("mobile",Keys.ENTER);
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, 400)");
			driver.findElement(By.xpath("//*[@id=\"grid-view\"]/div[3]/div/a/div/h3")).click();
			js.executeScript("window.scrollBy(0, 400)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"myform\"]/div/div/div[2]")).click(); 
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"main-body\"]/div[3]/div[3]/div/section[2]/div/div/div[2]/div/div[4]/div[2]/ul/li/a")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id=\"sticky-header-with-topbar\"]/div/div/div[4]/ul/li[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"main-body\"]/div[3]/div[2]/div/div/ul[2]/li[1]/a")).click();
			Thread.sleep(6000);
			js.executeScript("window.scrollBy(0, 350)");
			driver.findElement(By.xpath("//*[@id=\"main-body\"]/div[3]/div[3]/div/div/div/div/div/form/div[2]/div[1]/div[1]/a")).click();
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0, 200)");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section[2]/div/div[1]/div/div/div/div/form/div[1]/span[2]"));
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"main-body\"]/div[3]/div[3]/div/section[2]/div/div[1]/div/div/div/div/form/div[2]/div/div[2]/input")).click();
			js.executeScript("window.scrollBy(0, 300)");
			Thread.sleep(3000);
			
	}

}
