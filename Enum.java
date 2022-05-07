

	enum Day1{ MONDAY(10,"First"),
		TUE(20,"Second"), 
		WED(30,"Third"), 
		THU(40,"Fourth"),
		FRI(50,"Fifth"),
		SAT(60,"sixth"),
		SUN(70,"eight");

		//member variable
		private int value;
		private String msg;
		
		//constructor
		Day1(int val,String s)
		{
			value=val;
			msg=s;
		}
		
		//method
		public int getValue()
		{
			return value;
		}
		
		public String getMsg()
		{
			return msg;
		}
		
		
	}


