package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {

	WebDriver driver;

	public Pom_Class(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath="//input[@type='tel']")
	public WebElement mobileNumber;
	@FindBy(xpath="//span[text()='Send Institute Verification Code']")
	public WebElement Vcode;
	@FindBy(xpath = "//button[text()='Auto-Fill Demo']")
	public WebElement Autofill;
	@FindBy(xpath = "//input[@id='institute-manager-mobile-number']")
	public WebElement Vmobilenumber;
	@FindBy(xpath = "//span[text()='Send Institute Verification Code']")
	public WebElement verificationcode;
	@FindBy(xpath = "//button[text()='Auto-Fill OTP (123456)']")
	public WebElement AutofillOTP;
	@FindBy(xpath = "//span[text()='Verify & Enter Merchant Studio']")
	public WebElement verifyEnter;
    @FindBy(xpath="//h1[text()='My Institute']")
    public WebElement VmyInsitute;
    @FindBy(xpath="//span[text()='approved']")
    public WebElement approved;
    @FindBy(xpath="//span[text()='Create Course']")
    public WebElement createcourse;
    @FindBy(xpath="//span[text()='Add Batch']")
    public WebElement Addbatch;
    @FindBy(xpath="//span[text()='Total Revenue']")
    public WebElement TotalRevenue;
    @FindBy(xpath="//h1[text()='Course Studio']")
    public WebElement Vcorsestudio;
    @FindBy(xpath="//span[text()='Batches & Attendance']")
    public WebElement Vbatchesandattendance;
    @FindBy(xpath="//span[text()='Student Enrollments']")
    public WebElement Vstudententrollment;
    @FindBy(xpath="//span[text()='Published Courses']")
    public WebElement Vpublishedcrouse;
    @FindBy(xpath="//span[text()='Cohort Batches']")
    public WebElement Vcohortbatch;
    @FindBy(xpath="//span[text()='Course Studio']")
    public WebElement Coursestudiomodule; 
    @FindBy(xpath="//*[@class='overflow-x-auto']")
    public WebElement Vcs; 
    @FindBy(xpath="//span[text()='New Course Program']")
    public WebElement Newcoursebutton;
    @FindBy(xpath="//h3[text()='Create New Course Program']")
    public WebElement Vcreatenewcourse; 
    @FindBy(xpath="//input[@id='course-title']")
    public WebElement Training;
    @FindBy(xpath="//select[@id='discipline-/-category']")
    public WebElement Disciplinecategory; 
    @FindBy(xpath="//textarea[@id='course-overview-&-learning-outcomes']")
    public WebElement courseoverview;
    @FindBy(xpath="//span[text()='Add Module']")
    public WebElement Addmodule; 
    @FindBy(xpath="//span[text()='Publish Course']")
    public WebElement Publishcourse; 
    @FindBy(xpath="//h3[text()='Create New Course Program']")
    public WebElement Veditcreatenewcourse; 
    @FindBy(xpath="//button[@title='Edit Course']")
    public WebElement Editicon; 
    @FindBy(xpath="//input[@id='course-title']")
    public WebElement Vedittraining;
    @FindBy(xpath="//span[text()='Save Changes']")
    public WebElement savechange;
    @FindBy(xpath="//button[@title='Delete Course']")
    public WebElement deleteicon; 
    @FindBy(xpath="//span[text()='Yes, Delete Course']")
    public WebElement yesdeletecourse;
    @FindBy(xpath="//span[text()='Batches & Attendance']")
    public WebElement batchesattendance;
    @FindBy(xpath="//h1[text()='Batches & Attendance']")
    public WebElement Vbatchesattendance; 
    @FindBy(xpath="//div[@class='overflow-x-auto']")
    public WebElement Vba; 
    @FindBy(xpath="//span[text()='Create Cohort Batch']")
    public WebElement createcohortbatch;
    @FindBy(xpath="//h3[text()='Schedule New Cohort Batch']")
    public WebElement Vnewcohortbatch; 
    @FindBy(xpath="//span[text()='Generate Sessions & Schedule']")
    public WebElement generatesession;
    @FindBy(xpath="//span[text()='Roster Matrix']")
    public WebElement rostermatrix;
    @FindBy(xpath="//button[@aria-label='Close modal']")
    public WebElement cancleicon;
    @FindBy(xpath="//span[text()='Coupons & Promos']")
    public WebElement couponandpromos; 
    @FindBy(xpath="//h1[text()='Coupons & Promotions']")
    public WebElement Vcouponsandpromotion;
    @FindBy(xpath="//div[@class='overflow-x-auto']")
    public WebElement Vcp;
    @FindBy(xpath="//span[text()='Copy']")
    public WebElement copy; 
    @FindBy(xpath="//span[text()='Create Coupon']")
    public WebElement createcoupon; 
    @FindBy(xpath="//input[@id='coupon-code']")
    public WebElement Training20;
    @FindBy(xpath="//span[text()='Submit for Approval']")
    public WebElement submitforapproval; 
    @FindBy(xpath="//span[text()='Certificates & Approvals']")
    public WebElement certificatesandapprovals;
    @FindBy(xpath="//h1[text()='Certificates & Approvals']")
    public WebElement Vca;
    @FindBy(xpath="//div[@class='overflow-x-auto']")
    public WebElement Vpendingapproval;
    @FindBy(xpath="//span[text()='Sign & Approve']")
    public WebElement singnandapprove;
    @FindBy(xpath="//span[text()='Reject']")
    public WebElement Reject;
    @FindBy(xpath="//span[text()='Templates Studio']")
    public WebElement templatestudio;
    @FindBy(xpath="//span[text()='New Template']")
    public WebElement newtemplate;
    @FindBy(xpath="//h3[text()='Create Certificate Template']")
    public WebElement Vcreatecertificatetemplate;
    @FindBy(xpath="//span[text()='Save Template']")
    public WebElement savetemplate;
    @FindBy(xpath="//div[@class='overflow-x-auto']")
    public WebElement Vtemplatestudio;
    @FindBy(xpath="//span[text()='Funnel Insights']")
    public WebElement funnelinsights; 
    @FindBy(xpath="//h1[text()='Learner Retention & Funnel Insights']")
    public WebElement VLearnerRetentionFunnelinsights;
    @FindBy(xpath="//h2[@class='text-lg font-bold text-ink dark:text-dark-ink flex items-center gap-2']")
    public WebElement VTopPerformingPrograms;
    @FindBy(xpath="//div[@class='grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6']")
    public WebElement VTp; 
    @FindBy(xpath="//button[@title='Sign out']")
    public WebElement signout;
  
} 