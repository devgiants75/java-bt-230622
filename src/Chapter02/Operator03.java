package Chapter02;

public class Operator03 {

	public static void main(String[] args) {
		
		// 대입 연산자 : 변수에 값을 할당하는데 사용됩니다.(할당 연산자)
		// 좌항에 우항을 (누적)대입
		// 좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입
		
		// = : 좌항에 우항을 대입
		int num = 10;
		
		// += : 좌항에 우항을 더한 값을 좌항에 대입
		num += 3; // num = num(10) + 3 
		System.out.println(num);
		
		// -= : 좌항에 우항을 뺀 값을 좌항에 대입
		num -= 6; // num = num(13) - 6
		System.out.println(num);
		
		// *= : 좌항에 우항을 곱한 값을 좌항에 대입
		num *= 2; // num = num(7) * 2
		System.out.println(num);
		
		// /= : 좌항에 우항을 나눈 값(몫)을 좌항에 대입
		num /= 3; // num = num(14) / 3
		System.out.println(num);
		
		// %= : 좌항에 우항을 나눈 나머지를 좌항에 대입
		num %= 2; // num = num % 2
		System.out.println(num);
		
		// 대입 연산자의 좌항에는 무조건 변수만 지정할 수 있다.

	}

}
