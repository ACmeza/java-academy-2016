package exercises.java.exercise2;

import java.util.Arrays;
import java.util.Collections;

public class Exercise2_2 {

	public static void main(String[] args) {
		//I'm not so sure I understood correctly this exercise. What I understood is that I was supposed to shuffle 
		//the args array so it was in a random order, then display it using the for each loop.
		Collections.shuffle(Arrays.asList(args));
		for(String s : args) {
            System.out.println(s);
        }

	}

}
