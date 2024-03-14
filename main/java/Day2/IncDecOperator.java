package Day2;

public class IncDecOperator {
    public static void main(String[] args) {
        // 증감연산자
        int num = 10;
        System.out.println(num + 5);
        System.out.println(num);

        // 변수의 값을 5증가시키고 싶다
        // num = 15; // 증가x
        num = num + 5;
        num += 5; // 위와 같은 표현

        num += 1;
        num ++; // 위와 같은 표현

        num -= 1; // 감소값이 1인 경우에 한
        num --;

        System.out.println(num);
    }
}
