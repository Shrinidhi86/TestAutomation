package com.sgtesting.actitime.driverscripts;

import org.openqa.selenium.WebDriver;


import com.sgtesting.actitimetests.Customers;

import com.sgtesting.actitimetests.HomePage;
import com.sgtesting.actitimetests.Initialization;
import com.sgtesting.actitimetests.LoginLogout;
import com.sgtesting.actitimetests.Projects;
import com.sgtesting.actitimetests.Tasks;
import com.sgtesting.actitimetests.Users;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		
		
		//Create User Scenario:-
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		
		//Modify User Scenario
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.modifyUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		//Create Customer
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Customers.createCustomer(oBrowser);
		Customers.deleteCustomer(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		//Modify Customer Scenario
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Customers.createCustomer(oBrowser);
		Customers.modifyCustomer(oBrowser);
		Customers.deleteCustomer(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		

		//Create Project
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Projects.createCustomer(oBrowser);
		Projects.createProject(oBrowser);
		Projects.deleteProject(oBrowser);
		Projects.deleteCustomer(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		
		//Modify Project Scenario
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Projects.createCustomer(oBrowser);
		Projects.createProject(oBrowser);
		Projects.modifyProject(oBrowser);
		Projects.deleteProject(oBrowser);
		Projects.deleteCustomer(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		
		//Create Task
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Tasks.createCustomer(oBrowser);
		Tasks.createProject(oBrowser);
		Tasks.createTask(oBrowser);
		Tasks.deleteTask(oBrowser);
		Tasks.deleteProject(oBrowser);
		Tasks.deleteCustomer(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
				
		//Modify Task Scenario
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Tasks.createCustomer(oBrowser);
		Tasks.createProject(oBrowser);
		Tasks.createTask(oBrowser);
		Tasks.modifyTask(oBrowser);
		Tasks.deleteTask(oBrowser);
		Tasks.deleteProject(oBrowser);
		Tasks.deleteCustomer(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);	
		
		
	
	}
}
