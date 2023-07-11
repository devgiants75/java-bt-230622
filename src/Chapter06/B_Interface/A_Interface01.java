package Chapter06.B_Interface;

// 인터페이스: 추상메소드와 상수만으로 구성된 특수한 클래스
//			- interface키워드를 사용하여 선언

interface MyInterface {
	void abstractMethod();
}

// 인터페이스의 필요성
// 1. 서로 다른 클래스에 대해 공통된 동작을 보장할 때
//	: 인터페이스를 구현하는 모든 클래스는 인터페이스의 모든 메소드를 반드시 구현
// 2. 여러 인터페이스를 동시에 구현할 수 있음.
//  : 한 클래스에 대해 여러 개의 인터페이스를 구현할 수 있다.
//  : 다중 상속과 유사한 효과

// 인터페이스 VS 추상 클래스
// - 둘 다 추상메소드를 포함

// - 인터페이스: 클래스의 동작을 정의하는 "계약"역할, 다중 상속 효과
// - 추상 클래스: 일부 구현이 이미 있는 "부분적으로 완성된" 클래스, 단일 상속만 가능

// 인터페이스의 활용
// - API와의 소통, 프로그램 간의 상호작용, 프레임워크 등에서 유용하게 사용

// 인터페이스 선언
// : 인터페이스의 메소드는 본문 없이 선언만 가능, 모두 public abstract 특성을 가짐.
// : 인터페이스에는 상수만 포함 가능, 모든 필드는 public static final 특성을 가짐.

interface Flyable {
	int MAX_SPEED = 100; // public static final
	void fly(); // public abstract
	
	// 디폴트 메소드: default 키워드를 사용하여 선언
	// 			- 기본 구현 제공, 구현 클래스에서 오버라이드(재정의) 할 수 있다.
	// 			- 오버라이드 하지 않을 경우, 인터페이스의 디폴드 구현이 사용
	default void land() {
		System.out.println("Landing");
	}
	
	// 정적 메소드: static 키워드를 사용하여 선언
	// 			- 인터페이스 이름으로 직접 호출할 수 있다.
	// 			- 오버라이드 할 수 없다.
	static int getWingCount() {
		return 2;
	}
}

class Bird2 implements Flyable {
	
	public void fly() {
		System.out.println("Fly");
	}
	public void land() {
		System.out.println("... Landing... ");
	}
}

//프라이빗 메소드: private 키워드를 사용하여 선언
// 			- 인터페이스 내에서만 호출 가능, 주로 디폴드 메소드나 정적 메소드의 중복 제거에 사용
interface Drawable {
	void draw();
	default void pring() {
		String message = createMessage();
		System.out.println(message);
	}
	
	private String createMessage() {
		return "Private method in interface";
	}
}

// 인터페이스의 구현
// : 클래스에 implements 키워드를 사용하여 인터페이스를 구현
class Bird implements Flyable {
	public void fly() { // 인터페이스 안의 메소드를 구현한 클래스 메소드는 public으로 지정
		System.out.println("Bird is flying at speed " + MAX_SPEED);
	}
}


public class A_Interface01 {
	public static void main(String[] args) {
		Flyable bird = new Bird();
		Flyable bird2 = new Bird2();
		bird.fly();
		
		// 디폴트 메소드
		bird.land(); // Lading(디폴트 값)
		bird2.land(); // ... Lading... (오버라이딩 값)
		
		// 정적 메소드
		System.out.println(Flyable.getWingCount()); // 인터페이스 이름으로 직접 호출
		
	}

}
