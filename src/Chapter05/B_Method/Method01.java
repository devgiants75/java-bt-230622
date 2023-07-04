package Chapter05.B_Method;

// 메서드
// 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것

// 메서드 장점
// 1. 높은 재사용성: 한번 만들어 놓은 메서드를 반복해서 사용 가능
// 2. 중복 코드 제거: 반복적으로 나타나는 문장들을 메서드로 만들어서 사용하면
//					코드의 중복을 제거할 수 있고 수정이 발생하면 하나의 코드만 수정하면 됨
// 3. 프로그램 구조화: 작업 단위로 여러 개의 메서드에 담아 프로그램을 구조화 할 수 있음

class HigherMathematics {
	// 클래스 변수와 마찬가지로 메서드에 static을 포함하게되면
	// 클래스(메서드)로 사용 가능
	static final double PIE = 3.14;
	
	// 파라미터가 있는 메서드는 반드시! 파라미터 범위 등과 같은 검증을 먼저 해주어야함!
	static double getTriangleSize(double underside, double height) {
		// 유효성 검사에 대한 로직
		// 메서드는 밑변과 높이가 양수인지 확인, 만약 둘 중에 하나라도 0이하인 경우
		// "밑변과 높이는 양수여야 합니다."라는 메시지를 출력하고 0을 반환
		if (underside <= 0 || height <= 0) {
			System.out.println("밑변과 높이는 양수여야 합니다.");
			return 0;
		}
		// 위의 유효성 검사를 통과한 경우
		// 삼각형의 넓이를 계산하여 반환
		double size = underside * height * 0.5;
		height = 12;
		return size;
	}
	
	// 원의 넓이를 계산하는 메서드
	// 메서드는 반지름을 매개변수로 받는다.
	static double getCircleSize(double radius) {
		// 메서드는 반지름이 0 이하인지 확인하고
		// , 만약 0 이하인 경우 "반지름은 양수이어야합니다."라는 메시지를 출력하고 0을 반환합니다. 
		if (radius <= 0) {
			System.out.println("반지름은 양수이어야합니다.");
			return 0;
		}
		// 그렇지 않은 경우에는 원의 넓이를 계산하여 반환합니다.
		double size = PIE * radius * radius;
		return size;
	}
		
	// 원의 둘레를 계산하는 메서드입니다. 
	// 메서드는 반지름을 매개변수로 받습니다. 
	static double getCircumference(double radius) {
		// 메서드는 반지름이 0 이하인지 확인하고
		// , 만약 0 이하인 경우 "반지름은 양수이어야합니다."라는 메시지를 출력하고 0을 반환합니다. 
		if (radius <= 0) {
			System.out.println("반지름은 양수이어야합니다.");
			return 0;
		}
			
		// 그렇지 않은 경우에는 원의 둘레를 계산하여 반환합니다.
		double circumference = PIE * 2 * radius;
		return circumference;
	}
}

public class Method01 {
	
	// 메서드의 선언부
	// [접근제어자] 반환타입 메서드명(매개변수) {}
	// 접근제어자: 클래스, 메서드, 필드에 대한 접근을 어느 범위까지 제한하느냐에 대한 지시어
	// public - 접근 제한자 중에서도 가장 넓은 범위(모든 클래스에서 접근이 가능)
	public static void main(String[] args) {
		// 메서드의 구현 부
		// 실제 프로그램의 절차를 작성하는 부분
		// return 데이터; 로 결과를 반환
		// : 반환타입이 void이면 return;으로 메서드를 종료
		
		// main 메서드 안에서 HighterMathematics()메서드 호출
		
		double size = HigherMathematics.getTriangleSize(10, 0);
		System.out.println(size);
		
		double size2 = HigherMathematics.getTriangleSize(5, 2);
		System.out.println(size2);
		
				
		// HigherMathematics.getCircleSize(5)를 호출하여 원의 넓이를 계산
		double circleSize = HigherMathematics.getCircleSize(5);
		// 이 때 반지름은 5로 전달됩니다. 
		// getCircleSize 메서드는 반지름이 양수이므로 원의 넓이를 계산하여 반환합니다. 
		System.out.println(circleSize);
		// 이 값을 circleSize 변수에 할당하고 출력합니다.
				
		// 코드 실행 결과
//		밑변과 높이는 양수이어야합니다.
//		0.0
//		78.5
				
		// 첫 번째 계산에서는 유효하지 않은 입력이므로 "밑변과 높이는 양수이어야합니다." 메시지가 출력되고, 삼각형의 넓이는 0입니다. 
		// 두 번째 계산에서는 유효한 입력이므로 원의 넓이가 계산되어 출력됩니다.


//		public static void main(String[] args)
//		public: 모든 클래스에서 접근 가능
//		static: 프로그램 시작과 동시에 메모리에 올라가 있음
//		void: 반환 값X
		
		// main메서드가 static으로 프로그램 시작과 함께 메모리에 올라가 있음
		
		// 메서드를 메모리에 올리는 방법
		// 1. 라이브러리 클래스에 있는 메서드
		// - 인스턴스 메서드: 객체를 생성함과 동시에 객체의 멤버(필드, 메서드)들이 메모리에 올라감.
//							따라서, 객체를 생성한 후 사용 가능
		// - 정적 메서드(static): 프로그램 시작과 동시에 메모리에 자동으로 올라가기 때문에 바로 사용할 수 있음 
		
		// 2. 실행 클래스에 있는 메서드
		// - 객체를 생성할 방법이 없기 때문에, 메서드가 무조건 static(정적 메서드)으로 선언되어야 한다.
		
	}
	

}
