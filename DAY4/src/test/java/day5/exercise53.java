package day5;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;																					
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise53 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("cusid"));
		search.sendKeys("401");
		WebElement sub=driver.findElement(By.name("submit"));
		sub.click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.dismiss();
		search.clear();
		search.sendKeys("402");
		sub.click();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		Alert alert3=driver.switchTo().alert();
		String txt=alert3.getText();
		alert3.accept();
		System.out.println(txt);
		
		
		
	     	
	}

}