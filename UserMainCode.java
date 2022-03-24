package fetching_middle_character_from_string;

public class UserMainCode {

	public static String getMiddleChars(String s) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		String s2=null;
		if(s.length()%2==0) { // Constriant length
		sb.append(s.substring(s.length()/2-1,s.length()/2+1));
		// Stringlength=6;starting length=6/2-1,endinglength=6/2+1;(3-1,3+1);(2,4) 
		}
		 s2=sb.toString();// string coverted to  toString
		return s2;
	}
		
	}


