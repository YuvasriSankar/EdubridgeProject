package array;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create two dimensional array
				int a[][]= {{1,2,3},{6,7,8},{2,6,4}};
				int b[][]= {{4,3,1},{7,6,5},{8,8,6}};		
				//Creating another matrices because multiple of two(a and b) matrices and store the value of c matrix
		        int c[][]=new int[3][3];
		        //Adding and printing multiple of matrix
		        for(int i=0;i<3;i++) {
		        	for(int j=0;j<3;j++) {
		        		c[i][j]=0;
		        		for(int k=0;k<3;k++) {
		        		
		        		c[i][j]=a[i][k]*b[k][j];
		        		}
		        		System.out.print(c[i][j]+ " ");
		        	}
		        	// just print the line
		        	System.out.println();
		        	}
		        		
		        		
		        		
		         		
		        		
		        		
			  		
		        }
			






			




	}


