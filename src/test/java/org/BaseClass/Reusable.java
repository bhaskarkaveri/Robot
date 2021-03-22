package org.BaseClass;
import java.util.List;
import java.util.Stack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Reusable{

static WebDriver driver;

public static void launch (String s) {
System.setProperty("webdriver.chrome.driver", "D:\\base project\\RobotManager\\Browsers\\chromedriver.exe");
 driver=new ChromeDriver();
driver.get(s);}
public static void pass(WebElement w,String s) {
w.sendKeys(s);
	
}
public static void button(WebElement w) {
	w.click();
}
public static void maxi() {
	getDriver().manage().window().maximize();
}
public static void text(WebElement w) {
	String t = w.getText();
	
	System.out.println(t);


}
public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver) {
	Reusable.driver = driver;
}
}
  


