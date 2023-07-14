package Chapter07.B_List;

// ArrayList & LinkedList 메서드 사용시 유의사항

//1. get, remove, set메서드(index를 사용하는 메서드)의 경우
//: 인덱스가 유효한지 확인! (유효하지 않은 인덱스를 사용하면 IndexOutOfBoundsException이 발생)
//2. contains(Object o)메서드 사용 시 
//: 리스트에 지정된 요소가 있는 지 검사 필요

public class D_ArrayList_LinkedList {
	public static void main(String[] args) {
//		1. ArrayList와 LinkedList 개요
//		ArrayList
//		내부적으로 배열을 사용하여 요소를 저장합니다.
//		요소를 읽는데 빠르지만, 요소를 추가하거나 삭제하는 것은 느립니다.
		
//		LinkedList
//		내부적으로 이중 연결 리스트를 사용하여 요소를 저장합니다.
//		요소를 추가하거나 삭제하는데 빠르지만, 요소를 읽는 것은 느립니다.
		
//		2. ArrayList vs LinkedList
//		저장 구조
//		ArrayList는 요소의 추가 및 삭제시 요소를 이동시켜야 하므로 오버헤드가 발생하지만
//		, LinkedList는 노드의 연결만 변경하면 되므로 추가 및 삭제가 빠릅니다.
//		반면, ArrayList는 인덱스를 통한 접근이 빠르지만
//		, LinkedList는 처음부터 요소를 순회해야하므로 인덱스 접근이 느립니다.
		
//		메모리 사용
//		ArrayList는 요소의 개수에 비례하는 메모리를 사용하지만
//		, LinkedList는 요소마다 추가적인 메모리를 사용합니다
//		(각 노드는 다음 노드와 이전 노드에 대한 참조를 유지해야하기 때문입니다).
		
//		3. 성능 비교
//		요소 추가
//		ArrayList: 요소를 추가할 때마다 새 배열을 생성하고 기존 요소를 새 배열에 복사해야 하므로, 요소 추가에 시간이 걸립니다.
//		LinkedList: 새 노드를 생성하고 이전 노드와 다음 노드에 연결하기만 하면 되므로, 요소 추가가 빠릅니다.
		
//		요소 접근
//		ArrayList: 인덱스를 사용하여 직접 접근할 수 있으므로, 요소 접근이 빠릅니다.
//		LinkedList: 처음부터 요소를 순회해야 하므로, 요소 접근이 느립니다.
		
//		요소 삭제
//		ArrayList: 요소를 삭제한 후, 나머지 요소를 이동시켜야 하므로, 요소 삭제에 시간이 걸립니다.
//		LinkedList: 노드의 연결만 변경하면 되므로, 요소 삭제가 빠릅니다.
		
//		4. 적합한 리스트 사용 방법
//		ArrayList: 순차적으로 읽는 경우, 인덱스를 통해 요소에 접근하는 경우 적합
//		LinkedList: 자주 추가허가 삭제하는 경우, 또는 리스트의 처음이나 끝에서 작업하는 경우에 적합
	}

}
