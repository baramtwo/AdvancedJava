package kr.co.ioacademy;


class Cursor {
	public static Cursor instance = null;
	public static Cursor getInstance() {
	 	if (instance == null)
			instance = new Cursor();
	
			return instance;
	}

	private Cursor() {
		System.out.println("Cursor() created");
	}

	public static void foo() {
		System.out.println("foo");
	}
}

public class Example6 {
	public static void main(String[] args) {
		Cursor.foo();
		Cursor.getInstance();
	}
}
