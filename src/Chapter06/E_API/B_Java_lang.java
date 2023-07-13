package Chapter06.E_API;

// java.lang: 자바 프로그래밍의 가장 기본적인 클래스들을 포함
// : 다른 모든 자바 애플리케이션에서 기본으로 사용 가능
// : 별도의 import문 없이 사용 가능

// Object: 자바의 모든 클래스의 최상위 클래스, 모든 클래스는 Object 클래스로 부터 상속
// - equals(), toString()

// String, StringBuilder: 문자열
// - substring(), replace() 

// Math: 수학적 연산을 위한 메서드를 제공하는 클래스
// - max(), min()

// System: 시스템 관련 기능을 제공
// - out, in

public class B_Java_lang {
	public static void main(String[] args) {
		// String 클래스 예제
		String str = "Hello, World!";
		System.out.println(str.replace("World", "Java"));
		
		// StringBuilder 클래스 예제
		StringBuilder sb = new StringBuilder("Hello, ");
		sb.append("World!");
		System.out.println(sb.toString());
		
		// Math 클래스 예제
		double nineSqrt = Math.sqrt(9); // sqrt: 제곱근을 리턴
		System.out.println(nineSqrt);
		
		// System 클래스 예제
		long start = System.currentTimeMillis();
		
		// 실행할 코드를 작성
		// 1부터 10,000까지의 합을 구하는 코드
		int sum = 1;
		for (int index = 0; index < 100000000; index++) {
			sum += index;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(sum);
		System.out.println("실행 시간: " + (end - start) + "ms");
		
		
		
		
		
		
		
		
	}

}
