package test2problem2;

public class ATM {
	private ATMState AtmState;

	public ATM()
	{
		System.out.println("The ATM is craeted");
		//this.AtmState = non_detectedCard.createEjectCard(this); 
	}

	public void inserted() 
	{
		System.out.println("card inserted opertaion now called on Atm");
		AtmState.withdraw();
	}

	public void removed()
	{
		System.out.println("card remove operation now called on Atm");
		AtmState.eject();
	}

	public void changeState(ATMState AtmState) 
	{
		this.AtmState=AtmState;
	}
	

}
