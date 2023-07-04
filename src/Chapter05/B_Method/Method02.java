package Chapter05.B_Method;

// 삼각형의 속성과 계산 결과를 저장하는 클래스
class Triangle {
	// 멤버 변수로는 underside, height, diagonal(대각선), area(넓이), circumference(둘레)
	double underside;
	double height;
	double diagonal;
	
	double area;
	double circumference;
}

// 삼각형과 관련된 계산을 수행하는 정적 메서드들을 포함하는 유틸리티 클래스
class TriangleMath {
	
	// 파라미터로 참조변수(클래스)를 받는다면 메모리 주소가 복사되어 넘어옴
	// 실제 작업이 해당 메모리 주소에서 진행
	// 실제 데이터가 변경
	
	// 삼각형의 넓이를 계산하여 Triangle 객체의 area 멤버 변수에 저장하는 메서드
	static void setArea(Triangle triangle) {
		double areaValue = triangle.underside * triangle.height * 0.5;
		triangle.area = areaValue;
	}
	
	// 삼각형의 밑변과 높이를 이용하여 대각선 길이를 계산
	// Triangle 객체의 diagonal 멤버 변수에 저장
	static void setDiagonal(Triangle triangle) {
		double squareDiagonal = Math.pow(triangle.underside, 2) 
				+ Math.pow(triangle.height, 2);
		double diagonal = Math.sqrt(squareDiagonal);
		triangle.diagonal = diagonal;
	}
	
	// static정적 메서드로 구현: setCircumference
	// 삼각형의 둘레 = 높이 + 밑변 + 대각선
	
	static void setCircumference(Triangle triangle) {
		triangle.circumference = triangle.height + triangle.underside + triangle.diagonal;
	}
	
	// 주어진 밑변과 높이를 이용하여  Triangle 객체를 생성하는 메서드
	// , setDiagonal, setArea, setCircumference 메서드를 호출하여 객체의 속성을 설정
	// 생성된 Triangle 객체를 반환
	
	static Triangle createTriangle(double underside, double height) {
		Triangle triangle = new Triangle();
		
		triangle.underside = underside;
		triangle.height = height;
		
		setDiagonal(triangle);
		setArea(triangle);
		setCircumference(triangle);
		
		return triangle;
	}
	
}

public class Method02 {

	public static void main(String[] args) {
		// Triangle 객체를 생성, 멤버 변수인 underside, height, diagonal값을 설정
		Triangle triangle1 = new Triangle();
		triangle1.underside = 3;
		triangle1.height = 4;
		triangle1.diagonal = 5;
		
		// TriangleMath 클래스의 setArea 메서드를 호출해서 삼각형의 넓이를 계산하고 출력
		TriangleMath.setArea(triangle1);
		System.out.println(triangle1.area);
		
		// TriangleMath 클래스의 createTriangle 메서드를 호출
		// 밑변과 높이를 이용하여 Triangle객체를 생성하고, 생성된 객체의 넓이를 출력
		Triangle triangle2 = TriangleMath.createTriangle(5, 5);
		System.out.println(triangle2.area);

	}

}
