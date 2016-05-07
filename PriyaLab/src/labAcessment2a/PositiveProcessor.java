package labAcessment2a;


public class PositiveProcessor implements Chain {

	private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}

	public void process(Number request) {
		if (request.getNumber() == "Type mismatch:") {
			System.out.println("error name : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}
