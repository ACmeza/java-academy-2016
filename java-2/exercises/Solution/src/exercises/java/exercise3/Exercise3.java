package exercises.java.exercise3;
public class Exercise3 {

	public static void main(String[] args) {
		Shape a = Shape.CIRCLE;
		
		//Switch for an enum
		switch(a){
		case SQUARE: 
			System.out.println("Square");
			break;	
		case TRIANGLE: 
			System.out.println("Triangle");
			break;	
		case CIRCLE: 
			System.out.println("Circle");
			break;	
		}
		//Iterate through an enum
		for(Shape b : Shape.values()){
			System.out.println(b.toString());
		}
	}

}
