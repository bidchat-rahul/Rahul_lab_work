package oOStack;

public class workingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackImplementation stackI = new stackImplementation(7);
		
		stackI.displyStack();
		
		stackI.pushS(4);
		stackI.pushS(6);
		stackI.pushS(5);
		stackI.pushS(3);
		stackI.pushS(2);
		//stackI.pushS(1);
		//stackI.pushS(9);
		
		stackI.displyStack();

	}

}
