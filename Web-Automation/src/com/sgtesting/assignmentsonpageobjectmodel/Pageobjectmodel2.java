package com.sgtesting.assignmentsonpageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobjectmodel2 {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo oPage=null;
	public static void main(String[] args) {
		launchbrowser();
		 Navigate();
		 Login();
		 minimizeFlyOutWindow();
		 createuser();
		 Adduser();
		 Namefield();
		 modifyuser();
		deleteuser();
		 logout();
		 closeApplication();
	

	}
		static void launchbrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","E:\\Example Automation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		 oBrowser=new ChromeDriver();
		 oPage=new ActiTimeDemo(oBrowser);
			}catch(Exception e)
			{
				e.printStackTrace();
			
			}
			
		}
	 static void Navigate()
	 {
		 try
		 {
			 oBrowser.navigate().to("http://localhost:82/login.do");
			 oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		 }catch(Exception e)
			{
				e.printStackTrace();
			
			}
	 }
			
		static void Login()
		{
			try
			{
				oPage.getUserName().sendKeys("admin");
				Thread.sleep(2000);
				oPage.getPassword().sendKeys("manager");
				Thread.sleep(2000);
				oPage.getLogin().click();
				Thread.sleep(4000);
			 }catch(Exception e)
			{
				e.printStackTrace();
			
			}
	 }

		static void minimizeFlyOutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
				Thread.sleep(2000);
			 }catch(Exception e)
			{
				e.printStackTrace();
			
			}
	 }
		
		static void createuser()
		{
			try
			{
				oPage.getCreate().click();
			}catch(Exception e)
			{
				e.printStackTrace();
			
			}
	 }
	 
		static void Adduser()
		{
			try
			{
				oPage.getAddUser().click();
			}catch(Exception e)
			{
				e.printStackTrace();
			
			}
	 }	


	static void Namefield()
	{
		try
		{ 
			oPage.getfirstname().sendKeys("john");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("kornish");
			Thread.sleep(2000);
			oPage.getemailfield().sendKeys("johnkarnish@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("jornkarnish44");
			Thread.sleep(2000);
			oPage.getpasswordField().sendKeys("12345679");
			Thread.sleep(2000);
			oPage.getretypepassword().sendKeys("12345679");
			Thread.sleep(2000);
			oPage.getusercreated().click();
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		
		}
	}	
	
	static void modifyuser()
	{
		try
		{
			oPage.getclickmodifyuser().click();
			Thread.sleep(2000);
			oPage.getmodifyuser().sendKeys("88");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		
		}
	}
		static void deleteuser()
		{
			try
			{
				oPage.getdeleteuser().click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String str=oAlert.getText();
				System.out.println(str);
				oAlert.accept();
				Thread.sleep(3000);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		static void logout()
		{
			try
			{
				oPage.getLogout().click();
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

