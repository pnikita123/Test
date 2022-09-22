package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	public static void main(String[] args) throws IOException{
		Employee emp=new Employee(101,"raj");
		FileOutputStream  outputStream = new  FileOutputStream(" C:\\Java\\ser.txt");
		ObjectOutputStream objectOutputStream =new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(emp);
		outputStream.flush();
		System.out.println("Convert into stream");
		
		
	}

}
