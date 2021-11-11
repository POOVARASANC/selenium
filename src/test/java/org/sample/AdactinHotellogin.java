package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotellogin extends BaseClass {
	
	public AdactinHotellogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement UserName;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(id="login")
	private WebElement Login;
	
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin() {
		return Login;
	}
	

}
