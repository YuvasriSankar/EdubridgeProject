package vowelandconsonant;

public class Alphabetss {
	public int uniqueVowels(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				
				i++;
		}
	
	return 1;
}
public int uniqueConsonants(String str)
{
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		}else if(ch!=' ') {
			
			i++;
	}
}
	return 2;
}

public class Source{
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 Alphabet obj = new Alphabet();
		 int Alphabet= obj.uniqueVowels("abacab");
		 int Alphabet1= obj.uniqueConsonants("abacab");
		 System.out.println("Alphabet");
		 System.out.println("Alphabet1");

	}

}
}

