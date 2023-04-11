package project31;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexercise3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		
	     	
	}

}
