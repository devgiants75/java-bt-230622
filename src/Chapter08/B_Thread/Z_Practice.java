package Chapter08.B_Thread;

class PracticeThread extends Thread {
	@Override
	public void run() {
		for(int index = 0; index < 5; index++) {
			System.out.println("Hello, Thread!");
		}
	}
}

class PracticeRunnable implements Runnable {
	@Override
	public void run() {
		for(int index = 0; index < 5; index++) {
			System.out.println("Hello, Runnable!");
		}
	}
}

public class Z_Practice {
	public static void main(String[] args) {
//		Q1. 다음 중 자바에서 스레드를 생성하는 방법으로 올바른 것은 무엇인가요?
//		(답: 3, 4번)
//				1. Runnable 클래스 상속
//				2. Thread 인터페이스 구현
//				//3. Runnable 인터페이스 구현
//				//4. Thread 클래스 상속
		
//		Q2. 다음 코드를 작성하여 스레드를 생성하고 실행하시오.
//		스레드를 생성하고, "Hello, Thread!"를 5번 출력하는 코드를 작성하시오.
//		(Thread 클래스 상속, Runnable 인터페이스 구현)
		PracticeThread pt = new PracticeThread();
		pt.start();
		
		Thread pr = new Thread(new PracticeRunnable());
		pr.start();

// 		Q3. Q1. 스레드의 주요 메소드 중
//				, '스레드를 일시적으로 대기상태'로 만드는 메소드는 무엇인가요?
//			1. start(): 스레드 실행
//			2. run(): 스레드 생성
//			// 3. wait() : 스레드를 일시적으로 대기 상태로 만드는 메소드
			// - notify(), notifyAll() 메서드의에 의해 다시 실행될 때 까지 대기
			
			// 4. join() : 현재 실행 중인 스레드가 다른 스레드의 실행이 완료될 때 까지 대기
		
	}
}
