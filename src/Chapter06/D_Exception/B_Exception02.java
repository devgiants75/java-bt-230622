package Chapter06.D_Exception;

import java.io.FileReader;
import java.io.IOException;

class CustomException extends Exception {
	CustomException(String message) {
		super(message);
	}
}

public class B_Exception02 {
	public static void main(String[] args) {
		// 1. NullPointerException: null 참조를 시도할 때 발생
		
		String str = null;
		
		try {
			System.out.println(str.length());
		} catch (NullPointerException exception) {
			System.out.println("Null 참조 에러입니다.");
		}
		
		// 2. ArrayIndexOutOfBoundsException
		// : 배열의 범위를 초과하는 인덱스에 접근할 때 발생
		
		int[] array = new int[10]; // 배열의 길이 10 (인덱스 번호 0 ~ 9)
		
		try {
			array[10]= 5; // 인덱스 번호			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("배열 범위 초과 에러입니다.");
		}
		
		// 3. NumberFormatException
		// : 숫자로 변환할 수 없는 문자열을 숫자로 변환하려고 할 때 발생
		
		try {
			int num = Integer.parseInt("XYZ");			
		} catch (NumberFormatException exception) {
			System.out.println("숫자 변환 에러입니다.");
		}
		
		// 4. IOException
		// : 입출력 작업 중 예외가 발생할 경우 사용되는 체크 예외
		try {
			FileReader reader = new FileReader("non_existent_file.txt");			
		} catch (IOException exception) {
			System.out.println("파일 입출력 에러입니다.");
		}
		
		// 5. 사용자 정의 예외
		// : 상황에 맞게 사용자가 직접 정의하여 사용하는 예외
		try {
			throw new CustomException("사용자 정의 예외 발생");
		} catch (CustomException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
