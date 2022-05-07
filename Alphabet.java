


 class Alphabet {
	 
	public int uniqueVowels(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
			{	
				i++;
		}
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
			 System.out.println(" ");
		}else if(ch!=' ') {
			
			i++;
	}
}
	return 2;
}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 Alphabet obj = new Alphabet();
		 int UniqueVowels= obj.uniqueVowels("abacab");
		 int UniqueConsonants= obj.uniqueConsonants("abacab");
		 System.out.println("UniqueVowels:"+ obj.uniqueVowels("abacab"));
		 System.out.println("UniqueConsonants:"+obj.uniqueConsonants("abacab"));


 }
 }
 

