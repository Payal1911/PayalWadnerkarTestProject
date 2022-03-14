package stepDefinations;

import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.base;

public class stepDefination extends base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver =initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String Url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(Url);
	}
	
	@Given("^Select Application type as \"([^\"]*)\"$")
	public void select_Application_type_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getApplicationtype().click();
	}

	@Given("^Select Number of dependants as \"([^\"]*)\"$")
	public void select_Number_of_dependants_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		Select s=new Select(l.getNumberofdependants());
		s.selectByVisibleText(arg1);
	}

	@Given("^Select Property you would like to buy as \"([^\"]*)\"$")
	public void select_Property_you_would_like_to_buy_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getPropertyyouwouldliketobuy().click();
	}

	@Given("^Enter Your annual income \"([^\"]*)\"$")
	public void enter_Your_annual_income(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getYourannualincome().sendKeys(arg1);
	}

	@Given("^Enter Your annual other income \"([^\"]*)\"$")
	public void enter_Your_annual_other_income(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getYourannualotherincometype().sendKeys(arg1);
	}

	@Given("^Enter Monthly living expenses \"([^\"]*)\"$")
	public void enter_Monthly_living_expenses(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getMonthlylivingexpenses().sendKeys(arg1);
	}

	@Given("^Enter Current home loan monthly repayments \"([^\"]*)\"$")
	public void enter_Current_home_loan_monthly_repayments(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getCurrenthomeloanmonthlyrepayments().sendKeys(arg1);
	}

	@Given("^Enter Other loan monthly repayments \"([^\"]*)\"$")
	public void enter_Other_loan_monthly_repayments(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getOtherloanmonthlyrepayments().sendKeys(arg1);
	}

	@Given("^Enter Other monthly commitments \"([^\"]*)\"$")
	public void enter_Other_monthly_commitments(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getOthermonthlycommitments().sendKeys(arg1);
	}

	@Given("^Total credit card limits \"([^\"]*)\"$")
	public void total_credit_card_limits(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getTotalcreditcardlimits().sendKeys(arg1);
	}

	@Given("^Click on Borrow calculator$")
	public void click_on_Borrow_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getBorrowCalculater_btn().click();
	}

	@Then("^Verify borrowing estimate is \"([^\"]*)\"$")
	public void verify_borrowing_estimate_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		Thread.sleep(3000);
		Assert.assertEquals(l.getBorrowEstimate().getText(), arg1);
	}

	@Then("^Verify error message is displayed$")
	public void verify_error_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		String s="Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
		Assert.assertEquals(l.getBorrowErrorText().getText(), s);
	}

	@When("^user click on start over button$")
	public void user_click_on_start_over_button(){
	   
		LandingPage l=new LandingPage(driver);
		l.getStartover_btn().get(0).click();;
	}

	@Then("^Verify clicking the start over button clears the form$")
	public void Verify_clicking_the_start_over_button_clears_the_form(){
	    
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getApplicationtype().getText(),"Single");
		Select s=new Select(l.getNumberofdependants());
		Assert.assertEquals(s.getFirstSelectedOption().getText(),"0");
		Assert.assertEquals(l.getPropertyyouwouldliketobuy().getText(),"Home to live in");
		Assert.assertEquals(l.getYourannualincome().getAttribute("value"),"0");
		Assert.assertEquals(l.getYourannualotherincometype().getAttribute("value"),"0");
		Assert.assertEquals(l.getMonthlylivingexpenses().getAttribute("value"),"0");
		Assert.assertEquals(l.getCurrenthomeloanmonthlyrepayments().getAttribute("value"),"0");
		Assert.assertEquals(l.getOtherloanmonthlyrepayments().getAttribute("value"),"0");
		Assert.assertEquals(l.getOthermonthlycommitments().getAttribute("value"),"0");
		Assert.assertEquals(l.getTotalcreditcardlimits().getAttribute("value"),"0");
		
	}

	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }
	


}
