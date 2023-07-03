package Chapter05.A_Class;

// 인스턴스
// 클래스를 통해서 만들어진 객체
// 클래스에서 정의된 속성과 동작을 가진다.

class MyClass {
	int x;
	
	// 생성자(constructor)
	MyClass() {
		x = 10;
	}
}

class Car {
	String model;
	int year;
	
	// 생성자: 클래스의 인스턴스가 생성될 때 호출
	Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	void display() {
		System.out.println(model + " " + year);
	}
}

public class F_Instance {
	public static void main(String[] args) {
		// MyClass의 인스턴스 생성
		MyClass myObj = new MyClass();
		System.out.println(myObj.x);
		
		// Car의 인스턴스 생성
		// 생성과 동시에 생성자에 값을 할당
		Car myCar = new Car("Tesla", 2023);
		myCar.display();
		
	}

}
