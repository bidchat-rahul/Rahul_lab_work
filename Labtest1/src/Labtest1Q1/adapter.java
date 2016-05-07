package Labtest1Q1;

public class adapter implements enginType {

	@Override
	public void getFuel() {
		// TODO Auto-generated method stub
		LPGgas lp = new LPGgas();
		lp.getLPG();

	}

}
