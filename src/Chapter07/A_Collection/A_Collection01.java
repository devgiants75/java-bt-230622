package Chapter07.A_Collection;

// 자바 컬렉션 프레임워크
// : 자바에서 데이터를 저장하고 처리하는 자료구조의 표준화된 설계

// 컬렉션 프레임워크 주요 인터페이스
// Collection: List, Set 등의 상위 인터페이스, 데이터의 집합을 다룸.
// List: 데이터의 순서를 유지, 중복 허용 (ArrayList, LinkedList 등)
// Set: 데이터의 순서를 유지하지 않음, 중복을 허용하지 않음 (HashSet, TreeSet 등)
// Map: 키-값 쌍으로 이루어진 데이터를 다룸. 키는 중복이 허용되지 않음(HashMap, TreeMap 등)

public class A_Collection01 {
	public static void main(String[] args) {
		// 효과적인 컬렉션 프레임워크 사용법
		
		// 1. 데이터의 특성에 맞는 적절한 컬렉션 클래스 선택
		// 2. 고정된 크기의 데이터를 다룰 때는 ArrayList,
		//    데이터의 삽입과 삭제가 빈번할 때는 LinkedList 사용
		// 3. 중복 데이터를 허용하지 않아야 할 때는 Set 인터페이스를 구현하는 클래스 사용
		// 4. 키-값 쌍의 데이터를 다룰 때는 Map 인터페이스를 구현하는 클래스 사용
		// 5. 동기화가 필요한 경우에는 Collections의 정적 메소드인 
		//    synchronizedXXX()를 이용하여 동기화된 컬렉션 얻기
		
	}
	
}
