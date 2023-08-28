package StepDefinition;

import java.util.Properties;

import com.DriverFactory.BaseDriver;
import com.WebElements.ActiTimepage;

import MytestRunner.runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActiTimeSteps extends BaseDriver {
	public static Properties P;
	public ActiTimepage element = new ActiTimepage(driver);

	@Given("User Launch Browser as per req")
	public void user_launch_browser_as_per_req() {
		System.out.println("launch browser");
	}

	@Given("user Launch URL")
	public void user_launch_url() {
		System.out.println("url");
		P = runner.pro;
		System.out.println(P.getProperty("ActiTimeUrl"));
		//Navigate to url "https://demo.actitime.com/login.do"
		driver.get(P.getProperty("ActiTimeUrl"));
	}

	@Given("user enters logindetails")
	public void user_enters_logindetails() {
		//user enters username and password and clicks on login
		element.loginFun();
	}

	@When("user click on report_lnk")
	public void user_click_on_report_lnk() throws Exception {
		Thread.sleep(3000);
		//clicks o report link
		element.Report_lnk();
		System.out.println("click on reprot link");
	}

	@Then("user able to view {string}")
	public void user_able_to_view(String text) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("validate string");
		//validate reports dashboard page is opened or not
		element.ValidateReport_pagetxt(text);
	}

	@When("user click newreport_lnk")
	public void user_click_newreport_lnk() {
		//clicks on new report
		element.NewReport_lnk.click();
	
		System.out.println("click on newreprot link");
	}

	@When("user click on staff performance under TimeReports")
	public void user_click_on_staff_performance_under_time_reports() {
		System.out.println("staff report");
		//select staff performane
		element.StaffPerformance_lnk.click();
	}

	@When("user click on configure Report Parameters")
	public void user_click_on_configure_report_parameters() throws Exception {
		System.out.println("configure report");
		Thread.sleep(2000);
		//clicks on configure parameters
		element.configRepParameters_link.click();
	}

	@Then("user on {string} page")
	public void user_on_page(String textmessage) {
		System.out.println("user on page");
		//validate performance sheet visible or not
		element.Validate_PerformanceSheet(textmessage);
	}

	@Then("user clicks on Generate Html report")
	public void user_clicks_on_generate_html_report() {
		//used for generating html report
		element.generateHtml_btn.click();
	}

	@When("user click on users_lnk")
	public void user_click_on_users_lnk() throws InterruptedException {
		Thread.sleep(2000);
		//clicks on user link
		element.ClickUser_lnk();
	}

	@Then("user able to view {string} page")
	public void user_able_to_view_page(String string) {
//validate user page is displayed or not
		element.Valiadte_userPage();
	}

	@When("user clicks on newUser")
	public void user_clicks_on_new_user() throws Exception {
Thread.sleep(2000);
///clicks on new user link
element.New_user_lnk.click();
	}

	@When("user enters data {string} and {string} and {string}")
	public void user_enters_data_and_and(String FName_txt, String LName_txt, String Email_txt) throws Exception {
// enter new user data first name,last name,email
		Thread.sleep(6000);
		element.EnterNewUserData(FName_txt, LName_txt, Email_txt);
	}

	@Then("user clicks on send invitation_btn")
	public void user_clicks_on_send_invitation_btn() throws Exception {
		Thread.sleep(2000);
		//clicks on send invite link
element.save_sendInvit_lnk.click();
	}

	@Then("user clicks on close_btn")
	public void user_clicks_on_close_btn() throws Exception {
Thread.sleep(2000);
//clicks on close button
element.Close_btn.click();
	}

	@When("user click on TimeTrack_lnk")
	public void user_click_on_time_track_lnk() throws Exception {
		Thread.sleep(2000);
		//clicks on Time-track link
element.clickTimeTrack_lnk();
	}

	@When("user click on switch on slider_btn")
	public void user_click_on_switch_on_slider_btn() {
		//user switch on slider button
element.Slider_on();
	}

	@When("user clicks on save changes_btn")
	public void user_clicks_on_save_changes_btn() {
		//click on save changes
element.ClickSaveChanges_btn();
	}

	@Then("user able to save changes")
	public void user_able_to_save_changes() throws Exception {
		Thread.sleep(2000);
element.clickTotalsaveChange_btn();
//validate save changes or happened or not
element.ValiadteSaveChanges();
	}

	@When("user clicks on cancel_btn")
	public void user_clicks_on_cancel_btn() throws Exception {
		Thread.sleep(2000);
		//clicks on cancel for changes done
element.ClickCancelSaveChanges();
	}

	@Then("user unable to save changes")
	public void user_unable_to_save_changes() throws Exception {
		Thread.sleep(2000);
		//handle alert pop-up after cancel changes
		element.handlealert();
	}

	@When("user click on Task_lnk")
	public void user_click_on_task_lnk() throws Exception {
		//click on task link
		Thread.sleep(2000);
element.clickTask_lnk();
	}
	@Then("user able to view the{string}")
	public void user_able_to_view_the(String text) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("validate string");
		//validate "Customers & Projects" is displayed or not
		element.Validate_CustomerPage();
	}
	
	@Then("user clicks on searchBox")
	public void user_clicks_on_search_box() throws Exception {
		Thread.sleep(2000);
		//click on search box in task link
element.Searchfun_box.click();
	}

	@Then("user enter searchData")
	public void user_enter_search_data() {
		//enter text for searching
element.EnterSearchdata();
	}
	@Then("user enter Invalid searchData")
	public void user_enter_Invalid_search_data() throws Exception {
		//enter text for searching
		Thread.sleep(2000);
element.EnterInvalidSearchdata();;
	}

	@Then("user able find search related Data")
	public void user_able_find_search_related_data() {
System.out.println("user able to enter test data");
	}

	@Then("user Validate logo")
	public void user_validate_logo() throws Exception {
		Thread.sleep(5000);
		//used for verify logo is present or not
element.ValidateLogo();
	}

	@When("user clicks on setting_lnk")
	public void user_clicks_on_setting_lnk() throws Exception {
		Thread.sleep(3000);
		//Click on settings
element.settings_lnk.click();
	}

	@When("user clicks on Notification_lnk")
	public void user_clicks_on_notification_lnk() {
		//click on notification
element.ClickNotification();
	}

	@Then("user Navigates Back to home")
	public void user_navigates_back_to_home() throws Exception {
		Thread.sleep(3000);
		//close notification and back to home
		element.BacktoHome();

	}

	@When("user clicks on profile")
	public void user_clicks_on_profile() throws Exception {
		Thread.sleep(3000);
		//click on profile
element.clickOnProfile();
	}
@Then("user able to view MyProfile {string}")
public void user_able_to_view_MyProfile(String message) throws Exception {
	Thread.sleep(3000);
	//validate profile is opened or not
	element.ValidateProfilePage();
}
	@Then("user close the profile")
	public void user_close_the_profile() throws Exception {
		Thread.sleep(3000);
		//close the profile page
element.CloseProfile();
	}

	@When("user clicks on logout")
	public void user_clicks_on_logout() throws Exception {
Thread.sleep(5000);
//user log out from application
element.Logout();
	}

	@Then("user able to logout")
	public void user_able_to_logout() {
System.out.println("user is log out from application");
	}

}
