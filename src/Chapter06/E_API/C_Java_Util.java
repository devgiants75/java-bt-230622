package Chapter06.E_API;

import java.util.*;

//java.util: 유용한 유틸리티 클래스와 인터페이스를 포함
//: 데이터 구조, 시간과 날짜, 무작위 생성 등

// 자바 유틸의 주요 클래스
// 1. Collection Framework: List, Set, Queue, Map 인터페이스와 
//    이들의 구현 클래스(ArrayList, LinkedList 등)를 포함
// 2. Date, Calender 클래스
// 3. Random 클래스
public class C_Java_Util {

	public static void main(String[] args) {
		
		// ArrayList 사용 예제: 동적크기
		// VS 배열: 정적크기
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");
		System.out.println(stringList.get(0));
		
		// Date, Calender 사용 예제
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.get(Calendar.YEAR));
		
		// Random 사용 예제
		Random random = new Random();
		int randomNumber = random.nextInt(10); // 0 ~ 9 사이의 무작위 수
		// 1 ~ 10 사이의 무작위 수
		int randomNumber2 = random.nextInt(10) + 1; // 1 ~ 10사이의 무작위 수
		System.out.println(randomNumber);
		System.out.println(randomNumber2);
	}

}
