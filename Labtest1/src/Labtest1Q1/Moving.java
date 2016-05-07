package Labtest1Q1;


public class Moving extends CarState{
	
	private static Moving createMovingCar;
	
	public Moving(Car car) {
		// TODO Auto-generated constructor stub
		super();
		setCar(car);
	}

	@Override
	public void Moving() {
		// TODO Auto-generated method stub
		System.out.println("the car is in already moving state");
		
	}

	@Override
	public void Idel() {
		// TODO Auto-generated method stub
		System.out.println("Brake applied now in idel state");
		car.changeState(idel.createIdelCar(car));
	}

	public static Moving initMovingCar(Car car) {
		// TODO Auto-generated method stub
		if(createMovingCar == null)
			createMovingCar = new Moving(car);
		System.out.println("the car is now in moving state");
		return createMovingCar;
		
	}

}
/*
	
*/