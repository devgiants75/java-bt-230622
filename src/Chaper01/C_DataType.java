package Chaper01;
// 데이터 타입
// 각각의 데이터들은 자바에서 지정한 여러 종류의 타입이 존재
// 기본적으로 정수형, 실수형, 문자형, 논리형이 존재
// 추가적으로 참조형 데이터 타입

// 일반적으로 특정한 데이터 타입으로 정의되 변수 혹은 상수는
// 같은 데이터 타입의 데이터로만 연산이 가능
public class C_DataType {

	public static void main(String[] args) {

		// 정수 타입
		
		// byte type
		// 1 byte (-128 ~ 127) 크기의 데이터를 가질 수 있는 데이터 타입
		byte byte1 = 127;
//		byte byte2 = 128;
		
		// short type
		// 2byte (-32,768 ~ 32,767) 크기의 데이터를 가질 수 있는 데이터 타입
		short short1 = 32767;
//		short short2 = -32769;
		
		// int type
		// 4byte (-2,147,483,648 ~ 2,147,483,647) 크기의 데이터를 가질 수 있는 데이터 타입
		int int1 = 2147483647;
//		int int2 = 2147483648;
		
		// long type
		// 8byte (-2^63 ~ 2^63 - 1) 크기의 데이터를 가질 수 있는 정수형 데이터 타입
		// 정수타입의 리터럴 상수의 데이터 타입은 int 이기 때문에
		// long 타입의 리터럴 상수 지정할 땐 리터럴 상수 뒤에 대문자 L을 붙여줌
		long long1 = 12147483648L;
		
		// 실수 타입
		
		// float type
		// 4byte (1.4 * 10^-45 ~ 3.4 * 10^38) 크기의 데이터를 가질 수 있는 실수형 데이터 타입)
		// 실수타입의 리터럴 상수의 데이터 타입은 double이기 때문에
		// float 타입의 리터럴 상수를 지정할 땐 리터럴 상수 뒤에 F를 붙여줌
		float float1 = 3.14F;
		// float은 소수점 6자리에서 오차가 발생
		
		// double type
		// 8byte (4.9 * 10^-324 ~ 1.8 * 10^308) 크기의 데이터를 가질 수 있는 실수형 데이터 타입)
		double double1 = 3.14;
		
		// 문자 타입
		
		// char type
		// 2byte (0 ~ 65,535) 크기의 데이터를 가질 수 있는 문자형 데이터 타입
		// 문자(단어X) 하나를 저장 할 수 있는 공간
		// 한 문자를 표기 할 땐 ''(따옴표)으로 묶어서 표기
		char char1 = 'a';
		char char2 = 97;
		
		// 논리 타입
		
		// boolean type
		// 1byte (false, true) 크기의 데이터를 가질 수 있는 논리형 데이터 타입
		boolean boolean1 = true;
		boolean1 = false;
		// is**, has**, flag
		
	}

}
