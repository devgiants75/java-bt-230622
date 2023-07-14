package Chapter07.B_List;

import java.util.ArrayList;
import java.util.List;

// List 인터페이스
// : 데이터를 순차적으로 저장하고 접근하는 데 사용되는 메소드를 정의
// : 데이터의 중복 저장을 허용, 저장된 순서에 따라 데이터를 관리


public class A_List01 {
//  1. List 인터페이스의 주요 메소드
	
//	void add(int index, E element) {}: 저장된 위치에 주어진 요소를 삽입
//	boolean add(E e): 주어진 요소를 리스트의 끝에 추가
//	E get(int index): 저장된 위치에 있는 요소를 반환
//	int indexOf(Object o): 주어진 객체와 일치하는 첫 번째 요소의 인덱스를 반환
//	int lastIndexOf(Obejct o) :  주어진 객체와 일치하는 마지막 요소의 인덱스를 반환
//	ListIterator<E> listIterator(): 리스트에 대한 ListIterator(목록 반복자)를 반환
//	E remove(int index): 지정된 위치의 요소를 제거하고 그 요소를 반환
//	E set(int index, E element): 지정된 위치에 주어진 요소를 저장, 이전에 있던 요소를 반환
//	List<E> subList(int fromIndex, int toIndex): 리스트의 일부를 뷰로 반환
	
//	2. List 인터페이스 구현 클래스
//	ArrayList: 내부적으로 배열을 사용하여 데이터를 관리
//	LinkedList: 내부적으로 이중 연결 리스트를 사용하여 데이터를 관리
	//			각 요소가 이전 요소와 다음 요소에 대한 참조를 가짐.
//	Vector: ArrayList와 유사, 동기화 지원이되는 클래스

	public static void main(String[] args) {
		// List 생성
		List<String> list = new ArrayList<String>();
		
		// add(E e)
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println(list);
		
		// add(int index, E element)
		list.add(1, "melon");
		System.out.println(list);
		
		// get(int index)
		System.out.println(list.get(2));
		
		// indexOf(Object o)
		System.out.println(list.indexOf("melon"));
		
		// remove(int index)
		System.out.println(list.remove(1));
		System.out.println(list);
		
		// set(int index, E element)
		System.out.println(list.set(1, "strawberry"));
		System.out.println(list);
		
		list.add("Orange");
		list.add("PineApple");
		list.add("Mango");
		System.out.println(list);
		
		// subList(int fromIndex, int toIndex)
		// fromIndex 번호 부터 toIndex 번호 앞까지를 반환
		// fromIndex <= x < toIndex
		List<String> subList = list.subList(1, 3);
		System.out.println(subList);
	}

}
