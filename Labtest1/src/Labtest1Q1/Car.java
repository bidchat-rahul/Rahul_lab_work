package Labtest1Q1;

public class Car {

	CarState carState;

	public Car() {
		super();//car state is idel
		System.out.println("The car is idel");
		this.carState = idel.createIdelCar(this);
		
	}

	public void changeState(CarState carState) {
		// TODO Auto-generated method stub
		this.carState=carState;
		
	}
	public void moving() 
	{
		System.out.println("car is moving now");
		carState.Moving();
	}
	
	public void idel()
	{
		System.out.println("brake has been applied now in idel state");
		carState.Idel();
	}

}
