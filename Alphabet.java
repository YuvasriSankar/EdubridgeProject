package vowelandconsonant;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  a Character: ");
		char ch= sc.next().charAt(0);
		switch(ch)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
			i++;
		}
		if(i==1)
			System.out.println("Entered character "+ch+" is Vowel");	
		else
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println("Entered character"+ch+" is Consonant");	
			else
				System.out.println("Not an alphabet");
		}


	}


