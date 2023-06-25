package Chapter02;

public class Operator05 {

	public static void main(String[] args) {
		// 논리 연산자
		// 논리 값을 연산하는 연산자
		// 주로 조건문과 반복문에서 사용됩니다.
		
		// && : AND 연산자
		// 좌항과 우항이 모두 true일 때 true, 아니면 false
		int num1 = 8;
		int num2 = 5;
		boolean bool1 = (num1 > num2) && true;
		boolean bool2 = (num1 > num2) && false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		// || : OR 연산자
		// 좌항과 우항 중 하나라도 true이면 true, 아니면 false
		boolean bool3 = false || true;
		System.out.println(bool3);
		
		boolean bool4 = (num1 > num2) && (num2 > num1); // true && false
		boolean bool5 = (num1 > num2) || (num2 > num1); // true || false
		System.out.println(bool4);
		System.out.println(bool5);
		
		// ! : NOT 연산자
		// 논리값의 부정을 반환
		boolean bool6 = !(num1 > num2);
		System.out.println(bool6);
		
		// 삼항 연산자 (조건부 연산자)
		// 조건에 따라 다른 결과를 반환하는 연산자
		// (기본형태) 조건 ? '조건이 참일 때 결과' : '조건이 거짓일 때 결과'
		
		String str = "안녕하세요 코리아 it 아카데미 자바 수업입니다.";
		
		String str1 = 10 > 5 ? "10은 5보다 크다." : "10은 5보다 작거나 같다.";
		
		int num3 = 8;
		int num4 = 5;
		
		String str2 = num3 < num4 ? "num4가 num3보다 큽니다." : "num4가 num3보다 작습니다.";
		System.out.println(str2);
		
		// 윤년 확인하기 예제
		/*
		 * 윤년 : 해당 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수일 때
		 * 
		 * */
		
		int year = 2023;
		// 4의 배수(==) && 100의 배수(!=) || 400의 배수(==)
		// year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		
		String result 
			= year % 4 == 0 && year % 100 != 0 || year % 400 == 0 
			? "올해는 윤년입니다." : "올해는 윤년이 아닙니다.";
		
		System.out.println(result);
		
		int number = 900;
//		number가 2000보다 클 때 "2000보다 큽니다." number > 2000 ? "2000보다 큽니다." : "2000보다 작습니다." 
//		number가 1000보다 클 때 "1000보다 큽니다."
//		number가 500보다 클 때 "500보다 큽니다."
//		number가 500보다 작을 때 "500보다 작습니다."
		
		String result2 = number > 2000 ? "2000보다 큽니다." 
				: number > 1000 ? "1000보다 큽니다." 
				: number > 500 ? "500보다 큽니다." : "500보다 작습니다.";
				
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
