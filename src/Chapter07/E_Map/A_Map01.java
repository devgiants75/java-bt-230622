package Chapter07.E_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Map 인터페이스
// : 키(key)와 값(value)의 쌍으로 이루어진 데이터 구조
// : 키(key)는 고유한 데이터, 하나의 값을 가리킴

// Map 인터페이스 메소드
// 1. V put(K key, V value): 키와 값을 Map에 추가
//				키가 이미 있으면 해당 값을 새 값으로 교체하고 이전 값을 반환
// 2. V get(Object key): 주어진 키와 연관된 값을 반환
//				키가 Map에 없으면 null을 반환
// 3. V remove(Object key) : 주어진 키와 연관된 키-값 쌍을 삭제
//				삭제된 값이 반환
// 4. boolean containsKey(Object key): 주어진 키가 Map에 있는지 확인
//				있으면 true, 없으면 false를 반환
// 5. Set<K> keySet(): Map에 있는 모든 키를 포함하는 Set을 반환
//				이 Set은 Map의 키를 순회하는데 사용
// 6. Collection<V> values(): Map에 있는 모든 값을 포함하는 Collection을 반환

// Map 인터페이스 구현
//1. HashMap*: 키-값 쌍을 테이블에 저장, 순서를 유지하지 않음.
//- 삽입 순서나 요소의 정렬 상태를 보장하지 않음, 작업 시간이 빠름
//- null 허용(키와 값 모두 null값을 허용)

//2. TreeMap: 키-값 쌍을 트리에 저장, 키의 자연 순서를 유지
//- 요소의 순서가 중요하거나, 요소를 정렬된 상태로 유지해야 할 때 주로 사용
//- null키 허용하지 않음, null 값은 허용

//3. LinkedHashMap: 삽입 순서를 유지(LinkedList를 사용하여 키-값 쌍을 저장)
//- 요소의 삽입 순서가 중요하고 빠른 검색이 필요할 때 주로 사용

public class A_Map01 {
	public static void main(String[] args) {
		// Map 컬렉션 선언 방법
		Map<String, Integer> ages = new HashMap<String, Integer>();
		
		// 값 추가
		ages.put("SeungAh", 26);
		ages.put("JunGook", 28);
		ages.put("DoKyung", 28);
		
		// 값 가져오기
		System.out.println(ages.get("SeungAh"));
		
		// 값 제거
		ages.remove("DoKyung");
		System.out.println(ages);
		
		// 키를 통한 값을 검사
		System.out.println(ages.containsKey("JunGook"));
		
		System.out.println("==========");
		// 모든 키 순회
		for (String name: ages.keySet()) {
			System.out.println(name);
		}
		
		// 모든 값 순회
		for (Integer age: ages.values()) {
			System.out.println(age);
		}
		
		System.out.println("==========");
		// Map에서 키-값 쌍의 수를 반환
		System.out.println(ages.size());
		
		// Map에서 모든 키-값의 쌍을 제거
		ages.clear();
		System.out.println(ages);
		
		System.out.println("==========");
		ages.put("SeungAh", 26);
		ages.put("JunGook", 28);
		ages.put("DoKyung", 28);
		System.out.println(ages);
		
		for(Entry<String, Integer> entry : ages.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
