package Chapter08.B_Thread;

// 스레드 생성
// : java.lang.Thread 클래스를 사용하여 스레드를 생성
// : Thread 클래스 - 새로운 실행 흐름을 생성하고 시작하는 메커니즘을 제공

// 1. Thread 클래스를 상속
class MyThread extends Thread {
	// 스레드를 구현: run()
	@Override
	public void run() {
		// 스레드에서 실행할 작업
		int sum = 0;
		for(int index = 0; index < 10; index++) {
			sum = sum + (index + 1);
		}
		
		setName("Thread 스레드");
		
		System.out.println("Sum : " + sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름은 : " + threadName);
	}
}

// 2. Runnable 인터페이스 이용
class MyRunnable implements Runnable {
	@Override
	public void run() {
		// 스레드에서 실행할 작업
		for(int index = 0; index < 10; index++) {
			System.out.println("반복 작업 스레드");
		}
	}
}

public class B_Thread02 {
	public static void main(String[] args) {
		// 1. 상속받은 클래스의 인스턴스 생성
		MyThread t = new MyThread();
		
		// 스레드 실행: start()
		t.start();
		
		
		// 2. 인터페이스를 구현한 클래스 인스턴스를 생성
		Runnable r = new MyRunnable();
		
		// 위의 인스턴스를 Thread 클래스의 생성자에 전달하여 새로운 스레드 생성
		Thread write = new Thread(r);
		write.setName("Runnable 스레드");
		
//		Thread write = new Thread(new MyRunnable());
		
		// 스레드 실행: start()
		write.start();
		
		// 주의사항!
		// 1. start()메소드는 한 스레드 객체에 대해 한 번만 호출 가능
		// : 같은 스레드를 다시 시작하려면 새로운 인스턴스를 생성
		// 2. run()메소드는 스레드의 본문
		// : 이 메소드가 종료되면 스레드는 자동으로 종료됨.
		
		// Runnable VS Thread 
		// Runnable 인터페이스 사용이 일반적
		// : 자바는 다중 상속 지원 X
	}

}
