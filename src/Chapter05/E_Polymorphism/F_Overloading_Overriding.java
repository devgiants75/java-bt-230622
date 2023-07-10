package Chapter05.E_Polymorphism;
// 오버로딩
class DemoClass {
	void demo(int a) {
		System.out.println("a: " + a);
	}
	
	void demo(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
	}
}

class SuperClass {
	void demo() {
		System.out.println("SuperClass method");
	}
}

class SubClass extends SuperClass {
	
	@Override
	void demo() {
		System.out.println("SubClass method");
	}
}

public class F_Overloading_Overriding {
	//// 오버로딩
	// : 같은 이름의 메서드를 여러 개 가지면서 매개변수의 유형과 개수를 다르게 함.
	// : 동일한 이름의 메서드가 다른 작업을 수행
	
	// 오버로딩 특징
	// 1. 동일한 클래스 내에서 발생
	// 2. 메서드의 시그니처(이름, 매개변수의 유형과 순서)가 다르다.
	// 3. 반환 유형은 오버로딩을 결정하는데 영향X
	
	//// 오버라이딩
	// : 하위클래스가 상위클래스의 메서드를 재정의 함.
	// : 하위 클래스는 상위 클래스의 메서드를 자신이 요구하는 사항에 맞게 변경 가능
	
	// 오버라이딩 특징
	// 1. 다른 클래스(주로 하위 클래스)에서 발생
	// 2. 메서드의 시그니처는 동일해야 함.
	// 3. 반환 유형도 동일해야 함.
	
//			Overloading(오버로딩)		Overriding(오버라이딩)
//메서드 이름	같아야 합니다.				같아야 합니다.
//매개변수		달라야 합니다.				같아야 합니다.
//반환 유형	영향을 미치지 않음.			같아야 합니다.
//접근 제어자	아무런 영향을 미치지 않음.		오버라이딩 메서드에서 원본 메서드보다 더 좁은 범위의 접근 제어자는 사용할 수 없습니다.
//예외	검사되는 예외의 수가 늘어날 수 있음.	오버라이딩 메서드에서 원본 메서드보다 더 많은 검사 예외를 선언할 수 없습니다.
//발생 시점	컴파일 타임.				런타임.
//바인딩 타입	정적 바인딩.				동적 바인딩.
//사용 이유	메서드의 행동을 다양화.		상속받은 메서드의 행동을 변경.
	
}
