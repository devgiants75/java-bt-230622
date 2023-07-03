package Chapter05.A_Class;

import java.util.Scanner;

// Grade 클래스
// 수학, 과학, 영어의 점수가 담긴 변수
// 생성자(해당 점수를 매개변수로 가져옴) {
//	}
// 3과목의 평균을 구하는 메소드 : average

class Grade {
	int math;
	int science;
	int english;
	
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
			
	int average() {
		return (math + science + english) / 3;
	}
}
public class H_Class_Practice02 {
	public static void main(String[] args) {
		
		// 스캐너를 통해 3과목 각각의 점수를 입력받아 옴.
		// 수학, 과학, 영어 점수 변수 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 점수를 입력해주세요.");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		// Grade 클래스를 가지고 인스턴스를 생성
		Grade myScore = new Grade(math, science, english);
		// 출력: 
		System.out.println("평균은 "+ myScore.average());
	}

}

//노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
//
//- 노래의 제목을 나타내는 title
//- 가수를 나타내는 artist
//- 노래가 발표된 연도를 나타내는 year
//- 국적을 나타내는 country
//
//또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
//- 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
//- 노래 정보를 출력하는 show() 메소드

// Song 클래스로 인스턴스를 생성하고 값을 입력
// 최종 출력 결과: 2023년 뉴진스가 부른 HypeBoy
