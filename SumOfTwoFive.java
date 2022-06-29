/*sumTwoFive
Read the question carefully and follow the input and output format.

Given an integer array find the sum of elements which end with 2 or 5.

Input and Output Format:
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of an integer, the sum.

1) Print "Invalid array size" when size of the array is negative .
2) Print "Invalid input" when there is any negative number available in the input array and terminate the program.

Include a function named sumTwoFive(int array[], int size) whose return type is an integer, the sum

Sample Input 1:
5
22
35
5
2
10

Sample Output 1:
64

Sample Input 2:
-6

Sample Output 2:
Invalid array size*/
package hackerrankprogram;

import java.util.Scanner;

public class SumOfTwoFive {

	            public static void main(String[] args)
	            {
	            	  int temp,rem,sum=0;		
			// int flag=0;
	                        Scanner in=new Scanner(System.in);
	                       int n = in.nextInt();
	                        if(n < 0)
	                        {
	                                    System.out.println("Invalid array size");
	                        }
	                        else
	                        {
	                                    int a[]=new int[n];
	                                    for(int i = 0; i< n; i++)
	                                    {
	                                                a[i] = in.nextInt();
	                                                 if(a[i] < 0)
	                                                {
	                                                            //flag=1;
	                                                            System.out.println("invalid input");
	                                                            System.exit(0);
	                                                }
	                                                 }
	//  if(flag!=1)
	                                  //  {
	                                                for(int i=0;i<n;i++)
	                                                {
	                                                	if(a[i]%10==2||a[i]%10==5){
	                                                		sum=sum+a[i];//12 13 15 16 18 22 25
	                                                	}
	                                                }
														/*
														 * temp = a[i];//15 rem = temp % 10;//12%10==2 3 5 if(rem==2 ||
														 * rem==5) { sum = sum+a[i];//0=0+12 12=12+15=27 } }
														 */
	                                                System.out.print(sum);
	                        }
	            }
	            }
