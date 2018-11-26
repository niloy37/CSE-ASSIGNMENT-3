package savingschecking;

import Account.Date;

public class SavingsAccount extends Account {
	
	private String s;
	
	SavingsAccount(){
		
	}
	SavingsAccount(int id,double balance,double annualInterestRate,Date dateCreated,String s){
		super(id,balance,annualInterestRate,dateCreated);
		this.s=s;
	}
	
	public String toString() {
		return super.toString()+" Savings Account Cannot be OverDrawn";
	}

}
