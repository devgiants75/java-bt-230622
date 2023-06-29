package Practice.IO_Operator;

import java.util.Scanner;

public class A_2562 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt() };
		in.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
		
//		int max = 0;
//		int index = 0;
//		        
//		for(int i = 0 ; i < 9 ; i++) {            
//			if(value > max) {
//				max = value;
//				index = (i + 1) ;
//			}
//		}
		
	}
}