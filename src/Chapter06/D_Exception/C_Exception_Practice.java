package Chapter06.D_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 사용자로 부터 값을 입력 받는 코드를 작성
// 입력 받은 값을 int 변수에 할당
// 에러 발생하지 않은 경우 "입력하신 숫자는 5입니다."

// 정수가 아닌 다른 타입의 입력이 들어올 경우
// InputMismatchException을 통해 에러를 처리
// 에러 메시지: "정수가 아닌 다른 타입의 입력이 들어왔습니다."

// 오류 발생 여부와 상관없이 scanner.close(); 코드를 실행
public class C_Exception_Practice {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("정수를 입력하세요.");
			int number = scanner.nextInt();
			System.out.println("입력하신 숫자는 " + number + "입니다.");			
		} catch (InputMismatchException exception) {
			System.out.println("정수가 아닌 다른 타입의 입력이 들어왔습니다.");
		} finally {
			scanner.close();
		}
	}
}
