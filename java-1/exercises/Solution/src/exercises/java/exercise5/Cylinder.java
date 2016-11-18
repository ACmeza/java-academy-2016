package exercises.java.exercise5;

public class Cylinder extends Circle {

	private double heigth;
	
	public Cylinder(){
		super();
		heigth=0;
	}
	
	public Cylinder(double radius){
		super(radius);
		heigth=0;
	}
	
	public Cylinder(double radius, double heigth){
		super(radius);
		this.heigth = heigth;
	}
	
	public Cylinder(double radius, double heigth, String color, boolean filled){
		super(radius, color, filled);
		this.heigth = heigth;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public double getVolume(){
		return 3.141592 * radius * radius*heigth;
	}
	
	@Override
	public String toString(){
		return "cylinder";
	}
}
