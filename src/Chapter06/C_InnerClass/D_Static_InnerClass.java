package Chapter06.C_InnerClass;

// 정적 내부 클래스
// : 외부 클래스의 정적 컨텍스트에서 사용할 수 있는 클래스
// : 외부 클래스의 인스턴스 없이도 인스턴스화 가능
// : 외부 클래스의 모든 정적 멤버에 접근 가능

// 정적 내부 클래스의 특징
// : 외부 클래스의 정적 멤버에게만 접근 가능, 외부 클래스의 비정적 멤버에는 접근 불가
// : 외부 클래스의 인스턴스에 종속되지 않기 때문

class OuterClass3 {
	private static int outerStaticField = 10;
	
	// 정적 내부 클래스 선언: static 키워드를 사용하여 선언
	static class StaticInnerClass {
		private int innerField = 20;
		
		// 정적 내부 클래스에서 this키워드는 내부 클래스의 인스턴스를 참조
		// : X외부클래스.this형식 사용 불가X
		
		void printOuterStaticField() {
			System.out.println("Inner field : " + this.innerField);
			// 외부 클래스의 정적 멤버에만 접근 가능
			System.out.println("Outer static field : " + outerStaticField);
		}

	}
}

public class D_Static_InnerClass {
	public static void main(String[] args) {
		
		// 외부 클래스의 인스턴스 생성 없이도 정적 내부 클래스의 인스턴스 생성 가능
		OuterClass3.StaticInnerClass innerObejct = new OuterClass3.StaticInnerClass();
		innerObejct.printOuterStaticField();
	}
}
