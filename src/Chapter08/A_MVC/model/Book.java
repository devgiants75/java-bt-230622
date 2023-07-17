package Chapter08.A_MVC.model;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book(String title, String author, String pulisher) {
		this.title = title;
		this.author = author;
		this.publisher = pulisher;
	}
	
	// getter 메서드
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getPublisher() {
		return this.publisher;
	}
	
	@Override
	public String toString() {
		return "Title : " + title + ", Author : " + author +  ", Publisher : " + publisher;
	}
}
