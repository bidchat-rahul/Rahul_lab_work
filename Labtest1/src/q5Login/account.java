package q5Login;

public class account implements proInterface {
	String id;
	int balance = 1000;

	public account(String usrId) {
		// TODO Auto-generated constructor stub
		this.id = usrId;
	}

	public int getBalance() {
		return balance;
	}

	public void withdrow(int balance) {
		this.balance -= balance;
	}
	
	public void deposit(int balance) {
		this.balance += balance;
	}
	
	
	

}
