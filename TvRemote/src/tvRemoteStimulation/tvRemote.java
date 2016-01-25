package tvRemoteStimulation;

public class tvRemote implements tvInterface {
	tvControler tv = new tvControler();
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
tv.powerOn();
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
tv.powerOff();
	}

	@Override
	public void chennelUp() {
		// TODO Auto-generated method stub
tv.chennelUp();
	}

	@Override
	public void chennelDown() {
		// TODO Auto-generated method stub
tv.chennelDown();
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
tv.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
tv.volumeDown();
	}

}
