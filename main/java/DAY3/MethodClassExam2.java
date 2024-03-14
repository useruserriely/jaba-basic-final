package DAY3;

public class MethodClassExam2 {
    // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.
    public static void main(String[] args) {
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.
        자동차 자동차1 = new 자동차();
        자동차1.최고속력 = 200;
        자동차1.run();

        자동차 자동차2 = new 자동차();
        자동차2.최고속력 = 250;
        자동차2.run();
    }
}
class 자동차 {
    int 최고속력;
    void run() {
        System.out.println(최고속력 + "km로 자동차가 달립니다.");
    }
}