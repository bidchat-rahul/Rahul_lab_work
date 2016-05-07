package test2problem2;

public abstract class ATMState {
	
	//connect to door class as it needs to change the state 
	ATM atm;


	public abstract void withdraw(); 
	public abstract void enquiry();
	public abstract void eject();

	public void setATM(ATM atm)
	{
		this.atm=atm;
	}

}
