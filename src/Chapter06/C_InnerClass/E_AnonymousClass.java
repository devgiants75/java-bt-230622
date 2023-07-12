package Chapter06.C_InnerClass;

// 익명 내부 클래스
// : 이름이 없는 클래스
// : 주로 한 번만 사용되는 인스턴스를 생성할 때 사용
// : 클래스를 별도로 선언하지 않고도, 인스턴스를 생성할 수 있다.

// 익명 내부 클래스의 특징
// : 이름이 없기 때문에, 생성자를 가질 수 없다.
// : 객체 생성 시 인스턴스 초기화 블럭을 통해 초기화를 진행할 수 있다.

// 익명 내부 클래스의 제한
// : 외부의 final 키워드인 변수에만 접근 가능
// : 외부에서 직접 참조하거나, new 키워드를 사용해 새로운 인스턴스 생성 불가

abstract class AbstractClass {
	abstract void abstractMethod();
}

public class E_AnonymousClass {
	public static void main(String[] args) {
		
		// 익명 클래스 정의
//		new InterfaceOrSuperclassName() {
//			// 해당 익명 내부 클래스가 구현하거나 확장하는 인터페이스 또는 클래스 이름
//		}
		
		// new Runnable() {...}부분이 Runnable 인터페이스를 구현하는 익명 내부 클래스의
		// 정의와 인스턴스 생성을 동시에 수행하는 부분
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New thread created");
			}
			// start()메소드는 새로 생성된 Thread인스턴스를 시작시킴.
		}).start();
		
		AbstractClass instance = new AbstractClass() {
			{
				System.out.println("Instance 생성 블럭");
			}
			@Override
			void abstractMethod() {
				System.out.println("추상 메소드 실행");	
			}
		};
		
		instance.abstractMethod();
	}

}
