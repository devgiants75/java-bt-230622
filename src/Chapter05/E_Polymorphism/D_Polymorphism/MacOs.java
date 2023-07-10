package Chapter05.E_Polymorphism.D_Polymorphism;

public class MacOs extends Computer {
	
	@Override
	public void powerOn() {
		// 부모 클래스에서 정의된 기능을 유지
		super.powerOn(); // 부모 클래스의 powerOn() 메서드를 실행
		
		// 새로 추가된 작업
		System.out.println("Welcome to Apple!");
		
	}
}
