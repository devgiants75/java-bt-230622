package Chaper01;

import java.util.Scanner;

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
		
		// 배열(Array)
		
		// 동일한 타입의 여러 변수를 저장할 수 있는 컨테이너
		// 크기가 고정(한 번 생성되면 크기를 변경할 수 없다.)
		// new 연산자를 사용하여 생성
		// 배열은 해당 변수에 실제 데이터가 저장되는 것이 아니라 배열이 저장된 첫 번째 메모리 주소가 저장
		
		// 배열 선언과 동시에 생성
		int[] myArray = new int[5];
		
		// 문자열(String)
		// String 클래스는 문자열을 나타내는 데 사용되는 클래스
		// java.lang.String 패키지에 속해 있다.
		// 많은 메서드를 활용하여 문자열 조작이 편리
		
		// 문자열 선언
		String myString;
		
		// 문자열 생성
		myString = new String();
		
		// 문자열 선언과 동시에 생성
		String myString2 = new String();
		
		// 문자열 초기화
		myString = "Hello ";
		myString2 = "String!";
		
		// 불변성(Immutability)
		// 한 번 생성된 String객체는 그 값을 변경할 수 X
		// String에 변형을 할 경우, 새로운 String 객체가 생성되고 기존 객체는 변경되지 X
		
		// 문자열 주요 기능과 메서드
		
		// 1. 문자열 결합
		// + 연산자 || concat(String str)
		System.out.println(myString + myString2);
		
		// 2. 문자열 비교
		// equals(Object obj)메서드를 사용해서 두 문자열의 동일성을 확인 가능
		// compareTo(Str1, Str2)
		boolean bool = myString.equals(myString2);
		System.out.println(bool); // false
		
		// 3. 문자열 길이
		// length()메서드를 사용해 문자열의 길이를 확인 가능
		
		// 4. 문자열의 변환
		// toLowerCase() : 전부 다 소문자로 변환
		// toUpperCase() : 전부 다 대문자로 변환
		// toString() : 문자열로 변환
		System.out.println(myString.toUpperCase());
		
		// 5. 부분 문자열
		String introduce = "Hello my name is SeungAh";
		// substring(int beginIndex)
		// substring(int beginIndex, int endIndex);
		System.out.println(introduce.substring(10));
		System.out.println(introduce.substring(10, 13));
		
		// 참조 데이터 타입 (Reference types)

		// 객체의 참조 (즉, 메모리 주소)를 저장한다. 
		// 이들은 클래스, 인터페이스, 배열, 열거형 등을 포함하며, null 값을 가질 수 있다. 
		// "클래스 타입"이라고도 한다.

		// 모든 클래스 및 배열 타입은 참조 데이터 타입에 해당하며, 
		// `new` 연산자를 사용하여 생성해야하는 모든 데이터타입이 이에 해당한다. 
		// 이러한 타입의 변수는 객체 또는 배열에 대한 참조 (즉, 주소)를 저장한다.

		String str = "Hello, World!";
		Scanner scanner = new Scanner(System.in);

		// 참조 데이터 타입의 기본값은 `null`이며, 
		// 이는 아직 어떤 객체도 참조하지 않음을 의미한다.(주소만 있고 데이터가 X)
		// 참조 데이터 타입의 변수를 사용하기 전에 반드시 객체를 할당해야 한다. 
		// 그렇지 않으면 `NullPointerException`이 발생한다.

	}

}
