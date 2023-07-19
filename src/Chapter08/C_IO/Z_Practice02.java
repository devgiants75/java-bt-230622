package Chapter08.C_IO;
// employee.txt

//John,5000
//Jane,5500
//Peter,5200
//Lucy,6000
//David,4800

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// employee.txt 파일을 읽고 난 후
// 각 줄을 분석하여 직원의 이름과 월급을 분리
// 평균 월급을 계산하고 출력
public class Z_Practice02 {
	public static void main(String[] args) {
		String fileName = "employee.txt";
		BufferedReader reader = null;
		int totalSalary = 0;
		int employeeCount = 0;
		
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line;
			
			while((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				String name = parts[0].trim();
				int salary = Integer.parseInt(parts[1].trim());
				totalSalary += salary;
				employeeCount++;
			}
			
			double average = (double) totalSalary / employeeCount;
			System.out.println("평균 월급은" + average);
			
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
