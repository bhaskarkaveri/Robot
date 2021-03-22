package org.BaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\base project\\RobotManager\\Browsers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://app.robotmanager.io/#/login");
	WebElement id = driver.findElement(By.id("emailID"));
	id.sendKeys("kaveri.b@sybrant.com");
	WebElement password = driver.findElement(By.id("text"));
	password.sendKeys("India@123");
WebElement btn = driver.findElement(By.xpath("//button[@class='login-btn mat-button'][0]\\"));
btn.click();



}
}
