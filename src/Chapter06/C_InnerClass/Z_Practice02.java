package Chapter06.C_InnerClass;

class OuterClass5 {
	// Animal 인터페이스 생성
	// makeSound 메소드 선언
	interface Animal {
		void makeSound();
	}
	// someMethod 메소드 선언
	// 익명 내부 클래스를 사용하여 
	// Animal 인터페이스를 구현하는 클래스를 작성
	// 클래스에는 makeSound 오버라이딩
	void someMethod() {
		Animal animal = new Animal() {
			@Override
			public void makeSound() {
				System.out.println("멍멍!");
			}
		};
		animal.makeSound();
	}
	
}

public class Z_Practice02 {
	public static void main(String[] args) {
		// 외부 클래스 선언 및 초기화
		OuterClass5 outerObject = new OuterClass5();
		outerObject.someMethod();
		
	}
}
