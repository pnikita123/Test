package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream=new FileOutputStream("c:\\Java\\abc.txt");
		String str="Hello user";
		byte bArr[]=str.getBytes();
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("File created");
	}

}
