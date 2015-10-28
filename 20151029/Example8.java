package kr.co.ioacademy;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

class Person {
	private final Date birthDate;

	public Person(Date b) {
		this.birthDate = b;
	}

	public boolean isTeenager() {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1996, Calendar.JANUARY, 1, 0, 0, 0);
		Date start = gmtCal.getTime();
		gmtCal.set(2005, Calendar.JANUARY, 1, 0, 0, 0);
		Date end = gmtCal.getTime();

		return birthDate.compareTo(start) >= 0 && birthDate.compareTo(end) < 0;
	}
}

public class Example8 {
	@Test
	public void slow_isBabyBoomer() {
		Calendar c = Calendar.getInstance();
		c.set(1984, Calendar.MAY, 5);

		Person p = new Person(c.getTime());
		for (int i = 0; i < 10000000; ++i) {
			p.isTeenager();
		}
	}
}
