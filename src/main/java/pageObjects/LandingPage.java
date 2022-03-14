package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By Applicationtype = By.xpath("//label[@for='application_type_single']");
	By Numberofdependants = By.xpath("//select[@title='Number of dependants']");
	By Propertyyouwouldliketobuy = By.xpath("//label[@for='borrow_type_home']");
	By Yourannualincome = By.xpath("//input[@aria-labelledby='q2q1']");
	By Yourannualotherincometype = By.xpath("//input[@aria-labelledby='q2q2']");
	By Monthlylivingexpenses = By.cssSelector("#expenses");
	By Currenthomeloanmonthlyrepayments = By.cssSelector("#homeloans");
	By Otherloanmonthlyrepayments = By.xpath("//input[@aria-labelledby='q3q3']");
	By Othermonthlycommitments = By.xpath("//input[@aria-labelledby='q3q4']");
	By Totalcreditcardlimits = By.cssSelector("#credit");
	By BorrowCalculater_btn = By.cssSelector("#btnBorrowCalculater");
	By BorrowEstimate = By.cssSelector("#borrowResultTextAmount");
	By BorrowErrorText = By.cssSelector(".borrow__error__text");
	By Startover_btn = By.xpath("//button[@aria-label='Start over']");

	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getApplicationtype() {
		return driver.findElement(Applicationtype);
	}

	public WebElement getNumberofdependants() {
		return driver.findElement(Numberofdependants);
	}

	public WebElement getPropertyyouwouldliketobuy() {
		return driver.findElement(Propertyyouwouldliketobuy);
	}

	public WebElement getYourannualincome() {
		return driver.findElement(Yourannualincome);
	}

	public WebElement getYourannualotherincometype() {
		return driver.findElement(Yourannualotherincometype);
	}

	public WebElement getMonthlylivingexpenses() {
		return driver.findElement(Monthlylivingexpenses);
	}

	public WebElement getOtherloanmonthlyrepayments() {
		return driver.findElement(Otherloanmonthlyrepayments);
	}

	public WebElement getOthermonthlycommitments() {
		return driver.findElement(Othermonthlycommitments);
	}

	public WebElement getTotalcreditcardlimits() {
		return driver.findElement(Totalcreditcardlimits);
	}

	public WebElement getCurrenthomeloanmonthlyrepayments() {
		return driver.findElement(Currenthomeloanmonthlyrepayments);
	}

	public WebElement getBorrowCalculater_btn() {
		return driver.findElement(BorrowCalculater_btn);
	}

	public WebElement getBorrowEstimate() {
		return driver.findElement(BorrowEstimate);
	}

	public WebElement getBorrowErrorText() {
		return driver.findElement(BorrowErrorText);
	}

	public List<WebElement> getStartover_btn() {
		return driver.findElements(Startover_btn);
	}

}
