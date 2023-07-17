package Chapter06.B_Interface;

// 인터페이스 예제
// 추상 클래스 예제에 추가로 작성

// 특정 악기가 전자적인 기능을 가지고 있는지 여부를 판단하는 'Electronic' 인터페이스
// 인터페이스 내에 전자 전원을 끄고 켜는 메소드 선언 (turnOn, turnOff)

// 인터페이스를 'Synthesizer' 클래스에 적용
// 해당 클래스에는 추상클래스를 상속 받아 구현한 play메소드와
// Electronic 인터페이스 구현을 하는 turnOn, turnOff 메소드 작성

interface Electronic {
    void turnOn();
    void turnOff();
}

abstract class MusicalInstrument {
    public abstract void play();
}

class Synthesizer extends MusicalInstrument implements Electronic {
    @Override
    public void play() {
        System.out.println("신시사이저를 연주합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("신시사이저를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("신시사이저를 끕니다.");
    }
}

public class Z_Practice02 {
    public static void main(String[] args) {
        Synthesizer synth = new Synthesizer();
        synth.turnOn();   // 출력: 신시사이저를 켭니다.
        synth.play();     // 출력: 신시사이저를 연주합니다.
        synth.turnOff();  // 출력: 신시사이저를 끕니다.
    }
}
