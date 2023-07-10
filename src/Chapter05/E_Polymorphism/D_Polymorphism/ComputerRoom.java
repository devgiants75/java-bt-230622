package Chapter05.E_Polymorphism.D_Polymorphism;

public class ComputerRoom {
//	Samsung computer1;
//	Samsung computer2;
	
//	MacOs computer1;
//	MacOs computer2;
	
	Computer computer1; // 하나의 Computer 타입으로 Main클래스에서
	Computer computer2; // 여러 개의 객체 구현이 가능
	
	public void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
	}
	
	public void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}

}
