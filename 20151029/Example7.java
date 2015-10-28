package kr.co.ioacademy;

import java.util.Calendar;

class Person {
	public static final Person INSTANCE = new Person();

	private final int weight;
	public static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

	private Person() {
		weight = CURRENT_YEAR - 1984;
	}

	public int weight() {
		return weight;
	}
}

public class Example7 {
	public static void main(String[] args) {
		System.out.println(Person.INSTANCE.weight());
	}
}
