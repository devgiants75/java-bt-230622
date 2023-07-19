package Chapter08.C_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Buffer(버퍼): 데이터를 임시로 저장하는 공간
//				데이터를 한 곳에서 다른 곳으로 전달할 때 임시로 그 데이터를 보관하는 메모리 영역

// 버퍼링: 버퍼가 일어나는 프로세스
public class C_IO03 {
	public static void main(String[] args) {
		
		// BufferedReader 사용 예시
		try(BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
		// BufferedWriter 사용 예시
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered2.txt"))) {
			bw.write("안녕하세요. 반갑습니다.");
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
	}
}
