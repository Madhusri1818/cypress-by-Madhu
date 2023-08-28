package com.WebElements;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimepage {
	WebDriver driver;

	public ActiTimepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	public WebElement UserName;
	@FindBy(name = "pwd")
	public WebElement Password;
	@FindBy(id = "loginButton")
	public WebElement login_btn;

	@FindBy(xpath = "//div[text()='Reports']")
	public WebElement Report_lnk;

	@FindBy(xpath = "//div[@id='ext-gen29']")
	public WebElement NewReport_lnk;

	@FindBy(xpath = "//div[@class='timeReports']/div[2]")
	public WebElement StaffPerformance_lnk;
	@FindBy(xpath = "//div[@class='configureButton components_button']")
	public WebElement configRepParameters_link;
	@FindBy(xpath = "//div[text()='Create Staff Performance Report']")
	public WebElement ValidatePerSheet;
	@FindBy(xpath = "//span[@id='applyReportConfiguration']")
	public WebElement generateHtml_btn;
	@FindBy(xpath = "//td[text()='Reports Dashboard']")
	public WebElement Report_validate;
	@FindBy(xpath = "//div[text()='Users']")
	public WebElement User_lnk;
	@FindBy(xpath = "//span[text()='List of Users']")
	public WebElement valiadate_userpage;
	@FindBy(xpath = "//div[text()='New User']")
	public WebElement New_user_lnk;
	@FindBy(xpath = "//input[@id='createUserPanel_firstNameField']")
	public WebElement Newuser_FName_txt;

	@FindBy(id = "createUserPanel_lastNameField")
	public WebElement newUser_lNmae_txt;
	@FindBy(id = "createUserPanel_emailField")
	public WebElement newUser_Email_txt;

	@FindBy(xpath = "//div[text()='Save & Send Invitation']")
	public WebElement save_sendInvit_lnk;

	@FindBy(xpath = "//span[text()='Close']")
	public WebElement Close_btn;
	@FindBy(xpath = "//div[text()='Time-Track']")
	public WebElement TimeTrack_lnk;
	@FindBy(className = "switcherBackground")
	public WebElement slider_switch;
	@FindBy(id = "FormModifiedDivButton")
	public WebElement savechanges_btn;
	@FindBy(id = "SubmitTTButton")
	public WebElement SaveTotalChanges_btn;
	@FindBy(xpath = "//span[text()='Your changes were successfully saved.']")
	public WebElement validatesaveChanges;
	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement CancelSaveChanges_btn;
	@FindBy(id = "container_tasks")
	public WebElement Task_lnk;
	@FindBy(xpath = "//span[text()='Customers & Projects']")
	public WebElement validateCustomer_txt;;

	@FindBy(xpath = "//*[@id='taskListBlock']/div[1]/div[2]/div[2]/div[1]/div/table/tbody/tr/td[1]/div/input")
	public WebElement Searchfun_box;
	@FindBy(id = "logoutLink")
	public WebElement Logout_lnk;
	@FindBy(id = "logo_aT")
	public WebElement Logo;

	@FindBy(xpath = "//div[@class='menuTable']/div[2]")
	public WebElement settings_lnk;
	@FindBy(xpath = "//a[text()='Notifications']")
	public WebElement Notification_lnk;
	@FindBy(xpath = "//a[@class='userProfileLink username ']")
	public WebElement Profile_lnk;
	@FindBy(xpath = "//span[text()='My Profile']")
	public WebElement validateProfile;
	@FindBy(id = "closeUserProfilePopupButton")
	public WebElement CloseProfile;

	public void loginFun() {
		UserName.sendKeys("admin");
		Password.sendKeys("manager");
		login_btn.click();
	}

	public void LoginFunction(String UName, String pwd) {
		UserName.sendKeys(UName);
		Password.sendKeys(pwd);

	}

	public void Report_lnk() throws Exception {
		Thread.sleep(3000);
		Report_lnk.click();
	}

	public void ValidateReport_pagetxt(String text) {
		// validate the Report dashboard text
		if (Report_validate.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		String excepttext = Report_validate.getText();
		String actualtxt = text;
		Assert.assertEquals(excepttext, actualtxt);
	}

	public void Validate_CustomerPage() {
		Assert.assertTrue(validateCustomer_txt.isDisplayed());
	}

	public void Validate_PerformanceSheet(String text) {
		String Actual_txt = ValidatePerSheet.getText();
		String Expcted_txt = text;
		Assert.assertEquals(Actual_txt, Expcted_txt);
	}

	public void ClickUser_lnk() {
		User_lnk.click();
	}

	public void Valiadte_userPage() {
		Assert.assertTrue(valiadate_userpage.isDisplayed());
	}

	public void EnterNewUserData(String FName_txt, String LName_txt, String Email_txt) throws Exception {
		Thread.sleep(3000);
		Newuser_FName_txt.sendKeys(FName_txt);
		newUser_lNmae_txt.sendKeys(LName_txt);
		newUser_Email_txt.sendKeys(Email_txt);
	}

	public void clickTimeTrack_lnk() {
		TimeTrack_lnk.click();
	}

	public void Slider_on() {
		slider_switch.click();
	}

	public void ClickSaveChanges_btn() {
		savechanges_btn.click();
	}

	public void clickTotalsaveChange_btn() {
		SaveTotalChanges_btn.click();

	}

	public void ValiadteSaveChanges() {
		if (validatesaveChanges.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	public void ClickCancelSaveChanges() {
		CancelSaveChanges_btn.click();
	}

	public void handlealert() {
		driver.switchTo().alert().accept();
	}

	public void clickTask_lnk() {
		Task_lnk.click();
	}

	public void SearchFun() {
		Searchfun_box.sendKeys("Fli");
	}

	public void ValidateLogo() throws Exception {
		Thread.sleep(3000);
		// Validate Logo using isDisplayed method
		if (Logo.isDisplayed()) {
			System.out.println("Logo is Displayed !!!!!");
		} else {
			System.out.println("Logo not Found");
		}

		// using assert validate logo
		Assert.assertTrue(Logo.isDisplayed());
	}

	public void Logout() throws Exception {
		Thread.sleep(2000);
		try {
			Logout_lnk.click();
		} catch (Exception e) {
		}
	}

	public void clicksetting_btn() {
		settings_lnk.click();
	}

	public void EnterSearchdata() {
		Searchfun_box.sendKeys("Fli");
	}

	public void EnterInvalidSearchdata() throws Exception {
		Thread.sleep(3000);
		Searchfun_box.sendKeys("@#6*...");
		Assert.assertEquals(Searchfun_box.getText(), "Special characters are not Accepted");
	}

	public void ClickNotification() {
		Notification_lnk.click();
	}

	public void BacktoHome() {
		driver.navigate().back();
	}

	public void clickOnProfile() {
		Profile_lnk.click();
	}

	public void ValidateProfilePage() {
		Assert.assertTrue(validateProfile.isDisplayed());
	}

	public void CloseProfile() {
		CloseProfile.click();
	}
}
