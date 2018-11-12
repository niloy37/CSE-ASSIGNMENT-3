package Stock;
import java.util.*;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	Stock (String symbol,String name){
		this.symbol=symbol;
		this.name=name;
		
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice=previousClosingPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice=currentPrice;
	}
	
	public double getChangePercent() {
		
		double change = this.previousClosingPrice-this.currentPrice;
		change = Math.abs(change);
		
		return (change*100)/this.previousClosingPrice;
	}
	

}
