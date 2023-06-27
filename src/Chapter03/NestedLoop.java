package Chapter03;

public class NestedLoop {

	public static void main(String[] args) {
		// 자바 중첩 루프(nested loop)
		
		// 중첩 루프: 반복문 안에 또 다른 반복문이 있는 구조
		// 각 반복마다 내부 루프 전체를 완전히!! 반복
		
		// 기본 구조: while, do-while문에서도 동일하게 적용
//		for (초기화; 조건; 증감) {
//			for (초기화; 조건; 증감) {
//				// 중첩 루프 내부의 명령문
//			}
//			// 외부 루프 내부의 명령문
//		}
		
		// 예제 - 구구단 출력
		// 1 ~ 9단
		// 각 단마다 1 ~ 9를 반복해서 곱셈
		for (int i = 1; i <= 3; i++) {
			// i단 곱셈
			for (int j = 1; j <= 3; j++) {
				// i X (1 ~ 9)
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println(); 
			// println = print + line(줄 바꿈)
			// 첫 번째 for문 안에 작성
			// 각 행이 끝날 때 마다 한 번씩 실행되어 줄바꿈(새로운 줄에서 시작)
		}
		
		// 예제 - *별 찍기1
//		*
//		**
//		***
//		****
//		*****
		
		// 행이 5번 반복
		// 각 행이 반복될 때마다 *이 1개씩 증가
		
		int rows = 5;
		for (int index = 1; index <= rows; index++) {
			for (int j = 1; j <= index; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		// 예제 - *별 찍기
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
		
		int rows2 = 5;
		
		for (int i = 0; i < rows; i++) { // 행을 5번 반복 
			for (int j = 0; j < rows2 - (i + 1); j++) { 
				// 띄어쓰기를 반복 4, 3, 2, 1, 0
				System.out.print(" ");
				
			}
			for (int k = 0; k <= (2 * i); k++) { 
				// *을 프린트하는 반복 1, 3, 5, 7, 9
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

		
		
		
		
		
		

	}

}
