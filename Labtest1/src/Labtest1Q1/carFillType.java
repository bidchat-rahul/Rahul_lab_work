package Labtest1Q1;

public class carFillType {
	
	enginType EnginFill ;
	
	public void getFuel(){
		EnginFill.getFuel();
	}
	
	public void setEngin(String fillType){
		
		switch (fillType) {
		case "petrol":
			EnginFill = new petrol();
	
			break;
			
		case "disal":
			EnginFill = new desal();
	
			break;
			
		case "LPG":
			EnginFill = new adapter();
	
			break;
		}
	}
}
