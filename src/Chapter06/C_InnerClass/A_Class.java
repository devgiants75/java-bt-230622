package Chapter06.C_InnerClass;

// 클래스
// : 특정 객체를 생성하기 위해 변수와 메서드를 정의하는 일종의 틀, 설계도

class Dog {
	// 인스턴스 멤버: 클래스의 각 인스턴스, 즉 각 객체마다 별도로 생성
	// 객체의 상태를 나타내는 필드(변수)
	String breed;
	int age;
	String color;
	
	// 객체의 행동을 나타내는 메서드(함수)
	void barking() {
		
	}
	void hungry() {
		
	}
	void sleeping() {
		
	}
	
	// 클래스 멤버: 클래스의 모든 인스턴스들이 공유, 클래스 이름을 통해 직접 접근
	// 클래스 변수 (static field)
	static int staticVar;
	
	// 클래스 메소드
	static void staticMethod() {
		System.out.println("This is a class method");
	}
}

public class A_Class {
	public static void main(String[] args) {
		// 객체
		// : 클래스에서 정의한 것을 토대로 실제 메모리 상에 할당된 것
		// : 실제 프로그램에서 사용되는 데이터
		
		// 객체 생성
		Dog myDog = new Dog();
		
		// 필드(상태) 접근
		myDog.breed = "poodle";
		myDog.age = 3;
		myDog.color = "white";
		
		// 메서드(행동) 호출
		myDog.barking();
		myDog.hungry();
		myDog.sleeping();
		
		Dog.staticVar = 10;
		Dog.staticMethod();
		
	}

}
