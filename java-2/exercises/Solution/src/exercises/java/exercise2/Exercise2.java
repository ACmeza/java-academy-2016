package exercises.java.exercise2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise2 {

	public static void main(String[] args) {
		//Looping a Set.
		System.out.println("Looping a Set:");
		Set<Integer>grades = new HashSet<Integer>();
		grades.add(1);
		grades.add(2);
		grades.add(3);
		grades.add(4);
		grades.add(5);
		grades.add(6);
		for(Integer grade : grades){
			System.out.println(grade);
		}
		
		//Set Ordering
		System.out.println("\nSet and Ordering:");
		Set names = new HashSet();
		names.add("Jake");
		names.add("Robert");
		names.add("Marisa");
		names.add("Kasey");
		names.add("John");
		names.add("An");
		System.out.println(names);
		
		Set names2 = new TreeSet();
		names2.add("Jake");
		names2.add("Robert");
		names2.add("Marisa");
		names2.add("Kasey");
		names2.add("John");
		names2.add("An");
		System.out.println(names2);
		
		Set names3 = new LinkedHashSet();
		names3.add("Jake");
		names3.add("Robert");
		names3.add("Marisa");
		names3.add("Kasey");
		names3.add("John");
		names3.add("An");
		System.out.println(names3);
	}

}
