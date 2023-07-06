package Chapter05.C_Constructor;

class Student {
	String name;
	int age;
	int studentID;
	
//	Student(String n, int a, int s) {
//		name = n;
//		age = a;
//		studentID = s;
//	}
	
	// 1. this 키워드는 현재 클래스의 인스턴스 변수 참조
	Student(String name, int age, int studentID) {
		this.name = name; 
		// this.name: 인스턴스 변수
		// name: 매개변수를 참조
		this.age = age;
		this.studentID = studentID;
		// 이름이 동일할 경우, 
		// 중괄호 안에서 사용하기 위해 선언된 지역변수(매개변수)가 클래스 필드 보다
		// 우선순위가 높아서 대입연산자를 기준으로 왼쪽, 오른쪽 모두 매개변수를 뜻
	}
	
	// 2. 현재 클래스의 메소드를 호출
	void methodOne() {
		System.out.println("메서드 1입니다.");
	}
	
	void methodTwo() {
		// this 키워드를 사용해 같은 클래스 내의 다른 메소드를 호출
		this.methodOne();
		System.out.println("메서드 2입니다.");
	}
	
	// 3. 현재 클래스의 생성자 호출: 생성자 체이닝
	Student() {
		this("studentName", 20, 2222); // 다른 생성자 호출
	}
	
	// 4. 현재 객체 반환
	// 현재 객체를 반환하는 메소드를 작성할 수 있다.
	Student getStudent() {
		return this; // 현재 객체를 반환
	}
	
}

public class D_This {

	public static void main(String[] args) {
		
		Student student1 = new Student("이승아", 90, 1111);
		student1.methodTwo();
		
		Student student2 = new Student();
		System.out.println(student2.name + student2.age + student2.studentID);

	}

}
