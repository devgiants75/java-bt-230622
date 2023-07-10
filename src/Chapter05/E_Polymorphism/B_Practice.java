package Chapter05.E_Polymorphism;

class Calender {
	String color;
	int months;
	
	Calender(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	void info() {
		System.out.println(color + " 달력은" + months + "월까지 있습니다.");
	}
	
	void hanging() {
		System.out.println(color + "달력을 벽에 걸 수 있습니다.");
	}
}

class DeskCalender extends Calender {
	
	DeskCalender(String color, int months) {
		super(color, months);
	}
	
	@Override
	void hanging() {
		System.out.println(color + "달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	void onTheDesk() {
		System.out.println(color + "달력을 책상에 세울 수 있습니다.");
	}
}

public class B_Practice {
	public static void main(String[] args) {
		
		DeskCalender dc = new DeskCalender("보라색", 6);
		dc.info();
		dc.hanging(); // 오버라이드한 메서드 호출
		dc.onTheDesk();
		
		System.out.println();
		
		// Calender(부모)타입의 객체 c를 생성하고,
		// DeskCalender 객체로 초기화
		Calender c = new DeskCalender("검은색", 12); // 자동 타입 변환
		c.info();
		c.hanging(); // 오버라이드한 메서드 호출
//		c.onTheDesk(); // 오류
		
		// 클래스 타입 변환을 한 클래스는 자식 클래스만의 멤버들을 호출할 수 없습니다.
		
		// DeskCalender 객체임에도 Calender타입을 가졌기 때문에
		// DeskCalender의 멤버에는 접근할 수 없다.
	}
}
