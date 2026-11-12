Feature: To Launch the Chrome

Scenario Outline: To Launch the Corzaar Website
    Given User validate the Sign in Page
    When User Enter Institute Manager Mobile Number "<mobilenumber>"
    And User clicks on Vcode
    And User clicks on Autofill button
    And User clicks on Send verification code
    And User clicks on Autofill OTP button
    And User clicks on verify and Enter merchant studio

    Examples:
      |mobilenumber|
      |@#$&        |
     # |arul        |
     # |9876543     |
     
Scenario: verify Overview module
    Given User is on the my institute page
    When User clicks on Create Course button 
    Then User validate to Course studio page 
    When User clicks on Add Batch button 
    Then User validate to Batches & Attendance page 
    And User validate the Total Revenue  
    And user validate the Student Entrollement 
    And User validate the Published Courses
    And User validate the Cohort Batches
    And User validate the Operational Recommendations
   
Scenario: verify Create course module
    Given User clicks on course studio module 
    Then User validate the Course studio 
    And user course details in CS 
    And User clicks on New course program 
    Then User validate Create New Course Program 
    And User Enters Course Title "Training"
    And User select Discipline / Category
    And User Enters Course Overview "yy" 
    And User clicks on Add Module 
    And User clicks on Publish course
    Then User validate the created new course 
    And User clicks on Edit icon
    Then User validate Edit training 
    And User Enters Course Title "Training1"
    And User clicks on Savechange 
    And User clicks on Delete icon
    And User clicks on yes delete course

Scenario: verify Create Batches & Attendance module 
     Given User clicks on Batches & Attendance module 
     Then User validate the Batches & Attendance 
     And User Batches & Attendance details in B&D 
     And User clicks on create cohort Batch
     Then User validate Schedule New Cohort Batch 
     And User clicks on Generate sessions 
     And User clicks on Roster  Matrix
     And User clicks on cancle icon

Scenario: verify Create Coupons & Promotions module  
     Given user clicks on Coupons & Promotions
     Then User validate the Coupons & Promotions
     And User Coupons & Promotions details in c&p 
     And User clicks on copy button 
     And User clicks on create coupon 
     And user Enters Coupon Code "Training20"
     And User clicks on submit for approval 
     
Scenario: verify Certificates & Approvals module 
     Given User clicks on Certificates & Approvals
     Then User validate the Certificates & Approvals
     Then User validate the pending approvals 
     And user clicks on sign&approve button 
     And user clicks on Reject button 
     And user clicks on Templaet studio 
     Then user validate the TS 
     And User clicks on new template button 
     Then User validate the Create Certificate Template 
     And user clicks on Save template 
     Then User validate the template studio 
     
Scenario: verify Funnel Insights module  
     Given 
