package com.Step_Definition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Pom_Class.Pom_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	
	Pom_Class V = new Pom_Class(driver);
	
	@Given("User validate the Sign in Page")
	public void user_validate_the_sign_in_page() {
	    Assert.assertTrue(Url().contains("merchant"));
	}
	@When("User Enter Institute Manager Mobile Number {string}")
	public void user_enter_institute_manager_mobile_number(String value) throws InterruptedException {  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(V.mobileNumber));
		Sendkeys(V.mobileNumber, value);
		
	}

	@When("User clicks on Vcode")
	public void user_clicks_on_vcode() throws InterruptedException {  
		click(V.Vcode);
	}



	@When("User clicks on Autofill button")
	public void user_clicks_on_autofill_button() {
	   click(V.Autofill); 
	}

	
	@Then("User clicks on Send verification code")
	public void user_clicks_on_send_verification_code() {
		click(V.verificationcode);
	}

	@Then("User clicks on Autofill OTP button")
	public void user_clicks_on_autofill_otp_button() {
	   click(V.AutofillOTP);
	   
	}

	@Then("User clicks on verify and Enter merchant studio")
	public void user_clicks_on_verify_and_enter_merchant_studio() {
	   click(V.verifyEnter);
	   
	}

	@Given("User is on the my institute page")
	public void user_is_on_the_my_institute_page() {
		 Assert.assertTrue(Url().contains("merchant"));
	}
	
	

	@When("User clicks on Create Course button")
	public void user_clicks_on_create_course_button() {
	   click(V.createcourse);
	}

	@Then("User validate to Course studio page")
	public void user_validate_to_course_studio_page()  {
	   Assert.assertTrue(V.Vcorsestudio.isDisplayed());
	   back();
	}

	@When("User clicks on Add Batch button")
	public void user_clicks_on_add_batch_button() {
	   click(V.Addbatch);
	}

	@Then("User validate to Batches & Attendance page")
	public void user_validate_to_batches_attendance_page() {
		Assert.assertTrue(V.Vbatchesandattendance.isDisplayed());
	    back();
	}

	@Then("User validate the Total Revenue")
	public void user_validate_the_total_revenue() {
		 Assert.assertTrue(V.TotalRevenue.isDisplayed());
	}

	@Then("user validate the Student Entrollement")
	public void user_validate_the_student_entrollement() {
		Assert.assertTrue(V.Vstudententrollment.isDisplayed());
	}

	@Then("User validate the Published Courses")
	public void user_validate_the_published_courses() {
		Assert.assertTrue(V.Vpublishedcrouse.isDisplayed());
	}

	@Then("User validate the Cohort Batches")
	public void user_validate_the_cohort_batches() {
		Assert.assertTrue(V.Vcohortbatch.isDisplayed());
	}

	//@Then("User validate the Operational Recommendations")
	//public void user_validate_the_operational_recommendations() {
	
	
	@Given("User clicks on course studio module")
	public void user_clicks_on_course_studio_module() {
	      click(V.Coursestudiomodule);
	}
	@Then("User validate the Course studio")
	public void user_validate_the_course_studio() {
		 Assert.assertTrue(V.Vcorsestudio.isDisplayed());
	}

	@Then("user course details in CS")
	public void user_course_details_in_cs() {
		 Assert.assertTrue(V.Vcs.isDisplayed());
	}

	@Then("User clicks on New course program")
	public void user_clicks_on_new_course_program() {
	     click(V.Newcoursebutton);
	}

	@Then("User validate Create New Course Program")
	public void user_validate_create_new_course_program() {
		 Assert.assertTrue(V.Vcreatenewcourse.isDisplayed());
	}

	@Then("User Enters Course Title {string}")
	public void user_enters_course_title(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(V.Training));
		Sendkeys(V.Training, string);
	}

	@Then("User select Discipline \\/ Category")
	public void user_select_discipline_category() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(V.Disciplinecategory));
		Select select = new Select(dropdown);
		select.selectByContainsVisibleText("Business");
	}
	@Then("User Enters Course Overview {string}")
	public void user_enters_course_overview(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(V.courseoverview));
		Sendkeys(V.courseoverview, string);	
	}
	@Then("User clicks on Add Module")
	public void user_clicks_on_add_module() {
	     click(V.Addmodule);
	}
	@Then("User clicks on Publish course")
	public void user_clicks_on_publish_course() {
	     click(V.Publishcourse);
	}
	@Then("User validate the created new course")
	public void user_validate_the_created_new_course() {
		 Assert.assertTrue(V.Veditcreatenewcourse.isDisplayed()); 
	}
	@Then("User clicks on Edit icon")
	public void user_clicks_on_edit_icon() {
	   click(V.Editicon);
	}
	@Then("User validate Edit training")
	public void user_validate_edit_training() {
		 Assert.assertTrue(V.Vedittraining.isDisplayed()); 
	}
	@Then("User clicks on Savechange")
	public void user_clicks_on_savechange() {
         click(V.savechange);	   
	}

	@Then("User clicks on Delete icon")
	public void user_clicks_on_delete_icon() {
	   click(V.deleteicon);
	}
	@Then("User clicks on yes delete course")
	public void user_clicks_on_yes_delete_course() {
         click(V.yesdeletecourse);
}
	@Given("User clicks on Batches & Attendance module")
	public void user_clicks_on_batches_attendance_module() {
	    click(V.batchesattendance);
	}

	@Then("User validate the Batches & Attendance")
	public void user_validate_the_batches_attendance() {
		 Assert.assertTrue(V.Vbatchesattendance.isDisplayed()); 
	}

	@Then("User Batches & Attendance details in B&D")
	public void user_batches_attendance_details_in_b_d() {
		 Assert.assertTrue(V.Vba.isDisplayed());
	}

	@Then("User clicks on create cohort Batch")
	public void user_clicks_on_create_cohort_batch() {
	   click(V.createcohortbatch);
	}

	@Then("User validate Schedule New Cohort Batch")
	public void user_validate_schedule_new_cohort_batch() {
		 Assert.assertTrue(V.Vnewcohortbatch.isDisplayed());
	}

	@Then("User clicks on Generate sessions")
	public void user_clicks_on_generate_sessions() {
	    click(V.generatesession);
	}

	@Then("User clicks on Roster  Matrix")
	public void user_clicks_on_roster_matrix() {
	   click(V.rostermatrix);
	}

	@Then("User clicks on cancle icon")
	public void user_clicks_on_cancle_icon() {
		click(V.cancleicon);
	}
	
	@Given("user clicks on Coupons & Promotions")
	public void user_clicks_on_coupons_promotions() {
	   click(V.couponandpromos);
	}

	@Then("User validate the Coupons & Promotions")
	public void user_validate_the_coupons_promotions() {
		 Assert.assertTrue(V.Vcouponsandpromotion.isDisplayed());
	}

	@Then("User Coupons & Promotions details in c&p")
	public void user_coupons_promotions_details_in_c_p() {
		 Assert.assertTrue(V.Vcp.isDisplayed());
	}

	@Then("User clicks on copy button")
	public void user_clicks_on_copy_button() {
	    click(V.copy);
	}

	@Then("User clicks on create coupon")
	public void user_clicks_on_create_coupon() {
	   click(V.createcoupon);
	}

	@Then("user Enters Coupon Code {string}")
	public void user_enters_coupon_code(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(V.Training20));
		Sendkeys(V.Training20, string);
	}

	@Then("User clicks on submit for approval")
	public void user_clicks_on_submit_for_approval() {
	   click(V.submitforapproval);
	}

	@Given("User clicks on Certificates & Approvals")
	public void user_clicks_on_certificates_approvals() {
	    click(V.certificatesandapprovals);
	}

	@Then("User validate the Certificates & Approvals")
	public void user_validate_the_certificates_approvals() {
		 Assert.assertTrue(V.Vca.isDisplayed());
	}

	@Then("User validate the pending approvals")
	public void user_validate_the_pending_approvals() {
		 Assert.assertTrue(V.Vpendingapproval.isDisplayed());
	}

	@Then("user clicks on sign&approve button")
	public void user_clicks_on_sign_approve_button() {
	    click(V.singnandapprove);
	}

	@Then("user clicks on Reject button")
	public void user_clicks_on_reject_button() {
	   click(V.Reject);
	}

	@Then("user clicks on Templaet studio")
	public void user_clicks_on_templaet_studio() {
	   click(V.templatestudio);
	}

	@Then("user validate the TS")
	public void user_validate_the_ts() {
	   click(V.templatestudio);
	}

	@Then("User clicks on new template button")
	public void user_clicks_on_new_template_button() {
		click(V.newtemplate);
	}

	@Then("User validate the Create Certificate Template")
	public void user_validate_the_create_certificate_template() {
		Assert.assertTrue(V.Vcreatecertificatetemplate.isDisplayed());
	}

	@Then("user clicks on Save template")
	public void user_clicks_on_save_template() {
		 click(V.savetemplate);
	}

	@Then("User validate the template studio")
	public void user_validate_the_template_studio() {
		Assert.assertTrue(V.Vtemplatestudio.isDisplayed());
	}

	@Given("User clicks on Funnel Insights")
	public void user_clicks_on_funnel_insights() {
	    click(V.funnelinsights);
	}

	@Then("User validate the Learner Retention & Funnel Insights")
	public void user_validate_the_learner_retention_funnel_insights() {
		Assert.assertTrue(V.VLearnerRetentionFunnelinsights.isDisplayed());
	}

	@Then("User validate Top Performing Programs")
	public void user_validate_top_performing_programs() {
		Assert.assertTrue(V.VTopPerformingPrograms.isDisplayed());
	}

	@Then("User validate TP")
	public void user_validate_tp() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(V.VTp));
		Assert.assertTrue(V.VTp.isDisplayed());
	}

	@Given("User clicks on signout icon")
	public void user_clicks_on_signout_icon() {
		click(V.signout);
	}
	@When("user enter Faculty Name {string}")
	public void user_enter_faculty_name(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(V.arul));
		Sendkeys(V.arul, string);
	}

	@Then("User validate Faild to send OTP")
	public void user_validate_faild_to_send_otp() {
		Assert.assertTrue(V.Vfaildsendotp.isDisplayed());
	}
	@Given("user click on merchant module")
	public void user_click_on_merchant_module() {
		click(V.Merchantmodule);
	}
	
}	


	







