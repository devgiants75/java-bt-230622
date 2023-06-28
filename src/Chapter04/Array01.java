package Chapter04;
// 배열 //

// 같은 타입의 여러 변수를 하나의 집합으로 다루는 것
// : 같은 타입의 데이터를 연속적으로 저장하고 쉽게 관리 가능
// : 메모리 상에서 연속적인 공간을 차지 >> 배열 내의 특정 요소에 빠르게 접근 가능
public class Array01 {

	public static void main(String[] args) {
		// '같은 타입'의 변수가 나열된 형태
		// 배열은 '생성'을 해서 사용함. (생성해서 사용하는 변수 : 참조 변수)
		// new 연산자로 생성
		// 배열은 실제 데이터가 저장되는 것이 아니라
		// 데이터 배열이 저장된 첫 번째 메모리 주소가 저장됨
		
		// 동일한 그룹의 데이터를 변수로만 선언해서 사용
		int score1, score2, score3, score4, score5;
		
		score1 = 10;
		score2 = 20;
		score3 = 30;
		// 데이터 관리 & 특정 조건에 따른 데이터를 가져오기 어려움.
		
		// 배열의 선언 (기본형)
		// 데이터타입[] 배열명;
		
		int[] arrayName;
//		int arrayName2[];
		
		// 배열의 생성
		// 배열을 생성하려면 new 키워드를 사용, 그 다음에 데이터 타입과 대괄호 내에 배열의 크기를 지정
		// 배열의 크기: 배열이 저장할 수 있는 요소의 개수를 결정
		
		arrayName = new int[5];
		System.out.println(arrayName);
		
		// 배열을 선언하고 생성하면 모든 요소는 해당 데이터 타입의 기본값으로 초기화
		// int(정수) : 0;
		// boolean(논리) : false;
		// object(객체) : null;
		
		// 배열을 선언하면서 동시에 특정 값으로 초기화 가능
		// 배열명[인덱스 번호] = 데이터(값);
		
		// 배열의 각 요소는 인덱스(index)라는 고유한 번호로 식별
		// 인덱스는 0부터 시작, 배열의 크기보다 1이 작다.
		// 예를 들어 길이가 5인 배열의 인덱스는 0부터 4까지
		// 배열 요소에 접근하기 위해서는 해당 요소의 인덱스를 이용
		
		arrayName[0] = 10;
		arrayName[1] = 20;
		arrayName[2] = 30;
		arrayName[3] = 40;
		arrayName[4] = 50;
		
		// 선언과 동시에 생성 및 초기화
		// 1. 데이터타입[] 배열명 = new 데이터타입[] {요소1, 요소2, ...}	
		int[] scoreList = new int[] {90, 100, 95, 80, 70};
		System.out.println(scoreList.length);
		
		// 2. 데이터타입[] 배열명 = {요소1, 요소2, ...}
		char[] string = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(string);
		
		string[0] = 'j';
		System.out.println(string);
		
		// length
		// 배열의 길이(크기)는 length 필드를 이용해 얻을 수 있다.
		// 이 필드는 배열이 할당 받은 크기를 반환
		
		int[] numbers = {1, 2, 3, 4, 5}; // 배열 선언 및 초기화
		
		int length = numbers.length; // 배열의 길이 얻기 : 5
		
		// 반복문과 함께 lengh 필드를 사용하면 배열의 모든 요소에 순차적으로 접근 가능
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 배열을 이용하여 총합을 구하기
		int[] arr = new int[] {5, 7, 8, 6, 3};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		// 배열의 길이와 요소의 개수가 항상 일치하는 것은 아니다.
		
		int[] arr2 = new int[5];
		
		arr2[0] = 10;
		arr2[1] = 8;
		arr2[2] = 9;
		
		int sum2 = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum2 += arr2[i];
		}
		System.out.println(sum2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
