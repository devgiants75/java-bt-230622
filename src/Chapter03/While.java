package Chapter03;

import java.util.Scanner;

// while 반복문
// 일반적으로 반복 횟수가 지정되지 않을 때 사용하는 반복문

// 조건을 검사하고 해당 조건이 true일 경우 코드 블록을 실행하는 반복문
// if문의 반복 형태
// 반복 실행할 코드 블록이 종료되면 조건을 다시 검사하고 true면 반복!, false면 탈출!
public class While {

	public static void main(String[] args) {

		// 기본 구조
//		while (조건) {
//			// 조건이 true일 때 실행할 코드
//		}
		// 조건: 'while'문의 논리적 테스트, 이 조건이 참인 동안 반복문의 본문이 실행
		// 조건이 거짓이 되면 반복문 종료
		
		// 예제 : 홀수를 출력하는 반복문
		int number = 0;
		
		while (true) {
			if((number % 2) == 0) {
				// 조건문의 코드블록 내에는 해당 변수를 변경시켜주는 코드가 존재해야한다.(증감)
				number++;
				continue;
				// continue문을 만나면 코드블록내에서 continue문 아래에 오는
				// 모든 코드를 무시하고 다시 조건을 검사
				// continue문은 일반적으로 조건문과 함께 쓰임.
			}
			System.out.println(number);
			// while문에서는 조건에 사용되는 변수가
			// 필수로 실행코드 내에서 변경이 이루어져야 한다.
			number++;
			if (number == 10) break;
			// break: 반복문의 코드블록을 강제로 종료 시킬 때 사용
			// break문은 일반적으로 조건문과 함께 쓰임.
		}	
		System.out.println("==========");
		
		
		System.out.println("1부터 10까지의 숫자를 출력");
		// 예제 : 1부터 10까지의 숫자를 출력
		int i = 1;

		while(i <= 10) {
			   System.out.println(i);
			   i++;
		}
		System.out.println("==========");
		
		System.out.println("1부터 100까지의 모든 정수의 합");
		// 예제 : 'while' 반복문을 사용하여 1부터 100까지의 모든 정수를 더하는 코드
		int sum = 0;
		int index = 1;

		while(index <= 100) {
		    sum += index;
		    index++;
		}
		System.out.println("1부터 100까지의 합은: " + sum);
		System.out.println("==========");
		
		System.out.println("숫자를 2로 계속 나누기");
		// 숫자를 2로 계속 나누기
		// 처음 변수는 100으로 초기화
		// while문을 사용
		// 2로 계속 나눈 결괏값을 출력
		
		int number2 = 100;
		
		while (number2 >= 1) {
			number2 /= 2; // number2 = number2 / 2; 
			System.out.println(number2);
		}
		
		// do-while문
		// 반복 실행할 코드를 무조건 한번 실행 한 후에 조건을 검사하는 반복문
		
		// 기본 구조
//		do {
//			// 조건이 참일 때 실행할 코드
//		} while (조건);
		
		// 코드본문을 실행하고, 그 후에 조건을 검사, 조건이 참인 경우 코드본문이 다시 실행
		
		System.out.println("=============");
		// 예제
		int number3 = 0;
		
		do {
			System.out.println(number3);
			number3++;
		} while (number3 < 20);
		System.out.println(number3);
		
		// 예제: 'do-while' 반복문을 사용하여
		// 사용자로부터 'yes' 또는 'no'를 입력 받는 코드
		
		// 조건: yes 또는 no를 입력받지 않을! 경우 반복
		
		// 조건을 일치시키는 속성
//		변수명.equals(값) 
//		input.equals("yes")
		
		// 1. Scanner선언
		// 2. 입력받은 문자열을 담을 변수 선언
		// 3. "yes 또는 no를 입력하세요."를 한번은 무조건 실행
		
		// 출력 (입력받은 값은: yes)
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.println("yes 또는 no를 입력하세요: ");
			input = sc.next();
		} while (!input.equals("yes") && !input.equals("no"));
		
		System.out.println("입력받은 값은: " + input);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
