package Chapter05.E_Polymorphism;

// 클래스에서의 타입 변환
// 타입변환: 타입을 다른 타입으로 변환하는 것

// 자바에서의 타입 변환(2가지)
// - 자료형 (타입) 변환: 변수와 자료형 (자동 형 변환 & 강제 형 변환)
// - 클래스의 객체 타입 변환 (자동 형 변환 & 강제 형 변환)

// 단, 클래스에서의 객체 타입 변환은 자료형에 비해 타입 변환이 가능한 범위가 좁다.
// : 서로 상속 관계에 있는 클래스 사이에서만 변환 가능
class Parent {}
class Child extends Parent {}

// 단, 같은 상위 계층을 가지고 있더라도, 타입 변환을 시도하려는 두 클래스 간의
// 상속관계가 없다면 타입 변환 불가
class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar {}


public class A_Class_Auto_Type {
	public static void main(String[] args) {
		
		// 클래스의 자동 타입 변환
		// : 개발자가 직접 명시X, 자동으로 타입 변환이 일어남.(묵시적 형 변환)
		// : 상속관계에 있는 자식 클래스의 객체를 부모 타입의 객체로 변환
		
		// 자동 타입 변환 구현 방법
		// 1. 자식 객체를 만들면서 바로 부모 타입으로 변환하는 경우
//		부모클래스(타입) 객체변수 = new 자식클래스();
		
		// 2. 만들어진 자식 객체를 부모 타입으로 변환하는 경우
//		부모클래스(타입) 객체변수 = 자식객체;
		
		// 인스턴스 생성
		Parent p1 = new Parent(); // p1객체 생성
		Child c1 = new Child(); // c1객체 생성: Child 타입의 Child 객체
		
		Parent p2 = new Child(); // 자동 타입 변환 1. 
		Parent p3 = c1; // 자동 타입 변환 2.
//		Child c2 = p1;
		
		if(p3 == c1) { 
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
		// Child 타입의 Child객체 c1타입을 Parent로 변환해서 만든 p3는
		// 여전히 c1객체
		// 타입 변환 시: 객체가 바뀌는 것X, 객체는 보존되고 사용만 부모 객체처럼 사용
		
		// ==: 참조하는 객체가 같으면 true값을 출력
		
		Car car1 = new SchoolBus(); 
		// 1차 상속관계가 아니더라도 자동 타입 변환 가능
		
		Bus bus1 = new Bus();
		Bus bus2 = (Bus)new SchoolBus(); 
		// 자동 형 변환 시에도 명시적으로 변환을 작성가능
		
		Car car2 = new OpenCar();
		OpenCar openCar1 = new SportsCar(); // 자동 타입 변환
		
//		Bus bus3 = new OpenCar(); 오류
//		Bus bus4 = new SportsCar(); 오류
	}
}
