package car;

import java.util.ArrayList;

public class Subsystem implements Car{
	String name;
	double totalCost;

	private ArrayList<Car> listPart = new ArrayList<Car>();
	
	public Subsystem(String SubName) {
		// TODO Auto-generated constructor stub
		this.name=SubName;
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub

		for(Car temPart:listPart){
			this.totalCost +=temPart.getPrice();
		}
		return totalCost;
	}

	public void aadPart( Car c){
		listPart.add(c);

		
	}
	
	
}
