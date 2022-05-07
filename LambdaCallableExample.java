package lambdaexpression;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaCallableExample {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService executor =Executors.newSingleThreadExecutor();
		Callable c=()->{ //Lambda expression
			int n=0;
			for(int i=0;i<100;i++) {
				n+=i;
			}
			return n;
		};
Future<Integer>future=executor.submit(c);
try {
	Integer result = future.get();
	System.out.println(result);
	

	}catch(ExecutionException e) {
		e.printStackTrace();
	}

}
}