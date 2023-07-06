package Chapter05.C_Constructor;

// 클래스에서의 변수
// 인스턴스변수: 각각의 인스턴스마다 고유하게 가지고 있어야 하는 속성을 지정할 때 사용
//				객체의 상태를 저장하는 데 사용
// 클래스변수(정적 변수): 해당 클래스로 만들어진 모든 인스턴스가 동일하게 가지고 있어야하는 속성을 지정할 때 사용
// 지역변수: 메서드 내에서 선언된 변수(인스턴스변수와 클래스변수의 경우 전역변수)
// 			선언된 영역 내에서만 사용, 해당 영역을 벗어나면 사용할 수 X

class GalaxyPhone {
	// 인스턴스 변수: 인스턴스마다 고유하게 가지고 있는 속성, 인스턴스가 생성된 후에 사용가능
	String model;
	String owner;
	String phoneNumber;
	
	// 클래스 변수: 해당 클래스로 만들어진 모든 인스턴스가 동일하게 가지고 있어야하는 속성
	// 				클래스 변수는 인스턴스 생성 없이 클래스로 사용가능(인스턴스로도 사용가능)
	// static 데이터타입 변수명;
	static String maker = "SAMSUNG";
}

class MonitorSize {
	static final int HEIGHT = 1000;
	static final int WIDTH = 1920;
}

public class E_VariableMethod {
	
	int number = 10; // E_VariableMethod 클래스의 전역변수
	int size = MonitorSize.HEIGHT * MonitorSize.WIDTH;
	
	public static void main(String[] args) {
		
		// main 메서드의 지역변수
		double decimal = 10.0;
		
		GalaxyPhone myS23 = new GalaxyPhone();
		myS23.model = "S23 Ultra";
		myS23.owner = "이승아";
		myS23.phoneNumber = "010-1111-2222";
		
		System.out.println(myS23.phoneNumber); // 인스턴스의 변수 사용
		
		myS23.maker = "SAMSUNG"; // 클래스 변수를 설정
		System.out.println(myS23.maker); // 클래스 변수를 사용
		System.out.println(GalaxyPhone.maker); // 클래스 이름으로 클래스 변수를 사용
		
		System.out.println("지역변수 & 전역변수");
		
		int num1 = 10; // 메인 메소드 블록 내에서 선언되었으므로 메인 메소드 전역에서 사용 가능
		
		if (num1 > 10) {
			int num2 = 10; // if 블록 내에서 선언되었으므로 이 블록 내에서만 사용 가능
			if(num2 > 20) {
				int num3 = 30; // 중첩된 if 블록 내에서 선언되었으므로 이 블록 내에서만 사용 가능
			}
		} else if (num1 > 9) {
			int num2 = 9; 
			// 이전의 num2변수와는 다른 변수
			// else-if 블록 내에서 선언되었으므로 이 블록 내에서만 사용 가능
		} else if (num1 > 8) {
			int num2 = 8;
		} else {
			int num2 = 0;
		}
		
		
		
		
		
		
		
		
	}

}
