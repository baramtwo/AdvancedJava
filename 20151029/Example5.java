package kr.co.ioacademy;

class Cursor {
	public static final Cursor INSTANCE = new Cursor();
	private Cursor() {
		System.out.println("Cursor() created");
	}	
	
	public static void foo () {
		System.out.println("foo");
	}
}

public class Example5 {
	public static void main(String[] args) {
		Cursor.foo();
	}
}


