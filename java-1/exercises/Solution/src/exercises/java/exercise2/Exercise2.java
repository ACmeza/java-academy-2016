package exercises.java.exercise2;

public class Exercise2 {
	//Class Scope
	int varClassScope = 2;
	
	public static void main(String[] args) {
		//Method Scope
		int varMethodScope = 2;
		
		while(varMethodScope<4){
			//Loop Scope
			int varLoopScope = 2;
			varMethodScope++;
		}
		
		//Primitive Variables
		byte primitiveByte = 0;
		int primitiveInt = 1;
		short primitiveShort = 1;
		long primitiveLong = 100000000;
		float primitiveFloat = 1.0f;
		double primitiveDouble = 1.99;
		char primitiveChar = 's';
		boolean primitiveBoolean = true;
		
		//Strings Creation
		String firstString = "String1";
		char[] charArray = { 'S', 't', 'r', 'i', 'n', 'g', '2'};
		String secondString = new String(charArray);
		System.out.println(firstString + " " + secondString);
		
		//Array Initialization
		int[] firstIntArray = { 1, 2, 3};
		int[] secondIntArray = new int[3];
		
		for(int i = 0; i < 3; i++){
			secondIntArray[i]=i+1;
		}
		
		//Operators
		//Assignment Operators
		int a = 2;
		int b = 1;
		a+=1;
		a-=1;
		//Math Operators
		int sum = a + b;
		int substraction = a - b;
		int multiplicaction = a * b;
		int division = a / b;
		a++;
		a--;
		//Relational Operators
		if(a > b){}
		if(a < b){}
		if(a == b){}
		if(a >= b){}
		if(a <= b){}
		if(a != b){}
		//Logical Operators
		if(a > b && a != 1){}
		if(a < b || a != 1){}
		if(!(a == b)){}
		//Bitwise Operators
		int c = a&b;
		int d = a|b;
		int e = ~a;
		int f = a << 2;
		int g = a >> 2;
	}

}
