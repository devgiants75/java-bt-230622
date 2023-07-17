package Chapter08.A_MVC.view;

import java.util.List;
import java.util.Scanner;

import Chapter08.A_MVC.controller.BookController;
import Chapter08.A_MVC.model.Book;

public class BookView {
	private Scanner scanner;
	// BookController 객체를 저장하기 위한 변수
	private BookController bookController;
	
	public BookView() {
		scanner = new Scanner(System.in);
		bookController = new BookController();
	}
	
	public void showMenu() {
		System.out.println("1. Add a book");
		System.out.println("2. Show all books");
		System.out.println("3. Search for a book");
		System.out.println("4. Quit");
		System.out.print("메뉴를 선택해주세요 : ");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		switch(choice) {
			case 1:
				addBookView();
				break;
			case 2:
				showAllBooks();
				break;
			case 3:
				searchBookView();
				break;
			default:
				System.out.println("종료하겠습니다.");
				break;
		}
	}

	private void addBookView() {
		System.out.print("책의 제목을 입력해주세요.");
		String title = scanner.nextLine();
		
		System.out.print("책의 저자를 입력해주세요.");
		String author = scanner.nextLine();
		
		System.out.print("책의 출판사를 입력해주세요.");
		String publisher = scanner.nextLine();
		
		bookController.addBook(title, author, publisher);
	}

	private void showAllBooks() {
		List<Book> allBooks = bookController.getAllBooks();
		for(Book book : allBooks) {
			System.out.println(book.toString());
		}
		
	}

	private void searchBookView() {
		System.out.println("책을 검색해주세요.");
		String title = scanner.nextLine();
		List<Book> foundBooks = bookController.searchBook(title);
		for(Book book : foundBooks) {
			System.out.println(book.toString());
		}
		
	}

}
