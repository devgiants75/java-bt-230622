package Chapter08.B_Thread;

class Counter {
	private int count = 0;
	
	public int getCount() {
		return count;
	}
	
	// 여러 스레드가 동시에 이 메서드를 호출하는 경우 동기화
	// 한 번에 하나의 스레드만 increment()메서드를 실행할 수 있도록 보장
	public synchronized void increment() {
		count++;
	}
}

class CountingThread extends Thread {
	private Counter counter;
	public CountingThread(Counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		for(int index = 0; index < 100; index++) {
			counter.increment();
		}
	}
}

public class F_Thread06 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		CountingThread t1 = new CountingThread(counter);
		CountingThread t2 = new CountingThread(counter);
		
		t1.start();
		t2.start();
		
		// join(): 메인 메서드를 대기시키는 메서드
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(counter.getCount());
		
	}
}
