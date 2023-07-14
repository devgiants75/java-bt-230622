package Chapter07.B_List;

import java.util.ArrayList;

// ArrayList: 내부적으로 동적 배열을 사용하여 데이터를 관리,
//			저장 순서를 유지하고 중복 값을 허용

// ArrayList의 특징
//	1. 동적 크기 조절
//	: ArrayList는 요소가 추가되거나 제거될 때 자동으로 크기를 조절합니다. 
//	  즉, 사용자는 리스트의 크기에 대해 걱정할 필요가 없습니다.
//	2. 인덱스 기반 접근
//	: ArrayList는 인덱스를 기반으로 데이터에 접근합니다. 
// 	  따라서 특정 위치의 데이터를 빠르게 읽거나 수정할 수 있습니다. 
// 	  그러나 중간에 삽입하거나 삭제하는 작업은 비교적 느립니다.
//	3. 순차적인 데이터 저장
// 	: ArrayList는 데이터를 순서대로 저장합니다. 
//    입력 순서는 리스트에서 요소의 위치를 결정하며, 중복 데이터도 허용합니다.
//	4. 널 값을 허용
// 	: ArrayList는 널(null) 값을 저장하는 것을 허용합니다.
//	5. 스레드 불안전
//	: ArrayList는 기본적으로 스레드에 안전하지 않습니다. 
// 	  여러 스레드에서 동시에 ArrayList를 수정하면 데이터 무결성이 깨질 수 있습니다. 
//    스레드 안전성이 필요한 경우 Collections.synchronizedList 메서드를 
//    사용하여 동기화 된 리스트를 얻을 수 있습니다.

//	ArrayList 사용법
//	1. 데이터의 빈번한 삽입과 삭제보다는 데이터의 빈번한 조회에 적합
//	2. 동기화 지원X, 여러 스레드에서 동시에 데이터를 수정하면 문제가 발생
//	3. null값을 허용하기 때문에, null값이 허용될 수 있는 상황에서는 null 체크를 항상 해야 함.

public class B_ArrayList {
	public static void main(String[] args) {
//		ArrayList의 주요 메서드
//		ArrayList 클래스는 다음과 같은 주요 메서드들을 제공합니다:
//
//		boolean add(E e) : 리스트의 끝에 지정된 요소를 추가합니다.
//		void add(int index, E element) : 리스트의 지정된 위치에 요소를 삽입합니다.
//		E get(int index) : 리스트의 지정된 위치에 있는 요소를 반환합니다.
//		E remove(int index) : 리스트에서 지정된 위치의 요소를 제거하고 그 요소를 반환합니다.
//		E set(int index, E element) : 리스트의 지정된 위치에 있는 요소를 지정된 요소로 바꾸고, 원래의 요소를 반환합니다.
//		int size() : 리스트에 있는 요소의 수를 반환합니다.
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		// Adding elements
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Javascript");
		
		// Printing elements
		System.out.println(arrayList);
		
		// Adding element at specific index
        arrayList.add(1, "C++");
        System.out.println(arrayList);  // Output: [Java, C++, Python, JavaScript]

        // Accessing element from ArrayList
        String element = arrayList.get(2);
        System.out.println(element);  // Output: Python

        // Removing element from ArrayList
        arrayList.remove(0);
        System.out.println(arrayList);  // Output: [C++, Python, JavaScript]

        // Modifying element at specific index
        arrayList.set(1, "Rust");
        System.out.println(arrayList);  // Output: [C++, Rust, JavaScript]
		
		// Getting size of ArrayList
        int size = arrayList.size();
        System.out.println("Size of ArrayList : " + size);
		
	}
}
