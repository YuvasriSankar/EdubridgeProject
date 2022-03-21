import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter StudentMark:");
			int StudentMark=scanner.nextInt();
			if(StudentMark>=90 && StudentMark<=100) {
				System.out.println("Excellent");
			}else if(StudentMark>=80 && StudentMark<=90 ) {
				System.out.println("Good");
}else if(StudentMark>=60 && StudentMark<=80 ) {
			System.out.println("passed");
			
}else if(StudentMark<60 ) {
			System.out.println("Failed");
}else
				System.out.println("No Grade");
		}
			
	
			
			
			
		}
			

	}


