package Chapter05.E_Polymorphism;

// Person이라는 부모 클래스 생성
// 이 클래스를 상속하는 Student와 Teacher 두 개의 자식 클래스 생성

// 세개의 클래스 모두는 각자의 방식으로 자신을 소개하는 introduce() 메서드

// PersonDemo라는 클래스에서 다형성을 보여주는 코드를 작성
class Person {
    public void introduce() {
        System.out.println("안녕하세요, 저는 사람입니다.");
    }
}

class Student extends Person {
    @Override
    public void introduce() {
        System.out.println("안녕하세요, 저는 학생입니다.");
    }
}

class Teacher extends Person {
    @Override
    public void introduce() {
        System.out.println("안녕하세요, 저는 선생님입니다.");
    }
}

public class Z_Practice2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Student();
        Person person3 = new Teacher();

        person1.introduce();  // 출력: 안녕하세요, 저는 사람입니다.
        person2.introduce();  // 출력: 안녕하세요, 저는 학생입니다.
        person3.introduce();  // 출력: 안녕하세요, 저는 선생님입니다.
    }
}
