package Chapter04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

// Arrays 클래스: 배열의 복사, 항목 정렬, 항목 검색 등의 메서드를 제공
// 기능 사용시 마침표(.)를 사용하여 사용할 기능을 호출
public class C_Array03 {
	public static void main(String[] args) {
		// 1. 배열의 출력: toString()
		int[] array1 = {1, 3, 8, 6, 7};
		System.out.println(Arrays.toString(array1));
		// 출력값 [1, 3, 8, 6, 7] : 배열을 하나의 문자열로 출력
		
		// 2. 배열의 정렬: sort()
		// 오름차순 정렬
		Arrays.sort(array1);
		System.out.println("오름차순" + Arrays.toString(array1));
		
		// 내림차순 정렬
		Integer[] array2 = {1, 3, 8, 6, 7};
		Arrays.sort(array2, Comparator.reverseOrder());
		// int자료형 사용X, Integer사용O
		// Integer: int타입의 클래스 데이터
		System.out.println("내림차순" + Arrays.toString(array2));
		
		// 3. 배열의 복사
		// 3-1. 얉은 복사: 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경
		// 				 배열의 주소를 공유O
		int[] array3 = {1, 2, 3};
		
		int[] shallowArray = array3;
		System.out.println("array3 배열 : " + Arrays.toString(array3));
		
		shallowArray[1] = 5;
		System.out.println("array3 배열 : " + Arrays.toString(array3));
		System.out.println("shallowArray 배열 : " + Arrays.toString(shallowArray));
		
		// 3-2. 깊은 복사: 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값은 바뀌지 X
		// 				 배여릐 주소를 공유X
		
		int[] card = {1, 6, 8, 7, 2, 3};
		int[] newCard = new int[card.length];
		
		for(int i = 0; i < card.length; i++) {
			newCard[i] = card[i];
		}
		
		card[1] = 10;
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
		
		// 요소 삭제
		// : 삭제하려는 요소 다음 인덱스 부터 모든 요소를 한 칸씩 앞으로 당기고 배열의 길이를 조정
		int[] nums = {1, 2, 3, 4, 5};
		int index = 2; // 삭제하려는 요소의 인덱스
		
		int[] newNums = new int[nums.length - 1]; // 깊은 복사
		
		for (int i = 0, j = 0; i < nums.length; i++) {
			if (i == index) {
				continue;
			}
			newNums[j++] = nums[i];
		}
		
		// 예제 - Quiz
		// 1. int[] arr = new int[4];
		// 2. int[] arr = {1,2,3,5};
		
		// 예제 - 홀수와 짝수 구분
		int[] numbers = {21, 3, 22, 5, 42, 2, 28, 31};
		
		System.out.println("Even numbers : ");
		// forEach 반복문
		// if 조건문
		for(int number : numbers) {
			if(number % 2 == 0)
				System.out.println(number);
		}
		
		System.out.println("Odd numbers : ");
		// forEach 반복문
		// if 조건문
		for(int number : numbers) {
			if(number % 2 == 1)
				System.out.println(number);
		}
		
		// 예제 - 데이터 검색
		
		int[] numbersA = {10, 20, 30, 40, 50};
		
		Scanner sc = new Scanner(System.in);
		// 받아올 데이터를 저장할 변수 선언
		System.out.println("숫자를 입력해주세요 : ");
		int target = sc.nextInt();
		// boolean 데이터 타입에 false 지정
		boolean found = false;
		
		// for문 사용(배열의 길이만큼 반복)
		// for문 안에 if 조건문을 사용
		// 일치하는 값이 있을 경우에 boolean 데이터 타입에 false > true 변경
		for (int index2 = 0; index2 < numbersA.length; index2++) {
			if (numbersA[index2] == target) {
				found = true;
				break;
			}
		}
		
		// if else 조건문 사용
		// 사용자로부터 숫자를 받아서 해당 숫자가 배열에 포함되어 있을 경우
		// 출력: 데이터를 찾았습니다.
		// 해당하는 숫자가 배열에 없을 경우
		// 출력: 데이터를 찾지 못했습니다.
		if (found) {
			System.out.println("데이터를 찾았습니다 : " + target);
		} else {
			System.out.println("데이터를 찾지 못했습니다.");
		}
		
		
		
		
		
		
	}
}
