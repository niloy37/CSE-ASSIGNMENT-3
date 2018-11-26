package Account;

public class Date {
	
	private int date;
	private int year;
	private int month;
	Date() {
		
	}
	
	public Date(int date,int month,int year){
		this.date=date;
		this.year=year;
		this.month=month;
	}
	
	public String toString() {
		return this.date+" "+this.month+" "+this.year;
	}

}
