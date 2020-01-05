package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.Methods;
import com.qshore.PO_DashBoardPage;
import com.qshore.PO_HomePage;

public class PurchasesModule {
	
	// Test Name        : Login
	// Test Script Name : Login
	// Module Name      : Purchases
	// Application Name : Automobiles
	// Author           : Kishore Kumar
	// Reviewd By       : Ram
	// Date             : 01042020
	//****************************************************************************************
	
	public void login() throws Exception {
		
		// Create Object for Methods Class
		Methods methods_Obj=new Methods();
		
		// Import excelCon Method
		methods_Obj.excelCon("C:\\Users\\DELL\\Desktop\\FW4\\TestData\\Kishore\\Purchases\\Login\\Data.xls", "Sheet1");
		
		// Call LaunchApp method to launch application
		methods_Obj.launchApp(methods_Obj.sheetObj.getCell(0, 0).getContents(), "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\LaunchApp.png");
		
		// Import Page Objects Class
		PO_HomePage homepage=PageFactory.initElements(methods_Obj.driver, PO_HomePage.class);
		
		// Verifying User ID and PWD available or not
		methods_Obj.elementPresent(homepage.HomePage_UID, true, "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\UIDAvailable.png");
		methods_Obj.elementPresent(homepage.HomePage_PWD, true, "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\PWDAvailable.png");
		
		// Verifying UserID and PWD enabled or not
		methods_Obj.elementEnabled(homepage.HomePage_UID, true, "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\UIDEnabled.png");
		methods_Obj.elementEnabled(homepage.HomePage_PWD, true, "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\PWDEnabled.png");
		
		// Verifying Title contains "Online"
		methods_Obj.titleContains("Online", true);
		
		// Enter UID and PWD
		homepage.HomePage_UID.sendKeys(methods_Obj.sheetObj.getCell(0, 1).getContents());
		homepage.HomePage_PWD.sendKeys(methods_Obj.sheetObj.getCell(0, 2).getContents());
		
		// Verify Signin available and Enabled or not
		methods_Obj.elementPresent(homepage.HomePage_LoginButton, true, "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\SignINAvailable.png");
		methods_Obj.elementEnabled(homepage.HomePage_LoginButton, true, "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\SignINEnabled.png");
		
		// Click on Sign IN
		homepage.HomePage_LoginButton.click();
		
		// Create WebDriverWait Obj
		WebDriverWait ww=new WebDriverWait(methods_Obj.driver, 30);
		
		// Wait until Dashboard Page is loadin
		ww.until(ExpectedConditions.urlContains("DashBoard"));
		
		// Verifying URL
		methods_Obj.urlContains("DashBoard", true);
		
		// Verify Number Of Links are 20 or not
		methods_Obj.elementsCOunt("a", 20, "C:\\Users\\DELL\\Desktop\\FW4\\Test Results\\Kishore\\Purchases\\Login\\Links.png");
		
		// Import DashBoard Page Objects
		PO_DashBoardPage dashboardpage=PageFactory.initElements(methods_Obj.driver, PO_DashBoardPage.class);
		
		// Click on purchases
		dashboardpage.DashBoard_PurchaseLink.click();
		
		methods_Obj.closeApp();
	}
	//****************************************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
