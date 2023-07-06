package Chapter05.C_Constructor;

// 오버로딩
// 한 클래스 내에서 같은 이름으로 메서드를 여러 개 정의하는 것
// 이미 같은 이름의 메서드가 존재하더라도, 매개변수의 타입과 개수가 다르면
// 같은 이름으로 정의 할 수 있음.

// 오버로딩
// 메서드명이 같아야 함.
// 매개변수 개수 혹은 타입은 달라야 함.
// 반환타입은 오버로딩에 영향을 끼치지 않음.

public class C_Overloading {
		
	int add(int x, int y) {
		return x + y;
	}
	
	double add(double x, int y) {
		return x + y;
	}
	
//	매개변수의 데이터 타입이 같고 매개변수의 이름이 다르더라도
	// 오버로딩은 성립하지 않음.
//	int add(int x, int z) {
//		return x + z;
//	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
		
}

