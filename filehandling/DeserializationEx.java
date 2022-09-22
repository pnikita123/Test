package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ObjectInputStream  objectInputStream = new  ObjectInputStream (new FileInputStream("C:\\Java\\ser.txt"));
		Employee emp= (Employee) objectInputStream.readObject();
		System.out.println(emp);
		objectInputStream.close();
		

	}

}
