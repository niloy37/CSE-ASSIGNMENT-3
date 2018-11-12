package Rectangle;

public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2= new Rectangle(3.5,35.9);
		
		//rectangle 1 
		System.out.println("Rectangle 1");
		System.out.println("Width "+r1.getWidth());
		System.out.println("Height "+r1.getHeight());
		System.out.println("Area "+r1.showArea());
		System.out.println("Perimeter "+r1.showPerimeter());
		
		//rectangle 2
		System.out.println("Rectangle 2");
		System.out.println("Width "+r2.getWidth());
		System.out.println("Height "+r2.getHeight());
		System.out.println("Area "+r2.showArea());
		System.out.println("Perimeter "+r2.showPerimeter());
	}

}
