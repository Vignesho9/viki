package com.Mini_Projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	public static WebDriver browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");
            driver = new ChromeDriver();
			}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver = new FirefoxDriver();
			
		}

          driver.manage().window().maximize();
          return driver;
	}
        public static void get(String url) {
           driver.get(url);
		}
        public static void inputvalues(WebElement element, String values) {
        	element.sendKeys(values);
			}
        public static void click(WebElement element) {
        	element.click();
        }
        public static void selectindex(WebElement element, int value) {
        	Select s = new Select(element);
        	s.selectByIndex(value);
        }
        public static  void clear(WebElement element) {
        	element.clear();
		}
       

		
         public static void backSpace(WebElement element) throws AWTException {
	      element.clear();
         }
         public static void sleep(int sec) throws InterruptedException {
		 Thread.sleep(sec);
         }
          public static void waitt() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  }
          private void scrollElementView(WebElement element) {
        	  JavascriptExecutor js =  (JavascriptExecutor) driver;
        	  js.executeScript("arguments[0].scrollIntoview();", element);
			

		}
}
