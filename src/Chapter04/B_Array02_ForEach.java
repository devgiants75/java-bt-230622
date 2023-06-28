package Chapter04;

// forEach: 배열이나 컬렉션의 모든 요소를 순회하는 방법
// for each item in collection
// 코드를 더 간결하고 가독성이 좋다.
// 인덱스를 통한 요소 접근이 필요한 경우에는 사용 불가

public class B_Array02_ForEach {

	public static void main(String[] args) {
		
		// for반복문
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("=================");
		// forEach반복문
		for (int number : numbers) {
			System.out.println(number);
		}
		

	}

}
