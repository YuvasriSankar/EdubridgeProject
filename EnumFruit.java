
 enum Fruit {APPLE(100),
	 MANGO(200 ),
	 ORANGE(300);
	 
	 //Member Variable
	 private int price;
	 //constructor
	private Fruit(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	//Method
		int totalPrice()
		{
			return price;
		}


}
