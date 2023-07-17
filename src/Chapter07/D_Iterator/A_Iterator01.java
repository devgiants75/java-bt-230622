package Chapter07.D_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Iterator 인터페이스
// : 컬렉션에서 저장된 요소를 반복하거나 순회하는 데 사용

// Iterator 인터페이스 메소드
// 1. boolean hasNext(): 아직 순회하지 않은 요소가 있으면 true 반환
// 2. E next() : 다음 요소를 반환
// 3. void remove(): 최근에 반환된 요소를 컬렉션에서 제거

public class A_Iterator01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		// Iterator 선언 방법
		Iterator<String> iterator = list.iterator();
		
		System.out.println("--------iterator---------");
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("----------forEach 반복문---------");
		// Iterator와 for-each 루프 비교
		for(String element : list) {
			System.out.println(element);
		}
	}

}
