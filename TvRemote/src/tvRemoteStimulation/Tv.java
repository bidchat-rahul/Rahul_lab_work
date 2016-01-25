package tvRemoteStimulation;

public class Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tvControler tv1 = new tvControler();
		tvRemote tvrmot = new tvRemote();
		
		tv1.powerOn();
		tvrmot.powerOff();

	}

}
