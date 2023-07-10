package Chapter05.E_Polymorphism.D_Polymorphism;

// Computer 클래스를 상속받고 전원을 키는 메소드를 오버라이드
public class Samsung extends Computer {
	
	@Override
	public void powerOn() {
		// 부모 클래스에서 정의된 기능을 유지
		super.powerOn(); // 부모 클래스의 powerOn() 메서드를 실행
		
		// 새로 추가된 작업
		System.out.println("Welcome to Samsung!");
		
	}

}
