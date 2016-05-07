package q5Login;

public class accountMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int status=-1;
		int balance;
		String name = "Rahul";String passwd = "123";
		loginAc loc = new loginAc();
	 
		status = loc.login(name,passwd);
	 
		account ac = null;
		
		 if(status == 1){
				ac = new account(name);
				 ac.deposit(500);
				 balance = ac.getBalance();
				 ac.withdrow(500);
				// balance = ac.getBalance();
				 System.out.println("The Avalable Balance is "+balance);
				 
		 }else{
			 System.out.println("Login Failed");
		 }
	 

	 
	 

	}

}
