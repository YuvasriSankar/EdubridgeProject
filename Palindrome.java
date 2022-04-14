
	import java.util.Scanner;

	public class Palindrome{
		public static int addPalindromes(int a,int b)
		{
			int temp,sum=0,rem,sumOfPalindromes=0;
			for(int i=a;i<=b;i++)//100 to 130  i=111
			{
				temp=i;//temp=111
				sum=0;
				while(temp>0)//10>0
				{
					rem=temp%10;//101%10=1;10%10=0;1%10=1;
					sum=sum*10+rem;//0=0*10+1;1*10+0;10*10+1->101
					temp=temp/10;//101=101/10->10;10/10=1;1/10=0
					}
				if(i==sum)//101==101;111=111;121==121
					sumOfPalindromes+=i;//0=0+101->101;101=101+111;111=212;
				}
			return sumOfPalindromes;
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the range:");
			int a = scanner.nextInt();//lower limit
			int b = scanner.nextInt();//upper limit
			System.out.println("sum of palindrome within "+a+" and "+b+" is:" + addPalindromes(a, b));
		}

	}

