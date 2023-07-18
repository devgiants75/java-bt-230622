package Chapter08.B_Thread;

// 스레드의 생명주기
// New(새로운): 스레드가 생성되었지만 아직 시작되지 않은 상태
// - start()메소드가 호출되지 않은 상태

// Runnable(실행 가능): 스레드가 실행 중 | 실행할 준비가 되어 있고 시스템에 의해 선택될 수 있는 상태
// - 스레드 스케줄러에 의해 선택되면 CPU를 사용하여 실행됨.

// Waiting/Blocked: 스레드가 실행 중지 상태, 특정 조건이 만족될 때까지 실행을 계속할 수 없는 상태
// - notify(), notifyAll(), join(), interrupt()

// Terminated(종료): 스레드의 run()메소드가 완료되거나 예외로 인해 종료된 상태

class Bank {
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	// addMoney() 메서드를 동기화
	public void addMoney(int money) {
	// 메서드 동기화
//	public synchronized void addMoney(int money) {
		this.money += money;
	}
}

class AddThread implements Runnable {
	private Bank b;
	private String name;
	
	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		// 블록 동기화: 특정 실행 대상을 동기화
		synchronized (b) {
			for(int index = 0; index < 10; index++) {
				// sleep()메소드: 현재 스레드를 지정된 시간 동안 대기 상태로 전환
				// 				지정된 시간이 경과하면 스레드는 다시 실행 가능 상태로 전환
				//				단위 - 밀리세컨즈
				try {
					Thread.sleep(1000);
					b.addMoney(1000);
					System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class C_Thread03 {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread th1 = new Thread(new AddThread("이승아", b));
		Thread th2 = new Thread(new AddThread("이준국", b));
		
		th1.start();
		th2.start();

		// 스레드의 동기화
		// : synchronized 키워드를 사용하여 동기화 처리
	}

}
