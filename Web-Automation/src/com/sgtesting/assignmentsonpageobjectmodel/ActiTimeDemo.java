package com.sgtesting.assignmentsonpageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo {
	
	public ActiTimeDemo(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

    //Create user
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
private WebElement Create;
public WebElement getCreate()
{
	return Create;
}

//Add user
@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
private WebElement Adduser;
public WebElement getAddUser()
{
	return Adduser;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
private WebElement firstname;
public WebElement getfirstname()
{
	return firstname;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
private WebElement lastname;
public WebElement getlastname()
{
	return lastname;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
private WebElement emailfield;
public WebElement getemailfield()
{
	return emailfield;
}
@FindBy(xpath="userDataLightBox_usernameField")
private WebElement usernameField;
public WebElement getusernameField()
{
	return usernameField;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
private WebElement passwordfield;
public WebElement getpasswordField()
{
	return passwordfield;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
private WebElement retypepasswordfield;
public WebElement getretypepassword()
{
	return retypepasswordfield;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement usercreated;
public WebElement getusercreated()
{
	return usercreated;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
private WebElement  icondeleteuser;
public WebElement geticondeleteuser()
{
	return icondeleteuser;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
private WebElement deleteuser;
public WebElement getdeleteuser()
{
	return deleteuser;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
private WebElement clickmodifyuser;
public WebElement getclickmodifyuser()
{
	return clickmodifyuser;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
private WebElement modifyuser;
public WebElement getmodifyuser()
{
	return modifyuser;
}


@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement savechanges;
public WebElement getsavechanges()
{
	return savechanges;
}


//create customer

@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
private WebElement taskicon;
public WebElement  gettaskicon()
{
	return taskicon;
}

@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
private WebElement addnew;
public WebElement getaddnew()
{
	return addnew;
}

@FindBy(xpath="/html/body/div[14]/div[1]")
private WebElement newcustomerbutton;
public WebElement getnewcutomerbutton()
{
	return newcustomerbutton;
}

//entercustomername
@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
private WebElement createCustomer;
public WebElement getCustomer()
{
return createCustomer;
}

@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
private WebElement addnewCustomer;
public WebElement getaddnewCustomer()
{
return addnewCustomer;
}

@FindBy(xpath="/html/body/div[14]/div[1]")
private WebElement newCustomer;
public WebElement getnewCustomer()
{
return newCustomer;
}

@FindBy(id="customerLightBox_nameField")
private WebElement  customernameField;
public WebElement getCustomernameField()
{
return customernameField;
}	

@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
private WebElement  create1Customer;
public WebElement getcreateCustomer()
{
return create1Customer;
}

//deletecustomer
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
private WebElement clicksettingbutton;
public WebElement getclicksettingbutton()
{
	return clicksettingbutton;
}

@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
private WebElement clickactionbutton;
public WebElement getclickactionbutton()
{
	return clickactionbutton;
}

@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
private WebElement clickondeletebutton;
public WebElement getclickondeletebutton()
{
	return clickondeletebutton;
}

@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
private WebElement clickondeletepermanentlybutton;
public WebElement getclickondeletepermanentlybutton()
{
	return clickondeletepermanentlybutton;
}

//modifycustomer
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
private WebElement Writeonmodifyfield;
public WebElement getWriteonmodifyfield()
{
	return Writeonmodifyfield;
}

//closebutton
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
private WebElement closebuttonicon;
public WebElement getclosebuttonicon()
{
	return closebuttonicon;
}

//newprojectbutton
@FindBy(xpath="/html/body/div[14]/div[2]")
private WebElement newprojectbutton;
public WebElement newprojectbutton()
{
	return newprojectbutton;
}

//enterprojectnamefield
@FindBy(id="projectPopup_projectNameField")
private WebElement writeprojectnamefield;
public WebElement writeprojectnamefield()
{
	return writeprojectnamefield;
}

//createprojectbutton
@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]")
private WebElement createprojectbutton;
public WebElement createprojectbutton()
{
	return createprojectbutton;
}

//deleteprojectprocess
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement settingiconprojectbutton;
public WebElement settingiconprojectbutton()
{
	return settingiconprojectbutton;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
private WebElement projectactionbutton;
public WebElement projectactionbutton()
{
	return projectactionbutton;
}

@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
private WebElement projectdeletebutton;
public WebElement projectdeletebutton()
{
	return projectdeletebutton;
}

@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
private WebElement projectdeleteconfirm;
public WebElement projectdeleteconfirm()
{
	return projectdeleteconfirm;
}

//modifyproject
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
private WebElement Projectmodify;
public WebElement projectmodify()
{
	return Projectmodify;
}
//projectclosebutton
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
private WebElement projectclosebutton;
public WebElement projectclosebutton()
{
	return projectclosebutton;
}

//tocreatetaskoperation
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")
private WebElement Taskaddnewbutton;
public WebElement Taskaddnewbutton()
{
	return Taskaddnewbutton;
}

@FindBy(xpath="/html/body/div[13]/div[1]")
private WebElement createnewTaskbutton;
public WebElement createnewTaskbutton()
{
	return createnewTaskbutton;
}

@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
private WebElement writetaskname;
public WebElement writetaskname()
{
	return writetaskname;
}

@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]")
private WebElement clickoncreatetaskbutton;
public WebElement clickoncreatetaskbutton()
{
	return clickoncreatetaskbutton;
}


//delete task
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
private WebElement clickontaskicon;
public WebElement clickontaskicon()
{
	return clickontaskicon;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")
private WebElement taskdeleteicon;
public WebElement taskdeleteicon()
{
	return taskdeleteicon;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
private WebElement taskdeletebutton;
public WebElement taskdeletebutton()
{
	return taskdeletebutton;
}
@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")
private WebElement taskdeletepermanently;
public WebElement taskdeletepermanently()
{
	return taskdeletepermanently;
}


//create users for advance scenarios

//startexploringactitimewindow

@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
private WebElement startexploringwindow;
public WebElement getstartexploringwindow()
{
	return startexploringwindow;
}

//modifypasswordforusers

@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
private WebElement clickonuserbutton;
public WebElement getclickonuserbutton()
{
	return clickonuserbutton;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement Demouser1button;
public WebElement Demouser1button()
{
	return Demouser1button;
}


@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
private WebElement user1newpassword;
public WebElement user1newpassword()
{
	return user1newpassword;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement savechangesbutton;
public WebElement savechangesbutton()
{
	return  savechangesbutton;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
private WebElement demouser2button;
public WebElement demouser2button()
{
	return demouser2button;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
private WebElement demouser3button;
public WebElement demouser3button()
{
	return  demouser3button;
}

@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
private WebElement deleteuser1;
public WebElement deleteuser1button()
{
	return deleteuser1;
}
//*[@id="userDataLightBox_deleteBtn"]
@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
private WebElement deleteuser2;
public WebElement deleteuser2button()
{
	return deleteuser2;
}

@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
private WebElement deleteuser3;
public WebElement deleteuser3button()
{
	return deleteuser3;
}

//*[@id="userDataLightBox_deleteBtn"]

@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
private WebElement clickonuserButton;
public WebElement  clickonuserButton()
{
	return  clickonuserButton;
}


@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement demouser2deletebutton;
public WebElement demouser2deletebutton()
{
	return demouser2deletebutton;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement demo3deletebutton;
public WebElement demo3deletebutton()
{
	return  demo3deletebutton;
}


@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
private WebElement demo33deletebutton;
public WebElement demo33deletebutton()
{
	return  demo33deletebutton;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
private WebElement demo22deletebutton;
public WebElement demo22deletebutton()
{
	return  demo22deletebutton;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement demo11deletebutton;
public WebElement demo11deletebutton()
{
	return  demo11deletebutton;
}
}















