package observerPatten;

public class Mainclass {

	public static void main(String[] args)
	{
		MailBox mailbox1 = new MailBox();
		MailBox mailbox = new MailBox();
		PostOffice office = new PostOffice("Panjim sub-Post office");
		PostOffice office1 = new PostOffice("Bicholim sub-Post office");
		
		office.AddObserver(mailbox1);
		office1.AddObserver(mailbox);
		office.newMail();
		office1.newMail();
		office.RemoveObserver(mailbox1);
		//office1.RemoveObserver(mailbox1);
	}
}
