package exercises.java.exercise4;

public class Exercise4 {

	public static int decode(String code){
		return Integer.parseInt(code, 2);
	}

	public static void main(String[] args) {
		
		String binaryNum = "11";
		int intNum = decode(binaryNum);
		System.out.println(intNum);
	}

}
