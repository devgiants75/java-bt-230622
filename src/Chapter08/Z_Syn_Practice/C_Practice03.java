package Chapter08.Z_Syn_Practice;

// Animal 추상 클래스를 정의
abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	abstract void sound();
}

interface Pet {
	void play();
}

class Dog extends Animal implements Pet {
	public Dog(String name) {
		super(name);
	}
	
	@Override
	void sound() {
		System.out.println(name + "는 멍멍!");
	}
	
	@Override
	public void play() {
		System.out.println(name + "은(는) 놀이를 합니다.");
	}
}

public class C_Practice03 {
	public static void main(String[] args) {
		Dog dog = new Dog("초코");
		
		dog.sound();
		dog.play();
	}
}
