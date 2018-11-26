package Location;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Enter row and column");
		Scanner var = new Scanner(System.in);
		int row=var.nextInt();
		int column = var.nextInt();
		double [][] a = new double [row][column];
		
		System.out.println("Enter input");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]= var.nextDouble();
			}
		}
		
		
		
		Location locate = locateLargest(a);
		System.out.println(locate.toString());
	}
	
	
	public static Location locateLargest(double [] []a) {
		Location l = new Location();
		double max = a[0][0];
		int row=0; int column=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
                  if(max<a[i][j]) {
                	  max=a[i][j];
                	  l.row=i;
                	  l.column=j;
                	  l.maxValue=max;
                	  
                  }
			}
		}
		return l;
	}

}
