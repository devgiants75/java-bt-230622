package Chapter07.B_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Iterator
// : 컬렉션 프레임워크에 저장되어 있는 요소들을 순차적으로 접근하는 방법을 표준화한 인터페이스

// Iterator의 주요 메소드
// boolean hasNext(): 이후에 요소가 더 있는지 확인하는 메서드(요소가 있을 경우 true, 요소가 없을 경우 false 반환)
// E next(): 다음 요소를 반환

// Iterator의 장단점
//장점
//컬렉션의 구현 타입에 관계없이 동일한 방식으로 요소에 접근할 수 있습니다.
//리스트와 세트 모두에서 사용할 수 있습니다.

//단점
//단방향으로만 이동할 수 있으며, 이전 요소로 이동하거나, 특정 위치로 이동하는 것이 불가능합니다.
//컬렉션에 동시에 접근하려는 다중 스레드 환경에서는 동기화 문제를 처리해야 합니다.

public class E_Iterator {
	public static void main(String[] args) {
		List<String> sports = new ArrayList<String>();
		sports.add("축구");
		sports.add("야구");
		sports.add("배구");
		
		// Iterator 생성
		Iterator<String> iterator = sports.iterator();
		
		// Iterator로 List 순회
		while (iterator.hasNext()) {
			String sport = iterator.next();
			System.out.println(sport);
			
			// Iterator로 요소 수정과 삭제
			// !Iterator로 요소를 직접 수정 불가!
			if ("야구".equals(sport)) {
				iterator.remove(); // "야구" 삭제
			}
		}
		System.out.println(sports);
		
		System.out.println("===================");
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		Iterator<Integer> NumIterator = numbers.iterator();
		boolean allOdd = true;
		
		while(NumIterator.hasNext()) {
			Integer number = NumIterator.next();
			
			if (number % 2 == 0) {
				allOdd = false;
				break;
			}
		}
		System.out.println(allOdd ? "모든 숫자가 홀수입니다." : "짝수가 포함되어 있습니다.");
	}

}
