package Practice.IO_Operator;

import java.util.Scanner;

public class A_9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		score = sc.nextInt();

		if (score > 89 && score < 101) {
			System.out.println("A");
		} else if (score > 79 & score < 90) {
			System.out.println("B");
		} else if (score > 69 & score < 80) {
			System.out.println("C");
		} else if (score > 59 & score < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
