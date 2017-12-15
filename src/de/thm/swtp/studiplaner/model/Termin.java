package de.thm.swtp.studiplaner.model;

public class Termin {

	private String date;
	private String entry;
	
	public Termin(String date, String entry) {
		this.date = date;
		this.entry = entry;
		
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setEntry(String entry) {
		this.entry = entry;
	}
	
	public String getEntry() {
		return entry;
	}
	
	 @Override
	   public String toString() {
	        return ("Datum: "+ this.getDate() + " Eintrag: "+ this.getEntry());
	   }
	
}
