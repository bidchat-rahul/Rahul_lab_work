package tvRemoteStimulation;

public class tvControler implements tvInterface {

	@Override
	public void powerOn(Tv tv) {
		// TODO Auto-generated method stub
		tv.setState(true);
		System.out.println("Welcome");
	}

	@Override
	public void powerOff(Tv tv) {
		// TODO Auto-generated method stub
		tv.setState(false);
		System.out.println("Switching off");
	}

	@Override
	public void chennelUp(Tv tv) {
		// TODO Auto-generated method stub
		int chennel = tv.getChennel();
		tv.setChennel(++chennel);
		System.out.println("next chennel" + chennel);
	}

	@Override
	public void chennelDown(Tv tv) {
		// TODO Auto-generated method stub
		int chennel = tv.getChennel();
		tv.setChennel(--chennel);
		System.out.println("Previous chennel"+ chennel);
	}

	@Override
	public void volumeUp(Tv tv) {
		// TODO Auto-generated method stub
		int volume = tv.getVolume();
		tv.setVolume(++volume);
				
		System.out.println("Volume up"+ volume);
	}

	@Override
	public void volumeDown(Tv tv) {
		// TODO Auto-generated method stub
		int volume = tv.getVolume();
		tv.setVolume(--volume);
		System.out.println("Volume down" + volume);
	}

	@Override
	public void chennel(Tv tv , int No) {
		// TODO Auto-generated method stub
		int chennel = No ;
		tv.setChennel(chennel);
		System.out.println("Go to chennel"+ chennel);
	}
	

}
