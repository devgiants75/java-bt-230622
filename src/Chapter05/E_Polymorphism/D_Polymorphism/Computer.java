package Chapter05.E_Polymorphism.D_Polymorphism;
// 이 코드에서 Computer 클래스는 전원을 켜고 끄는 기본 기능을 가지고 있습니다. 
// Samsong 클래스는 Computer 클래스를 상속받아서 powerOn() 메소드를 오버라이드하여 전원을 켤 때 
// "Welcome to Samsong!"이라는 메시지를 출력하게 만들었습니다.

//그 다음, ComputerRoom 클래스는 Samsong 컴퓨터를 가지고 있으며, 
// 이 컴퓨터의 전원을 켜고 끄는 기능을 제공합니다.

//마지막으로, Main 클래스에서 ComputerRoom 객체를 만들고, 
// 이 객체를 통해 Samsong 컴퓨터의 전원을 켜고 끕니다.

//이 예제는 자바의 상속과 다형성, 그리고 메소드 오버라이딩 개념을 보여줍니다.


// 첫번째 생성
public class Computer {
    public void powerOn() {
        System.out.println("The power is turned on.");
    }

    public void powerOff() {
        System.out.println("The power is turned off.");
    }
}
