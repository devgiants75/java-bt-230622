package Chapter06.B_Interface;

// 다중 인터페이스 구현
// 클래스는 여러 개의 인터페이스 구현이 가능, 둘 이상의 타입으로 동작 가능

interface Interface1 {
	void method1();
}

interface Interface2 {
	void method2();
}

class myClass implements Interface1, Interface2 {
	public void method1() {
		System.out.println("Method1");
	}
	
	public void method2() {
		System.out.println("Method2");
	}
}

// 다중 인터페이스 구현 주의사항
interface Interface3 {
	default void method() {
		System.out.println("Interface3");
	}
}

interface Interface4 {
	default void method() {
		System.out.println("Interface4");
	}
}

class myClass2 implements Interface3, Interface4 {
	public void method() {
		System.out.println("Method");
		
		Interface3.super.method();
	}
}
// 다중 인터페이스 구현 주의사항
// 두 인터페이스에 같은 시그니처(같은 반환타입, 메소드명, 파라미터)를 가진
// 디폴트 메서드가 있다면, 해당 클래스는 두 메서드를 명시적으로 재정의해야 함!

public class C_Interface03 {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
	}
}
