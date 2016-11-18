package exercises.java.exercise3;

public class Animal {
	//Private 
	private String sound;
	private String type;
	private int age;
	
	//Empty Constructor
	public Animal(){
		sound = "";
		type = "";
		age = 0;
	}
	//Data Constructor
	public Animal(String sound, String type,int age){
		this.sound = sound;
		this.type = type;
		this.age = age;
	}
	
	@Override
	public String toString(){
		return sound;
	}
	
	public void makeSound(){
		System.out.println(this.sound);
	}
	
	public void makeSound(int n){
		for(int i = 0; i < n; i++){
			System.out.println(this.sound);
		}
	}
	
	//Get and Set methods due to the data being private 
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
