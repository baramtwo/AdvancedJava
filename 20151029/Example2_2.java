package kr.co.ioacademy;

import org.junit.Test;

public class Example2_2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		Boolean b1 = new Boolean(true);
		Boolean b2 = Boolean.valueOf(true);
	}
	
	@Test
	public void test_long() {
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; ++i) {
			sum += i;
		}

		System.out.println(sum);
	}

	@Test
	public void test_Long() {
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; ++i) {
			sum += i;
		}

		System.out.println(sum);
	}
}
