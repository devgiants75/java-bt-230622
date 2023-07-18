package Chapter08.B_Thread;

// waith() & notify()
// : 동기화 블록 안에서만 호출 가능

class WaitNotifyExample {
	private final Object lock = new Object();
	private boolean conditionMet = false;
	
	public void doWait() {
		synchronized (lock) {
			while(!conditionMet) {
				try {
					lock.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Condition met, continuing execution");
		}
	}
	
	public void doNotify() {
		synchronized (lock) {
			conditionMet = true;
			lock.notify();
		}
	}
}

public class E_Thread05 {
	public static void main(String[] args) {
		WaitNotifyExample example = new WaitNotifyExample();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				example.doWait();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				example.doNotify();
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
