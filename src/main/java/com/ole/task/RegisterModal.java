package com.ole.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegisterModal {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.REGISTER_BUTTON)
	private WebElement register_button;
	@FindBy(id = Constants.NAME_FIELD)
	private WebElement name_field;
	@FindBy(id = Constants.SURNAME_FIELD)
	private WebElement surname_field;
	@FindBy(xpath = Constants.DAY) 
	private WebElement day;
	@FindBy(xpath = Constants.MONTH)
	private WebElement month;
	@FindBy(xpath = Constants.YEAR)
	private WebElement year;
	@FindBy(xpath = Constants.SELECT_DAY)
	private WebElement select_day;
	@FindBy(xpath = Constants.SELECT_MONTH)
	private WebElement select_month;
	@FindBy(xpath = Constants.SELECT_YEAR)
	private WebElement select_year;
	@FindBy(xpath = Constants.COUNTRY)
	private WebElement country;
	@FindBy(id = Constants.ADDRESS_1)
	private WebElement address_1;
	@FindBy(id = Constants.CITY)
	private WebElement city;
	@FindBy(id = Constants.STATE)
	private WebElement state;
	@FindBy(id = Constants.POSTCODE)
	private WebElement postcode;
	@FindBy(id = Constants.EMAIL)
	private WebElement email;
	@FindBy(xpath = Constants.PHONE_REGION)
	private WebElement phone_region;
	@FindBy(id = Constants.PHONE)
	private WebElement phone;
	@FindBy(id = Constants.NICKNAME)
	private WebElement nickname;
	@FindBy(id = Constants.PASSWORD)
	private WebElement password;
	@FindBy(id = Constants.CONFIRM_PASSWORD)
	private WebElement confirm_password;
	@FindBy(id = Constants.ANSWER)
	private WebElement answer;
	@FindBy(xpath = Constants.TIMEZONE)
	private WebElement timezone;
	@FindBy(xpath = Constants.CURRENCY)
	private WebElement currency;
	@FindBy(xpath = Constants.USD)
	private WebElement usd;
	@FindBy(xpath = Constants.REGISTER)
	private WebElement register;
	@FindBy(xpath = Constants.PHONE_REGION_SELECT_BOX)
	private WebElement phone_region_select_box;
	@FindBy(xpath = Constants.QUESTION)
	private WebElement question;
	@FindBy(xpath = Constants.CHOOSE_QUESTION)
	private WebElement choose_question;
	@FindBy(xpath = Constants.ODDS)
	private WebElement odds;
	@FindBy(xpath = Constants.CHOOSE_ODDS)
	private WebElement choose_odds;
	@FindBy(xpath = Constants.CHECKBOX)
	private WebElement checkbox;
	@FindBy(xpath = Constants.CHOOSE_COUNTRY)
	private WebElement choose_country;
	@FindBy(xpath = Constants.CHOOSE_TIMEZONE)
	private WebElement choose_timezone;
	

	public  RegisterModal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void registeruser() throws InterruptedException {
		String psw = "123456";
		
		register_button.click();
		name_field.click();
		name_field.sendKeys("TEST1");
		surname_field.click();
		surname_field.sendKeys("TEST2");
		day.click();
		select_day.click();
		month.click();
		select_month.click();
		year.click();
		select_year.click();
		country.click();
		choose_country.click();
		address_1.click();
		address_1.sendKeys("test address 22");
		city.click();
		city.sendKeys("Yerevan");
		state.click();
		state.sendKeys("MX");
		postcode.click();
		postcode.sendKeys("11000");
		email.click();
		email.sendKeys("test1@mailinator.com");
		phone_region_select_box.click();
		phone_region.click();
		phone.click();
		phone.sendKeys("99442255");
		nickname.click();
		nickname.sendKeys("test1");
		password.click();
		password.sendKeys(psw);
		confirm_password.click();
		confirm_password.sendKeys(psw);
		question.click();
		choose_question.click();
		answer.click();
		answer.sendKeys("12");
		timezone.click();
		choose_timezone.click();
		odds.click();
		choose_odds.click();
		currency.click();
		usd.click();
		checkbox.click();
		register.click();
		
		
		
		
		
		
		
	}
	
	

}
