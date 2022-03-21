package libraryexample;
import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char aaoption,ccoption,lloption,coption;
		do
		{
			System.out.println("A:Admin");
			System.out.println("C:Customer");
			System.out.println("L:Libraian");
			System.out.println("Enter the option");
			Scanner scanner=new Scanner(System.in);
			char option=scanner.next().charAt(0);
			int num1,num2,result;
		
	

			switch(option) {
			case'A':
				do {
					System.out.println("Welcome to library admin");
					System.out.println("1:Add Book");
					System.out.println("2:Delete Book");
					System.out.println("3:Check the number of Customer");
					System.out.println("Enter the option");
					int adminOption=scanner.nextInt();
					switch(adminOption) {
					case 1:
						System.out.println("Add Book");
						break;
					case 2:
						System.out.println("Delete Book");
						break;
					case 3:
						System.out.println("Check the number of Customer");
						break;
					default:
						System.out.println("Enter the valid number");
					}
					System.out.println("Do you wish to continue then press y if not press n");
					aaoption=scanner.next().charAt(0);
				}while(aaoption == 'Y'||aaoption=='y');
					
						break;
					case'C':
						do {
							System.out.println("Welcome to Customer page");
							System.out.println("1:Taking Book");
							System.out.println("2:Payment");
							
							System.out.println("Enter the option");
							int custOption=scanner.nextInt();
							switch(custOption) {
							case 1:
								System.out.println("Taking Book");
								break;
							case 2:
								System.out.println("Payment");
								break;
							default:
								System.out.println("Enter the valid number");
							}
							System.out.println("Do you wish to continue then press y if not press n");
							ccoption=scanner.next().charAt(0);
						}while(ccoption == 'Y'||ccoption=='y');
			
		
							
								break;
					case'L':
						do {
							
						
						       System.out.println("Welcome to librarian");
							   System.out.println("1:Issue the Book");
							   System.out.println("2:Payment Book");
											
							   System.out.println("Enter the option");
								int libraryOption=scanner.nextInt();
				       			switch(libraryOption) {
											case 1:
												System.out.println("Issuse Book");
												break;
											case 2:
												System.out.println("Payment Book");
												break;
											
											default:
												System.out.println("Enter the valid number");
											}
											System.out.println("Do you wish to continue then press y if not press n");
											lloption=scanner.next().charAt(0);
										}while(lloption == 'Y'||lloption=='y');
						break;
						
					default:
						System.out.println("Enter the valid number");
					}
					System.out.println("Do you wish to continue then press y if not press n");
					ccoption=scanner.next().charAt(0);
		}while(ccoption == 'Y'||ccoption=='y');

	}
}
											
			
		
	
		
	




		
										
								
										
									
							
									
									
								
								


						
				
						
					
			
					
					
				
				


		
				
			
	
			
			
		
		

	


