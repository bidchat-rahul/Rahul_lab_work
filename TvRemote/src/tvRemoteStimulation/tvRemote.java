package tvRemoteStimulation;

public class tvRemote implements tvInterface {
	tvControler tv = new tvControler();
	@Override
	public void powerOn(Tv tv) {
		// TODO Auto-generated method stub
		this.tv.powerOn(tv);
	}

	@Override
	public void powerOff(Tv tv) {
		// TODO Auto-generated method stub
		this.tv.powerOff(tv);
	}

	@Override
	public void chennelUp(Tv tv) {
		// TODO Auto-generated method stub
		this.tv.chennelUp(tv);
	}

	@Override
	public void chennelDown(Tv tv) {
		// TODO Auto-generated method stub
		this.tv.chennelDown(tv);
	}

	@Override
	public void volumeUp(Tv tv) {
		// TODO Auto-generated method stub
		this.tv.volumeUp(tv);
	}

	@Override
	public void volumeDown(Tv tv) {
		// TODO Auto-generated method stub
		this.tv.volumeDown(tv);
	}

	@Override
	public void chennel(Tv tv , int No) {
		// TODO Auto-generated method stub
		this.tv.chennel(tv,No);		
	}

}
