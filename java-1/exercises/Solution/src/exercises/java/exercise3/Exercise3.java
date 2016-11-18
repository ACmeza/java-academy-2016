package exercises.java.exercise3;

public class Exercise3 {

	public static void main(String[] args) {
		//Creation of animals with Data Constructor
		Animal dog = new Animal("woof","mammal",2);
		Animal cat = new Animal("meow","mammal",4);
		//Creation of animals with Empty Constructor
		Animal bird = new Animal();
		//Modify animal's age
		bird.setAge(1);
		bird.setSound("A");
		dog.makeSound();
		cat.makeSound(3);
		bird.makeSound();
		System.out.println(dog.getAge());
		System.out.println(dog.getSound());
		System.out.println(dog.getType());
	}

}
