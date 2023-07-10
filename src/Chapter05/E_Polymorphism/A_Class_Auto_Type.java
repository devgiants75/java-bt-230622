package Chapter05.E_Polymorphism;

// 40번째 줄 다음에 생성
class Parent {}
class Child extends Parent { }

// 63번째 줄 다음에 생성
class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar {}

// 클래스에서의 타입 변환
// 타입변환: 타입을 다른 타입으로 변환하는 것

// 자바에서의 타입 변환(2가지)
// 자료형(타입)변환
// 클래스의 객체 타입 변환

// - 자료형 변환: 변수와 자료형에서 학습했던 자동 형 변환 & 강제 형 변환
// - 클래스의 타입 변환: 자동 형 변환 & 강제 형 변환
// - 단, 자료형에 비해 타입 변환이 가능한 범위가 좁다.
// - 클래스의 타입 변환은 서로 상속 관계에 있는 클래스 사이에서만 변환 가능
public class A_Class_Auto_Type {
	public static void main(String[] args) {
		
		// 클래스의 자동 타입 변환
		// 자료형에서의 자동 형 변환과 마찬가지로 개발자가 직접 명시하지 않아도 자동으로 타입 변환이 일어나는 것
		// 상속관계에 있는 자식 클래스의 객체를 부모 타입의 객체로 변환하는 것
		
		// 클래스의 자동 타입 변환 구현 방법
		// 자식 객체를 만들면서 바로 부모 타입으로 변환할 때
//		부모클래스(타입) 객체변수 = new  자식클래스();
		
		// 만들어진 자식 객체를 부모 타입으로 변환할 때
//		부모클래스(타입) 객체변수 = 자식객체;
		
		// 4번째 줄 Parent, Child 클래스 생성
		
		Parent p1 = new Parent(); // p1객체 생성
		Child c1 = new Child(); // c1객체 생성
		
		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1; // 자동 형 변환
//		Child c2 = p1; // 자동 형 변환 X: 오류(p1을 Child타입으로 변환 시도 시 오류 발생)
		
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
		// p3와 c1이 참조하는 객체가 같은지 확인하여 true일 경우 출력문 실행
		// == 연산자의 경우 참조하는 객체가 같으면 true값 출력
		
		// Child 타입의 Child 객체 c1 타입을 Parent로 변환해 만든 p3는 여전히 c1객체라는 것을 확인
		// 타입을 변환한다고 객체가 바뀌는 것이 아니라, 객체는 보존되고 사용만 부모 객체처럼 사용
		
		// 또한 앞에서 확인한 것처럼 클래스 자동 타입 변환은 자식 타입에서 부모 타입 방향으로만 가능
		// 따라서 부모타입을 자식 타입으로 변환하려고 하면 40번째 줄 처럽 오류가 발생
		
		// 자동 타입 변환은 반드시 상속 관계에 있는 자식 클래스의 객체를 부모 타입으로 변환할 때
		// 적용할 수 있다. 
		// 하지만 같은 상위 계층을 가지고 있더라도, 타입 변환을 시도하려는 두 클래스 간의 상속관계가 없다면 타입 변환 불가
		// 7번째줄 클래스 생성
		
		Car car1 = new SchoolBus(); // 1차 상속관계가 아니더라도 자동 타입 변환 가능
		
		Bus bus1 = new Bus(); // 자동 타입 변환
		Bus bus2 = new SchoolBus(); // 자동 타입 변환
//		Bus bus2 = (Bus) new SchoolBus(); // 자동 형 변환 시에도 명시적으로 변환을 작성가능
		
		Car car2 = new OpenCar(); 
		// 자동 타입 변환: OpenCar 클래스는 Car클래스와 2차 상속관계이기 때문에 자동 타입 변환 가능
		OpenCar openCar1 = (OpenCar) new SportsCar(); // 자동 타입 변환
		
//		Bus bus3 = new OpenCar(); //오류
//		Bus bus4 = new SportsCar(); //오류
		
//		OpenCar와 SportsCar는 Bus 클래스와 같은 상위 계층의 클래스 Car와 상속관계이지
//		Bus와 직접적인 상속관계가 아니기 때문에 자동 타입 변환 불가
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
