package exercises.java.exercise5;

public class Rectangle extends Shape{
	
	protected double width;
	protected double heigth;
	
	public Rectangle(){
		super();
		width = 0;
		heigth = 0;
	}
	
	public Rectangle(double width,double heigth){
		super();
		this.width=width;
		this.heigth=heigth;
	}
	
	public Rectangle(double width,double heigth, String color, boolean filled){
		super(color,filled);
		this.width=width;
		this.heigth=heigth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	@Override
	public double getArea(){
		return width*heigth;
	}
	
	@Override
	public double getPerimeter(){
		return width*2 + heigth*2;
	}
	
	@Override
	public String toString(){
		return "rectangle";
	}

}
