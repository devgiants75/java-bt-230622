package Chapter07.B_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 6. ArrayList 생성 (숫자 타입 Integer)
// 7. 값을 추가 (1, 2, 3)
// 8. Collection.max(), Collection.min() 최대값, 최소값을 출력

public class Z_Practice01 {
	public static void main(String[] args) {
		
		// 1. 운동 종목을 나열하는 ArrayList를 생성 (sports)
		// 2. 값을 추가 (축구, 야구, 배구, 농구, 야구)
		// 3. 리스트를 순회 (반복문)
		// 4. 리스트를 정렬: Collection.sort(), 정렬 후 출력
		// 5. 부분리스트를 생성: subList(1, 3)
		
		List<String> sports = new ArrayList<String>();
		sports.add("축구");
		sports.add("야구");
		sports.add("배구");
		sports.add("농구");
		sports.add("야구");
		System.out.println(sports);
		
		// for-each루프를 사용하여 리스트의 모든 요소를 순회
		for(String sport : sports) {
			System.out.println(sport);
		}
		
		// Collections.sort()를 사용하여 리스트를 정렬
		Collections.sort(sports);
		System.out.println(sports);
		
		List<String> subList = sports.subList(1, 3);
		System.out.println(subList);
		
		// 6. ArrayList 생성 (숫자 타입 Integer)
		// 7. 값을 추가 (1, 2, 3)
		// 8. Collection.max(), Collection.min() 최대값, 최소값을 출력
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		int max = Collections.max(numbers);  // Output: 3
		int min = Collections.min(numbers);  // Output: 1

	}
}
