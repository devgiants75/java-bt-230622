package Chapter02;

public class Operator04 {
	public static void main(String[] args) {
		// 비교 연산자
		// 좌항을 우항과 비교한 결과를 논리(true, false) 값으로 반환
		
		// ==
		// 좌항이 우항과 같다면 true, 아니면 false를 반환
		boolean bool1 = (10 == 20);
		System.out.println(bool1);
		
		// != (! : not)
		// 좌항이 우항과 다르다면 true, 아니면 false를 반환
		boolean bool2 = (10 != 20);
		System.out.println(bool2);
		
		// >, >=
		// > : 좌항이 우항보다 크면 true, 아니면 false를 반환
		// >= : 좌항이 우항보다 크거나 같으면 true, 아니면 false를 반환
		boolean bool3 = 10 > 10; // (초과, 미만) : false
		boolean bool4 = 10 >= 10; // (이상, 이하) : true
		
		// <, <=
		// 좌항이 우항보다 작으면 true, 아니면 false
		// 좌항이 우항보다 작거나 같으면 true, 아니면 false
		boolean bool5 = 8 < 10;
		boolean bool6 = 10 <= 10;
		System.out.println(bool5);
		System.out.println(bool6);
		
		
		
		
		
		
		
		
		
	}
}
