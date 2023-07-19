package Chapter08.C_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 1. 예제 실습

// 프로그램의 요구사항
// - students.txt 파일을 읽은 후
// - 각 줄을 분석하여 학생의 이름과 점수를 분리
// - 평균 성적을 계산하고 출력
public class Z_Practice {
	public static void main(String[] args) {
		
		// 읽을 파일의 이름을 지정
		String fileName = "students.txt";
		
		// BufferedReader 객체를 선언: 해당 객체를 사용해 파일을 읽음.
		BufferedReader reader = null;
		
		// 총 점수를 저장할 변수와 학생 수를 저장할 변수를 선언
		int totalScore = 0;
		int studentCount = 0;
		
		try {
			// 파일을 읽기 위해 FileReader로 BufferedReader를 생성
			reader = new BufferedReader(new FileReader(fileName));
			
			// 각 줄을 저장할 문자열 변수를 선언
			String line = null;
			
			// 파일의 끝에 도달할 때까지 각 줄을 읽어옴
			while ((line = reader.readLine()) != null) {
				// 각 줄을 쉼표 기준으로 분리하여 이름과 점수를 분리
				String[] parts = line.split(",");
				// 이름은 첫 번째 배열이며, 공백을 제거
				String name = parts[0].trim();
				// 점수는 두 번째 배열이며, 공백을 제거하고 정수로 변환
				int score = Integer.parseInt(parts[1].trim());
				// 학생의 점수의 총합
				totalScore += score;
				// 학생의 수를 증가
				studentCount++;
			}
			
			// 평균 점수를 계산하고 출력
			double average = (double) totalScore / studentCount;
			System.out.println("평균 점수는 : " + average);	
		} catch(IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				// 파일 읽기가 끝난 후 BufferedReader를 닫음.
				if (reader != null) {
					reader.close();
				}
			} catch (IOException exception) {
				// 파일 닫기 중에 발생한 예외를 처리
				exception.printStackTrace();
			}
		}
		
		
	}
}
