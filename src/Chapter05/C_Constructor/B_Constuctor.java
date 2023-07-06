package Chapter05.C_Constructor;

// 생성자
// : 클래스를 구성하는 구성요소 중 하나
// 인스턴스(객체)가 생성될 때 호출되는 인스턴스(객체) '초기화 메서드'

// 객체를 생성해야 하는 라이브러리용 클래스에는 모두 생성자를 가지고 있다.
// 일반메서드와는 달리 생성자는 호출할 수 있는 곳이 지정되어 있다. 
// 객체를 생성할 때만 호출할 수 있다!

// 자바의 모든 클래스에는 하나 이상의 생성자가 정의 되어 있어야 한다.

class Circle {
	double radius; // 반지름
	double diameter; // 지름
	double circumference; // 둘레
	double area; // 넓이
	
	// 기본 생성자
//	Circle() { // 기본 생성자, 중괄호 안의 블록 안에 코드가 없다, 매개변수도 없다.
//		
//	}
	
	// 생성자
	// 생성자의 조건: 생성자의 이름은 해당 클래스명과 동일해야 한다, 생성자는 반환값이 없다.
	// 생성자의 기본형태: 클래스명(파라미터, ...) { 인스턴스 생성 시 실행할 코드 }
	Circle(double radius) { // 직접 선언한 생성자
		System.out.println("Circle이 생성 됩니다.");
		
		// this: 인스턴스 그 자체
		this.radius = radius;
		this.diameter = radius * 2;
		this.circumference = radius * 3.14 * 2;
		this.area = radius * radius * 3.14;
	}
	// 생성자에 전달할 매개변수가 부족할 경우, 객체를 생성할 수 없다.
	// 자바는 생성자를 여러 개 선언하는 것을 허용
	// 각각의 생성자 마다 매개변수의 수를 지정할 수 있음(없거나 ~ 여러 개 지정 가능)
	// 오버로딩: 생성자를 다양한 형태로 선언하는 것
	
	// 매개변수가 없는 생성자
	Circle() {
		System.out.println("빈 생성자입니다.");
		
		this.radius = 10;
		this.diameter = 2 * this.radius;
		this.circumference = 3.14 * this.diameter;
		this.area = this.radius * this.radius * 3.14;
	}
	
	// 생성자를 이용한 인스턴스 복사
	// 원본 객체의 속성 값을 보존하면서 독립적인 복사본을 생성할 수 있다.
	// 동일한 속성 값을 가진 새로운 객체를 만드는데 사용
	Circle(Circle circle) {
		// 주어진 Circle 객체의 속성 값을 현재 인스턴스의 속성에 복사
		this.radius = circle.radius;
		this.diameter = circle.diameter;
		this.circumference = circle.circumference;
		this.area = circle.area;
	}
}

public class B_Constuctor {
	public static void main(String[] args) {
		
		System.out.println("===생성자===");
		Circle circle1 = new Circle(); // 객체 생성 및 초기화
		// new Circle(); : 생성자(생성자를 호출할 때는 new 키워드와 함께 사용)
		Circle circle2 = new Circle(5);
		
		System.out.println("===========");
		System.out.println(circle1.area);
		System.out.println(circle2.area);
	}
}
