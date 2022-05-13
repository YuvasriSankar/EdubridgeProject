package ex;

public class OrderDetails {
	
	private int orderID;
	private ContactDetails weekdayContact;
	private ContactDetails holidayContact;
	public OrderDetails()
	{
		
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public ContactDetails getWeekdayContact() {
		return weekdayContact;
	}
	public void setWeekdayContact(ContactDetails weekdayContact) {
		this.weekdayContact = weekdayContact;
	}
	public ContactDetails getHolidayContact() {
		return holidayContact;
	}
	public void setHolidayContact(ContactDetails holidayContact) {
		this.holidayContact = holidayContact;
	}

}
