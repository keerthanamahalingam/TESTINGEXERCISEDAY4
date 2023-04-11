package project31;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement firstname=driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("keerthana");
		WebElement lastname=driver.findElement(By.id("input-lastname"));
		lastname.sendKeys("M");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("kee@gmail.com");
		WebElement pass=driver.findElement(By.id("input-password"));
		pass.sendKeys("123456");
		WebElement yesbutton=driver.findElement(By.id("input-newsletter-yes"));
		yesbutton.click();
		
		
	     	
	}

}
