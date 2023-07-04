package Chapter05.B_Method;

// 특정 기능을 수행하기 위한 메서드는 기능을 수행할 때 사용할 인수를 받을 수 있다.
// 그 인수를 '매개변수'라고 부른다.
// 메서드를 정의할 때, 메서드명 다음의 소괄호() 안에 어떤 형태로 인수를 받을지 작성
// : 변수 선언 형식과 동일(매개변수의자료형 매개변수명)

// 매개변수
// 개수의 제한X
// 2개 이상의 매개변수 정의 시 콤마(,)를 이용해서 나열
// 서로 다른 자료형을 매개변수로 받는 것도 가능
// 배열도 매개변수의 자료형 가능

// 리턴값(return)
// 메서드로부터 실행한 결과값을 되돌려 받는 것


//1. 매개변수O, 리턴값X
class Book {
	void count(int bookNum) {
		System.out.println("책은 " + bookNum + "권 입니다.");
	}

	public static String isSameAuthor(Book2 book1, Book2 book2) {
		return null;
	}
}

// 2. 매개변수O, 리턴값O
class Calc {
//	void sum(int[] nums) {
	int sum(int[] nums) {
		int result = 0;
		for (int index = 0; index < nums.length; index++) {
			result += nums[index]; 
			// 매개변수로 받은 배열의 요소 값을 하나씩 result 값에 더함 
		}
//		System.out.println("숫자들의 합은 " + result + "입니다.");
		// 매개변수로 받은 숫자들의 합 result를 메서드 안에서 출력X
		// 리턴값으로 수를 반환하여 main메서드 안에서 출력O
		return result; // 매개변수로 받은 값을 모두 더한 result값을 다시 반환
	}
}

// 3. 매개변수O, 리턴값O
class MidTerm {
	int score(int[] scores) {
		int result = 0;
		for (int index = 0; index < scores.length; index++) {
			result += scores[index]; 
			// 매개변수로 받은 배열의 요소 값을 하나씩 result 값에 더함 
		}
		return result;
	}
}

// 4. 매개변수O, 리턴값X, return문 사용
class Bus {
	void take(int money) {
		//  return이 나올 때까지 무한 반복
		while (true) {
			if(money < 2000) {
				System.out.println("교통카드를 충전해 주세요");
				return;
			}
			System.out.println("버스를 탑니다. 어서오세요.");
			money -= 1200;
		}
	}
}


public class Method03 {
	public static void main(String[] args) {
		// 매개변수가 있는 메서드 호출
		Book myBook = new Book(); // 객체 생성
		myBook.count(3); // myBook 인스턴스의 count 호출
		
		// 리턴값이 없는 메서드 호출(메서드 안에서 출력)
		int nums[] = {100, 200}; // 배열 생성
		Calc calc = new Calc(); // Calc 객체 생성(인스턴스)
		calc.sum(nums);
		
		// 리턴값이 있는 메서드 호출
		// calc 인스턴스의 sum 메서드를 호출하여 return된 결과값을 출력
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");
		System.out.println(calc.sum(nums) + "은 출력값입니다.");
	
		// 리턴값이 있는 메서드를 호출하여 결과값을 변수에 저장 후 로직 구현
		int[] studentA = {97, 53};
		int[] studentB = {95, 66};
		
		MidTerm mid = new MidTerm();
		int sumA = mid.score(studentA);
		int sumB = mid.score(studentB);
		
		if (sumA > sumB) {
			System.out.println("A학생");
		} else if (sumA < sumB) {
			System.out.println("B학생");
		} else { // sumA == sumB
			System.out.println("A학생 == B학생");
		}
		
		// 리턴값이 없는 메서드의 경우, void 사용
		// 이 경우, return문으로 결과값을 반환해 주지 않는다.
		// 단! 메서드를 종료하기 위해서 반환값이 없는 return;문을 사용할 수 있다.
		int money = 10000;
		
		Bus bus = new Bus(); // 객체 생성
		bus.take(money); // bus 인스턴스의 take메서드 호출
		
	}

}
