package DAY3;

public class Parameter {
    // 함수 정의 > 변수
    public static void plus(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public static void main(String[] args) {
        // 함수 호출 > 값(인자, argument)
        plus(10, 20);
        plus(30, 40);

        multiply(10, 20);
        multiply(5,5);

        // 인자의 개수와 매개변수의 개수는 일치해야 합니다.


    }
}
