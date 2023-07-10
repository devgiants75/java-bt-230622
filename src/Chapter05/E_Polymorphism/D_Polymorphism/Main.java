package Chapter05.E_Polymorphism.D_Polymorphism;

public class Main {
	public static void main(String[] args) {
		ComputerRoom myRoom = new ComputerRoom();

		myRoom.computer1 = new Samsong(); // Samsong computer1
		myRoom.computer2 = new Samsong(); // Samsong computer2
		
		// 나중에 생성, 생성 후 위의 7, 8번 줄 코드 주석
//      myRoom.computer1 = new MacOS(); // Samsong computer1
//     	myRoom.computer2 = new MacOS(); // Samsong computer2
        
        myRoom.allPowerOn();
        myRoom.allPowerOff();
        
        System.out.println();
        
        // 만약 ComputerRoom에 있는 Samsong컴퓨터 2대를 MacOs로 변경하고 싶을 경우
        // MacOs 클래스 생성
        
        // 위에 MacOS 생성 후 
        // 객체를 변경하기 위해서 여러 가지 코드를 수정하는 것은 상당히 위험도가 높은 작업이다.
        // 실무에서는 코드양이 많고
	}
	
}
