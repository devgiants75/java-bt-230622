package Chapter08.Z_Syn_Practice;
// 객체 지향 프로그래밍, 클래스와 객체, 상속, 다형성 등의 개념을 복습

// 학생 성적 관리 시스템 //

// 학생 클래스(Student) 생성
class Student {
// 클래스 필드: 학생의 이름(name), 학번(id), 성적(grade)
	private String name;
	private String id;
	private int grade;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		this.grade = 0;
	}
	// 클래스 메소드 
	// 1.성적을 추가하거나 변경 메소드(setGrade).
	// 2. 성적을 받아오는 메소드(getGrade).
	// 3.이 클래스의 toString 메소드를 오버라이드하여
	// , 학생의 정보를 문자열로 리턴하는 메소드 작성
	// "학생 이름: " + this.name + ", 학번: " + this.id + ", 성적: " + this.grade;
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	@Override
	public String toString() {
		return "학생 이름: " + this.name + ", 학번: " + this.id + ", 성적: " + this.grade;
	}
}
public class A_Practice01 {
	public static void main(String[] args) {
		// 메인 메소드 
		// 1. 학생 객체 생성  
		Student student1 = new Student("이승아", "20230718");
		// 2. 성적 설정
		student1.setGrade(4);
		// 3. 학생의 정보 출력
		System.out.println(student1.toString());
		// 학생 이름: 이승아, 학번: 20230718, 성적: 4.0	
	}
}
