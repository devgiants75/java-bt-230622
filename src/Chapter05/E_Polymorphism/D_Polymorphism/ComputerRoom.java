package Chapter05.E_Polymorphism.D_Polymorphism;

// 3번째 생성
public class ComputerRoom {
	Samsong computer1;
	Samsong computer2;
	
	// 나중에 생성, 생성 후 위의 5,6번 줄 코드 주석
//	MacOS computer1;
//	MacOS computer2;

    public void allPowerOn() {
    	computer1.powerOn();
    	computer2.powerOn();
    }

    public void allPowerOff() {
    	computer1.powerOff();
    	computer2.powerOff();
    }
}
