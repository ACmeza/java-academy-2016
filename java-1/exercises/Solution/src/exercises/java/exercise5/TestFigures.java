package exercises.java.exercise5;

public class TestFigures {

	public static void main(String[] args) {
		//Shapes
		System.out.println("SHAPES:");
		Shape a = new Shape();
		System.out.println(a.toString());
		
		//Rectangles
		System.out.println("\nRECTANGLES:");
		Rectangle b = new Rectangle();
		b.setHeigth(2);
		b.setWidth(12);
		b.setFilled(false);
		b.setColor("black");
		Rectangle c = new Rectangle(1.2,1.0,"red",true);
		
		System.out.println(b.toString());
		System.out.println("Area: "+b.getArea());
		System.out.println("Perimeter: "+b.getPerimeter());
		
		System.out.println("\n"+c.toString());
		System.out.println("Area: "+c.getArea());
		System.out.println("Perimeter: "+c.getPerimeter());
		
		//Squares
		System.out.println("\nSQUARES:");
		Square d = new Square(22,"blue",false);
		d.setWidth(3);
		System.out.println(d.toString());
		System.out.println("Area: "+d.getArea());
		System.out.println("Perimeter: "+d.getPerimeter());
		
		//Circles
		System.out.println("\nCIRCLES:");
		Circle e = new Circle(22);
		e.setFilled(true);
		System.out.println(e.toString());
		System.out.println("Area: "+e.getArea());
		System.out.println("Perimeter: "+e.getPerimeter());
		
		//Cylinder
		System.out.println("\nCYLINDERS:");
		Cylinder f = new Cylinder(2,1);
		System.out.println(f.toString());
		System.out.println("Area: "+f.getArea());
		System.out.println("Perimeter: "+f.getPerimeter());
	}

}
