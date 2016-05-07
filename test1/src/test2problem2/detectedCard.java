package test2problem2;


public class detectedCard extends ATMState {
/*	
	private static OpenDoor OpenDoorinstance;
	private OpenDoor(Door d)
	{
		super();
		this.door = d;
	}
	
	public static OpenDoor createOpenDoor(Door d)
	{
		if(OpenDoorinstance == null)
			OpenDoorinstance = new OpenDoor(d);
		System.out.println("the ATM rady for transection state");
		return OpenDoorinstance;
	}
	
*/
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("the withdraw operation");
	}

	@Override
	public void enquiry() {
		// TODO Auto-generated method stub
		System.out.println("the enquiry operation");
		
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub
		System.out.println("Card ejected, thank you");
		
	}

}
