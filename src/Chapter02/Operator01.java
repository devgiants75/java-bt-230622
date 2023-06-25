package Chapter02;
/**
 * 연산자(operator)
 * 산술연산자, 대입연산자, 비교연산자, 논리연산자, 삼항연산자
 * 
 * */
public class Operator01 {

	// main method 생성 방법
	// main 입력 후 (ctrl + space : 자동완성 단축키)
	public static void main(String[] args) {
		
		// 산술 연산자
		// 산술 연산자는 기본적인 수학 연산에 사용
		
		// 덧셈 연산자 : + 
		// 좌항에 우항을 더한 값을 반환
		int addResult = 8 + 3;
		System.out.println(addResult);
		
		// 뺄셈 연산자 : -
		// 좌항에 우항을 뺀 값을 반환
		int minusResult = 8 - 3;
		System.out.println(minusResult);
		
		// 곱셈 연산자 : *
		// 좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;
		System.out.println(multiResult);
		
		// 나눗셈 연산자 : /
		// 좌항에 우항을 나눈 값(몫)을 반환
		int remainderResult = 7 / 3;
		float float1 = 2.6666F;
		int number1 = (int)float1; // 명시적 형 변환
		System.out.println(number1);
		System.out.println(remainderResult);
		
		// 나머지 연산자 : %
		// 좌항에 우항을 나눈 나머지를 반환
		int remainderResult2 = 7 % 3;
		System.out.println(remainderResult2);
		
		// 정수와 정수를 연산하면 정수가 반환
		// 실수와 정수를 연산하면 실수가 반환
		// 실수와 실수를 연산하면 실수가 반환
		
		// 산술 연산자의 우선순위
		// 곱셈, 나눗셈, 나머지 연산이 덧셈과 뺄셈보다 우선순위가 높습니다.
		// 우선순위가 동일할 경우에는 왼쪽에서 오른쪽으로 계산합니다.
		// 괄호 ( ) 를 사용하면 우선 순위를 변경할 수 있습니다.
		int result = 1 + 2 * 3;
		int result2 = (1 + 2) * 3;
		System.out.println(result);
		System.out.println(result2);
		
	}
}
