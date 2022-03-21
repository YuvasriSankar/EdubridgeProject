package armstrongnumber;
import java.util.Scanner;

public class ArmstrongNumberExample {
	//function to check if the number is Armstrong or not
	static boolean isArmstrong(int n)
	{
		int temp,digits=0,last=0,sum=0;
		//assigning n into a temp variable
		temp=n;
		//loop execute until the condition becomes false
		while(temp>0)
		{
			temp=temp/10;
			digits++;
			
		}
		temp=n;
		while(temp>0)
		{
			//determines the last digit from the number
			last=temp%10;
			//calculates the power of a number up to digit times andadd the resultant to the sum variable
		sum+=(Math.pow(last, digits));
		//removes the last digit
		temp=temp/10;
		}
		//compares the sum with n
		if(n==sum)
			//returns if sum and n are equal
			return true;
		//return false if sum and n are not equal
		else return false;
	}
	//derived code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;

Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number:");
//reads the limit from the user
num= scanner.nextInt();
if(isArmstrong(num))
{
	System.out.print("Armstrong");
	
}
else
{
	System.out.print("NotArmstrong");	
}
	}

}
		
		
		
		
		
		
		
		
		
	
	


