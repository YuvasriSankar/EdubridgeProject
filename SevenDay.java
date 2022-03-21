import java.util.Scanner;

public class SevenDay {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("1: Monday");
			System.out.println("2: Tuesday");
			System.out.println("3: Wednesday and Thursday");
			System.out.println("4: Friday");
			System.out.println("5: Saturday and Sunday");
			System.out.println("Enter the Day:");
			String option=scanner.next();
			switch(option)
			{
			case "Monday":
			
				System.out.println("First day of the week");
				break;
			    case "Tuesday":
				System.out.println("Second day of the week");
				break;
				case "Wednesday":
				case "Thursday":
				System.out.println("Mid day of the week");
				break;
			
				case "Friday":
				System.out.println("last working day of week");
				break;
			
				case "Saturday":
				case "Sunday":
				System.out.println(" week end");
				break;
				default:
				System.out.println("Enter the Valid Option");
			
			}
		}
	}
}
	

