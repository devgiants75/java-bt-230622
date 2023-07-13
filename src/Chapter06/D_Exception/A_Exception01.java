package Chapter06.D_Exception;

// 자바 예외 처리
// 예외(Exception): 프로그램이 실행 중에 발생할 수 있는 예기치 못한 문제나 조건
// 예외 처리(Exception Handling)
// : 예외가 발생할 경우 프로그램이 중단되지 않고, 이를 적절하게 처리하여 계속 실행되게 하는 기능

// 자바의 예외 클래스
// Throwable: 모든 예외의 최상위 클래스
//	- Exception: 프로그램이 처리할 수 있는 예외들의 클래스
// 		- RuntimeException: 프로그래머의 실수로 발생하는 예외(예외 처리가 강제되지 않음)
//  - Error: 시스템 레벨에서 발생하는 예외, 개발자가 처리할 수 없음

// 지바 예외 처리 방법
// try-catch-finally 블록, throws 키워드, 사용자 정의 예외 

public class A_Exception01 {
	public static void main(String[] args) {
		// 자바의 기본적인 예외 유형
		// : 체크 예외, 언체크 예외 
		// (컴파일러가 예외 처리를 확인하는 시점이 다름, 예외 처리 방식에 차이가 있음)
		
		// 1. 체크 예외
		// : 개발자가 예외를 처리해야만 하는 예외
		// : 컴파일러가 예외 처리 코드가 있는지 확인하고, 처리가 되어있지 않을 경우 컴파일 에러를 발생
		// IOException, SQLException 등
		
		// 2. 언체크 예외
		// : 컴파일러가 강제로 예외 처리를 확인하지 않는 예외, 주로 개발자의 실수 등으로 발생하는 예외
		// : 이에 대한 처리를 선택적으로 진행
		// : RuntimeException을 상속받은 예외들이 대표적
		// NullPointerException: 참조변수가 null을 참조할 때 발생
		// ArrayIndexOutOfBoundsException: 배열의 범위를 벗어난 접근 시 발생
		
		// 자바 예외 처리 구문
		// 1. try-catch-finally
		try {
			// 예외 발생 가능 코드
		} catch (Exception exception) {
			// 예외 처리 코드
		} finally {
			// 항상 실행될 코드
		}
		
		// 2. throws
		// : 메소드 선언부에 사용, 해당 메소드에서 처리하지 않은 예외를 메소드를 호출한 곳으로 위임하는 역할
//		public void method() throws ExceptionType {
//			// 예외 발생 가능 코드
//		}
		
		// 3. throw
		// : 예외를 직접 발생시키는데 사용
		// : 특정 조건에서 예외를 발생시키고 싶을 때 사용 가능
//		if (condition) {
//			throw new ExceptionType("Exception message");
//		}
		
		// 4. 복수의 예외처리
		// : 하나의 try 블록에서 여러 타입의 예외가 발생할 수 있는 경우
		// : 상위 클래스의 예외 타입이 하위 클래스의 예외 타입보다 선행 될 수 없음.
		
//		try {
//			// 예외 발생 가능 코드
//		} catch(SubExcetpionType1 e) {
//			// SubExcetpionType1 처리 코드
//		} catch(SubExcetpionType2 e) {
//			// SubExcetpionType2 처리 코드
//		} catch(SubExcetpionType3 e) {
//			// SubExcetpionType3 처리 코드
//		} finally {
//			// 항상 실행될 코드
//		}			
	}
}
