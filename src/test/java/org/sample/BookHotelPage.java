package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement Address;

	@FindBy(id = "cc_num")
	private WebElement creditCardNo;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNo;

	@FindBy(id = "book_now")
	private WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCVVNo() {
		return cvvNo;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

}
