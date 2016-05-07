package testFactory;


public class whatsApp implements Message {

	@Override
	public void sendMessage(String phnum, String MessageContent) {
		// TODO Auto-generated method stub
		System.out.println("Message sent via whatsApp  ");
		System.out.println("Your number is "+phnum );
		System.out.println("Message is "+MessageContent);
		
	}

}
