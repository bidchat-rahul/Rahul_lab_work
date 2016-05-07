package semExam;
public interface Subject {

	void AddObserver(Observer o);
	void RemoveObserver(Observer o);
	void NotifyObservers();
	
}