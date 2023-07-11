package Chapter06.A_Abstract;

// 추상 메소드: 메소드의 선언부만 존재하고, 구현부는 존재하지 않는 메소드
//			- 하위 클래스에서 이 메소드를 반드시 구현하도록 강제하는 역할
//			- abstract 키워드를 통해 선언
// : 추상 메소드를 하나 이상 포함하는 클래스는 반드시 추상클래스로 선언!

// 추상 메소드의 선언
// 구현부 {} 대신 세미콜론(;)을 사용하여 선언을 마침.

abstract class AbstractClass2 {
	// abstract 반환타입 메소드명(파라미터);
	abstract void abstractMethod();
}

// 추상 메소드의 특징
// 1. 구현부가 없기 때문에, 직접 호출할 수 없다.
// 2. 추상 클래스를 상속받은 하위 클래스에서 반드시 구현해야 한다.
// 3. 하위클래스에서 추상메소드를 구현할 때
//	- 메소드명, 반환타입, 파라미터가 추상메소드와 동일해야 함.

class ChildClass2 extends AbstractClass2 {
	// 추상 클래스의 추상 메소드와 동일해야 함.
	void abstractMethod() {
		System.out.println("Implemented abstract method");
	}
}

// 추상 메소드를 통해 동일한 행동을 하지만
// 그 방식이 다른 다른 객체들을 효율적으로 관리

public class A_Abstract_Method {
	public static void main(String[] args) {
		// 인스턴스 생성
		ChildClass2 cc = new ChildClass2();
		cc.abstractMethod();
	}
}
