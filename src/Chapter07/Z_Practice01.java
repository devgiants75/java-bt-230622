package Chapter07;

import java.util.ArrayList;
import java.util.List;

// 학생 정보를 표현하는 Student 클래스
class Student {
	private String name; // 학생 이름
	private Integer score; // 학생 점수
	
	// Student 클래스의 생성자
	Student(String name, Integer score) {
		this.name = name;
		this.score = score;
	}
	
	// 학생 이름을 반환하는 메소드
	public String getName() {
		return this.name;
	}
	
	// 학생 점수를 반환하는 메소드
	public Integer getScore() {
		return this.score;
	}
}

// 학생 관리를 위한 StudentManager 클래스
class StudentManager {
	private List<Student> students; // Student 객체를 저장할 리스트
	
	 StudentManager() {
		 this.students = new ArrayList<Student>(); // ArrayList로 Student 객체를 관리
	 }
	 
	 // 학생을 추가하는 메소드
	 // 이름, 점수를 받아서 새로운 Student 객체를 생성하고 리스트에 추가
	 public void addStudent(String name, Integer score) {
		 Student student = new Student(name, score);
		 this.students.add(student);
	 }
	 
	 public void printStudents() {
		 for(Student student : this.students) {
			 System.out.println("Name : " + student.getName() +  ", Score :" + student.getScore());
		 }
	 }
	 
	 // 가장 높은 점수를 받은 학생의 이름을 반환하는 메소드
	 // 리스트에 있는 각 Student 객체에 대해 점수를 비교,
	 // 가장 높은 점수를 받은 학생의 이름을 찾아서 출력
	 public String getHighestScore() {
		 String highestScorer = "";
		 Integer highestScore = Integer.MIN_VALUE;
		 
		 for(Student student : this.students) {
			 if(student.getScore() > highestScore) {
				 highestScore = student.getScore();
				 highestScorer = student.getName();
			 }
		 }
		 return highestScorer;
	 }
}

public class Z_Practice01 {
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.addStudent("이승아", 85);
		sm.addStudent("이준국", 100);
		sm.addStudent("이도경", 90);
		
		sm.printStudents();
		System.out.println("성적 우수자 : " + sm.getHighestScore());
	}

}
