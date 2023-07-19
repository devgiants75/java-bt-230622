package Chapter08.Z_Syn_Practice;

// 'Animal'이라는 추상 클래스를 작성합니다. 
// 이 클래스는 'name' 속성과 'sound'라는 추상 메소드를 가지고 있습니다.
// 'Dog'와 'Cat' 두 가지 동물 클래스를 작성합니다. 
// 이 클래스들은 'Animal' 클래스를 상속받아야 합니다. 각 클래스는 'sound' 메소드를 재정의하여 
// 개는 "Woof"라고, 고양이는 "Meow"라고 출력해야 합니다.
// 'MakeSound'라는 인터페이스를 작성합니다. 
// 이 인터페이스는 'makeSound'라는 메소드를 가지고 있습니다.
// 'Dog'와 'Cat' 클래스가 'MakeSound' 인터페이스를 구현하도록 합니다. 
// 'makeSound' 메소드는 동물의 'sound' 메소드를 호출해야 합니다.
// 메인 메소드에서 'Dog'와 'Cat' 객체를 생성하고, 
// 각 객체의 'makeSound' 메소드를 호출해 보세요.

abstract class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract void sound();
}

interface MakeSound {
    void makeSound();
}

class Dogs extends Animals implements MakeSound {
    public Dogs(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void makeSound() {
        sound();
    }
}

class Cats extends Animals implements MakeSound {
    public Cats(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void makeSound() {
        sound();
    }
}

public class D_Practice04 {
	public static void main(String[] args) {
		MakeSound dog = new Dogs("Buddy");
        MakeSound cat = new Cats("Kitty");

        dog.makeSound();
        cat.makeSound();
	}
}
