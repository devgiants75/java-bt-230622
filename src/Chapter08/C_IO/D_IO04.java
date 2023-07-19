package Chapter08.C_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class D_IO04 {
	public static void main(String[] args) {
		
		// 1. DataStream
		// : 기본 데이터 타입을 바이트 단위로 읽고 쓸 수 있는 클래스
		// : byte, short, int, long, float, double, boolean, char 등
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))){
			dos.writeInt(123);
			dos.writeDouble(123.45);
			dos.writeBoolean(true);
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
			int i = dis.readInt();
			double d = dis.readDouble();
			boolean b = dis.readBoolean();
			
			System.out.println("Read values : " + i + ", " + d + ", " + b);
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
		// 2. Object Stream
		// : 객체 직렬화를 위한 스트림 클래스
		// : 객체를 바이트 단위로 변환, 스트림을 통해 전송 | 파일에 저장
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.bin"))) {
			Person person = new Person("Jun Gook", 28);
			oos.writeObject(person);
		} catch(IOException exception) {
			exception.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.bin"))) {
			Person person = (Person) ois.readObject();
			System.out.println("Read object : " + person.name + "은 " + person.age + "살 입니다.");
			
		} catch(IOException | ClassNotFoundException exception) {
			exception.printStackTrace();
		}
		
	}
}
