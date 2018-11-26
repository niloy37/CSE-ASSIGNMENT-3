package savingschecking;

import Account.Date;

public class CheckingAccount extends Account {
	private String s;
	
CheckingAccount(){
		
	}
	CheckingAccount(int id,double balance,double annualInterestRate,Date dateCreated,String s){
		super(id,balance,annualInterestRate,dateCreated);
		this.s=s;
	}
	
	public String toString() {
		return super.toString()+" "+this.s+" can be OverDrawn";
	}

}
