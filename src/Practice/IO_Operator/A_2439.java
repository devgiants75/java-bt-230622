package Practice.IO_Operator;

import java.util.Scanner;

public class A_2439 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		N = scanner.nextInt();
		
		// 중첩된 for문
		
		// 별의 길이 (행)
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - (i + 1); j++) {
				System.out.print(" ");
			}
			
			// *
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
