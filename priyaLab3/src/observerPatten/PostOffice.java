package observerPatten;


import java.util.*;
import java.util.ArrayList;

public class PostOffice implements Subject {
	private String Address;
	
public String getAddress()
{
	return Address;
}

private ArrayList<Observer> observers;

public PostOffice (String Address)
{
	super();
	this.Address = Address;
	observers = new ArrayList<Observer>();
}

public void newMail()
{
	NotifyObservers();
}

public void AddObserver(Observer o)
{
	observers.add(o);
}

public void RemoveObserver(Observer o)
{
	observers.remove(o);
}

public void NotifyObservers()
{
	for(int i=0; i<observers.size();i++)
	{
		observers.get(i).Update();
	}
}
}

