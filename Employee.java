




import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Iterator;

public class Employee {
	public static TreeMap<Integer,Integer>
	display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)
	{
	TreeMap<Integer,Integer> hm2=new TreeMap<Integer,Integer>();
	Iterator<Integer> it=hm.keySet().iterator();
	while(it.hasNext())
	{
	int y=it.next();
	String dob=hm.get(y);
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	sdf.setLenient(false);
	String now="01-09-2014";
	try
	{ 
		Date d=sdf.parse(now);
	Date d1=sdf.parse(dob);
	int y1=d.getYear();
	int y2=d1.getYear();
	int m1=d.getMonth();
	int m2=d1.getMonth();
	int day1=d.getDay();
	int day2= d1.getDay();
	int age=y1-y2;
	if(m1<m2)
	age--;
	else if(m1==m2 && day1<day2)
	age--;
	if(age>=25 && age<=30)
	{
		float bonus=(float)0.2*hm1.get(y)+hm1.get(y);
	hm2.put(y,(int)bonus );
	}
	else if(age>30 && age<=60)
	{ float bonus=(float) (0.3*hm1.get(y))+hm1.get(y);
	
	hm2.put(y,(int)bonus );
	}
	else if(age<25 || age>60)
	hm2.put(y,-200);
	else
	hm2.put(y,-100);
	}
	catch(Exception e)
	{e.printStackTrace();
	}}
	return hm2;
	}
	




}
