package hackerrankprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	   public static void main(String[] args)throws NumberFormatException,IOException {  
		   BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		   int result=0; 
		   int N = Integer.parseInt(bufferedreader.readLine().trim());
		   if(N>=2&& N<=20)
		   {
		   for(int i=1;i<=10;i++) {
			   result=N*i;
			   System.out.println(N+" "+"x"+" "+i+" "+"="+result);
		   }
		   }
		   bufferedreader.close();
}
}