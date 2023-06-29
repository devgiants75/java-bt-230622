package Practice.IO_Operator;

import java.util.Scanner;

public class A_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		// M이 45미만일 때
		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
			
			
		// M이 45이상일 때
		} else {
			M -= 45;
			System.out.println(H + " " + M);
		}

	}

}
