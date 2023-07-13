package Chapter06.E_API;

import java.text.SimpleDateFormat;
import java.util.Date;

// 1. String 문자열의 길이를 확인하고 출력: length()
// "안녕하세요. 코리아 it 아카데미 입니다."

// 2. 현재 시간을 출력하세요
// Date 생성 후 .getTime() 메소드 사용

// 3. Math.abs를 사용하여 음수값의 절대값을 출력
// -123의 절대값 출력

public class Z_Practice {
	public static void main(String[] args) {
		String str = "안녕하세요. 코리아 it 아카데미 입니다.";
		System.out.println(str.length());
		
		Date date = new Date(); // 현재 시간을 밀리초로 변환하여 반환
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		// 밀리초의 시간을 지정한 형태로 변환하여 저장
		String strDate = formatter.format(date);
		
		System.out.println("현재시간 : " + strDate);
		
		System.out.println(Math.abs(-123));
	}
}
