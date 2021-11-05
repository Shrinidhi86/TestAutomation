package com.sgtesting.assignmentsonpageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobjectmodeladvancescenarios1 {


	public static WebDriver oBrowser=null;
	public static ActiTimeDemo oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createuser1();
		Createuser2();
		Createuser3();
		logout();
		loginasuser1();
		startexploringwindow();
		logout();
		loginasuser2();
		startexploringwindow();
		logout();
		loginasuser3();
		startexploringwindow();
		logout();
		login();
		clickonuserbutton();
		Demouser1Button();
		modifypassword1();
		savechangesbutton();
		demouser2button();
		modifypassword2();
		savechangesbutton();
		demouser3button();
		modifypassword3();
		savechangesbutton();
		logout();
		loginasuser11();
		logout();
		loginasuser22();
		logout();
		loginasuser33();
		logout();
		login();
		clickonuserbutton();
		Demouser1Button();
		deleteuser1();
		demouser2deletebutton();
		deleteuser2();
		demouser3deletebutton();
		deleteuser3();
		logout();
		//	closeApplication();


	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Example Automation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeDemo(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(1000);
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void Createuser1()
	{
		try
		{ 
			oPage.getCreate().click();
			oPage.getAddUser().click();
			oPage.getfirstname().sendKeys("User1");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getemailfield().sendKeys("UserDemo1@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("UserDemo1");
			Thread.sleep(2000);
			oPage.getpasswordField().sendKeys("123456789");
			Thread.sleep(2000);
			oPage.getretypepassword().sendKeys("123456789");
			Thread.sleep(2000);
			oPage.getusercreated().click();

			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	static void Createuser2()
	{
		try
		{ 
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("User2");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getemailfield().sendKeys("UserDemo2@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("UserDemo2");
			Thread.sleep(2000);
			oPage.getpasswordField().sendKeys("12345789");
			Thread.sleep(2000);
			oPage.getretypepassword().sendKeys("12345789");
			Thread.sleep(2000);
			oPage.getusercreated().click();


			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}	

	static void Createuser3()
	{
		try
		{ 
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("User3");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getemailfield().sendKeys("UserDemo3@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("UserDemo3");
			Thread.sleep(2000);
			oPage.getpasswordField().sendKeys("1234578989");
			Thread.sleep(2000);
			oPage.getretypepassword().sendKeys("1234578989");
			Thread.sleep(2000);
			oPage.getusercreated().click();


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
	static void loginasuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("UserDemo1");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("123456789");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void startexploringwindow()
	{
		try
		{
			oPage.getstartexploringwindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void loginasuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("UserDemo2");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("12345789");
			oPage.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	} 

	static void loginasuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("UserDemo3");
			oPage.getPassword().sendKeys("1234578989");
			oPage.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	} 


	static void clickonuserbutton()
	{
		try
		{
			oPage.getclickonuserbutton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	} 

	static void Demouser1Button()
	{
		try
		{
			oPage.Demouser1button().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void modifypassword1()
	{
		try
		{
			oPage.getpasswordField().sendKeys("123457777");
			Thread.sleep(2000);
			oPage.getretypepassword().sendKeys("123457777");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void savechangesbutton()
	{
		try
		{
			oPage.savechangesbutton().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void demouser2button()
	{
		try
		{
			oPage.demouser2button().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifypassword2()
	{
		try
		{
			oPage.getpasswordField().sendKeys("123458888");
			Thread.sleep(2000);
			oPage.getretypepassword().sendKeys("123458888");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void demouser3button()
	{
		try
		{
			oPage.demouser3button().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifypassword3()
	{
		try
		{
			oPage.getpasswordField().sendKeys("123456666");
			Thread.sleep(2000);
			oPage.getretypepassword().sendKeys("123456666");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser11()
	{
		try
		{
			oPage.getUserName().sendKeys("UserDemo1");
			Thread.sleep(4000);
			oPage.getPassword().sendKeys("123457777");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	} 
	static void loginasuser22()
	{
		try
		{
			oPage.getUserName().sendKeys("UserDemo2");
			Thread.sleep(4000);
			oPage.getPassword().sendKeys("123458888");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	} 
	static void loginasuser33()
	{
		try
		{
			oPage.getUserName().sendKeys("UserDemo3");
			Thread.sleep(4000);
			oPage.getPassword().sendKeys("123456666");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	} 

	static void deleteuser1()
	{
		try
		{
			oPage.deleteuser1button().click();
			Thread.sleep(1000);
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
	static void deleteuser2()
	{
		try
		{
			oPage.deleteuser2button().click();
			Thread.sleep(1000);
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
	static void deleteuser3()
	{
		try
		{
			oPage.deleteuser3button().click();
			Thread.sleep(1000);
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


	static void demouser2deletebutton()
	{
		try
		{

			oPage.demouser2deletebutton().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void demouser3deletebutton()
	{
		try
		{

			oPage.demo3deletebutton().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
