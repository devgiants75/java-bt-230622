package Chapter08.B_Thread;

// 프로세스 VS 스레드

// 프로세스(Process)
// : 프로그램을 실행하는 순간 메모리에 올라가고 동작하게 되는 상태의 프로그램
// : 운영 체제 실행 중인 프로그램의 인스턴스

// 스레드(Thread)
// : 프로세스 내에서 실행되는 흐름의 단위
// : 각 스레드는 독립적인 호출 스택을 가짐(병렬 작업을 수행 - 효율성, 성능 개선)

// 하나의 프로세스에는 적어도 한 개의 스레드를 가짐.

public class A_Thread01 {
	public static void main(String[] args) {
		// 자바의 스레드 생성 및 관리
		// 스레드 생성
		// 1. Thread 클래스를 상속 받아서 새로운 클래스를 만드는 방법
		// : run()메소드를 오버라이드하여 생성
		
		// 2. Runnable 인터페이스를 구현하는 클래스를 만드는 방법
		// : 위의 클래스를 Thread 객체의 생성자에 전달
		
		// 스레드의 상태
		// : New(새로 만들어짐), Runnable(실행 가능)
		// Running(실행 중), Blocked(차단), Terminated(종료) 
		
		// 스레드의 메소드
		// start(): 실행가능 상태가 됨.
		// sleep(), wait(): 스레드가 차단 상태가 됨.
		
		// 1. 병렬처리의 필요성
		// 스레드는 프로그램이 동시에 여러 작업을 수행하도록 해주는 프로그래밍 구조입니다.
		// 여러 스레드를 활용하면, CPU를 효율적으로 사용하여 프로그램의 성능을 향상시킬 수 있습니다.
		// 특히 입출력 또는 네트워크 작업과 같이 대기 시간이 긴 작업을 수행할 때, 스레드를 사용하면 프로그램의 반응성을 향상시킬 수 있습니다.
		
		// 2. 자바에서의 스레드 활용 예시
		// GUI(Graphical User Interface) 프로그램에서, 한 스레드가 사용자 입력을 처리하고 다른 스레드가 그래픽을 렌더링하는 경우
		// 웹 서버에서, 각각의 클라이언트 요청을 처리하는 데 독립적인 스레드를 사용하는 경우
		// 복잡한 계산 작업을 여러 스레드로 분할하여 병렬로 처리하는 경우
		
		// 3. 스레드 사용 시 주의할 점
//		스레드는 자원을 공유하므로, 동시에 여러 스레드가 같은 데이터에 접근할 때 데이터 일관성 문제가 발생할 수 있습니다.
//		이를 해결하기 위해 스레드 동기화 기법이 사용되지만, 동기화를 잘못 사용하면 데드락(Deadlock) 등의 문제가 발생할 수 있습니다.
//		또한 스레드를 과도하게 많이 사용하면, 스레드 생성 및 관리에 대한 오버헤드가 성능을 저하시킬 수 있습니다.
//		따라서 스레드를 적절히 사용하고, 필요한 경우 스레드 풀과 같은 기법을 활용하여 스레드 관리 비용을 줄여야 합니다.
	}

}
