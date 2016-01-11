package ShopingPkg;

public class EComsite {
	paymentMethod PayMethod;
	
	public double makePayment(double price, int qty) {
		// TODO Auto-generated method stub
		return PayMethod.makePayment(price, qty);
		
	}

	public void chosePaymentMethod(String paymentMode) {
		// TODO Auto-generated method stub
		switch (paymentMode) {
		case "COD":
			PayMethod = new cashOnDelivery();
	
			break;
			
		case "creditCard":
			PayMethod = new creditCard();
			
			break;
			
		case "debitCard":
			PayMethod = new debitCard();
	
			break;
			
		case "netBanking":
			PayMethod =new netBanking();
		
			break;

		default:
			PayMethod =null;
			break;
		}

	}

	
	
}
