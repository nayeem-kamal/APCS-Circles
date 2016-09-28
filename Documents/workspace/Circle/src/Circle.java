
public class Circle {
private int x;
private int y;
private int radius;


	public Circle(){
		x = 0;
		y = 0;
		radius = 1;
		
	}
	public Circle(int newx, int newy){
		x = newx;
		y = newy;
		radius = 1;
		
	}
	public Circle(int newx, int newy, int newrad){
		x = newx;
		y = newy;
		radius = newrad;
	}
	public double getArea() {
		return Math.PI*(Math.pow(radius,2));
	}
	public double getCircumference(){
		return 2*Math.PI*radius;
		
	}
	public int getQuadrant(){
		int quadrant = 0;
		if(x == 0 || y == 0){
			
		}
		else if(x > 0 && y > 0){
			quadrant = 1;
			
		}
		else if(x < 0 && y > 0){
			
			quadrant = 2;
		}
		else if(x < 0 && y < 0){
			quadrant = 3;
		}
		else if(x > 0 && y < 0){
			quadrant = 4;
		}
		return quadrant;
		
	}
	public boolean setX(int newX){
		if (newX >= -100 && newX <= 100){
			x = newX;
			return true;
			
		} else {
			return false;
		}
	}
	public boolean setY(int newY){
		if (newY >= -100 && newY <= 100){
			y = newY;
			return true;
			
		} else {
			return false;
		}
	}
	
	
	
	
}
