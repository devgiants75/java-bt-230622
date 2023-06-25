package Chapter02;

public class Practice {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 
		 * score이라는 변수명을 가진 숫자 데이터 타입의 변수를 
		 * 선언하고 초깃값으로 65를 할당해주세요
		 * result라는 변수명을 가진 
		 * 문자열(String) 데이터 타입의 변수를 선언해주세요
		 * 
		 * score이 0보다 작거나 100보다 크면 (계산불가)
		 * 89보다 크면 (A학점)
		 * 79보다 크면 (B학점)
		 * 69보다 크면 (C학점)
		 * 59보다 크면 (D학점)
		 * 나머지 (F학점)
		 * 
		 * */
		
		int score = 65;
		String result;
		
		result = score < 0 || score > 100 ? "계산불가"
				: score > 89 ? "A학점"
				: score > 79 ? "B학점"
				: score > 69 ? "C학점"
				: score > 59 ? "D학점" : "F학점";
		 System.out.println("결과 :" + result);
		

		

	}

}
