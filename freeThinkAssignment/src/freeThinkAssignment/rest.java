package freeThinkAssignment;

import java.util.ArrayList;

public class rest implements LocationUsr {

	ArrayList<LocationAtData>  restAra = new ArrayList<>();
	@Override
	public ArrayList<String> getResturentNames() {
		// TODO Auto-generated method stub
		ArrayList<String> tempNames = new ArrayList<>();
		
		for(int i=0;i<restAra.size();i++){
			tempNames.add(restAra.get(i).getNames());
		}
		
		return tempNames;
	}
	
	@Override
	public void addResturent(LocationAtData newRecourd) {
		// TODO Auto-generated method stub
		restAra.add(newRecourd);
		
	}

}
