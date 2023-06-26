package Chapter03;

import java.util.Scanner;

//if 구문
//조건에 따라 실행시키고자 하는 로직(프로세스)이 다를 때 사용하는 구문
public class If {

	public static void main(String[] args) {
		System.out.println("==== 단순 If문 ====");
		// 단순 if 문
		// 조건이 true일 때 실행할 코드를 지정하는 구문
		// 조건을 평가하여 그 결과에 따라 실행할 코드 블록을 결정
		
		// 사용 방법(기본형)
//		if (조건) { 
//		 조건이 true일 때 실행할 코드 
//		}
		// condition은 true / false의 결과를 반환하는 boolean 형태의 표현식
		// condition이 true일 경우 { }에 작성한 코드 블록이 실행
		
		int age = 12;
		
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		// if 문의 경우 코드 블럭에 오는 실행할 코드가 하나의 구문이면
		// {}를 제거하고 사용 가능
		if (age < 19) System.out.println("미성년자입니다.");
		
		System.out.println("==== If-else문 ====");
		// if - else 문
		// 조건이 true일 경우와 false일 실행되는 코드를 각각 지정한 구문
		// if 문의 condition이 거짓일 경우에만 실행할 코드 블록을 결정
		
		// 사용 방법 : 
		// if (조건) { true일 때 실행할 코드 }
		// else { false일 때 실행할 코드 }
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		// if-else문을 삼항연산자로 치환
//		삼항 연산자의 기본형 (조건 ? 표현식1 : 표현식2)
		String message = age > 19 ? "성인입니다." : "미성년자입니다.";
		
		// if 문과 마찬가지로 else 문도 코드 블럭에 오는 실행할 코드가
		// 하나의 구문이면 {}를 제거하고 사용 가능
		if (age > 19) System.out.println("성인입니다.");
		else System.out.println("미성년자입니다.");
		
		System.out.println("==== 중첩 If문 ====");
		// 중첩 if문
		// if 문 혹은 else문의 코드 블럭 안에 if문을 작성
		if (age <= 19) {
			if (age < 8) System.out.println("미취학 아동입니다.");
			else System.out.println("청소년입니다.");
		} else {
			System.out.println("성인입니다.");
		}
		
		// 위의 코드와 결괏값이 같다.
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			if (age < 8) System.out.println("미취학 아동입니다.");
			else System.out.println("청소년 입니다.");
		}
		
		// if - else if - else 문
		// 중첩 if문의 응용
		// else 문의 코드 블럭에 오는 코드가 한 줄일 때 {}을 제거 할 수 있음을 이용
		if (age > 19) {
			System.out.println("성인입니다.");
		} else if (age < 8) {
			System.out.println("미취학 아동입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
		
		boolean nomal = true;
		
		if (nomal) {
			boolean nomal2 = true;
			if (nomal2) {
				System.out.println("정상 결과");
			} else {
				System.out.println("비정상 2");
			}
		} else {
			System.out.println("비정상 1");
		}
		
		if (!nomal) System.out.println("비정상 1");
		boolean nomal2 = true;
		if (!nomal2) System.out.println("비정상 2");
		
		System.out.println("정상 결과");
		
		
		System.out.println("==== 예제 실습 학점 계산기 ====");
		// 예제 실습 - 학점계산기 //
		
		int score = 80;
		String result = null;
		
		if(score < 0 || score > 100) {
			System.out.println("점수는 0~100점 사이어야 합니다.");
			result = "계산불가";
		}else if(score > 89) {
			System.out.println("90점대 입니다.");
			result = "A";
		}else if(score > 79) {
			System.out.println("80점대 입니다.");
			result = "B";
		}else if(score > 69) {
			System.out.println("70점대 입니다.");
			result = "C";
		}else if(score > 59) {
			System.out.println("60점대 입니다.");
			result = "D";
		}else {
			System.out.println("0 ~ 59점 사이입니다.");
			result = "F";
		}
	
		System.out.println("결과: " + result);
		
		System.out.println("==== 예제 실습 함수 위치 구하기 ====");
		// 예제 실습 - 함수 위치 구하기 //
		
		/*
		 * x값을 입력하세요: 10
		 * y값을 입력하세요: 2
		 * 
		 * 출력
		 * x : 10
		 * y : 2
		 * 결과 : 1사분면
		 */
		
		// 자바 출력
		System.out.println("출력");
		
		// 자바 입력 (scanner + (ctrl + space))
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		String result2 = null;
		
		System.out.println("x값을 입력하세요 : ");
		x = sc.nextInt();
		
		System.out.println("y값을 입력하세요 : ");
		y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			result2 = "1사분면";
		} else if (x < 0 && y > 0) {
			result2 = "2사분면";
		} else if (x < 0 && y < 0) {
			result2 = "3사분면";
		} else {
			result2 = "4사분면";
		}
		
		System.out.println("결과 : " + result2);
		
		// FAQ //
		
		// 조건문에서는 불필요한 조건을 사용하지 않는 것이 중요
		
		// if (x === true) {} (권장X)
		// if (x) (권장O)
		
		// if (x !== true) {}
		// if (!x) {}

		// Quiz
		String message2 = true ? "성인입니다." : "미성년자입니다."; 
		String message3 = false ? "성인입니다." : "미성년자입니다.";
		
//		String message4 = true || "성인입니다."; // 출력X
//		String message5 = true && "성인입니다.";

		// OR연산자
		// 피연산자 2개 중에서 true값이 하나라도 있으면 결괏값은 true
		
		// AND연산자
		// 피연산자 2개 중에서 false값이 하나라도 있으면 결괏값 false
		
		
		
		
		
		
		
		
		
		
		
	}

}