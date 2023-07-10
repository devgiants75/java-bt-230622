package Chapter05.E_Polymorphism.D_Polymorphism;

public class MacOS extends Computer {
	@Override
    public void powerOn() {
        super.powerOn();
        System.out.println("Welcome to MacOs!");
	}
	
	// 위 처럼 코드 작성 후 
	// ComputerRoom, Main 코드를 수정
}
