package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;																					
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise54 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.abhibus.com/bus-ticket-booking");
		WebElement leavedes=driver.findElement(By.xpath("//*[@id=\"source\"]"));
		leavedes.sendKeys("Coimbatore",Keys.ENTER);
		WebElement godes=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		godes.sendKeys("Delhi",Keys.ENTER);
	    WebElement datepicker=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('value','10/05/2023')",datepicker);
	    
	}

}