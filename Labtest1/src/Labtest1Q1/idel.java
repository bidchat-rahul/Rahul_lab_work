package Labtest1Q1;

public class idel extends CarState  {
	
	private static idel createIdelCar;
	
	private idel(Car car)
	{
		setCar(car);
	}


	@Override
	public void Moving() {
		// TODO Auto-generated method stub
		System.out.println("Car is in moving state");
		car.changeState(Moving.initMovingCar(car));
		
	}

	@Override
	public void Idel() {
		System.out.println("Car is alrady in idel state");
		// TODO Auto-generated method stub
		
	}

	public static CarState createIdelCar(Car car) {
		// TODO Auto-generated method stub
		
		if(createIdelCar == null)
			createIdelCar = new idel(car);
		System.out.println("the car is now in idel state");
		return createIdelCar;
	}

}
