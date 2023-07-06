package Chapter05.C_Constructor.A_Getter_Setter;

public class A_Getter_Setter {
	
	public static void main(String[] args) {
		
		Person seungah = new Person();
		seungah.name = "이승아";
		seungah.job = "Developer";
//		seungah.age = -99;
//		System.out.println(seungah.age);
		
//		seungah.setAge(-10);
		seungah.setAge(90);
		
		System.out.println(seungah.name + "의 나이는 " + seungah.getAge() + "세 입니다.");
				
	}
}
