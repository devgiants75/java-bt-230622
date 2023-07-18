package Chapter08.B_Thread;
 
// 스레드의 시작, 종료 및 우선순위 설정

class TimeThread extends Thread {
	@Override
	public void run() {
		for(int index = 0; index < 100; index++) {
			System.out.println("스레드 출력" + (index + 1));
		}
	}
}

public class D_Thread4 {
	public static void main(String[] args) {
		TimeThread th = new TimeThread();
		
		// 스레드 우선 순위 결정
		// setPriority(int newPriority)메소드 사용
		
		// 우선순위를 최대로 설정
		th.setPriority(TimeThread.MAX_PRIORITY);
		
		// 스레드 시작
		th.start();
		
		// 스레드 종료
		// - 메소드 실행 종료 | 예외, 에러 발생
		
		// 스레드 우선순위 조절(순위 확인 방법)
		System.out.println("스레드 순위 : " + th.getPriority());
		
		
	}
}
