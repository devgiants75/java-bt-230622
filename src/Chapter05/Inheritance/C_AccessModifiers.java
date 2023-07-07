package Chapter05.Inheritance;

// 접근 제한자
// 클래스, 메소드, 변수의 접근 범위를 제어

// private, default, protected, public

// 1. private
// : 접근 제한자가 지정된 멤버(필드, 메소드 등)는 
// 동일한 클래스 내에서만 접근 가능, 클래스 외부에서는 접근할 수 없다.
// 가장 제한적인 접근 제한자

class MyClass {
	// 같은 클래스 내에서만 접근 가능
	// 자식 클래스에서 접근 불가(캡슐화)
	private int myField;	
	private void myMethod() {	
	}
}

// 2. (default)
// : 아무런 접근 제한자도 지정하지 않을 경우의 접근 범위
// default로 지정된 멤버는 동일한 패키지 내의 다른 클래스에서 접근 가능
// 패키지 외부에서는 접근할 수 없다.

class MyClass2 {
	// 같은 패키지 내의 다른 클래스에서 접근 가능
	// 부모 클래스와 같은 패키지의 다른 클래스, 그리고 같은 패키지의 자식클래스에 접근 가능
	int myField;
	void myMethod() {	
	}
}

// 3. protected
// : protected로 지정된 멤버는 동일한 패키지 내의 모든 클래스와
// 다른 패키지의 하위 클래스에서 접근 할 수 있다.
class MyClass3 {
	// 같은 패키지 내의 다른 클래스 및 다른 패키지의 하위 클래스에서 접근 가능 
	// 부모 클래스와 같은 패키지의 다른 클래스,
	// 그리고 다른 패키지의 자식 클래스에서 접근 가능(상속관계에서 주로 사용)
	protected int myField;
	protected void myMethod() {
	}
}

// 4. public 
// : public으로 지정된 멤버는 어떤 클래스에서든 접근할 수 있다.
// 가장 제한이 없는 접근 제한자
class MyClass4 {
	// 어디서든 접근 가능
	// 주로 API를 구성하는 메소드에 사용됨.
	public int myField;
	public void myMethod() {
	}
}

public class C_AccessModifiers {
	public static void main(String[] args) {
		// 클래스, 메소드, 변수에 대한 접근 제한자의 적용
		
		// 클래스: public, (default) 접근제한자만 사용 가능
		// 메소드&변수: 모든 접근 제한자 사용 가능
		
		// 상속에서의 접근 제한자의 중요성
		// 상속관계에서는 private 멤버를 제외한 
		// public, protected, default 멤버가 자식 클래스에서 접근 가능
	}
}








