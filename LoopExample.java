import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in)) {
			int rowsize=sn.nextInt();
			for(int row=1;row<=rowsize;row++)
			{
				for (int k=0;k<rowsize-row;k++)
				{
					System.out.print("  ");
					
				}
				for(int col=0;col<row;col++)
				{
					System.out.print("   *");
					
				}
				System.out.println();
			
			}
		}
		

	}

}
