import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				Scanner sn = new Scanner(System.in)) {
					int columnsize=sn.nextInt();
					
					for(int column=1;column<=columnsize;column++)
					{
						for (int k=0;k<columnsize-column;k++)
						{
							System.out.print("  ");
							
						}
						for(int row=0;row<column;row++)
						{
							System.out.print(" *");
							
						}
						System.out.println();
					
					}
				}
				

	}

}
