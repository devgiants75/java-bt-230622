package Chapter05.D_Inheritance;

// final 키워드

// final 클래스
// 더 이상 상속될 수 없는 클래스를 의미
// final 클래스를 부모 클래스로 사용할 수 없다.
// 클래스의 동작을 변경하지 않고 안정성을 보장하기 위함.
final class MyFinalClass {
	// final 클래스의 모든 메소드는 암묵적으로 final.
	// final 클래스의 메소드는 하위 클래스에서 오버라이드 될 수 없다. 
}

// final 메소드
// 하위 클래스에서 오버라이드 할 수 없는 메소드를 의미
// 메소드의 동작을 변경하지 못하도록 지정
class MyFinalMethodClass {
	public final void myMethod() {
		// private메소드와 유사하게 동작
	}
}

class FinalVariable{
	final int FINAL_VARIABLE = 10;
	
	public void methodWithFinalParameter(final int param) {
		final int localFinalVariable = 20;
		
//		FINAL_VARIABLE = 30; - 컴파일 오류
//		param = 40; - 컴파일 오류
//		localFinalVariable = 50; - 컴파일 오류
	}
}

public class D_Final {
	public static void main(String[] args) {
		// final 키워드의 장단점
		
		// 장점
		// 불변성: final키워드를 통해 객체의 상태를 변경하지 못하게 함.
		// 불변객체의 경우 안정성을 보장 받을 수 있다.
		// final 클래스나 메소드는 상속되거나 오버라이드 될 수 없음.
		
		// 단점
		// 유연성 감소: final클래스는 상속X, final메소드는 오버라이드X
		
		
		
		
		
		
	}
}
