package incomeTaxCal;

public class catTaxAdapter extends calTaxNew  implements incomeTax {
	double amt1;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		
		amt1=calculate1(amt);
		return amt1;
	}

}
