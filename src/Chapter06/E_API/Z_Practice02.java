package Chapter06.E_API;

import java.util.ArrayList;
import java.util.Scanner;

// 사용자로 부터 정수를 입력받아 해당 정수의 제곱근을 계산하는 프로그램을 작성
// Math.sqrt()
// 사용자가 음수를 입력할 경우 ArithmeticException 예외를 발생
// 이를 처리하여 사용자에게 양수를 다시 입력하도록 요청

// while문(무한루프로 작성, 음수 일경우 무한 루프가 계속 동작하도록 작성)
// 제곱근 계산이 동작할 경우 break;문을 사용하여 무한 루프 탈출

public class Z_Practice02 {
	public static void main(String[] args) {
		// 복습문제1
		// 아래의 코드에서 발생하는 예외를 검색해 
		// 해당 오류를 try-catch문을 사용해 예외 처리
		try {
			int result = 10/0;			
		} catch(ArithmeticException exception) {
			System.out.println("Cannot divide by zero!");
		}
		
		// 복습문제2
		// 아래의 메소드를 사용해 W값의 인덱스 번호를 출력
		// indexOf()
		String str = "Hello, World!";
		int index = str.indexOf('W');
		System.out.println("Index of 'W' : " + index);
		
		// 복습문제3
		// ArrayList<String>을 생성
		// "Hello", "World", "!" 세 개의 요소를 추가
		// get() 메서드를 사용하여 "World"를 출력
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("!");
		System.out.println("Second element : " + list.get(1));
		
		// 종합 복습 문제 정답
		Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new ArithmeticException("Cannot calculate square root of a negative number");
                }

                double sqrt = Math.sqrt(num);
                System.out.println("The square root is: " + sqrt);
                break; // 성공적으로 계산되면 루프 종료
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter a positive number.");
            }
        }
        scanner.close();
	}
}
