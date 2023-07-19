package Chapter08.C_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Input/Output: 컴퓨터와 사용자 혹은 다른 컴퓨터와 프로그램간의 정보(데이터) 교환
// Data: 자바 프로그램 내에서 처리할 수 있는 모든 데이터를 의미
//		ex)디스크상 존재하는 데이터 또는 키보드, 마우스와 같은 외부 입력장치에서 입력되는 데이터

// Stream: 자바 프로그래밍이 디스크에 접근해 데이터를 주고받는 작업을 도와주는 (가상)통로
//			- 스트림의 양 끝에서 전달이 이루어진다.
//			- 단방향 통신, 입력 스트림과 출력 스트림을 별도로 사용, FIFO 구조를 이룬다.
//			- FIFO(First In First Out): 선입선출 구조

// 입출력 스트림의 종류 
// 바이트(byte)기반 스트림: byte 단위로 파일을 읽고 출력할 때 사용, 모든 타입의 데이터 가능
// 문자(char)기반 스트림: 문자 단위로 파일을 읽고 출력할 때 사용, 문자 데이터 가능

public class A_IO01 {
	public static void main(String[] args) {
		
		// 0. 파일 IO 클래스
		// - File: 파일이나 디렉토리 경로명을 추상화한 클래스
		//			파일 및 디렉토리(폴더)의 생성, 삭제, 이름 변경 등을 수행 가능
		
		// 1. 바이트(byte)기반 스트림
		// 1byte = 8bit
		
		// - FileInputStream: 파일에서 바이트를 읽어들이는 클래스
		// - FileOutputStream: 파일에 바이트를 쓰는 클래스
		
		// - BufferedInputStream: 입력 스트림에 버퍼를 제공하여 입출력 효율을 향상시키는 클래스
		// - BufferedOutputStream: 출력 스트림에 버퍼를 제공하여 입출력 효율을 향상시키는 클래스
		
		try {
			// input.txt 파일의 내용을 읽고, output.txt 파일로 복사하는 역할
			FileInputStream in = new FileInputStream("input.txt");
			FileOutputStream out = new FileOutputStream("output.txt");
			
			// 파일에서 읽은 바이트를 저장할 변수
			int c;
			// in.read(): 파일에서 한 바이트씩 읽어오는 메소드
			// 반환값이 -1이 아닌 동안 루프가 실행
			while((c = in.read()) != -1) {
				// 읽은 바이트 c를 output.txt 파일에 씁니다.
				out.write(c);
			}
			
			in.close();
			out.close();
			

		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		// 2. 문자(char) 기반 스트립
		// - 유니코드 문자 데이터를 위한 I/O 스트림
		
		// - FileReader: 파일에서 문자를 읽어들이는 클래스
		// - FileWriter: 파일에 문자를 쓰는 클래스
		// - BufferedReader: 입력 스트림에 버퍼를 제공하여 입출력 효율을 향상시키는 클래스
		// - BufferedWriter: 출력 스트립에 버퍼를 제공하여 입출력 효율을 향상시키는 클래스
		
		try {
			// 문자 스트림을 이용해
			// input.txt 파일의 내용을 output.txt 파일로 복사하는 코드
			FileReader reader = new FileReader("input.txt");
			FileWriter writer = new FileWriter("output.txt");
			
			int c;
			while ((c = reader.read()) != -1) {
				writer.write(c);
			}
			
			reader.close();
			writer.close();
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		// 자바 IO 클래스 예제
		
		// File 클래스 사용 예제
		// : File 클래스 사용하여 test.txt 이름의 파일 객체 file을 생성
		File file = new File("test.txt");
		
		// FileOutputStream 클래스 사용 예제
		// : file 을 대상으로 하는 fos 객체를 생성
		try(FileOutputStream fos = new FileOutputStream(file)) {
			String content = "This is a test.";
			// getBytes()메소드를 사용하여 배열로 변환한 후, 파일에 기록
			fos.write(content.getBytes());
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		// FileInputStream 클래스 사용 예제
		try(FileInputStream fis = new FileInputStream(file)) {
			int content;
			while((content = fis.read()) != -1) {
				System.out.print((char)content);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}	
	}
}
