package Labtest1Q1;

public abstract class CarState {
	Car car;
	
	public abstract void Moving(); 
	public abstract void Idel();
	
	public void setCar(Car car)
	{
		this.car=car;
	}

}
