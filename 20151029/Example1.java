package kr.co.ioacademy;

class RandomIntGenerator
{
	private final int min;
	private final int max;
	
	public RandomIntGenerator(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public RandomIntGenerator(int min) {
		this.min = min;
		this.max = Integer.MAX_VALUE;
	}	
	
}

public class Example1 {
	public static void main(String[] args) {
		RandomIntGenerator obj1 = new RandomIntGenerator(0, 100);
		RandomIntGenerator obj2 = new RandomIntGenerator(0); 
	}
}





