
public class PassBookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to State Bank of India");
		Account account1=new Account();
		account1.account_name="Yuvasri";
		account1.account_no="123456789";
		account1.account_detail="Vandavasi";
		account1.account_phoneno="7339643931";
	/*	System.out.println(account1.account_name+" "+account1.account_no+" "+account1.account_detail+" "+account1.account_phoneno);*/
		
		Account account2=new Account();
		 account2.amount_deposit (80000);
		/*System.out.println(amount_deposit);*/
		
		
		account2.amount_withdraw (20000);
		/*System.out.println(amount_withdraw);*/
		
		
		System.out.println(account2.account_checkbalance());
		/*System.out.println(account_checkbalance);*/
		
		
	
		
		
		
		
		
		
		/*System.out.println(account1.account_name+" "+account1.account_no+" "+account1.account_detail);*/
		
	
		
		

	}

}
