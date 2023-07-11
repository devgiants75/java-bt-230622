package Chapter06.B_Interface;

// 인터페이스 멤버 변수 정의
// 인터페이스에서 선언된 모든 변수는 자동으로 public, static, final 특성을 가짐.

interface ExampleInterface {
	int EXAMPLE_VARIABLE = 10; // public, static, final
}

class ExampleClass implements ExampleInterface {
	void printVar() {
		System.out.println(EXAMPLE_VARIABLE);
	}
}

//public: 모든 곳에서 접근 가능
//static: 인스턴스화 없이 인터페이스 이름을 통해 접근 가능
//final: 한 번 할당되면 값을 변경할 수 없다.

public class B_Interface02 {
	public static void main(String[] args) {
		ExampleClass ec = new ExampleClass();
		ec.printVar();
		
	}
}
