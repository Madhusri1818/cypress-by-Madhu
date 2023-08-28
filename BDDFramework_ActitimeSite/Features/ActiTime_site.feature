Feature: Check All Modules Functionality
  As a new user 
  I want to logged in to app and check the Functions

  Background: 
    Given User Launch Browser as per req

  @tag1
  Scenario: user verify the Reports_lnk Fun
    Given user Launch URL
    And user enters logindetails
    When user click on report_lnk
    Then user able to view "Reports Dashboard"
    And user clicks on logout

  @tag13
  Scenario: user verify the performance_Report generation in Reports_lnk Fun
    Given user Launch URL
    And user enters logindetails
    When user click on report_lnk
   
    When user click newreport_lnk
    And user click on staff performance under TimeReports
    And user click on configure Report Parameters
    Then user on "Create Staff Performance Report" page
    And user clicks on Generate Html report
    And user clicks on logout

  @tag1
  Scenario: user verify the Users_lnk Fun
    Given user Launch URL
    And user enters logindetails
    When user click on users_lnk
    Then user able to view "List of Users" page
    And user clicks on logout

  @tag3
  Scenario: user verify the user can send invitation in Users_lnk Fun
    Given user Launch URL
     And user enters logindetails
    When user click on users_lnk
    And user clicks on newUser
    And user enters data "Madhu" and "sri" and "Madhu@gmail.com"
    Then user clicks on send invitation_btn
    And user clicks on close_btn
    And user clicks on logout

  @tag4
  Scenario: user verify the Timetrack_lnk Fun
    Given user Launch URL
    And user enters logindetails
    When user click on TimeTrack_lnk
    And user click on switch on slider_btn
    And user clicks on save changes_btn
    Then user able to save changes
    And user clicks on logout

  @tag1
  Scenario: user verify the Timetrack_lnk and cancel the Fun
    Given user Launch URL
    And user enters logindetails
    When user click on TimeTrack_lnk
    And user click on switch on slider_btn
    And user clicks on cancel_btn
    Then user unable to save changes
    And user clicks on logout

  @tag6
  Scenario: user verify the Task_lnk Fun
    Given user Launch URL
    And user enters logindetails
    When user click on Task_lnk
    Then user able to view the"Customers & Projects"
    And user clicks on logout

  @tag7
  Scenario: user verify the Task_lnk search Fun
    Given user Launch URL
    And user enters logindetails
    When user click on Task_lnk
   
    And user clicks on searchBox
    And user enter searchData
    Then user able find search related Data
    And user clicks on logout
    @tag8
  Scenario: user verify the Task_lnk search Fun
    Given user Launch URL
    And user enters logindetails
    When user click on Task_lnk
   
    And user clicks on searchBox
    And user enter Invalid searchData
    Then user able find search related Data
    And user clicks on logout

  @tag9
  Scenario: user verify logo
    Given user Launch URL
    And user enters logindetails
    Then user Validate logo
    And user clicks on logout

  @tag10
  Scenario: user checks the Notification
    Given user Launch URL
    And user enters logindetails
    When user clicks on setting_lnk
    And user clicks on Notification_lnk
    Then user able to view "Email Notifications"
    And user Navigates Back to home
    And user clicks on logout

  @tag11
  Scenario: user checks Profile
    Given user Launch URL
    And user enters logindetails
    When user clicks on profile
    Then user able to view MyProfile "My Profile"
    And user close the profile
    And user clicks on logout

  @tag12
  Scenario: user Logout From the App
    Given user Launch URL
    And user enters logindetails
    When user clicks on logout
    Then user able to logout
    
   
    
    