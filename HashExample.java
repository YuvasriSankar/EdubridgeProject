

	import java.util.HashMap;
	import java.util.Scanner;
	import java.text.DecimalFormat;
	import java.util.Map;
	public class HashExample {
		public static void main(String[] arg) {
			HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
			Scanner sc = new Scanner(System.in);
			//int n = sc.nextInt();//size of the hashmap
			hm.put(1,2.3);
			hm.put(2,3.4);
			hm.put(3,4.5);
			hm.put(4,6.7);
			hm.put(5,6.7);
			hm.put(6,6.7);
			hm.put(7,6.7);
			
			/*for (int i = 0; i < n; i++) {
				int key = sc.nextInt();//key
				double value = sc.nextDouble();//value
				hm.put(key,value);
			}	System.out.println(main13.calculateAverage(hm,n));*/
			System.out.println(main13.calculateAverage(hm));
		}
	}

	class main13 {
		
	public static double calculateAverage(HashMap<Integer, Double> h1) {
			double avg = 0.0, sum = 0.0;
			int k = 0;
			for (Map.Entry m : h1.entrySet()) {
				int a = (Integer) m.getKey();
				if (a % 2 != 0) {
					Double d = (Double) m.getValue();
					sum = sum + d;
					k++;//2
				}
			}
			avg = (double) sum / k;
			DecimalFormat df = new DecimalFormat(".##");
			//String b1 = df.avg = (double) sum / k;
			//DecimalFormat df = new DecimalFormat(".##");
			String b1 = df.format(avg);
			double b = Double.parseDouble(b1);
			return b;
		}
	}


