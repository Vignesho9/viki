package com.Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Runner {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("vignesho9");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Vignesh09");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@name='location']")).click();
		  Robot r = new Robot();
			for (int i = 0; i < 7; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		      Thread.sleep(4000);
		      
		driver.findElement(By.xpath("//*[@name='hotels']")).click();
		 Robot r1 = new Robot();
			for (int i = 0; i < 2; i++) {
				r1.keyPress(KeyEvent.VK_DOWN);
				r1.keyRelease(KeyEvent.VK_DOWN);
				}
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
		      Thread.sleep(4000);
		      
		driver.findElement(By.xpath("//*[@name='room_type']")).click(); 
		 Robot r2 = new Robot();
			for (int i = 0; i < 2; i++) {
				r2.keyPress(KeyEvent.VK_DOWN);
				r2.keyRelease(KeyEvent.VK_DOWN);
				}
			r2.keyPress(KeyEvent.VK_ENTER);
			r2.keyRelease(KeyEvent.VK_ENTER);
		      Thread.sleep(4000);
		      
		WebElement idate = driver.findElement(By.xpath("//*[@name='datepick_in']"));      
		idate.clear();
		idate.sendKeys("09/12/2021");
		
		WebElement odate = driver.findElement(By.xpath("//*[@name='datepick_out']"));
		odate.clear();
		odate.sendKeys("18/12/2021");
		
		driver.findElement(By.xpath("//*[@name='adult_room']")).click();
		 Robot r3 = new Robot();
			for (int i = 0; i < 1; i++) {
				r3.keyPress(KeyEvent.VK_DOWN);
				r3.keyRelease(KeyEvent.VK_DOWN);
				}
			r3.keyPress(KeyEvent.VK_ENTER);
			r3.keyRelease(KeyEvent.VK_ENTER);
		      Thread.sleep(4000);
		      
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//*[@name='continue']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Pandiyan");
		driver.findElement(By.xpath("//*[@name='address']")).sendKeys("09 vignesh street palur trichy 621216");
		driver.findElement(By.xpath("//*[@name='cc_num']")).sendKeys("8012228005998877");
		driver.findElement(By.xpath("//*[@name='cc_type']")).click();
		 Robot r4 = new Robot();
			for (int i = 0; i < 1; i++) {
				r4.keyPress(KeyEvent.VK_DOWN);
				r4.keyRelease(KeyEvent.VK_DOWN);
				}
			r4.keyPress(KeyEvent.VK_ENTER);
			r4.keyRelease(KeyEvent.VK_ENTER);
		      Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@name='cc_exp_month']")).click();
	 Robot r5 = new Robot();
		for (int i = 0; i < 7; i++) {
			r5.keyPress(KeyEvent.VK_DOWN);
			r5.keyRelease(KeyEvent.VK_DOWN);
			}
		r5.keyPress(KeyEvent.VK_ENTER);
		r5.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@name='cc_exp_year']")).click(); 
	 Robot r6 = new Robot();
		for (int i = 0; i < 8; i++) {
			r6.keyPress(KeyEvent.VK_DOWN);
			r6.keyRelease(KeyEvent.VK_DOWN);
			}
		r6.keyPress(KeyEvent.VK_ENTER);
		r6.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@name='cc_cvv']")).sendKeys("123");          
	driver.findElement(By.xpath("//*[@name='book_now']")).click();
	Thread.sleep(8000);
	
    driver.findElement(By.xpath("//*[@name='my_itinerary']")).click();
    Thread.sleep(8000);

}
}