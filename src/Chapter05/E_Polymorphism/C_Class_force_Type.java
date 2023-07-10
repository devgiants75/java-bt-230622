package Chapter05.E_Polymorphism;

//동물 클래스 정의
class Animal {
 void makeNoise() {
     System.out.println("동물은 소리를 낸다.");
 }
}

//고양이 클래스 정의 (Animal 클래스를 상속)
class Cat extends Animal {
 @Override
 void makeNoise() {
     System.out.println("고양이는 냐옹 소리를 낸다.");
 }

 void purr() {
     System.out.println("고양이는 새끼 소리를 낸다.");
 }
}

public class C_Class_force_Type {

	public static void main(String[] args) {
		// 객체 c처럼 자식 타입에서 부모타입으로 자동 타입 변환을 했지만 자식 클래스의 멤버들에게
		// 접근하고 싶을 때에는 다시 DeskCalendar 타입으로 변경해서 접근할 수 있도록 제공 가능
		
		// 이를 클래스 강제 타입 변환이라고 부른다.
		// 자식 객체가 부모 타입으로 자동 타입 변환을 한 후, 다시 자식 타입으로 변환하는 것
		
		// 클래스 타입 변환에서 강제 타입 변환은 자동 타입 변환과는 달리
		// 개발자가 직접 명시해야만 타입 변환을 할 수 있다.
		
		// 자식 타입을 부모 타입으로 변환할 때는 별도 명시가 없어도 프로그램이 실행되면서
		// 자동으로 타입을 변환해 주지만, 부모에서 자식 타입으로 변환하려면 타입의 형태를 직접 작성해야 한다.
		
		// 일회성으로 타입 변환이 필요할 때는 
//		((자식 타입)부모타입).메서드();
		
		// 자식클래스의 멤버들에 대한 접근이 여러 번 필요한 경우에는 다음과 같이 자식 타입 변수에 담아서 사용
//		자식 타입 변수 = (자식 타입) 부모타입;

		// 예제
		Animal genericAnimal = new Cat(); // 업캐스팅. Cat 객체를 Animal 타입으로 참조
        genericAnimal.makeNoise(); // "고양이는 냐옹 소리를 낸다." 출력
//        genericAnimal.purr(); // 오류

        // genericAnimal 변수를 Cat 타입으로 다운캐스팅. 
        Cat specificCat = (Cat) genericAnimal;
        specificCat.purr(); // "고양이는 새끼 소리를 낸다." 출력 // 자식 메서드 사용 가능
		
		// 위의 예제에서는 Animal 타입의 참조변수 genericAnimal이 실제로 Cat 객체를 참조하고 있습니다. 
        // 따라서 (Cat) genericAnimal 코드는 genericAnimal 참조변수를 
        // Cat 타입으로 강제 변환하는 다운캐스팅을 수행하게 됩니다.

        //이 경우에는 genericAnimal이 Cat의 인스턴스를 가리키므로 
        // ClassCastException이 발생하지 않습니다. 
        // 하지만 이런 코드는 genericAnimal이 Cat의 인스턴스를 가리키고 있음을 확실하게 알고 있을 때만 
        // 사용해야 합니다. 그렇지 않다면 런타임 에러인 ClassCastException이 발생할 수 있습니다.
		
	}

}
