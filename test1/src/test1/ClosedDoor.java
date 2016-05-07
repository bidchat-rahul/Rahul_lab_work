package test1;

public class ClosedDoor extends DoorState {
	
private static ClosedDoor closedDoorinstance;


private ClosedDoor(Door door)
{
	setDoor(door);
}

//singleton method creates instance of closed door
public static ClosedDoor createClosedDoor(Door door)
{
	if(closedDoorinstance == null)
		closedDoorinstance = new ClosedDoor(door);
	System.out.println("the door is now in closed state");
	return closedDoorinstance;
}

public void open()
{
	System.out.println("Door is being opened welcome");
	door.changeState(OpenDoor.createOpenDoor(door));
}

public void close()
{
	System.out.println("Door is already closed");
}
}

