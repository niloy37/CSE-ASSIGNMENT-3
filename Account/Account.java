package Account;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	
	
	
	Account(){
		
	}
	Account(int id,double balance,double annualInterestRate,Date dateCreated) {
		
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
		this.dateCreated=dateCreated;
		
	}
	
	
	public int getId(){
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public void setDate(Date dateCreated) {
		this.dateCreated=dateCreated;
	}
	
	
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate/100)/12;
	}
	public double getMontlyInterest() {
		double month = (this.annualInterestRate/100)/12;
		return this.balance*month;
		
		
	}
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public String toString() {
		return "ID- "+this.id+" Balance-"+this.balance+" Annual Interest Rate"+this.annualInterestRate+" Date Created-"+this.dateCreated.toString();
	}
	

}
