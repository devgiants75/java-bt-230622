package Chapter05.B_Method;
//Book이라는 이름의 클래스를 생성
//
//클래스에 title(책의 제목), author(책의 저자), numberOfPages(책의 페이지 수)라는 이름의 인스턴스 변수 생성
//
//클래스는 title, author, numberOfPages 매개변수를 받는 생성자를 가지고 있어야 한다. 
//생성자는 이 매개변수들을 인스턴스 변수에 할당
//
//(생성자명은 클래스명과 동일
//, 매개변수로 인스턴스 변수를 받아옴
//this.title = title;)
//
//isSameAuthor라는 이름의 정적 메서드를 정의
//이 메서드는 두 개의 Book 인스턴스를 매개변수로 받고
//, 이 두 인스턴스가 같은 저자에 의해 쓰여졌는지 여부를 반환
//같은 저자에 의해 쓰여진 경우 true를, 그렇지 않은 경우 false를 반환
//
//// main
//마지막으로, 주 실행 메서드에서는 세 개의 Book 인스턴스를 생성
//, isSameAuthor 메서드를 사용하여 첫 번째 책과 두 번째 책이 같은 저자에 의해 쓰여졌는지
//, 첫 번째 책과 세 번째 책이 같은 저자에 의해 쓰여졌는지를 확인
//결과는 콘솔에 출력
class Book2 {
	String title;
	String author;
	int numberOfPages;
	
	Book2(String title, String author, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	public static boolean isSameAuthor(Book2 b1, Book2 b2) {
		// 변수들의 값이 동일한지의 여부를 확인하는 속성 .equals()
		return b1.author.equals(b2.author);	
	}
}

public class Method_Practice {

	public static void main(String[] args) {
		// 책 인스턴스 생성
		Book2 book1 = new Book2("Book1", "Author1", 300);
		Book2 book2 = new Book2("Book2", "Author1", 250);
		Book2 book3 = new Book2("Book3", "Author2", 100);

		// 같은 저자인지 검사
		System.out.println("book1과 book2는 같은 저자인가요?" + Book2.isSameAuthor(book1, book2));
		System.out.println("book1과 book3는 같은 저자인가요?" + Book2.isSameAuthor(book1, book3));
	}

}
