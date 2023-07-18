package Chapter08.Z_Syn_Practice;

import java.util.Scanner;

// "피보나치 수열"은 첫 번째와 두 번째 항이 1이며 
// 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열

// 사용자로 부터 입력받은 숫자 N까지의 피보나치 수열을 
// 출력하는 프로그램을 작성
// 단, N은 2 이상의 자연수로가정합니다.

// 반복문 내에서는 피보나치 수열의 다음 항을 계산하기 위해 
// 앞의 두 항의 값을 더하고, 이전 항들의 값을 새로운 항들의 
// 값으로 업데이트하는 과정을 반복
public class B_Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피보나치 수열 예제, 숫자를 입력하세요 : ");
		int N = sc.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		int num3;
		
		System.out.println(num1 + " " + num2 + " ");
		
		for(int i = 2; i < N; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
