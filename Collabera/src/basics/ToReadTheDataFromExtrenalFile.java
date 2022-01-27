package basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToReadTheDataFromExtrenalFile {

	public static void main(String[] args) throws IOException    {
//		FileInputStream fis= new FileInputStream("C:\\Users\\vams\\Desktop\\java\\Collabera\\Demo.docx");
//		int c = fis.read();
//		while(c!=0) {
//			System.out.println((char)c);
//			c=fis.read();
//		}
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\vams\\Desktop\\java\\Collabera\\Write.text");
		
		fos.write('A');
		fos.write('B');
		
	}

}
