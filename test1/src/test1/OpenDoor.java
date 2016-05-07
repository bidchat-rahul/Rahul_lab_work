package test1;

public class OpenDoor extends DoorState {
	private static OpenDoor OpenDoorinstance;
	private OpenDoor(Door d)
	{
		super();
		this.door = d;
	}
	
	public static OpenDoor createOpenDoor(Door d)
	{
		if(OpenDoorinstance == null)
			OpenDoorinstance = new OpenDoor(d);
		System.out.println("the door is now in open state");
		return OpenDoorinstance;
	}
	
	public void open()
	{
		System.out.println("the door is already open");
	}
	
	public void close()
	{
		System.out.println("closing the door, thank you");
		door.changeState(ClosedDoor.createClosedDoor(door));
	}
	

}
