package Chaper01;

import java.util.Scanner;

public class B_IO {

	public static void main(String[] args) {
		// 저장 단축키 : ctrl + s
		// 실행 단축키 : ctrl + f11
		
		// 입출력		
		// console로 데이터를 출력할 때 System 객체를 사용한다.
		// console을 통해서 개발자로부터 입력을 받을 때 Scanner 객체를 사용한다.
	
		// 1. 출력
		// 출력의 기본형 : System.out.println(출력하고자하는 변수 혹은 상수);
		System.out.println();
		
		// ctrl + space : 자동완성 기능
		// syso 입력 후 ctrl + space 사용
		
		System.out.println("안녕하세요. 이것은 리터럴 상수 문자열입니다.");
		
		String comment = "안녕하세요. 변수에 저장된 문자열입니다.";
		System.out.println(comment);
		
		// 2. 입력
		// 입력의 기본형 : Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		// Scanner 객체 .next**(); 기능(메서드)를 사용해서 입력 받을 수 있다.
		
		int inputInteger = sc.nextInt();
		System.out.println("입력 받은 값 : ");
		System.out.println(inputInteger);
		
//		**Scanner** 클래스는 다양한 형태의 입력을 받을 수 있게 해주는 여러 메소드를 제공한다. 예를 들어, **nextInt()**, **nextDouble()**, **nextBoolean()** 등이 있다. 이러한 메소드들은 각각 정수, 실수, 불리언 값을 입력받을 수 있다.
//
//		- **next()**: 다음 토큰을 문자열로 반환한다. 토큰은 공백 (스페이스, 탭, 엔터 등)으로 구분된다.
//		- **nextLine()**: 다음 행 전체를 문자열로 반환한다.
//		- **nextInt()**: 입력된 다음 토큰을 int로 반환한다.
//		- **nextDouble()**: 입력된 다음 토큰을 double로 반환한다.
//		- **nextFloat()**: 입력된 다음 토큰을 float로 반환한다.
//		- **nextLong()**: 입력된 다음 토큰을 long으로 반환한다.
//		- **nextBoolean()**: 입력된 다음 토큰을 boolean으로 반환한다.
//		- **hasNext()**: 다음 토큰이 있는 경우 true를 반환한다.
//		- **hasNextInt()**, **hasNextDouble()**, **hasNextFloat()**, **hasNextLong()**, **hasNextBoolean()**: 각각 다음 토큰이 해당 타입으로 해석될 수 있는 경우 true를 반환한다.
//		- **close()**: 해당 Scanner의 사용을 종료한다.
	}

}
