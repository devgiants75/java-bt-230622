package Chapter05.E_Polymorphism.D_Polymorphism;

// 2번 째 생성
// Samsong 클래스: 컴퓨터 클래스를 상속받고 전원을 켜는 메소드를 오버라이드
public class Samsong extends Computer {

	    @Override
	    public void powerOn() {
	        super.powerOn();
	        System.out.println("Welcome to Samsong!");
	}
}

