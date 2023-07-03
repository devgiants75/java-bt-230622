package Chapter05;

class Dog {
	// 인스턴스 변수
	String breed;
	int age;
	
	// 생성자
	Dog(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}
	
	// 메서드
	void bark() {
		System.out.println("Woof!");
	}
}

public class G_Class_Practice {

	public static void main(String[] args) {
//		클래스 이름: Dog
//		인스턴스 변수: String breed, int age
//		메서드: bark() - "Woof!" 라고 출력합니다.
//		생성자: breed와 age를 매개변수로 받아 초기화합니다.

		// 생성한 Dog클래스의 인스턴스를 생성하고
		// bark() 메서드를 호출
		
		Dog myDog = new Dog("choco", 3);
		myDog.bark();
	}

}

// 다음 객체 배열 중 옳지 않은 것?

//1. Power []p = new Power[10];    
//2. Power p[] = new Power[10];    
//3. Power p[10] = new Power[10]; (X)   
//4. Power[] p; 선언


