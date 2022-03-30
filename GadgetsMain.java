package electronicgadgets;

public class GadgetsMain {

		public static double discount(Gadgets gadgets)
		{
			if(gadgets instanceof Computer)
			{
				return gadgets.price*0.5;
			}else if(gadgets instanceof Tv)
			{
				return gadgets.price*0.8;
			}else if(gadgets instanceof Fan)
			{
				return gadgets.price*0.2;
			}
			return 0.0;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Gadgets gadgets=new Computer("Dell",65431.87,"Dell systems");
			System.out.println(discount(gadgets));
			
			gadgets=new Tv("LG",55431.87,"LG systems");
			System.out.println(discount(gadgets));
			
			gadgets=new Fan("Samsung",5431.87,"samsung systems");
			System.out.println(discount(gadgets));
		}

	

	}


