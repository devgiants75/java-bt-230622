package Chapter06.B_Interface;

// 인터페이스 멤버 변수 정의
// 인터페이스에서 선언된 모든 변수는 자동으로 public, static, final 특성을 가짐.

interface ExampleInterface {
	int EXAMPLE_VARIABLE = 10; // public, static, final
}

class ExampleClass implements ExampleInterface {
	void printVar() {
		System.out.println(EXAMPLE_VARIABLE);
	}
}
//public: 모든 곳에서 접근 가능
//static: 인스턴스화 없이 인터페이스 이름을 통해 접근 가능
//final: 한 번 할당되면 값을 변경할 수 없다.

// 인터페이스와 다형성 예제
// 인터페이스를 구현한 클래슨의 객체는 인터페이스 타입을 가질 수 있다.
interface Drivable {
	void Drive();
}

class Car implements Drivable {
	public void Drive() {
		System.out.println("The car drives");
	}
}

public class B_Interface02 {
	public static void main(String[] args) {
		ExampleClass ec = new ExampleClass();
		ec.printVar();
		
		// 인터페이스와 다형성 예제
		Car myCar = new Car();
		myCar.Drive();
		
		// myCar객체를 Drivable 타입으로 변환
		Drivable drivable = myCar;
		drivable.Drive();
		
	}
}
