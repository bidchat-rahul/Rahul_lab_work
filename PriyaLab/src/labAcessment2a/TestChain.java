package labAcessment2a;

import java.util.Scanner;

public class TestChain {
	public static void main(String[] args) {
		//configure Chain of Responsibility
		Chain c1 = new NegativeProcessor();
		Chain c2 = new ZeroProcessor();
		Chain c3 = new PositiveProcessor();
		Chain c4 = new exception();
		
		c1.setNext(c2);
		c2.setNext(c3);
		c3.setNext(c4);

		/*//calling chain of responsibility
		c1.process(new Number(99));
		c1.process(new Number(-30));
		c1.process(new Number(0));
		c1.process(new Number(100));*/
		
		try{
			int a[] = new int[2];
			//double b = 24/0; // error will be java.lang.ArithmeticException:
			//a[3] = 4; // error will be java.lang.ArrayIndexOutOfBoundsException:
			//int c = "test"; //error will be Type mismatch:
			Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // give input string error will be  java.util.InputMismatchException
			
		}catch(Exception ex){
			System.out.println(ex.toString());
			c1.process(new Number(ex.toString()));
			//java.lang.ArithmeticException:
			//java.lang.ArrayIndexOutOfBoundsException:
			//Type mismatch:
			//java.util.InputMismatchException
			
			
		}
		
		
		
	}
}
