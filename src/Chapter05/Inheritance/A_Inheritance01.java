package Chapter05.Inheritance;

// 상속
// 한 클래스의 속성과 메소드를 다른 클래스가 가져오는 것
// 'extends'키워드를 사용하여 상속을 구현
// 하위클래스(자식클래스, 서브클래스): 상속을 '받는' 클래스
// 상위클래스(부모클래스, 슈퍼클래스): 상속을 '하는' 클래스

// 상속은 코드의 재사용성을 향상시키고, 클래스 간의 관계를 구성한다.

// 클래스를 상속하는 방법
//[접근제어자] class SubClassName extends SuperClassName {
	// fields
	// methods
//}

// 클래스를 상속하더라도 기존 멤버 변수 및 멤버 메서드만 상속이 가능하고 생성자는 상속되지 않는다.

// 자바에서는 단일 상속만을 지원!
// 한 클래스가 하나의 상위 클래스만 상속받을 있다. (여러 개의 클래스로부터 상속받는 것은 허용X)
// 자바에서는 다중 상속의 기능 효과를 얻기 위해서 인터페이스를 사용할 수 있다.

// 부모 클래스
class Animal {
	// 필드
	protected String name;
	
	// 생성자
	public Animal(String name) {
		this.name = name;
		System.out.println("부모 클래스가 생성되었습니다.");
	}
	
	// 메소드
	public void eat() {
		System.out.println("The animal eats " + name);
	}
}

// 자식 클래스
class Dog extends Animal {
	
	// 상속에서의 생성자 사용
	// 상속에서, 생성자 호출 순서는 부모클래스에서 자식 클래스로 진행
	// 자식클래스에서 부모클래스의 생성자를 호출하려면 'super'키워드를 사용
	// super는 부모 클래스를 가리킴.
	// super()는 부모 클래스의 생성자를 호출
	public Dog(String name) {
		super(name); // Animal 클래스의 생성자를 호출
		System.out.println("자식 클래스가 생성되었습니다.");
	}
	
	
//	public Dog() {
//		super(); // 생성자 내부에서 항상 첫 번째 줄에서 호출되어야 합니다.
//	}
	
	public void bark() {
		System.out.println("The dog barks " + name);
	}
}

public class A_Inheritance01 {

	public static void main(String[] args) {
		Dog myDog = new Dog("choco");
		// Dog객체 생성 시 Animal의 생성자도 함께 호출 & 객체 초기화
		
		// Dog 클래스의 메소드 호출
		myDog.bark();
		
		// Animal 클래스의 메소드 호출
		myDog.eat();
	}
}

// 자식 클래스는 항상 부모 클래스의 생성자를 호출!
// 단, 항상 직접적으로 정의된 생성자를 필요로 하는 것은 X



