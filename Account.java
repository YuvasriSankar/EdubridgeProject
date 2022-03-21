
public class Account {
	String account_name;
    String account_no;
	String account_detail;
	String account_phoneno;
	double amount_deposit;
	public void amount_deposit(int i) {
		amount_deposit=amount_deposit+i;
		
	}
	
	public  void amount_withdraw(int i) {
		 amount_deposit=amount_deposit-i;
		
	}
	public double  account_checkbalance() {
		return amount_deposit;
		
	}
	


}
