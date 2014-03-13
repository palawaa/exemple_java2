package ro.meditatii.test.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List strings = new ArrayList<String>();
		
		strings.add("Hello, ");
		strings.add("Dave!");
		String greeting = (String)strings.get(0) + (String)strings.get(1);
		System.out.println(greeting);
		
		Integer e = new Integer(3);
		
		List<Number> numere = new ArrayList<>();
		numere.add(3);
		numere.add(3.14d);
		System.out.println(numere);
		
		List<Integer> intregi = new ArrayList<>();
		List<? extends Number> num2 = new ArrayList<>();
		num2 = intregi;
		
	}

}
