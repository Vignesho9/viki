package com.Runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.Mini_Projects.Base_Class;
import com.pom.Book_Hotel;
import com.pom.Conform_Booking;
import com.pom.Home_page;
import com.pom.Search_Hotel;
import com.pom.Select;
import com.v.Po_Manager;

public class Test_Runner1 extends Base_Class {
	
	public static WebDriver driver = browserlaunch("chrome");
	public static Po_Manager pom = new Po_Manager(driver);
	public static void main(String[] args) throws Throwable  {
		
	
		get("https://adactinhotelapp.com/");

		
		inputvalues(pom.gethp().getemail(),"vignesho9");
		inputvalues(pom.gethp().getPassword(),"Vignesh09");
		click(pom.gethp().getLogin());
		sleep(3000);
	
		selectindex(pom.getsh().getLocation(), 7);
		selectindex(pom.getsh().getHotel(), 2);
		selectindex(pom.getsh().getRoom(), 2);
		clear(pom.getsh().getChi());
		inputvalues(pom.getsh().getChi(), "09/12/2021");
		clear(pom.getsh().getCho());
		inputvalues(pom.getsh().getCho(), "18/12/2021");
		selectindex(pom.getsh().getAdultroom(), 2);
		click(pom.getsh().getSubmit());
		waitt();
		
		click(pom.gets().getRadio());
		click(pom.gets().getContinu());
	
		inputvalues(pom.getbh().getFname(), "Vignesh");
		inputvalues(pom.getbh().getLname(), "Pandiyan");
		inputvalues(pom.getbh().getAddress(), "09 vignesh street palur trichy 621216");
		inputvalues(pom.getbh().getCcnum(), "8012228005998877");
		selectindex(pom.getbh().getCctype(), 2);
	    selectindex(pom.getbh().getCcexpm(), 6);
	    selectindex(pom.getbh().getCcexpy(), 8);
	    inputvalues(pom.getbh().getCvv(), "123");
    	click(pom.getbh().getBooknow());
	    waitt();
		 
		 click(pom.getcb().getItey());
		 waitt();
		 
		 
			TakesScreenshot t = (TakesScreenshot) driver;
			File adt = t.getScreenshotAs(OutputType.FILE);
			File a=new File("C:\\Users\\Vignesh\\eclipse-workspace\\selenium\\screenshot\\adt.png");
			FileHandler.copy(adt, a);
	}

	}

	
	


