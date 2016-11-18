package exercises.java.exercise3;

public enum Shape {
	SQUARE("SQUARE"),
	CIRCLE("CIRCLE"),
	TRIANGLE("TRIANGLE");
	
	private String s;
	
	private Shape(String s){
		this.s = s;
	}
	
	@Override
	public String toString(){
		return s;
	}
}
