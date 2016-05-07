package q5Login;

public class loginAc implements proInterface  {
	String usrID = "Rahul";
	String passwd = "123";
	public int login(String usrId , String passwd){
		
		if(this.usrID == usrId && this.passwd == passwd){
			return 1;
			
		}else{
			return -1;
		}
		
		
	}
	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void withdrow(int bal) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit(int bal) {
		// TODO Auto-generated method stub
		
	}

}
