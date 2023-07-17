package Chapter07.C_Set;

import java.util.HashSet;
import java.util.Set;

// Set 인터페이스
// : 중복된 요소를 포함하지 않는 객체의 집합
// : 객체의 저장 순서를 저장하지 않음(삽입 순서를 유지하지 않음)
// : null 요소를 포함할 수 있다.

// Set 컬렉션(Set 인터페이스 구현)
// 1. HashSet*: 가장 빠른 성능을 제공하지만 순서를 유지하지 않음.
// - 삽입 순서나 요소의 정렬 상태를 보장하지 않음, 작업 시간이 빠름

// 2. TreeSet: 요소를 자동으로 정렬
// - 요소의 순서가 중요하거나, 요소를 정렬된 상태로 유지해야 할 때 주로 사용

// 3. LinkedHashSet: 삽입 순서를 유지
// - 요소의 삽입 순서가 중요하고 빠른 검색이 필요할 때 주로 사용

public class A_Set01 {
	public static void main(String[] args) {
		// HashSet 클래스 선언 방법
		// Set<E> set = new HashSet<E>();
		// Set<E> set = new HashSet<>();
		Set<String> set = new HashSet<String>();		
		
		// Set 인터페이스의 주요 메서드
		// 1. 요소 추가: add()
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("Java"); // 이 요소는 추가되지 않음.(Set은 중복을 허용하지 X)
		
		System.out.println(set); // [Java, Python, C++]
		
		// 2. 요소 삭제: remove()
		set.remove("Java");
		System.out.println(set);
		
		// 3. Set의 크기 확인: size()
		System.out.println(set.size());
		
		// 4. Set에 특정 요소가 있는지 확인: contains()
		System.out.println(set.contains("Python"));
		System.out.println(set.contains("Java"));
		
		// 5. Set에서 모든 요소를 제거: clear()
		set.clear();
		System.out.println(set.size());
		
		
		
		
		
		
	}
}
