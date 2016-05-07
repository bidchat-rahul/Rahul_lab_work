package labAcessment2a;

public class NegativeProcessor implements Chain {

	private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}

	public void process(Number request) {
		if (request.getNumber() == "java.lang.ArithmeticException:") {
			System.out.println("error name : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}
