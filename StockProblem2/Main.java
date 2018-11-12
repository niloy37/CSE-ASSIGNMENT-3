package Stock;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Stock s1 = new Stock ("ORCL","Oracle Corporation");
		s1.setCurrentPrice(34.35);
		s1.setPreviousClosingPrice(34.5);
		double percent = s1.getChangePercent();
		percent = Math.round(percent*100d)/100d;
		
		System.out.println("The price change percentage is "+percent+"%");
	}

}
