package tvRemoteStimulation;

public class tvControler implements tvInterface {
	int volume = 5;
	int chennel = 1;
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
		System.out.println("next chennel" + ++chennel);
	}

	@Override
	public void chennelDown() {
		// TODO Auto-generated method stub
		System.out.println("Previous chennel"+ --chennel);
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Volume up"+ ++volume);
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Volume down" + --volume);
	}

	@Override
	public void chennel(int No) {
		// TODO Auto-generated method stub
		chennel = No ;
		System.out.println("Go to chennel"+ chennel);
	}
	

}
