package Chapter03;

import java.util.Scanner;

// switch 조건문
// 특정 변수의 값에 따라 실행할 코드 블록의 범위를 결정하는데 사용

// 비교할 변수를 case 값과 비교하여 같은 case를 찾아 해당 case 구문부터 끝까지 실행
// break 문으로 해당 switch 종료
// default 문으로 해당하는 case가 없을 때 실행할 구문 작성
public class Switch {

	public static void main(String[] args) {

		// switch 사용 방법 (기본형)
		
//		switch (비교할 대상) {
//		case 비교할 값1:
//			비교할 값1과 비교할 대상이 같을 경우 실행할 코드
//		case 비교할 값2:
//			비교할 값2과 비교할 대상이 같을 경우 실행할 코드
//		case 비교할 값3:
//			비교할 값3과 비교할 대상이 같을 경우 실행할 코드
//			break;
//			// break구문으로 switch를 해당 위치에서 종료 시킬 수 있음.
//		default:
//			비교할 대상과 일치하든 안하든 실행할 코드
//		}
		
		// switch : 조건에 따라서 코드 실행 범위를 지정
		
		// 비교할 대상 : 주로 변수 또는 값(데이터)
		// case : 비교할 대상의 값과 일치하는 값
		
		// break 키워드는 현재 case 블록에서 빠져나가 switch문을 종료하는 역할
		// 만약 break가 없으면, 그 다음 case블록이 실행
		
		// default : 조건이 그 어떤 case값과도 일치하지 않을 때 실행
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("1부터 4까지의 숫자를 입력하세요 : ");
		int number = sc1.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("1을 입력하였습니다.");
			break;
		case 2:
			System.out.println("2을 입력하였습니다.");
			break;
		case 3:
			System.out.println("3을 입력하였습니다.");
			break;
		case 4:
			System.out.println("4을 입력하였습니다.");
			break;
		default:
			System.out.println("범위초과");
		}
		
		System.out.println("====예제 실습 - 학점 계산기 ====");
		
		// score 변수 선언(숫자형)
		// 비교할 대상 : 표현식 (score / 10 => 10(100점), 9(90점대), 8(80점대)...)
		
		// 100 : 만점입니다.
		// 90 이상 : 90점대 입니다.
		// 80 이상 : 80점대 입니다.
		// 70 이상 : 70점대 입니다.
		// 60 이상 : 60점대 입니다.
		// 일치하는 case가 없을 경우 : 과락입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");

		int score = sc.nextInt();
		switch(score / 10) {
		case 10:
			System.out.println("만점입니다.");
			break;
		case 9: 
			System.out.println("90점대 입니다.");
			break;
		case 8: 
			System.out.println("80점대 입니다.");
			break;
		case 7: 
			System.out.println("70점대 입니다.");
			break;
		case 6: 
			System.out.println("60점대 입니다.");
			break;
		default:
			System.out.println("과락입니다.");
		}
		
		// if-else문이 복잡하게 겹쳐질 경우 코드를 더 간결하고 이해하기 쉽게 구조화 할 수 있다.
		
		System.out.println("==== 예제 실습 - 사칙연산 계산기 만들기 ====");
		
		// 사용자로부터 입력 받기 
		// 두 개의 숫자(number1, number2)
		// 연산자 ( +, -, *, / )
		
		// 해당 연산자와 일치 할 경우
		// 연산자에 따른 연산을 수행
		
		// 숫자를 0으로 나눌 경우 오류!!!
		// 나눗셈 case의 경우 숫자가 0이 아니라는 조건식을 포함(if문)
		
		// 기본값
		// Error: Invalid operator
		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		int number1 = 0;
		int number2 = 0;
		String operator = null;
		
		int result = 0;
		
		number1 = scanner1.nextInt();
		number2 = scanner1.nextInt();
		operator = scanner2.next();
		
		switch (operator) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			if (number1 != 0 && number2 != 0) {
				result = number1 / number2;
			} else {
				System.out.println("Error: Division by zero is not allowed");
			}
			break;
		default:
			System.out.println("Error: Invalid operator");
			return;
		}
		System.out.println("결과 : " + result);
	}
}
