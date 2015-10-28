package kr.co.ioacademy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

import org.junit.Test;

class Cursor implements Serializable {
	private Cursor() {
	}

	private static final Cursor INSTANCE = new Cursor();

	public static Cursor getInstance() {
		return INSTANCE;
	}
}

public class Example4 {
	@Test
	public void Serialize() throws Exception {
		String fileName = "cursor.dat";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(Cursor.getInstance());
		
		fos.close();
		oos.close();
			
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Cursor c = (Cursor) ois.readObject();
	
		if (c != Cursor.getInstance())
			System.out.println("Not Singleton");
		else
			System.out.println("Singleton");
	}

	@Test
	public void Reflection() throws Exception {
		Constructor<?> con = Cursor.class.getDeclaredConstructors()[0];
		con.setAccessible(true);

		Cursor c = (Cursor) con.newInstance();
		System.out.println(c);

		System.out.println(Cursor.getInstance());
	}
}
