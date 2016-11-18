package exercises.java.exercise5;

public class CharSequenceImplementation implements CharSequence {
	private String s;
	
	public CharSequenceImplementation(){
		this.s = "";
	}
	public CharSequenceImplementation(String s){
		
		//Reverses the string in the constructor
		char[] arrayS = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(start<end){
			char temp = arrayS[start];
			arrayS[start]=arrayS[end];
			arrayS[end]= temp;
			start++;
			end--;
		}
		this.s = new String(arrayS);
	}
	
	public void print(){
		System.out.println(s);
	}
	
	public void setString(String s){
		this.s = s;
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return s.length();
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return s.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return s.subSequence(start, end);
	}
	
	@Override
	public String toString(){
		return s.toString();
	}

}
