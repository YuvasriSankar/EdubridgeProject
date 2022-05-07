package vowelandconsonant;

public class Alphabets{
	static void countVowels(String str)
	{
		int uniquevowels=0,uniqueconsonants=0;
		for(int i=0;i<str.length();i++)
		{
			/*char ch =str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				ch=Character.toLowerCase(ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')*/
			if(isvowel(str.charAt(i)))
			{
				uniquevowels++;
			}
				else
				{
					uniqueconsonants++;
			}
			System.out.println("Enter a uniqueVowels: "+uniquevowels);
			System.out.println("Enter a uniqueConsonants: "+uniqueconsonants);
		}
	
	}
	private static boolean isvowel(char charAt) {
		// TODO Auto-generated method stub
		charAt=Character.toUpperCase(charAt);
		return(charAt=='A'||charAt=='E'||charAt=='I'||charAt=='O'||charAt=='U');
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str="abacab";
	countVowels(str);


}

}