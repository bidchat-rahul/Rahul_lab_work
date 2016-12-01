package freeThinkAssignment;

import java.util.ArrayList;

public class LocationAtData {
	
	private String names;
	private ArrayList<String> staff;
	private ArrayList<String> crusis;
	private int review;
	
	public LocationAtData(String names, ArrayList<String> staff, ArrayList<String> crusis, int review) {
		super();
		this.names = names;
		this.staff = staff;
		this.crusis = crusis;
		this.review = review;
	}

	public String getNames() {
		return names;
	}

	public ArrayList<String> getStaff() {
		return staff;
	}

	public ArrayList<String> getCrusis() {
		return crusis;
	}

	public int getReview() {
		return review;
	}
	
	
	
	
	
	

}
