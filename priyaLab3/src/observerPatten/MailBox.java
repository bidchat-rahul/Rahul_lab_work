package observerPatten;

public class MailBox implements Observer {
	String Address;
	
	public void Update()
	{
		System.out.println("New Mail!!!");
	}

}
