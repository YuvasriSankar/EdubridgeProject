import java.util.Scanner;

public class Loopnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		
		try(Scanner sn = new Scanner(System.in)) {
			int rowsize=sn.nextInt();			
			for(int row=1;row<=rowsize;row++,num++)
			{
			
				for(int col=0;col<row;col++)
				{
					System.out.print(num);
					
				}
				System.out.println();
			
			}
	}
	
		
}
}
