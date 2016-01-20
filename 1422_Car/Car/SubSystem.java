package Car;

import java.util.ArrayList;

public class SubSystem {
	private int cost;
	
	private ArrayList<Parts> parts=new ArrayList<Parts>();

	public int getTotalCost() {
		for(Parts p:parts)
			this.cost+=p.getPrice();

		return this.cost;
	}
	
	public void addPart(Parts p) {
		parts.add(p);
	}	

}
