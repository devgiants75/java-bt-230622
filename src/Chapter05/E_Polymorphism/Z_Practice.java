package Chapter05.E_Polymorphism;

// 1. 다형성
// Animal, Cat 그리고 Dog 클래스
// Animal 클래스는 sound 메소드 ( The animal makes a sound )
// Cat과 Dog 클래스들은 Animal 클래스를 상속
// Cat과 Dog 클래스들에서 sound 메소드를 오버라이딩하여, 
// 각각 "meow"와 "bark"를 출력

class AnimalClass {
	void sound() {
		System.out.println("The animal makes a sound");
	}
}

class CatClass extends AnimalClass {
	@Override
	void sound() {
		System.out.println("meow");
	}
}

class DogClass extends AnimalClass {
	@Override
	void sound() {
		System.out.println("bark");
	}
}

// 2. instanceof 연산자
// 위에서 정의한 Animal, Cat, Dog 클래스를 이용해서
// 다형성을 확인하는 메소드를 작성
// 메소드는 Animal 타입의 매개변수를 받고,
// instanceof 연산자를 사용하여 매개변수가 
// Cat의 인스턴스인지 Dog의 인스턴스인지 확인하여 출력

class AnimalChecker {
	void checkAnimalType(AnimalClass animal) {
		if(animal instanceof CatClass) {
			System.out.println("This is a cat");
		} else if (animal instanceof DogClass) {
			System.out.println("This is a dog");
		} else {
			System.out.println("Unknown animal type");
		}
	}
}

public class Z_Practice {
	public static void main(String[] args) {
		AnimalChecker animalChecker = new AnimalChecker();
		
		AnimalClass myPet1 = new CatClass();
		animalChecker.checkAnimalType(myPet1);
		
		AnimalClass myPet2 = new DogClass();
		animalChecker.checkAnimalType(myPet2);
		
		AnimalClass myPet3 = new AnimalClass();
		animalChecker.checkAnimalType(myPet3);
	}
}
