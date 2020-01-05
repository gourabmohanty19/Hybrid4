package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_HomePage {
	
	// Page Name   : Home Page
	// Module Name : Purchases
	// Application Name : Motors
	// Author      : Kishore Kumar
	// Reviewed By : Raja
	// Date Created : 01042020
	//****************************************************************************
	
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_txtUserId']") WebElement HomePage_UID;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_txtPassword']") WebElement HomePage_PWD;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_btnLogin']") WebElement HomePage_LoginButton;
	
	

}
