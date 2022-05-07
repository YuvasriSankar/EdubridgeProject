

	public class EnumDayClassEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Day1 day=Day1.SUN;//constructor invoked(memory is allocated ) and value of Monday is assigned to value variable
			
			System.out.println(day.getValue()+" "+day.getMsg());
			
			Day1 arr[] = Day1.values();
			for(Day1 d : arr)
			{
				System.out.println(d.getValue()+" "+d.getMsg());
			}

		}

	}

	
