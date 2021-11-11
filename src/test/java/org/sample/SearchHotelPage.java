package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement Location;

	@FindBy(id = "hotels")
	private WebElement Hotels;

	@FindBy(id = "room_type")
	private WebElement RoomType;

	@FindBy(id = "room_nos")
	private WebElement NumberOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement DateCheckIn;

	@FindBy(id = "datepick_out")
	private WebElement DateCheckOut;

	@FindBy(id = "adult_room")
	private WebElement AdultsRoom;

	@FindBy(id = "child_room")
	private WebElement ChildrenRoom;

	@FindBy(id = "Submit")
	private WebElement Search;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumberOfRooms() {
		return NumberOfRooms;
	}

	public WebElement getDateCheckIn() {
		return DateCheckIn;
	}

	public WebElement getDateCheckOut() {
		return DateCheckOut;
	}

	public WebElement getAdultsRoom() {
		return AdultsRoom;
	}

	public WebElement getChildrenRoom() {
		return ChildrenRoom;
	}

	public WebElement getSearch() {
		return Search;
	}
	

}
