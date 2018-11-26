package Account;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	public static void main(String [] args) {
	// GregorianCalendar date = new GregorianCalendar();
	
	
     
	
	/*date.set(date.YEAR, 1997);
	date.set(date.DATE,15);
	date.set(date.MONTH, 10);
	SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
	
	
	String s = fmt.format(date.getTime());
	System.out.println(s);*/
	
	
	
	
	
	Date d = new Date(1,10,2018);
	
	Account acc = new Account(1122,20000,4.5,d);
	
	acc.withdraw(2500);
	acc.deposit(3000);
	System.out.println(acc.toString());
	
	
	
	}
}
