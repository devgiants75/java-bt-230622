package Chapter06.A_Abstract;

// 추상클래스 예제
// 'MusicalInstrument' 추상 클래스 생성
// 클래스는 'play'라는 추상 메소드를 포함

// 'MusicalInstrument'를 상속하는 구체 클래스 'Piano'와 'Violin'
// 각 클래스에서 'play' 메소드를 구현

// main 메소드에서 각각 구체 클래스의 play 메소드를 실행

abstract class MusicalInstrument {
    public abstract void play();
}

class Piano extends MusicalInstrument {
    @Override
    public void play() {
        System.out.println("피아노를 연주합니다.");
    }
}

class Violin extends MusicalInstrument {
    @Override
    public void play() {
        System.out.println("바이올린을 연주합니다.");
    }
}

public class Z_Practice02 {
    public static void main(String[] args) {
        MusicalInstrument piano = new Piano();
        MusicalInstrument violin = new Violin();

        piano.play();   // 출력: 피아노를 연주합니다.
        violin.play();  // 출력: 바이올린을 연주합니다.
    }
}
