
public class EnumEx {
	enum Day {Monday, Tuesday, Wed, Thu, Fri, Sat, Sun}//intergal constant for monday ,tuesday,wed,thur,fri,sat,sun.
//  1,     2,       3,    4,  5,   6,   7

public static void main(String[] args) {
// TODO Auto-generated method stub
Day day=Day.Fri;//creating an abject--constructor will be invoking
System.out.println(day);

switch(day)
{

case Monday: System.out.println("first day of week");
break;
case Tuesday: System.out.println("second day of week");
break;
case Wed: System.out.println("mid day of week");
break;
case Thu: System.out.println("mid day of week");
break;
case Fri: System.out.println("lastworking day of week");
break;
case Sat: System.out.println("holi day of week");
break;
case Sun: System.out.println("weekend day of week");
break;


}

}

}


