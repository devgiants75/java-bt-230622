package Chapter06.C_InnerClass;

// 비정적 내부 클래스 생성 Animal, Heart
// 외부 클래스에는 private한 필드 값 (나이 age)
// 내부 클래스에는 메소드 (beat) - 출력값 (위에서 선언한 나이를 가져옴)

// 인스턴스화 (외부, 내부클래스)
// heart.beat(); // "3 years old"
class Animal {
	private int age = 3;
	
	class Heart {
		void beat() {
			System.out.println(age + " years old");
		}
	}
}

// 정적 내부 클래스 생성 Car, Engine 
// 외부 클래스에는 private한 필드 값(model)
// 내부 클래스에는 메소드 (start) - 출력값 (위에서 선언한 model을 가져옴)

// 인스턴스화 (내부클래스)
// engine.start();

class Car {
	private static String model = "Tesla Model S";
	
	static class Engine {
		void start() {
			System.out.println(model + "'s engine is starting");
		}
	}
}

public class Z_Practice01 {

	public static void main(String[] args) {
		// 비정적 내부 클래스
		Animal animal = new Animal();
		Animal.Heart heart = animal.new Heart();

		heart.beat();
		
		// 정적 내부 클래스
		Car.Engine engine = new Car.Engine();
		
		engine.start();
	}

}
