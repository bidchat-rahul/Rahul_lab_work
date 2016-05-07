package test2problem2;

public class non_detectedCard extends ATMState{

private static non_detectedCard eject_card_status;

private non_detectedCard(ATM atm)
{
	setATM(atm);
}

public static non_detectedCard ejectAtm(ATM atm)
{
	if(eject_card_status == null)
		eject_card_status = new non_detectedCard(atm);
	System.out.println("insert card");
	return eject_card_status;
}


@Override
public void withdraw() {
	// TODO Auto-generated method stub
	System.out.println("insert card");
	//atm.changeState(OpenDoor.createOpenDoor(atm));
	
}

@Override
public void enquiry() {
	// TODO Auto-generated method stub
	System.out.println("insert card");
	
}

@Override
public void eject() {
	// TODO Auto-generated method stub
	System.out.println("card is already removed");
	
}

}
