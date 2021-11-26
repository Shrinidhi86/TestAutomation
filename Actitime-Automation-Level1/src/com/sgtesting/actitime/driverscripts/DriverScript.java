package com.sgtesting.actitime.driverscripts;

import com.sgtesting.actitimetests.Customers;

import com.sgtesting.actitimetests.HomePage;
import com.sgtesting.actitimetests.Initialization;
import com.sgtesting.actitimetests.LoginLogout;
import com.sgtesting.actitimetests.Projects;
import com.sgtesting.actitimetests.Tasks;
import com.sgtesting.actitimetests.Users;

public class DriverScript {

	public static void main(String[] args) {
		//Create User Scenario:-
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		
		//Modify User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//Create Customer
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//Modify Customer Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.modifyCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		

		//Create Project
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Projects.createCustomer();
		Projects.createProject();
		Projects.deleteProject();
		Projects.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		
		//Modify Project Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Projects.createCustomer();
		Projects.createProject();
		Projects.modifyProject();
		Projects.deleteProject();
		Projects.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		
		//Create Task
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Tasks.createCustomer();
		Tasks.createProject();
		Tasks.createTask();
		Tasks.deleteTask();
		Tasks.deleteProject();
		Tasks.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
				
		//Modify Task Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Tasks.createCustomer();
		Tasks.createProject();
		Tasks.createTask();
		Tasks.modifyTask();
		Tasks.deleteTask();
		Tasks.deleteProject();
		Tasks.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();	
		
		
		//Create Import Task
	   /* Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		ImportTasks.createimportTask();
		LoginLogout.logout();
		Initialization.closeApplication();
		*/
	}
}
