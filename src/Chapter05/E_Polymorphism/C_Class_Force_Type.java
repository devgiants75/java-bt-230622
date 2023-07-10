package Chapter05.E_Polymorphism;
// 자식 타입에서 부모 타입으로 자동 형 변환이 되어
// 자식 클래스의 멤버에 접근이 불가능한 경우
// 다시 자식 클래스의 타입으로 변경해서 접근!: 강제 형 변환

// 자식 객체가 부모 타입으로 자동 타입 변환 한 후, 다시 자식 타입으로 변환하는 것
// 명시적 타입 변환

// 동물 클래스 정의
class Animal {
	void makeNoise() {
		System.out.println("동물은 소리를 낸다.");
	}
}

// 고양이 클래스 정의(Animal 클래스를 상속)
class Cat extends Animal {
	@Override
	void makeNoise() {
		System.out.println("고양이는 냐옹 소리를 낸다.");
	}
	
	void purr() {
		System.out.println("고양이는 새끼소리를 낸다.");
	}
}

public class C_Class_Force_Type {
	public static void main(String[] args) {
		
		// 강제 타입 변환 구현 방법
		// 1. 일회성으로 타입 변환이 필요할 때
//		((자식타입)부모타입).메서드();
		
		// 2. 자식클래스의 멤버들에 대한 접근이 여러 번 필요한 경우에는
		// 		자식 타입 변수에 담아서 사용
//		자식타입 변수 = (자식 타입) 부모타입;
		
		Animal genericAnimal = new Cat(); 
		// 업캐스팅, Cat객체를 Animal 타입으로 참조
		genericAnimal.makeNoise();
		// Cat 객체 안의 메소드가 호출
//		genericAnimal.purr();
		
		// genericAnimal 변수를 Cat 타입으로 다운캐스팅
		Cat specificCat = (Cat)genericAnimal;
		specificCat.purr(); // 자식 메서드가 사용 가능
	}
}
