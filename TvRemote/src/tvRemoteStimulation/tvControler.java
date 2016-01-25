package tvRemoteStimulation;

public class tvControler implements tvInterface {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Switching off");
	}

	@Override
	public void chennelUp() {
		// TODO Auto-generated method stub
		System.out.println("next chennel");
	}

	@Override
	public void chennelDown() {
		// TODO Auto-generated method stub
		System.out.println("Previous chennel");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Volume up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Volume down");
	}

}
