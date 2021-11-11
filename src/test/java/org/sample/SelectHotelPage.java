package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement RadioButton;

	@FindBy(id = "continue")
	private WebElement Continue1;

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getContinue1() {
		return Continue1;
	}
	
	

}
