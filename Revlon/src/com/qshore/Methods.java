package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	public FileInputStream filepath;
	public Workbook workbookObj;
	public Sheet sheetObj;
	
	// Method Name   : launchApp
	// Description   : To launch Application
	// Author        : Kishore Kumar
	// Reviewed By   : Ram
	// Date Created  : 01042020
	// Arguments     : String url, String sspath
	//******************************************************
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File fileObj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileObj, new File(sspath));}
	//***************************************************************************
	// Method Name   : closeApp
	// Description   : To Close Application
	// Author        : Kishore Kumar
	// Reviewed By   : Raja
	// Date Created  : 01042020
	// Arguments     : NA
	//****************************************************************************
	public void closeApp(){
		driver.close();	}
	//****************************************************************************
	public void elementPresent(WebElement elementt, boolean exp, String sspath) throws Exception {
		boolean element=elementt.isDisplayed();
		if(element==exp)
		{
			System.out.println("Pass");
			File fileObj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fileObj, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File fileObj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fileObj, new File(sspath));
		}
	}
	//*****************************************************************************
	public void excelCon(String fpath, String sname) throws Exception {
		filepath=new FileInputStream(fpath);
		workbookObj=Workbook.getWorkbook(filepath);
		sheetObj=workbookObj.getSheet(sname);
	}
	//*****************************************************************************
	public void elementsCOunt(String locator, int exp, String sspath) throws Exception{
		List<WebElement> elements=driver.findElements(By.tagName(locator));
		if(elements.size()==exp)
		{
			System.out.println("Pass");
			File fileObj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fileObj, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File fileObj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fileObj, new File(sspath));
		}
	}
	//****************************************************************************
	public void elementEnabled(WebElement elementt, boolean exp, String sspath) throws Exception {
		boolean element=elementt.isEnabled();
		if(element==exp)
		{
			System.out.println("Pass");
			File fileObj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fileObj, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File fileObj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fileObj, new File(sspath));
		}
	}
	//**************************************************************************************
	public void titleContains(String exptext, boolean exp){
		String title=driver.getTitle();
		if(title.contains(exptext)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//**************************************************************************************
	public void urlContains(String exptext, boolean exp){
		String url=driver.getCurrentUrl();
		if(url.contains(exptext)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//*****************************************************************
	
	
	
	
	

}









