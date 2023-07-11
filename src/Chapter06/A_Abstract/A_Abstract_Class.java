package Chapter06.A_Abstract;

// 추상 클래스: 하나 이상의 추상 메소드를 포함하는 클래스
// 			'abstract' 키워드를 사용해서 선언
// 추상 메소드: 선언만 있고 구현 내용이 없는 메소드를 의미

abstract class AbstractClass {
	// 추상 메소드
	abstract void abstractMethod();
}

// 추상 클래스의 특징
// 1. 추상 클래스는 직접 인스턴스화 될 수 없다.
//		- new 키워드를 사용해 직접 객체 생성X
// 2. 자신의 추상 메소드를 포함하는 하위 클래스에 의해 반드시 구현
// 3. 추상 클래스를 상속받은 하위 클래스가 추상 메소드를 구현하지 않는다면
// 		- 해당 하위 클래스도 추상 클래스로 선언해야만 한다.

class ChildClass extends AbstractClass {
	void abstractMethod() {
		System.out.println("Implemented abstract method");
	}
}

// 추상 클래스의 활용 예시
abstract class Animal {
	abstract void makeSound();
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Meow");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Bark");
	}
}

public class A_Abstract_Class {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass(); //인스턴스 생성
		cc.abstractMethod();
		
		Dog myDog = new Dog();
		myDog.makeSound();
	}
}
