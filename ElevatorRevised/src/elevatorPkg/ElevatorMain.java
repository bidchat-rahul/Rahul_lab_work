package elevatorPkg;

public class ElevatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int printLocation;
		
		DisplyPanel displyPanel = new DisplyPanel();
		
		printLocation = displyPanel.getToDisply();
		
		System.out.println("lift at "+printLocation);
		
		CallPanel callPanel = new CallPanel(4);
		
		
		
		

	}

}
