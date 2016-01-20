package Car;

import java.util.ArrayList;

public class Car {

	private int totalCost;
	private ArrayList<SubSystem> subSystem=new ArrayList<SubSystem>();

	public void addSubSystem(SubSystem ss) {
		subSystem.add(ss);
	}
	
	public int getTotalCost(){
		for(SubSystem ss:subSystem)
			this.totalCost+=ss.getTotalCost();
		return this.totalCost;
	}
	
}
