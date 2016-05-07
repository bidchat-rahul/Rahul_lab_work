package test1;

//abstract class
public abstract class DoorState { 

//connect to door class as it needs to change the state 
Door door;

//these are two abstract methods to  be implemented in subclasses
public abstract void open(); 
public abstract void close();

//set the door to particular door value
public void setDoor(Door door)
{
	this.door=door;
}
}