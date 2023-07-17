package Chapter08.A_MVC.controller;

import java.util.ArrayList;
import java.util.List;
import Chapter08.A_MVC.model.Book;

public class BookController {
	private List<Book> books;
	
	public BookController() {
		this.books = new ArrayList<Book>();
	}
	public void addBook(String title, String author, String publisher) {
		Book newBook = new Book(title, author, publisher);
		books.add(newBook);
	}

	public List<Book> getAllBooks() {
		return books; // 전체 책 목록을 반환
	}
	
	public List<Book> searchBook(String title) {
		// 검색 결과를 저장할 새로운 ArrayList를 생성
		List<Book> result = new ArrayList<Book>();
		// books 리스트의 각 Book 객체에 대해 반복
		for(Book book : books) {
			if(book.getTitle().contains(title)) {
				result.add(book);
			}
		}
		return result;
	}
	
	
	
	
}
