package Labtest1Q1;

public class carClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1
		Car car = new Car();
		car.moving();
		car.idel();//brake applied
		car.moving();
		
		//Q2 and Q3
		carFillType carFill = new carFillType();
		carFill.setEngin("LPG");//disal or petrol or adapter LPG
		carFill.getFuel();
		
		
	}

}
