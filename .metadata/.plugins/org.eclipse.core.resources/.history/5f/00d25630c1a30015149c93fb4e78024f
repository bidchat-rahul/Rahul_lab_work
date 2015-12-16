package elevatorStimulation;

import java.util.Scanner;

public class working {

	public static void main(String[] args) throws InterruptedException {
		int reqFlor , status,ch=0 ,curtFloor;

		Scanner readnum = new Scanner(System.in);
		requestElevator el1 =new requestElevator();

		el1.setStatus(3); 
		
		while(ch==0){
			System.out.println("Outside Panel");
			System.out.print("Enter your current floor ");
			curtFloor = readnum.nextInt();
			el1.elevatorCall(curtFloor);
			
			System.out.println("\nInside Panel");
			System.out.println("Enter The Floor No");
			reqFlor = readnum.nextInt();
			status=el1.getStatus();
		
			System.out.println("Closing Doors");
			System.out.println("Elevator at " +el1.callElevator(reqFlor,status));
			System.out.println("Opening Doors");

			
		}
		
	}

}
