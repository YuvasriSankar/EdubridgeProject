package ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Storing the data");
		try {
			// creating configuration object
			System.out.println("111111111111111111111");
			Configuration cfg = new Configuration();
			System.out.println("2222222222222222222222222222");
			cfg.configure("Hibernate.cfg.xml");// populates the data of the
												// configuration file
			System.out.println("3333333333333333333333333333");
			// creating seession factory object
			SessionFactory factory = cfg.buildSessionFactory();
			System.out.println("4444444444444444444444444");
			// creating session object
			Session session = factory.openSession();
			System.out.println("5555555555555555555555555");
			// creating transaction object
			Transaction t = session.beginTransaction();
			System.out.println("66666666666666666666666666666666");
			OrderDetails e1 = new OrderDetails();
			e1.setOrderID(200);
			ContactDetails holidayContact = new ContactDetails();
			holidayContact.setAddress("Chennai");
			holidayContact.setPhone("7339643931");
			holidayContact.setRecipient("YuvasriSankar");
			e1.setHolidayContact(holidayContact);
			ContactDetails weekdayContact = new ContactDetails();
			weekdayContact.setAddress("Vandavasi");
			weekdayContact.setPhone("9486264607");
			weekdayContact.setRecipient("Gomathi");
			e1.setWeekdayContact(weekdayContact);
			System.out.println("7777777777777777777777777777777");
			session.save(e1);// persisting the object
			System.out.println("888888888888888888888888888888");
			t.commit();// transaction is committed
			session.close();

			System.out.println("successfully saved");
		} catch (Exception ex) {
			System.out.println("Problem in connection" + ex.getMessage());
			System.out.println(ex.getCause());
		}
	}

}
