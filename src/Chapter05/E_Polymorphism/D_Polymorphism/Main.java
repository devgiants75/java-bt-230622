package Chapter05.E_Polymorphism.D_Polymorphism;

// 다형성
// 한 타입의 참조 변수로 여러 타입의 객체를 참조함으로써 다형성을 구현

// 다형성의 장점
// : 코드 간결성
// : 유연성
// : 확장성

public class Main {
	public static void main(String[] args) {
		ComputerRoom myRoom = new ComputerRoom();
		
//		myRoom.computer1 = new Samsung(); // Samsung computer1
//		myRoom.computer2 = new Samsung(); // Samsung computer2
		
//		myRoom.computer1 = new MacOs();
//		myRoom.computer2 = new MacOs();
		
		myRoom.computer1 = new Computer(); // Samsung computer1
		myRoom.computer2 = new Computer(); // Samsung computer2
		
		myRoom.allPowerOn();
		myRoom.allPowerOff();
		
		System.out.println();
		
		// 만약 ComputerRoom에 있는 Samsung 컴퓨터 2대를
		// Mac북으로 변경하고 싶을 경우
	}

}
