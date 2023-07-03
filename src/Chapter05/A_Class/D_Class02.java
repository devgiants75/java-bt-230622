package Chapter05.A_Class;

// 클래스
class SmartPhone {
	// 속성
	
	// 기종
	String modelName;
	// 색상
	String color;
	// 메모리
	int memory;
	// 전화번호
	String telNumber;
	// 전원
	boolean power;
	
	// 메소드
	// 전화 걸기
	void call(String toTelNumber) {
		System.out.println(toTelNumber + " 로 전화를 겁니다.");
	}
	// 영상 시청
	void showVideo() {
		System.out.println("영상을 시청합니다.");
	}
	// 메시지 보내기
	void sendMessage(String toTelNumber, String message) {
		System.out.println(toTelNumber + " 로 " + message + "를 보냅니다.");
	}
	// 전원을 키고 끄기
	void setPower() {
		power = !power;
	}
}

public class D_Class02 {
	// 객체
	// 클래스 정의 후 new 연산자를 사용하여 객체 생성
	// 객체 생성 방법
//	클래스명 참조변수명 = new 클래스명();
	
	// 객체를 해당 클래스의 인스턴스라고 부른다.

	public static void main(String[] args) {
		// 인스턴스
		// 특정 클래스로 생성된 객체를 '인스턴스'
		// 클래스로 객체를 생성하는 행위를 '인스턴스화'
		
		// 인스턴스 선언 방법
		// 클래스명 참조변수명(인스턴스명)
		SmartPhone iPhone15;
		
		// 인스턴스 생성 방법
		// 참조변수명(인스턴스명) = new 클래스명();
		iPhone15 = new SmartPhone();
		
		// 인스턴스 선언 & 생성
		SmartPhone iPhone15Pro = new SmartPhone();
		
		System.out.println(iPhone15);
		System.out.println(iPhone15Pro);
		
		// 참조 자료형
		// 해당 값이 아니라 해당 자료형의 주소값이 저장
		
//		#기본형 매개변수와 참조형 매개변수 / 기본형 반환타입과 참조형 반환타입
//
//		- 기본형 매개변수: 값이 복사되어, 변수의 값을 읽기만 할 수 있다. (Read Only)
//		- 참조형 매개변수: 인스턴스의 주소가 복사되어, 변수의 값을 읽고 변경할 수 있다. (Read & Write)
//		- 기본형 반환타입: 값 자체가 반환된다.
//		- 참조형 반환타입: 힙 영역에 데이터를 저장하고 해당 힙 영역에 존재하는 객체의 주소를 반환한다.

		// 인스턴스의 속성 접근 및 기능 사용
		// 속성 접근: 참조변수명.멤버변수명;
		// 기능 사용: 참조변수명.메서드(매개변수...);
		
		iPhone15.modelName = "IPHONE";
		iPhone15.color = "black";
		iPhone15.memory = 512;
		iPhone15.telNumber = "010-1234-5678";
		iPhone15.power = false;

		System.out.println(iPhone15.modelName);
		System.out.println(iPhone15.memory);
		
		System.out.println(iPhone15Pro.modelName);
		System.out.println(iPhone15Pro.memory);
		
		iPhone15.call("010-9999-8888");
		iPhone15.showVideo();
		System.out.println(iPhone15.power);
		
		iPhone15Pro = iPhone15;
		System.out.println(iPhone15Pro.color);
		
		// 객체배열
		// 클래스명[] 객체배열명 = new 클래스명[길이];
		SmartPhone[] smartPhoneList = new SmartPhone[3];
		
		smartPhoneList[0] = iPhone15;
		smartPhoneList[1] = iPhone15Pro;
		smartPhoneList[2] = new SmartPhone();
		
		for (int index = 0; index < smartPhoneList.length; index++) {
			SmartPhone smartPhone = new SmartPhone();
			smartPhone.telNumber = "010-1111-111" + index;
			smartPhoneList[index] = smartPhone;
		}
		
		for (SmartPhone phone: smartPhoneList) System.out.println(phone.telNumber);

	}

}
