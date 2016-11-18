package exercises.java.exercise5;

public class Square extends Rectangle {

	public Square(){
		super();
	}
	
	public Square(double size){
		super(size,size);
	}
	
	public Square(double size, String color, boolean filled){
		super(size,size,color,filled);
	}
	
	public double getSide(){
		return heigth;
	}
	
	public void setSide(double side){
		this.heigth = side;
		this.width = side;
	}
	
	@Override
	public void setWidth(double width) {
		this.width = width;
		this.heigth = width;
	}
	
	@Override
	public void setHeigth(double heigth) {
		this.heigth = heigth;
		this.width = heigth;
	}
	
	@Override
	public String toString(){
		return "square";
	}
}
