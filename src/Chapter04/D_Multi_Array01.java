package Chapter04;
// 다차원 배열
// : 배열의 배열, 배열의 요소로 1차원 배열을 가지는 배열
// : 예) 행과 열이 있는 표(grid)

public class D_Multi_Array01 {

	public static void main(String[] args) {
		// 다차원 배열
		
		// 선언 방법: 데이터타입[][] 배열명; 
		// int형 2차원 배열 선언
		int[][] array;
		
		// 생성 방법
		// : 배열명 = new 데이터타입[첫번째 배열 길이(행의 길이)][두번째 배열 길이(열의 길이)];
		
		// 첫 번째 행의 인덱스는 0, 두 번째 행의 인덱스는 1, ...
		// 열도 동일
		array = new int[3][3];
		
		// 선언과 동시에 초기화
		// 1. 데이터타입[][] 배열명 = new 데이터타입[][] {{요소1, 요소2, ...}, {요소1, 요소2, ...}, {...}};
		// 2. 데이터타입[][] 배열명 = {{요소1, 요소2, ...}, {요소1, 요소2, ...}, {...}};
		
		// 3행 3열의 int형 2차원 배열을 생성하고 각 요소에 초깃값을 할당
		int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		// 선언&생성된 다차원 배열의 각 요소에 값 할당
		// 3행 3열의 배열을 생성한 후 각 요소에 값 할당
		// 각 행의 첫 번째 열에는 1, 4, 7이라는 값 할당
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[1][0] = 4;
		array[1][1] = 5;
		array[1][2] = 6;
		array[2][0] = 7;
		array[2][1] = 8;
		array[2][2] = 9;
		
		// 배열 초기화의 주의점
		// 배열의 크기는 고정적!
		// 배열을 선언하고 초기화 후 크기 변경 불가!
		
		// 다차원 배열에서, 각 행의 열의 개수가 서로 다른 경우
		int[][] array3 = new int[3][];
		// 배열을 선언할 때 열의 크기는 지정하지 않아도 된다.
		// 행의 크기는 항상! 지정하여야 한다.
		
		array3[0] = new int[2];
		array3[1] = new int[3];
		array3[2] = new int[1];
		// 불규칙한 배열 || 비정방형 배열(jagged array)
		
		// 2차원 배열 요소에 접근(읽기)
		int value = array[0][0]; 
		System.out.println(value);
		
		// 2차원 배열의 값 변경
		// 2차원 배열의 특정 요소의 값을 변경하는 방법 또한
		// 할당 연산자(=)를 사용하여 새 값을 할당
		array[0][0] = 10;
		System.out.println(array[0][0]);
		
		// 2차원 배열을 순회하려면 보통 중첩된 for문을 사용
		// 3행 4열의 배열에 순서대로 값을 할당하고 출력
		
		int[][] array4 = new int[3][4];
		
		// 할당
		int count = 1;
		// 행을 반복
		for(int i = 0; i < 3; i++) {
			// 열을 반복
			for(int j = 0; j < 4; j++) {
				array4[i][j] = count++;
			}
		}
		
		// 출력
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(array4[i][j] + " ");
			}
			System.out.println();
		}
		
		// 1. 다차원 배열의 할당 & 출력
		// 6행 3열의 배열에 순서대로 값을 할당하고 출력
		// 홀수 값만을 각 요소로 할당
		int[][] arrayPractice = new int[6][3];
		
		int count2 = 1;
		for (int i = 0; i < 6; i++) {
			for (int j =0; j < 3; j++) {
				if(count2 % 2 == 1) {
					arrayPractice[i][j] = count2;
					count2++;	
				}
				count2++;
			}
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arrayPractice[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2. 행렬의 덧셈
		// 2개의 2차원 배열(A, B)을 선언, 생성 및 초기화
		// A, B의 경우 3X3 2차원 배열
		
		// 새로운 배열(C)을 선언, 생성
		// 2차원 배열 A, B의 위치가 동일한 요소를 더하여 C에 할당
		
		// 배열 C 출력
		// 4, 2, 3
		// 5, 2, 9
		// 8, 4, 7
		
		int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] C = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
        		C[i][j] = A[i][j] + B[i][j];
        	}
        }
        
        // 결과 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }	
	}
}
