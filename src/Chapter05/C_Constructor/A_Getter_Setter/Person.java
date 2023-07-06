package Chapter05.C_Constructor.A_Getter_Setter;

public class Person {
	
	String name;
	String job;
	// setter메서드 사용 시, 필드의 값을 객체 외부에서 직접 지정하지 못하도록
	// private 키워드를 사용하여 필드에 접근을 제한
	// private: 접근 제한자 중에서 가장 좁은 범위로 접근을 제한하는 지시어
	// - 필드를 보호할 수 있다.
	// - 메서드에서 필드에 들어갈 값을 검증한 후에 필드에 대입 가능
	// - 외부에서 사용할 필드의 값을 정제한 후 값을 제공 가능
	private int age;
	
	// age 값을 1 이상의 값으로만 받고 싶은 경우
	// if 조건문을 사용해 조건 검사 메서드를 만들어 줄 수 있다.
	
	// setter메서드
	void setAge (int num) {
		if (num <= 0) { // 만약, age에 넣으려는 값이 0보다 작거나 같다면,
			// 값이 잘못되었음을 출력하여 알려준다.
			System.out.println("잘못된 수를 입력하셨습니다. 1 이상의 값으로 설정하세요.");
			return; // 메서드 종료
		} else {
			age = num; // age 필드에 num값 저장
		}
	}
	
	// getter메서드
	// setter메서드로 값을 저장했던
	// age의 값을 불러오기 위해 메서드 구현
	int getAge() {
		return age;
	}

}
