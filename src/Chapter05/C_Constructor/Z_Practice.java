package Chapter05.C_Constructor;
// 음식(Food) 클래스 작성 
// 음식의 이름(name), 가격(price), 그리고 재고(stock)를 저장
// private 접근 지정자를 설정

class Food {
	private String name;
	private int price;
	private int stock;
	
	// 기본 생성자
	Food() { }
	
	// 이름, 가격, 재고를 매개변수로 받아 초기화하는 생성자를 구현
	Food(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	// 정보를 설정하고 반환하는 getter와 setter 메서드를 구현
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		if (price < 0) {
			System.out.println("가격을 잘못입력하였습니다. 다시 입력해주세요.");
			return;
		} else {
			this.price = price;
		}
	}
	
	int getStock() {
		return stock;
	}
	void setStock(int stock) {
		if (stock < 0) {
			System.out.println("재고를 잘못입력하였습니다. 다시 입력해주세요.");
			return;
		} else {
			this.stock = stock;
		}
	}
	// 음식의 이름과 가격을 출력하는 printInfo 메서드도 작성
	// 메서드는 "음식: [음식이름], 가격: [음식가격]" 형식으로 정보를 출력
	void printInfo() {
		System.out.println("음식: " + name + ", 가격: " + price);
	}
}

public class Z_Practice {
	public static void main(String[] args) {
		// 음식 객체를 생성하고, 생성된 객체의 정보를 출력한 후에, 
		Food food = new Food("피자", 21000, 2);
		food.printInfo();
		
		// 재고를 10으로 설정해 주세요. 
		food.setStock(10);
		System.out.println("재고: " + food.getStock());
		// 이후에 재고를 5만큼 감소시킨 후, 다시 재고를 출력하는 코드를 작성
		food.setStock(food.getStock() - 5);
		System.out.println("재고: " + food.getStock());
		
//		음식: 피자, 가격: 10000
//		재고: 10
//		재고: 5

	}

}
