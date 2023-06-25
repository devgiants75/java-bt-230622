package Chapter02;

public class Operator02 {
	public static void main(String[] args) {
		// 증감 연산자: '변수' 자기 자신을 1 증가 혹은 감소
		
		System.out.println("-증가 연산자-");
		// 증가 연산자: ++
		// 연산자의 좌항 혹은 우항의 값을 1 증가 시킴
		int integer1 = 10;
		++integer1;
		System.out.println(integer1);
		
		integer1++;
		System.out.println(integer1);
		System.out.println("--------------");
		
		integer1 = 0;
		System.out.println(integer1); // 0
		++integer1; // 1
		integer1++; // 2
		System.out.println(integer1); // 2
		integer1++; // 2(+1)
		System.out.println(integer1); // 3
		System.out.println("--------------");
		
		System.out.println(integer1++); // 3
		System.out.println(integer1); // 4
		System.out.println(++integer1); // (+1) + 4 = 5
		
		// 상수에는 증감연산자를 사용하지 못함
		final int NUMBER = 0;
//		NUMBER++;
		
		System.out.println("-감소 연산자-"); 
		// 감소 연산자: --
		// 연산자의 좌항 혹은 우항에 값을 1 감소시킨다.
		int integer2 = 10;
		--integer2; // 출력 시 : 9
		integer2--; // 출력 시 : 9
		System.out.println(integer2); // 출력 시 : 8
		
		int num = 8;
		int num2 = 3;
		int sampleNumber = num / --num2; // 8 / 2
		System.out.println(sampleNumber);
		
	}

}
