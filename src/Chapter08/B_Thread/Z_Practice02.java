package Chapter08.B_Thread;

// 두 개의 스레드를 생성하여, 각각 1부터 10까지, 11부터 20까지의 숫자를 출력하는 코드를 작성

class NumberThread extends Thread {
	private int startNum;
	private int endNum;
	
	public NumberThread(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	@Override
	public void run() {
		for(int i = startNum; i <= endNum; i++) {
			System.out.println(i);
		}
	}
}

public class Z_Practice02 {
	public static void main(String[] args) {
		NumberThread thread1 = new NumberThread(1, 10);
		NumberThread thread2 = new NumberThread(11, 20);
		
		thread1.start();
		thread2.start();
	}

}
