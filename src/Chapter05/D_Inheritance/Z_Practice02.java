package Chapter05.D_Inheritance;

// 'Book' 클래스를 만들고
// 이 클래스는 'title', 'author' 그리고 'price'라는 private 필드를 가집니다. 
// 생성자를 사용하여 이 세 필드를 초기화하고, 각 필드에 대한 getter 메소드를 작성하세요.

// 이제 'Ebook' 클래스를 만들어 'Book' 클래스를 상속받게 합니다. 
// 'Ebook' 클래스는 추가로 'fileSize'라는 private 필드를 가지며
// , 생성자를 통해 초기화합니다. 
// 'fileSize'에 대한 getter 메소드를 작성하세요.

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class Ebook extends Book {
    private double fileSize;

    public Ebook(String title, String author, double price, double fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
}

// 테스트를 위해 'Ebook' 클래스의 객체를 하나 생성하고, 모든 필드의 값을 출력하세요.
public class Z_Practice02 {
	public static void main(String[] args) {
		Ebook ebook = new Ebook("Java Programming", "Author Name", 19.99, 1.5);
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Author: " + ebook.getAuthor());
        System.out.println("Price: " + ebook.getPrice());
        System.out.println("File Size: " + ebook.getFileSize() + "MB");
	}

}
