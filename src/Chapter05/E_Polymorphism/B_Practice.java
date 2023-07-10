package Chapter05.E_Polymorphism;

// 타입을 부모 타입으로 변환한 객체는 더 이상 자신의 클래스에 부모 클래스와 별개로 추가한 멤버들을
// 사용할 수 없으며, 부모 클래스에 선언된 멤버(필드와 메서드)들만 사용할 수 있습니다.
// 단, 부모 클래스의 메서드를 오버라이딩한 메서드의 경우에는 자식 객체의 것을 호출할 수 있습니다.

class Calender{
	String color;
	int months;
	
	Calender(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	void info() {
		System.out.println(color + " 달력은 " + months + "월까지 있습니다.");
	}
	
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸 수 있습니다.");
	}
}

// 상속
class DeskCalender extends Calender {
	
	DeskCalender(String color, int months) {
		super(color, months);
	}
	
	@Override
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	void onTheDesk() {
		System.out.println(color + " 달력을 책상에 세울 수 있습니다.");
	}
}

public class B_Practice {
	public static void main(String[] args) {
		
		DeskCalender dc = new DeskCalender("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calender c = new DeskCalender("검은색", 12);
		c.info();
		c.hanging(); // 오버라이드한 메서드를 호출합니다.
//		c.onTheDesk(); // 오류

		// 오버라이딩한 메서드는 클래스 타입 변환을 했어도 자식 메서드를 호출
		// 52번째 줄에 타입 변환으로 생성된 c 객체는 Calendar타입을 가졌지만, 
		// DeskCalendar의 객체이기 때문에 DeskCalendar의 hanging() 메서드를 호출
		
		// 클래스 타입 변환을 한 클래스는 더 이상 자식 클래스만의 멤버들을 호출할 수 없습니다.
		// c객체와 같이 자신의 멤버를 호출하고자 하면 에러가 나타납니다.
		// DeskCalender 객체임에도 Calender타입을 가졌기 때문에
		// DeskCalendar의 멤버에는 접근할 수가 없습니다.
		
		// 그렇다면 부모타입으로 변환한 객체가 다시 자신의 멤버에 접근하고 싶을 때 어떻게 해야 할까요?
		
		// C_Class_force_Type 클래스 생성
		
	}
}
