package labAcessment2a;

public class ZeroProcessor implements Chain {

	private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}

	public void process(Number request) {
		if (request.getNumber() == "java.util.InputMismatchException") {
			System.out.println("error name : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}
