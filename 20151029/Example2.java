package kr.co.ioacademy;

class RandomIntGenerator {
	private int min;
	private int max;

	private RandomIntGenerator(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public static RandomIntGenerator between(int min, int max) {
		return new RandomIntGenerator(min, max);
	}
	
	public static RandomIntGenerator biggerThan(int min) {
		return new RandomIntGenerator(min, Integer.MAX_VALUE);
	}

	public static RandomIntGenerator smallerThan(int max) {
		return new RandomIntGenerator(Integer.MIN_VALUE, max);
	}
	
	private static final RandomIntGenerator INSTANCE = new RandomIntGenerator(Integer.MIN_VALUE, Integer.MAX_VALUE);
	public static RandomIntGenerator getInstance() {
		return INSTANCE;
	}
}

public class Example2 {
	public static void main(String[] args) {

		RandomIntGenerator obj1 = RandomIntGenerator.between(0, 100);
		RandomIntGenerator obj2 = RandomIntGenerator.smallerThan(200);
		RandomIntGenerator obj3 = RandomIntGenerator.biggerThan(20);
		
	}
}




















