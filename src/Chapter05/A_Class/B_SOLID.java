package Chapter05.A_Class;

// SOLID 원칙: 객체지향 프로그래밍 설계 원칙
// 소프트웨어의 유지보수성, 확장성, 재사용성을 향상

// Single Responsibility Principle(SRP)
// Open/Close Principle(OCP)
// Liskov Substitution Principle(LSP)
// Interface SegregationPrinciple(ISP)
// Dependency Inversion Principle(DIP)

public class B_SOLID {

	public static void main(String[] args) {
		// Single Responsibility Principle(SRP)
		// 단일 책임 원칙: 하나의 클래스는 단 하나의 책임을 가져야 한다!
		class UserManager {
			void addUser() {
				// 사용자 추가 로직
			}
			void removeUser() {
				// 사용자 삭제 로직
			}
			void updateUser() {
				// 사용자 업데이트 로직
			}
		}
		
		// Open/Close Principle(OCP)
		// 개방/폐쇄 원칙
		// 확장에는 열려있고, 변경에는 닫혀있어야 한다.
		// 기존의 코드를 수정하지 않고 확장을 통해 기능을 추가할 수 있도록 설계

		// Liskov Substitution Principle(LSP)
		// 리스코프 치환 원칙
		// 자식 클래스는 언제나 부모 클래스의 자리에 대체될 수 있어야 한다.
		// 부모 클래스의 기능을 자식 클래스에서 무시하거나 변경하지 않아야 한다.
		
		// Interface SegregationPrinciple(ISP)
		// 인터페이스 분리 원칙
		// 클라이언트는 자신이 사용하지 않는 인터페이스에 의존하지 않아야 한다.
		
		// Dependency Inversion Principle(DIP)
		// 의존성 역전 원칙
		// 의존 관계를 맺을 때, 구체적인 클래스보다 추상화된 인터페이스나 추상 클래스에 의해 의존해야 한다.
		
	}

}
