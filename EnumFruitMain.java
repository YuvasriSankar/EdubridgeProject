
public class EnumFruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit=Fruit.APPLE;//constructor invoked(memory is allocated ) and value of Monday is assigned to value variable
		
		/*System.out.println(fruit.getPrice());
		
		Fruit arr[] = Fruit.values();
		for(Fruit f : arr)
		{
			System.out.println(f.getPrice());
		}*/

		System.out.println("TOTAL PRICE OF FRUITS: ");
		int total=0;
		//using enhanced for each loop
		for (Fruit f : Fruit.values()) {
			total=total+f.totalPrice();
			System.out.println(f + " " +  "costs" + " " +f.totalPrice() + " " + "rupees per kg." + " ");
		}
		System.out.println(total);
	}



	}



