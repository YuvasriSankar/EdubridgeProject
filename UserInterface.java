package appmain;
import java.sql.SQLException;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.LoginDetailsDao;
import dao.ProductDao;
import daoimpl.LoginDetailsDaoImpl;
import daoimpl.ProductDaoImpl;
import exception.UserNotFoundException;
import model.Product;
import model.UserDetails;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("***********Welcome to Employee Administration****************");
		
		System.out.println("1: Contact US");
		System.out.println("2: About US");
		System.out.println("3: LinkedIn");
		System.out.println("4: Facebook");
		System.out.println("5: Instagram US");
		System.out.println("6: Sign up");
		System.out.println("7: Sign In");
		System.out.println("8: Update");
		System.out.println("9: Delete");
		System.out.println("10: ViewAllUsers");
		System.out.println("11: finduserbyusername");
		System.out.println("12: Exit");
		System.out.println("*************************************************************");
		char ch=' ';
		LoginDetailsDao LoginDao=new LoginDetailsDaoImpl();
		String username,firstname,lastname,password, location, mobileno;
		do {
			System.out.println("What you do wish to check from the above list");
		
		
			Scanner sn=new Scanner(System.in);
			int option=sn.nextInt();
		
			switch(option)
			{
				case 1: 
					
					break;
				case 2: 
					break;
				case 3:
					break;
				case 4:
					break;
					
				case 5: 
					break;
				case 6:System.out.println("enter the details to signup");
						username=sn.next();
						firstname=sn.next();
						lastname=sn.next();
						password=sn.next();
						location=sn.next();
						mobileno=sn.next();
						UserDetails user=new UserDetails();
						user.setFirstName(firstname);
						user.setLastName(lastname);
						user.setLocation(location);
						user.setMobileno(mobileno);
						user.setUsername(username);
						user.setPassword(password);
						
					LoginDao.signUp(user);
					
					 /*create table userdetails(
					 username varchar(20) primary key,
					 password varchar(20) not null,
					 firstname varchar(20) not null,
					 lastname varchar(20),
					 location varchar(20),
					 mobileno varchar(10) not null
					 )
					 */
					
					break;
				case 7:
					System.out.println("enter the username and password to login");
					String usern=sn.next();
					String pass=sn.next();
					UserDetails details=new UserDetails();
					details.setUsername(usern);
					details.setPassword(pass);
					boolean res=LoginDao.signIn(details);
					if(res) {
						do {
						ProductDao productDaoImpl = new ProductDaoImpl();	
						System.out.println("login success");
						System.out.println("1-------add product");
						System.out.println("2-------update product");
						System.out.println("3-------delete product");
						System.out.println("4-------viewallproduct");
						System.out.println("5-------find product by id");
						int option1=sn.nextInt();
						switch(option1) {
						case 1:
							Product product = new Product();
							System.out.println("Id");
							product.setP_id(sn.next());
							System.out.println("name");
							product.setP_name(sn.next());
							System.out.println("price");
							product.setP_price(sn.next());
							productDaoImpl.addProduct(product);
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						default : System.out.println("invalid option");
						}
						System.out.println("Do you wish to check other options");
						ch=sn.next().charAt(0);
						
					  }while(ch=='y'||ch=='Y');
					}
					
					
					else 
						System.out.println("login failed");
					break;
				case 8:
					System.out.println("Enter the user name to update");
					String oldUser=sn.next();
					
				try {
					UserDetails existingUser = LoginDao.findUserByUserName(oldUser);

					UserDetails userDetails = new UserDetails();
					System.out.println("username");
					userDetails.setUsername(sn.next());
					System.out.println("pass");                     
					userDetails.setPassword(sn.next());
					System.out.println("firstname");
					userDetails.setFirstName(sn.next());
					System.out.println("lastname");
					userDetails.setLastName(sn.next());
					System.out.println("location");
					userDetails.setLocation(sn.next());
					System.out.println("mobileno");
					userDetails.setMobileno(sn.next());  
					
					boolean output =LoginDao.updateUser(oldUser,userDetails) ;                 
					if (output) { 
						System.out.println("updated");
						
					}else
						System.out.println("something fishy");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("user not found");
					
				}
					//String newUser=sn.next();
					//String newPass=sn.next();
					//String newFname=sn.next();
					// newLname=sn.next();
					//String newLocation=sn.next();
					//String newPnumber=sn.next();
					
					
					break;
				case 9:
					System.out.println("Enter the user name to dlt");
					String userNamedlt=sn.next();
					//UserDetails ud = new UserDetails();
					boolean output2=LoginDao.deleteUser(userNamedlt);
					
					if (output2) {
						System.out.println("deleted");
					}else {
						System.out.println("something fishy");
					}
					break;
				case 10:
					List<UserDetails> arrayList = LoginDao.viewAllUsers();
					System.out.println(arrayList);
					
					Iterator<UserDetails> iterator = arrayList.iterator();
					while(iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					break;
				case 11:
					System.out.println("username");
					try {
					UserDetails userDetailsByName = LoginDao.findUserByUserName(sn.next());
					System.out.println(userDetailsByName);

					}catch (UserNotFoundException e) {
					System.out.println(e.getMessage());
					}catch (SQLException e1) {
						System.out.println("sql exception"+e1.getMessage());
					}
						
					break;
				case 12:	
					System.exit(0);
				default: System.out.println("enter the valid option");
			}
		System.out.println("Do you wish to check other options");
		ch=sn.next().charAt(0);
		
	  }while(ch=='y'||ch=='Y');
		
	}
	

}
