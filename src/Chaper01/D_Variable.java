package Chaper01;

public class D_Variable {

	// main 메서드 : 실행(ctrl+f11) 시 실행되는 메서드
	// {} : 코드 블럭 - 여러 줄의 코드를 하나로 묶어주는 역할
	public static void main(String[] args) {
		
		// 변수 선언 방법
		// 데이터타입 변수명;
		int numberVariable;
		
		// 변수 초기화 방법
		// 변수명 = 데이터(값);
		numberVariable = 1010;
		
		// 선언과 동시에 초기화 (변수를 할당하고 바로 초깃값을 지정)
		// 데이터타입 변수명 = 데이터(값);
		char characterVariable = 'a';
		characterVariable = 'b';
		
		// 변수 명명 규칙
		// 1. 첫 번째자리에 숫자가 올 수 없음.
		// 2. 정해진 특수문자만 사용 가능 ($, _ 두 가지만 사용 가능) : 첫 번째 자리에 올 수 있음.
		// 3. 같은 코드 블럭 내에 이미 선언한 변수명은 재사용 불가능
		// 4. java의 변수는 lowerCamelCase 명명 규칙을 사용
		
		// lowerCamelCase
		// 첫 문자는 소문자로 시작하고 띄어쓰기는 사용하지 않고
		// 다음에 오는 문자를 대문자로 작성
		char helloMyNameIsSeungAh;
		
	}

}
