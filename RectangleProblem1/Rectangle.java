package Rectangle;

public class Rectangle {
  private double width=1;
  private double height=1;
  Rectangle() {
	  
  }
  Rectangle (double width,double height){
	  this.width=width;
	  this.height=height;
	  
  }
  
   public double showArea() {
	   return this.width*this.height;
   }
   public double showPerimeter() {
	   return this.width+this.width+this.height+this.height;
   }
   
   public double getWidth() {
	   return this.width;
   }
   public double getHeight() {
	   return this.height;
   }
  
  
  
  
  
}
