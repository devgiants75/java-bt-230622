package Chapter02;
/**
 * 형 변환(Type Casting)
 * 변수의 데이터 유형을 다른 데이터 유형으로 변환하는 과정
 * */
public class Cast {

	public static void main(String[] args) {
		//  byte(1) -> short / char(2) -> int(4) -> float(4.0) -> long / double(8)
		
		// 자동 형 변환 (묵시적 형 변환 / 업캐스팅)
		// 차지하는 범위가 작은 데이터 타입은 범위가 큰 데이터 타입으로 자동 형 변환 된다.
		char char1 = 'a';
		int int1 = char1;
		double double1 = int1;
		
		// 강제 형 변환 (명시적 형 변환 / 다운캐스팅)
		// 차지하는 범위가 큰 데이터 타입은 범위가 작은 데이터 타입으로 대입할 때 형 변환을 명시해야 한다.
		// 강제 형 변환의 경우 overflow (범위 초과)가 발생할 수 있다.
		double double2 = 3.14;
		int int2  = (int)double2;
		char char2 = (char)int2;
		
	}

}
