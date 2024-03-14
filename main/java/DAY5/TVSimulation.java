package DAY5;

public class TVSimulation {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!
    }
}
abstract class 표준Tv { // 추상클래스
    abstract void 켜기(); // 추상메서드
    abstract void 끄기();
}

class 샤오미Tv extends 표준Tv { // 표준TV에서 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행할 수 없음
    void 켜기() {
        System.out.println("샤오미Tv 켜집니다.");
    }
    void 끄기() {
        System.out.println("샤오미Tv 꺼집니다.");
    }
    void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}
class 삼성Tv extends 표준Tv { // 표준TV에서 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행할 수 없음
    void 켜기() {
        System.out.println("삼성Tv 켜집니다.");
    }
    void 끄기() {
        System.out.println("삼성Tv 꺼집니다.");
    }
    void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv extends 표준Tv { // 표준TV에서 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행할 수 없음
    void 켜기() {
        System.out.println("LGTv 켜집니다.");
    }
    void 끄기() {
        System.out.println("LGTv 꺼집니다.");
    }
    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}