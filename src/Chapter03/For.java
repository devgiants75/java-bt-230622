package Chapter03;

import java.util.Scanner;

//자바의 반복문
//같은 작업을 여러 번 반복해야 할 때 유용
//EX) 배열의 모든 요소에 작업을 적용하거나, 특정 조건이 만족될 때까지 작업을 반복하는 등의 작업에 유용

//코드의 로직을 제어하는데 중요!

public class For {

	public static void main(String[] args) {
		
		// For 반복문
		// 규칙이 있는 작업을 반복하는 제어문
		// 일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문 : 주어진 조건이 만족되는 동안 만 코드 블록을 반복적으로 실행
		
		// 기본 구조
//		for (초기화; 조건; 증감) {
//			// (조건이 참일 경우) 실행할 코드
//		}
		
		// 초기화: 반복문의 제어 변수를 초기화: 숫자형 변수를 사용하여 반복문이 실행하는 횟수를 제어
		// 조건: 제어 변수에 대한 논리적 테스트를 기술(조건이 참일 경우에만 반복문의 본문이 실행)
		// 증감: 반복문의 각 반복 후에 제어 변수를 어떻게 변경할지 결정
		
		// 예제
		// 1부터 10까지의 숫자를 출력
		for (int index = 1; index <= 10; index++) {
			System.out.println(index);
		}
		
		// 'i'라는 제어변수를 1로 초기화하고
		// 'i'가 10이하인 동안에만 반복문을 실행
		// 각 반복 후에 i를 1씩 증가
		
		System.out.println("===================");
		// 예제 실습
		// 10부터 20까지의 숫자 중에서 짝수만 출력하는 for 반복문을 작성
		for (int i = 10; i <= 20; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("===================");
		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("===================");
		// for반복문을 사용하여 구구단 출력 (3단)
		
		// 3이라는 변수
		// 1 ~ 9 숫자를 반복
		// * 연산자를 사용
		
		int number = 3;
		
		for (int index = 1; index <= 9; index++) {
			System.out.println(number + " X " + index + " = " + (number * index) );
		}
		
		System.out.println("======================");
		// for 반복문을 사용해서 5개의 임의의 숫자를 입력받아 그 숫자들의 평균을 구하는 반복문을 작성
		
		// Scanner 사용 (java.utils)
		// 평균 : 총합 / 개수
		
		// 평균을 담을 변수의 자료형을 실수형 선언
		
		Scanner sc = new Scanner(System.in);
		
		// 평균을 담을 변수 선언 및 초기화(0)
		int sum = 0;
		
		// for문 (5개의 임의의 숫자를 입력, 그 5개의 숫자의 총합을 구하는 반복문)
		for (int index = 1; index <= 5; index++ ) {
			System.out.println(index + "번 째 숫자를 입력하세요: ");
			int number2 = sc.nextInt();
			sum += number2;
		}
		
		double average = sum / 5;
		System.out.println("입력한 숫자들의 평균은 : " + average + "입니다.");
		
		// 평균
		// 출력 : 입력한 숫자들의 평균은 : 10입니다.

	}

}
