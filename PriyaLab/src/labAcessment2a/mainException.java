package labAcessment2a;

import java.util.Scanner;

public class mainException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int a[] = new int[2];
			//double b = 24/0;
			//a[3] = 4;
			//int c = "test";
			Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
			
		}catch(Exception ex){
			System.out.println(ex);
			//java.lang.ArithmeticException:
			//java.lang.ArrayIndexOutOfBoundsException:
			//Type mismatch:
			//java.util.InputMismatchException
			
			
		}

	}

}
