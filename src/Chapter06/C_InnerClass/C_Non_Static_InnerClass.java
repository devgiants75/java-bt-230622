package Chapter06.C_InnerClass;

// 자바 비정적 내부 클래스(= 내부 클래스)
// : 외부클래스의 인스턴스에 바인딩되어 그 인스턴스와 관련된 작업을 수행하는데 사용가능
// : 외부 클래스의 인스턴스를 생성한 후에만 인스턴스화 가능

// 비정적 내부 클래스의 특징
// : 외부 클래스의 모든 멤버(비공개 멤버 포함)에 접근 가능

class OuterClass2 {
	private int outerField = 10;
	
	// 비정적 내부 클래스(static X)
	class InnerClass {
		private int innerField = 20;
		// 비정적 내부 클래스에서는 this키워드를 사용하여 내부 클래스의 인스턴스에 접근 가능
		// 외부클래스명.this 형식: 외부 클래스의 인스턴스에 접근 가능
		
		void printOuterField() {
			System.out.println("Outer Field : " + outerField);
			// this키워드는 내부 클래스의 인스턴스를 참조
			System.out.println("Outer Field : " + OuterClass2.this.outerField);
			
			System.out.println("Inner Field : " + this.innerField);
		}
	}
}

public class C_Non_Static_InnerClass {
	public static void main(String[] args) {
		
		OuterClass2 outerObject = new OuterClass2();
		// 비정적 내부 클래스 인스턴스 생성을 위해서는 외부 클래스의 인스턴스 생성이 선행되어야 한다.
		// 외부 클래스의 인스턴스를 통해 내부 클래스의 인스턴스를 생성
		OuterClass2.InnerClass innerObject = outerObject.new InnerClass();

	}

}
