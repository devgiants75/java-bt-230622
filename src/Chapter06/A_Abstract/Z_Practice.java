package Chapter06.A_Abstract;

// 모바일 애플리케이션이라는 추상 클래스를 선언(MobileApp)
// 이 클래스는 '실행'이라는 추상 메소드를 선언(execute)
abstract class MobileApp {
	abstract void execute();
}

// '게임 애플리케이션'과 (GameApp)
// '사회 네트워킹 애플리케이션'이라는 클래스를 생성 (SocialApp)

class GameApp extends MobileApp {
	void execute() {
		System.out.println("Game application is running");
	}
}

class SocialApp extends MobileApp {
	void execute() {
		System.out.println("Social application is running");
	}
}

// 각 클래스에서 '실행' 메소드를 구현

// 메인메소드에서 GameApp, SocialApp 인스턴스 생성
// 각각의 메소드 실행

public class Z_Practice {
	public static void main(String[] args) {
		MobileApp myGameApp = new GameApp();
		MobileApp mySocialApp = new SocialApp();
		
		myGameApp.execute();
		mySocialApp.execute();
		
	}
}
