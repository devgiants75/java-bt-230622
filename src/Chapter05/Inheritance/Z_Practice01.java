package Chapter05.Inheritance;

//'Person' 클래스를 만들고, 이 클래스는 'name'과 'age'라는 private 필드를 가집니다. 
// 생성자를 사용하여 이 두 필드를 초기화하고, 
// 'introduce'라는 메소드를 통해 사람의 이름과 나이를 출력하세요.
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("사람의 이름 : " + name + " 사람의 나이 : " + age);
	}
}

// 'Student' 클래스를 만들어 'Person' 클래스를 상속받게 합니다. 
// 'Student' 클래스는 추가로 'school'이라는 private 필드를 가지며
// , 생성자를 통해 초기화합니다. 

//'Student' 클래스에서도 'introduce' 메소드를 오버라이드하여 
//학생의 이름, 나이, 학교를 출력하세요.

class Student extends Person {
	private String school;
	
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	@Override
	void introduce() {
		super.introduce();
		System.out.println("학생의 학교 : " + school);
	}
	
}
//테스트를 위해 'Student' 클래스의 객체를 하나 생성하고
// , 'introduce' 메소드를 호출하세요.
public class Z_Practice01 {
	 public static void main(String[] args) {
		Student student = new Student("Seungah", 20, "KoreaIt");
		student.introduce();
	}
}
