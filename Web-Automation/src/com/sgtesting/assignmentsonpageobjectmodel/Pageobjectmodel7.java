package com.sgtesting.assignmentsonpageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobjectmodel7 {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo oPage=null;
	public static void main(String[] args) {
		launchbrowser();
		Navigate();
		Login();
		minimizeFlyOutWindow();
		Createcustomer();
		CreateProject();
		Createtask();
		deletetask();
		deleteproject();
		deletecustomer();
		logout();
		//closeApplication();


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
			oPage.getPassword().sendKeys("manager");
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

	static void Createcustomer()
	{
		try
		{

			oPage.getCustomer().click();
			Thread.sleep(1000);	
			oPage.getaddnewCustomer().click();
			Thread.sleep(1000);
			oPage.getnewCustomer().click();
			Thread.sleep(1000);
			oPage.getCustomernameField().sendKeys("user33");
			Thread.sleep(1000);
			oPage.getcreateCustomer().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void CreateProject()
	{
		try
		{
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.newprojectbutton().click();
			Thread.sleep(2000);
			oPage.writeprojectnamefield().sendKeys("Stage3establishment");
			Thread.sleep(2000);
			oPage.createprojectbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void  Createtask()
	{
		try
		{
			oPage.Taskaddnewbutton().click();
			Thread.sleep(2000);
			oPage.createnewTaskbutton().click();
			Thread.sleep(2000);
			oPage.writetaskname().sendKeys("productionstage");
			Thread.sleep(2000);
			oPage.clickoncreatetaskbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletetask()
	{
		try
		{
			oPage.clickontaskicon().click();
			Thread.sleep(2000);
			oPage.taskdeleteicon().click();
			Thread.sleep(2000);
			oPage.taskdeletebutton().click();
			Thread.sleep(2000);
			oPage.taskdeletepermanently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteproject()
	{
		try
		{
			oPage.settingiconprojectbutton().click();
			Thread.sleep(2000);
			oPage.projectactionbutton().click();
			Thread.sleep(2000);
			oPage.projectdeletebutton().click();
			Thread.sleep(2000);
			oPage.projectdeleteconfirm().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deletecustomer()
	{
		try 
		{
			oPage.getclicksettingbutton().click();
			Thread.sleep(2000);
			oPage.getclickactionbutton().click();
			Thread.sleep(2000);
			oPage.getclickondeletebutton().click();
			Thread.sleep(2000);
			oPage.getclickondeletepermanentlybutton().click();
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




