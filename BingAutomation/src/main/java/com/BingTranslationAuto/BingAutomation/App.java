package com.BingTranslationAuto.BingAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class App 
{
	static WebDriver driver;
	
	
	public void inputSelection() {
	     Select iValue = new Select(driver.findElement(By.id("t_sl")));
	       iValue.selectByVisibleText("Spanish");
			System.out.println(iValue);

		}

		public void outputSelection() {
			Select oValue = new Select(driver.findElement(By.id("t_tl")));
			oValue.selectByVisibleText("English");
			System.out.println(oValue);

		}	
	
	public void launchBrowser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prkrishnakumar\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		
	}
	
	public void closeBrowser() {
		//driver.quit();
	}

	public void sendtext() {
driver.findElement(By.id("t_sv")).sendKeys("Hola");		
	}

	public boolean translation() {
String translatedText = driver.findElement(By.id("t_tv")).getText();
if(translatedText.equals("Hello"))
{
	return true;
}
else
{
	return false;
}
	}
	
	
	
}
