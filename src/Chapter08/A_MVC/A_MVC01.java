package Chapter08.A_MVC;

// MVC 패턴
// MVC(Model, View, Controller)는 소프트웨어 디자인 패턴 중 하나
// : 애플리케이션을 3가지 역할로 나누어 개발을 진행

// 1. Model
// : 애플리케이션의 정보, 데이터, 비즈니스 로직을 담당
// 2. View
// : 사용자에게 보여지는 UI부분을 담당(Model의 정보를 표시하고, 사용자의 액션을 Controller 에게 전달)
// 3. Controller
// : 사용자의 입력과 이벤트를 처리하여 Model과 View를 업데이트

// MVC 패턴의 작동 원리
// M > V > C > V > M

// MVC 패턴의 장점
// 1. 분리된 관심사
// 2. 유연성
// 3. 유지보수성

// 자바에서 실제 MVC 패턴 사용 사례
// - Spring MVC
// : 자바 기반의 통합 웹 개발을 위한 Spring Framework

// 1. Model(비즈니스 데이터와 로직을 담당)
// - 데이터베이스(데이터)와 상호작용하는 DAO(Data Access Object)에 의해 사용

// 2. View(사용자에게 정보를 제공하는 데 사용되는 영역)
// : 요즘은 JSP 대신, 따로 프론트엔드 구현을 많이 함.

// 3. Controller(Spring MVC에서 어노테이션을 사용하여 정의)
// : @Controller, @RestController

public class A_MVC01 {
	public static void main(String[] args) {
		// 도서 관리 시스템
		
		// 1. 새 도서 추가
		// 2. 모든 도서 정보 출력
		// 3. 도서 검색(도서 제목으로 검색)
		
		// Model 도서 정보를 담당
		// - Book: 도서 정보(도서 제목, 저자, 출판사)
		
		// View 사용자 인터페이스(UI)를 담당
		// - BookView: 사용자의 입력을 받아 Controller에게 전달하고, Controller에서 받은 정보를 출력
		
		// Controller 사용자 입력을 받아 Model과 View 사이에서 중재
		// - BookCotroller: 사용자의 입력에 따라 적절한 Model 메서드를 호출
		
		
		
		
		
		
		
		
		
		
	}
}
