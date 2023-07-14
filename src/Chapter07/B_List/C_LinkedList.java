package Chapter07.B_List;

import java.util.LinkedList;

// LinkedList
// : 내부적으로 이중 연결 리스트를 사용하여 데이터를 관리, 저장 순서를 유지하고 중복 값을 허용

//	LinkedList의 특징
//	동적 크기 조절
//	: LinkedList는 요소가 추가되거나 제거될 때마다 자동으로 크기를 조절합니다.

//	데이터 삽입/삭제 효율
// 	: LinkedList는 특정 위치에서의 요소 추가/삭제가 빠릅니다. 
//  이는 노드 간의 연결만 변경하면 되기 때문입니다. 
//  그러나 특정 위치의 요소에 접근하기 위해서는 리스트를 순회해야 하므로
//  , 접근 시간은 ArrayList보다 느릴 수 있습니다.

//	순차적인 데이터 저장
// 	: LinkedList는 데이터를 순서대로 저장합니다. 
//  입력 순서는 리스트에서 요소의 위치를 결정하며, 중복 데이터도 허용합니다.

//	널 값을 허용
// 	: LinkedList는 널(null) 값을 저장하는 것을 허용합니다.

//	스레드 불안전
// 	: LinkedList는 기본적으로 스레드에 안전하지 않습니다. 
//	여러 스레드에서 동시에 LinkedList를 수정하면 데이터 무결성이 깨질 수 있습니다. 
//  스레드 안전성이 필요한 경우 Collections.synchronizedList 메서드를 사용하여 
//  동기화 된 리스트를 얻을 수 있습니다.

//LinkedList 사용법
//1. 데이터의 빈번한 삽입과 삭제에 적합, 인덱스를 이용한 접근보다는 순차적인 접근에 적합
//2. 동기화 지원X, 여러 스레드에서 동시에 데이터를 수정하면 문제가 발생
//3. null값을 허용하기 때문에, null값이 허용될 수 있는 상황에서는 null 체크를 항상 해야 함.

public class C_LinkedList {
	public static void main(String[] args) {
//		LinkedList의 주요 메서드
//		LinkedList 클래스는 다음과 같은 주요 메서드들을 제공합니다:
//
//		boolean add(E e) : 리스트의 끝에 지정된 요소를 추가합니다.
//		void add(int index, E element) : 리스트의 지정된 위치에 요소를 삽입합니다.
//		E get(int index) : 리스트의 지정된 위치에 있는 요소를 반환합니다.
//		E remove(int index) : 리스트에서 지정된 위치의 요소를 제거하고 그 요소를 반환합니다.
//		E set(int index, E element) : 리스트의 지정된 위치에 있는 요소를 지정된 요소로 바꾸고, 원래의 요소를 반환합니다.
//		int size() : 리스트에 있는 요소의 수를 반환합니다.
		
		LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JavaScript");
        
     // Printing elements
        System.out.println(linkedList);
        
     // Adding element at specific index
        linkedList.add(1, "C++");
        System.out.println(linkedList);
        
     // Accessing element from LinkedList
        String element = linkedList.get(2);
        System.out.println(element);
        
     // Removing element from LinkedList
        linkedList.remove(0);
        System.out.println(linkedList);
        
     // Modifying element at specific index
        linkedList.set(1, "Rust");
        System.out.println(linkedList);
        
     // Getting size of LinkedList
        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);
	}
}
