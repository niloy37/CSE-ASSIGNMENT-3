package savingschecking;
import java.util.*;

public class Main {
public static void main(String[] args) {
	Account [] p = new Account [10];
	
	Date date = new Date(12,9,2011);
	Date date2 = new Date(11,9,2012);
	
	
	for(int i=0;i<10;i++) {
		if(i%2==0) {
			p[i]= new SavingsAccount(i+10,5000.5,3.5,date,"SavingsAccount");
		}
		else p[i]= new CheckingAccount(i+10,5033.78,4.5,date2,"CheckingAccount");
		
		
		System.out.println(p[i].toString());
	}
	
	

	
	
}
}
