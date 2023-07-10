package Chapter05.E_Polymorphism;

// instanceof 연산자
// 주어진 객체가 특정 클래스나 인터페이스의 인스턴스인지를 확인하는데 사용
// : 객체의 타입을 확인하고 해당 타입에 따라 다른 동작을 수행하게 할 수 있음.

class Animals {}
class Dog extends Animals {}

public class E_Instanceof {
	public static void main(String[] args) {
		
		Animals a = new Animals();
		Dog d = new Dog();
		
		System.out.println(a instanceof Animals); //true
		System.out.println(d instanceof Dog); // true
		
		// Dog클래스가 Animal클래스를 상속받았으므로
		// d인스턴스는 Animal의 인스턴스가 맞다 // true
		System.out.println(d instanceof Animals); // true
		
		Animals myAnimal = new Dog(); // 자동 형 변환
		// Animals 타입의 참조 변수
		// + 실제 객체는 Dog이다.
		
		if (myAnimal instanceof Dog) {
			System.out.println("myAnimal is an instance of Dog");
		} else {
			System.out.println("myAnimal is not an instance of Dog");
		}
		
		// instanceof 연산자 VS == 연산자
		
		// 1. instanceof 연산자
		// 왼쪽 객체가 생성될 때 오른쪽 타입으로 생성되었는지 확인하는 연산자
		
		// 2. == 연산자
		// 객체 변수가 같은 객체를 참조하는지 확인
		
		// instanceof 연산자의 주의사항
		// : null에 대해 false값을 반환(null 값은 모든 클래스의 인스턴스가 아니다.)
		
		Animals myAnimal2 = null;
		
		System.out.println(myAnimal2 instanceof Animals);
		
	}

}
