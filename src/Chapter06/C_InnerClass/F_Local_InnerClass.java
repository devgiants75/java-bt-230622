package Chapter06.C_InnerClass;

// 지역 내부 클래스
// : 메소드 내부에서 정의되는 클래스
// : 메소드를 실행하는 동안만 인스턴스화되고 사용 가능

// 지역 내부 클래스의 특징
// : 메소드 내부에서 정의되기 때문에, 외부 클래스의 모든 멤버에 접근 가능
// : 지역 내부 클래스는 메소드 또는 블럭에서 final 키워드인 변수에만 접근 가능

// 지역 내부 클래스에서 this 키워드는 내부 클래스의 인스턴스를 참조
// 외부클래스명.this형식을 사용해서 외부 클래스의 인스턴스에 접근 가능

class OuterClass4 {
	private int outerField = 10;
	
	void someMethod() {
		final int localField = 20;
		
		class LocalInnerClass {
			void printField() {
				System.out.println("Outer field : " + outerField);
				System.out.println("Outer field : " + OuterClass4.this.outerField);
				System.out.println("Local field : " + localField);
			}
		}
		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.printField();
	}
}
public class F_Local_InnerClass {
	public static void main(String[] args) {
		OuterClass4 outerObject = new OuterClass4();
		outerObject.someMethod();
	}

}
