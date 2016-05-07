package test1;

public class Door {
private DoorState doorState;

public Door()
{
	System.out.println("The door is craeted");
	this.doorState = ClosedDoor.createClosedDoor(this);  //this is ex of singlton factory method that creates closed door and assigns closed state
}

public void open() //delegate the behavior to subclasses of door state
{
	System.out.println("open opertaion now called on door");
	doorState.open();
}

public void close()
{
	System.out.println("close operation now called on door");
	doorState.close();
}

public void changeState(DoorState doorState) //set the state to arguments
{
	this.doorState=doorState;
}



}
