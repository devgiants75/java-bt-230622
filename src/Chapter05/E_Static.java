package Chapter05;
// static
// 메모리에 한 번만 할당되고 모든 객체가 공유하는 멤버를 정의할 수 있다.
// : 정적멤버
// 변수, 메서드, 중첩클래스, 초기화블록에 적용 가능

// 정적 필드: 클래스의 모든 인스턴스가 공유하는 변수

class Employee {
	// 정적(static) 변수
	static String companyName = "SamSung";
	
	// 인스턴스(instance) 변수
	String name;
	int age;
}

class Utility {
	// 정적(static) 메서드
	// : 인스턴스를 생성하지 않고 클래스 이름으로 직접 호출할 수 있는 메서드
	// static메서드 내에서는 static 변수만 직접 접근 가능
	static int add(int a, int b) {
		return a + b;
	}
}

class MyStaticBlock {
	// 정적 블록
	// 클래스가 로드될 때 한 번만 실행되는 코드 블록
	// 주로 정적 변수를 초기화하는데 사용
	static int a;
	static int b;
	
	static {
		a = 10;
		b = 20;
	}
	
	static void display() {
		System.out.println("a: " + a + " b: " + b);
	}
}

public class E_Static {

	public static void main(String[] args) {
		// 인스턴스를 생성하지 않고 메서드 호출
		int result = Utility.add(5, 3);
		System.out.println(result);
		
		MyStaticBlock.display();
	}
	

}
