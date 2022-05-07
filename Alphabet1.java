package vowelandconsonant;

public class Alphabet1 {
	static void countCharacterType(String str)
	{
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				ch=Character.toLowerCase(ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowels++;
				else
					consonants++;
			}
			System.out.println("Enter a Vowels: "+vowels);
			System.out.println("Enter a Consonants: "+consonants);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abacab";
		countCharacterType(str);

	}

}
