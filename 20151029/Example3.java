package kr.co.ioacademy;

class Cursor {
	private Cursor() {
	}

	public static final Cursor INSTANCE = new Cursor();
	public static Cursor getInstance() {	
		return INSTANCE;
	}
}

public class Example3 {
	public static void main(String[] args) {
		System.out.println(Cursor.getInstance());
		System.out.println(Cursor.getInstance());
	}
}
