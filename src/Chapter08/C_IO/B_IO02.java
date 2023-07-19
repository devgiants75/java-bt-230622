package Chapter08.C_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_IO02 {
	public static void main(String[] args) {
//		FileInputStream & FileOutputStream
		
		try {
			FileInputStream fis = new FileInputStream("input.txt");
			
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
			fis.close();
		} catch (IOException exption) {
			exption.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			
			// 문자열을 바이트 배열로 변환한 후 그 바이트 배열을 파일에 쓰는 예제
			String str = "Hello, World";
			byte[] bytes = str.getBytes();
			
			fos.write(bytes);
			
			fos.close();
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
		// 파일 읽기와 쓰기 예제
		// FileReader, FileWriter, BufferedReader, BufferedWriter 
		
		try(FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr)) {
			
			String line;
			// readLine(): 한 줄을 읽어 문자열로 반환, 파일의 끝에 도달하면 null을 반환
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
		try(FileWriter fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			bw.write("Hello IO");
			bw.newLine();
			bw.write("This is a Java file writing example");
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
