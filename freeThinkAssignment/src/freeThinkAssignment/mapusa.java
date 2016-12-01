package freeThinkAssignment;

import java.util.ArrayList;

public class mapusa implements LocationUsr {

	ArrayList<LocationAtData>  mapusaAra= new ArrayList<>();
	@Override
	public ArrayList<String> getResturentNames() {
		// TODO Auto-generated method stub
		ArrayList<String> tempNames = new ArrayList<>();
		
		for(int i=0;i<mapusaAra.size();i++){
			tempNames.add(mapusaAra.get(i).getNames());
		}
		
		return tempNames;
	}
	@Override
	public void addResturent(LocationAtData newRecourd) {
		// TODO Auto-generated method stub
		mapusaAra.add(newRecourd);
		
	}

}
