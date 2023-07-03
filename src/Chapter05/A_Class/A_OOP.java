package Chapter05.A_Class;
// 객체 지향 프로그래밍
// OOP(Object Oriented Programming)

public class A_OOP {

	public static void main(String[] args) {
		// 객체지향 프로그래밍의 주요 개념
		
		// 1. 클래스(Class)와 객체(Object)
		// 클래스: 공통적 성질을 가진 대상들을 정의한 것
		//		  데이터(속성)와 메서드(동작)를 포함
		// 객체: 클래스에 정의된 대로 생성한 실체
		// 		클래스에 의해 생성되어 클래스에서 정의한 행동을 수행 가능
		
		// 클래스 정의
		class Car {
			// 데이터(속성)
			String color;
			int speed;
			
			// 메서드(동작)
			void accelerate() {
				speed += 10;
			}
			
			void brake() {
				speed -= 10;
			}
		}
		
		// 객체 생성
		Car myCar = new Car();
		myCar.color = "Red";
		myCar.speed = 0;
		
		// 객체의 메서드 호출
		myCar.accelerate();
		System.out.println("현재 속도: " + myCar.speed);
		
		// 2. 상속(Inheritance)
		// 클래스는 다른 클래스의 특성을 상속 받을 수 있다.
		// 기존 클래스의 재사용성을 높이고, 코드의 중복을 줄일 수 있다.
		// 부모클래스(상위, 슈퍼 클래스)의 특성을 자식클래스(하위, 서브 클래스)가 물려받는다.
		
		// 부모 클래스
		class Animal {
			// 메서드(동작)
			void makeSound() {
				System.out.println("동물이 소리를 내고 있습니다.");
			}
		}
		
		// 자식 클래스 정의
		class Dog extends Animal {
			void makeSound() {
				System.out.println("멍멍");
			}
		}
		
		// 객체 생성
		Dog myDog = new Dog();
		
		// 메서드 호출
		myDog.makeSound(); 
		
		// 3. 캡슐화(Encapsulation)
		// 클래스의 데이터와 메서드를 하나로 묶고, 클래스 내부의 구현 상세를 숨기는 것
		// 데이터를 보호하고, 외부에서 직접적인 접근을 제한 (메서드를 통해 간접적 접근 만 가능)
		
		// 4. 다형성(Polymorphism)
		// 하나의 인터페이스나 클래스를 다양한 방법으로 동작하게 하는 것
		// 프로그램의 유연성과 확장성을 향상 시킬 수 있다.
		// 동일한 메서드(동작)를 서로 다른 방식으로 구현할 수 있는 개념
		
		// 5. 추상화(Abstraction)
		// 복잡한 시스템을 단순화시키는 프로세스
		// 관련된 정보를 묶어서 불필요한 세부 정보를 제거하고 핵심 기능만을 표현
		// 추상클래스와 인터페이스를 통해 구현, 구체적인 내용은 하위 클래스에서 구현
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
