package org.sample;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinFullPage extends BaseClass {
	
	@BeforeClass
	public static void browser()  {
		
		browserlaunch("https://adactinhotelapp.com/");
		String gettingCurrentUrl = gettingCurrentUrl();
		boolean contains = gettingCurrentUrl.contains("adactin");
		Assert.assertTrue(contains);
		System.out.println("poovarasan");
	}
	
	@Before
	public void timeBeforeCredentials() {
		
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@Test
	public void tc1() throws IOException {
		AdactinHotellogin a = new AdactinHotellogin();
		//Enter UserName
		WebElement userName = a.getUserName();
		String txtUserName = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 0);
		enterText(userName, txtUserName);
		//Enter Password
		WebElement password = a.getPassword();
		String txtpassword = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 1);
		enterText(password, txtpassword);
		//Click Login
		WebElement login = a.getLogin();
		buttonClick(login);
	}
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		
		SearchHotelPage b = new SearchHotelPage();
		//Select Location
		WebElement location = b.getLocation();
		String selectLocation = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 2);
		int parseInt = parseInt(selectLocation);
		selectByIndex(location, parseInt);
		
		//Select Hotels
		WebElement hotels = b.getHotels();
		String selectHotels = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 3);
		int parseInt2 = parseInt(selectHotels);
		selectByIndex(hotels, parseInt2);
		
		//Select RoomType
		WebElement roomType = b.getRoomType();
		String selectRoomType = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 4);
		int parseInt3 = parseInt(selectRoomType);
		selectByIndex(roomType, parseInt3);
		
		//Select No of Rooms
		WebElement numberOfRooms = b.getNumberOfRooms();
		String selectNoofRoom = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 5);
		int parseInt4 = parseInt(selectNoofRoom);
		selectByIndex(numberOfRooms, parseInt4);
		
		thread(2000);
		//Select Check In Date
		WebElement dateCheckIn = b.getDateCheckIn();
		dateCheckIn.clear();
		String selectCheckin = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 6);
		enterText(dateCheckIn, selectCheckin);
		
		thread(2000);
		//Select Check Out Date
		WebElement dateCheckOut = b.getDateCheckOut();
		dateCheckOut.clear();
		String selectCheckOut = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 7);
		enterText(dateCheckOut, selectCheckOut);
		
		//Select Adults Per Room
		WebElement adultsRoom = b.getAdultsRoom();
		String selectAdults = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 8);
		int parseInt7 = parseInt(selectAdults);
		selectByIndex(adultsRoom, parseInt7);
		
		//Select Children Per Rooms
		WebElement childrenRoom = b.getChildrenRoom();
		String selectchildren = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 9);
		int parseInt8 = parseInt(selectchildren);
		selectByIndex(childrenRoom, parseInt8);
		
		//Click Search
		WebElement search = b.getSearch();
		buttonClick(search);
	}
		
	@Test
	public void tc3() {
		
		SelectHotelPage c = new SelectHotelPage();
		//Click RadioClick
		WebElement radioButton = c.getRadioButton();
		buttonClick(radioButton);
		
		//Click Continue
		WebElement continue1 = c.getContinue1();
		buttonClick(continue1);
		
		
	}
		
	@Test
	public void tc4() throws IOException, InterruptedException {
		BookHotelPage d = new BookHotelPage();
		//Enter FirstName
		WebElement firstName = d.getFirstName();
		String txtFirstName = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 10);
		enterText(firstName, txtFirstName);
		
		//Enter Last Name
		WebElement lastName = d.getLastName();
		String txtpassword = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 11);
		enterText(lastName, txtpassword);
		
		//Enter Address
		WebElement address = d.getAddress();
		String txtAddress = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 12);
		enterText(address, txtAddress);
		
		//Enter Credit Card No
		WebElement creditCardNo = d.getCreditCardNo();
		String txtCreditCardNo = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 13);
		enterText(creditCardNo, txtCreditCardNo);
		
		//Select Credit Card Type
		WebElement creditCardType = d.getCreditCardType();
		String selectcreditCardType = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 14);
		int parseInt = parseInt(selectcreditCardType);
		selectByIndex(creditCardType, parseInt);
		
		//Select Expiry Month
		WebElement expiryMonth = d.getExpiryMonth();
		String selectExpiryMonth = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 15);
		int parseInt2 = parseInt(selectExpiryMonth);
		selectByIndex(expiryMonth, parseInt2);
		
		//Select Expiry Year
		WebElement expiryYear = d.getExpiryYear();
		String selectExpiryYear = excelRead("D:\\Book2.xlsx", "Sheet1", 0, 16);
		int parseInt3 = parseInt(selectExpiryYear);
		selectByIndex(expiryYear, parseInt3);
		
		//Enter CVV No
		WebElement cvvNo = d.getCVVNo();
		String txtCvvNo = excelRead("D:\\Book2.xlsx", "Sheet1", 3, 0);
		enterText(cvvNo, txtCvvNo);
		
		//Click Book Now
		WebElement bookNow = d.getBookNow();
		buttonClick(bookNow);
		
		thread(10000);
	}
	
	@Test
	public void tc5() throws IOException {
		
		BookingConffirmPage e = new BookingConffirmPage();
		
		//Get OrderNo
		WebElement orderNo = e.getOrderNo();
		String gettingAttribute = gettingAttribute(orderNo, "value");
		excelWrite("D:\\Book7.xlsx", "Poovarasan", 0, 0, gettingAttribute);			
	}
	
	@After
	public void testLastCredentials() {
		
		Date d1 = new Date();
		System.out.println(d1);
		
	}
	
	@AfterClass
	public static void browserClose() {
		close();
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
