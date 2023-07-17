package Chapter07;

import java.util.HashMap;
import java.util.Map;

// 1. 고객의 ID와 이름을 저장하는 Customer 클래스를 생성
// ID는 Integer 타입
// 이름은 String 타입
// (생성자, getter를 사용해 ID, 이름을 가져옴)

// 고객의 정보를 담은 Customer 클래스
class Customer {
	private Integer id; // 고객 ID
	private String name; // 고객 이름
	
	// Customer 클래스 생성자
	Customer(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// 고객 ID를 반환하는 메소드
	public Integer getId() {
		return this.id;
	}
	
	// 고객 이름을 반환하는 메소드
	public String getName() {
		return this.name;
	}
}

// 2. 고객을 관리하는 CustomerManager 클래스를 생성
// Customer 객체를 저장할 수 있는 Map 인터페이스 구축
// 키(key)는 고객의 ID, 값(value)는 Customer 객체

// 새로운 고객을 추가하는 addCustomer(Integer id, String name) 메서드를 작성

// 고객의 이름을 ID를 통해 찾는 findCustomer(Integer id) 메서드를 작성(if 조건문 사용)
// 찾은 고객의 이름을 반환

// 모든 고객의 정보를 출력하는 printCustomers() 메서드를 작성
// for-each 구문 사용

// 고객 관리를 위한 CustomerManager 클래스
class CustomerManager {
	private Map<Integer, Customer> customers; // Customer 객체를 저장할 Map 인터페이스
	// 키(key): 고객 ID
	// 값(value): Customer
	
	public CustomerManager() {
		// HashMap으로 Customer 객체를 관리
		this.customers = new HashMap<Integer, Customer>();
	}
	
	// 고객을 추가하는 메소드, ID와 이름을 받아서 새로운 Customer 객체를 생성하고 Map에 추가
	public void addCustomer(Integer id, String name) {
		Customer customer = new Customer(id, name);
		this.customers.put(id, customer);
	}
	
	// ID를 통해 고객을 찾고 그 이름을 반환하는 메소드
	// Map에서 ID를 키로 사용해서 Customer 객체를 찾음
	public String findCustomer(Integer id) {
		// 해당 id가 존재하는지 여부 검사
		if(this.customers.containsKey(id)) {
			return this.customers.get(id).getName();
		}
		return null;
	}
	
	// 모든 고객의 정보를 출력하는 메소드
	// Map에 있는 각 Customer 객체에 대해 ID와 이름을 출력
	public void printCustomers() {
		for(Customer customer : this.customers.values()) {
			System.out.println("ID : " + customer.getId() + ", Name : " + customer.getName());
		}
	}	
}

public class Z_Practice02 {
	public static void main(String[] args) {
		CustomerManager cm = new CustomerManager();
		cm.addCustomer(1, "이승아");
		cm.addCustomer(2, "이준국");
		cm.addCustomer(3, "이도경");
		
		cm.printCustomers();
		System.out.println("고객 ID가 2번인 고객 : " + cm.findCustomer(2));
		
	}

}
