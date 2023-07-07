package Chapter05.Inheritance;

// 메소드 오버라이딩
// 다형성 & 코드 재사용성
// 하위클래스가 상위클래스의 메서드를 재정의하는 과정을 의미

// @Override 어노테이션
// 현재 메소드가 상위클래스 또는 구현해야하는 인터페이스의 메소드를
// 오버라이드(재정의)하는 것임을 컴파일러에게 알려주는 역할

// 상위클래스에 정의된 메서드와 
// 동일한 이름, 매개변수, 반환타입을 가진 메서드를 하위 메서드에서 다시 정의할 수 있다.

// 부모 클래스 정의
// 이 클래스에는 자식 클래스에서 오버라이드하려는 메서드가 포함되어 있어야 한다.
class Animal2 {
	public void sound() {
		System.out.println("이 동물의 소리는?");
	}
}

// 자식 클래스 정의
class Dog2 extends Animal2 {
	// @Override 어노테이션을 사용하여 해당 메소드가 부모 클래스의 메소드를
	// 오버라이딩한다는 것을 명시적으로 표현
	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
}

//자식 클래스 정의
class Cat extends Animal2 {
	// @Override 어노테이션을 사용하여 해당 메소드가 부모 클래스의 메소드를
	// 오버라이딩한다는 것을 명시적으로 표현
	@Override
	public void sound() {
		System.out.println("야옹!");
	}
}


public class B_Method_Overriding {
	public static void main(String[] args) {
		// 각 자식 클래스의 인스턴스를 생성
		Animal2 myDog = new Dog2();
		Animal2 myCat = new Cat();
		
		// 동일한 메소드를 호출
		myDog.sound();
		myCat.sound();
		
	}
}

// 오버로딩 VS 오버라이딩

// 모두 메소드의 이름을 재사용하는 방법

// 오버로딩: 같은 클래스 내에서 같은 이름을 가진 메소드를 여러 개 정의
// 			메소드 이름이 같아야 하지만 매개변수의 타입, 개수, 순서 중
//			적어도 하나가 달라야 한다.

// 오버라이딩: 상속관계에 있는 클래스에서 사용
// 			메소드 시그니처(이름, 매개변수, 반환 타입)가 같아야 한다.
// 			@Override 어노테이션을 사용(컴파일러에게 오버라이딩 전달)

// 			오버라이딩(Overriding) vs 오버로딩(Overloading)
//사용되는 클래스:	상속 관계에 있는 클래스 vs 같은 클래스
//메소드 시그니처:	동일해야 함	 vs 이름은 동일하나, 매개변수의 타입, 개수, 순서 중 하나 이상이 달라야 함
//어노테이션:	@Override 사용 가능 vs 사용 불가
//목적:	메소드의 동작을 변경하거나 확장	vs 메소드의 동작을 다양한 상황에 맞게 조정












