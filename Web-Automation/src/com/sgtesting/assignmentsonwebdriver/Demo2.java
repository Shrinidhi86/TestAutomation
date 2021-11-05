package com.sgtesting.assignmentsonwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		Navigate();
		Login();
		minimizeFlyOutWindow();
		createUser();
		Modify();
		Deleteuser();
	logout();
		closeApplication();

	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Example Automation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void Navigate()
	{
		{
			try
			{
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
	}
 static void Login()
 {
		
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
 static void minimizeFlyOutWindow()
 {
 	try
 	{
 		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
 		Thread.sleep(2000);
 	}catch(Exception e)
 	{
 		e.printStackTrace();		
 	}
 }
 
 static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser7");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(500);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
 static void Modify()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
		
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User2");
		
			
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

 static void Deleteuser()
 {
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

 
 static void logout()
 {
 	try
 	{
 		oBrowser.findElement(By.linkText("Logout")).click();
 		Thread.sleep(2000);
 	}catch(Exception e)
 	{
 		e.printStackTrace();		
 	}
 }
 static void closeApplication()
 {
 	
 	try
 	{
 		oBrowser.quit();
 	}catch(Exception e)
 	{
 		e.printStackTrace();		
 	}
 }
}

