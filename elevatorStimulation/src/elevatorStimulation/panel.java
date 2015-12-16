package elevatorStimulation;

import java.util.Scanner;

public class panel {
	Scanner readnum = new Scanner(System.in);
	public int outSidePanel(){
		int curtFloor;

		System.out.println("Outside Panel");
		System.out.print("Enter your current floor ");
		curtFloor = readnum.nextInt();
		return curtFloor;
	}
	
	public int inSidePanel(){
		int reqFlor;
		System.out.println("\nInside Panel");
		System.out.println("Enter The Floor No");
		reqFlor = readnum.nextInt();
		
		return reqFlor;
	}
	
}
