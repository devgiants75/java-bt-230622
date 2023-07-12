package Chapter06.C_InnerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

// 이벤트: 사용자의 입력, 시스템 변경 등 프로그램이 반응해야하는 사건

// 이벤트 처리의 기본 개념
// 이벤트 소스: 이벤트를 발생시키는 구성요소
// 이벤트 객체: 이벤트의 세부 정보를 담는 객체(이벤트의 타입, 발생 시간)
// 이벤트 리스너: 특정 이벤트가 발생했을 때 실행되는 메소드를 정의

public class G_Event {
	public static void main(String[] args) {
		
		// 이벤트 소스 생성( JButton 객체를 생성 )
		JButton button = new JButton("Click me");
		
		// 이벤트 리스너 추가
		// 버튼이 클릭되면 ActionEvent 객체가 생성되어 
		// 이벤트 리스너의 actionPerformed 메소드로 전달
		button.addActionListener(new ActionListener() {
			// 익명 클래스를 이용하여 ActionListener 인터페이스를 구현
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 클릭될 때마다 호출
				System.out.println("Button Clicked");
			}
		});
		
		// 버튼을 프레임에 추가하고 표시
		// 모든 이벤트 구성요소의 최상위 컨테이너
		JFrame frame = new JFrame();
		// 버튼을 프레임의 콘텐트 팬(프레임에 들어가는 구성요소들을 담은 컨테이너)에 추가
		frame.getContentPane().add(button);
		// 프레임의 크기를 지정
		frame.setSize(300, 200);
		// 사용자가 프레임의 닫기 버튼을 클릭하면 프로그램이 종료되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임을 화면에 표시하도록 설정
		// 실제로 사용자에게 보이도록하는 마지막 단계
		frame.setVisible(true);
		
	}
}
