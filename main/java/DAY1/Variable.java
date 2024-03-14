package DAY1;

public class Variable {
    public static void main(String[] args) {
        // 변수
        // 변수는 데이터를 저장하는 공간(그릇)

        // 변수 선언
        // 변수 타입 변수명
        // 숫자형 변수 선언
        // int 정수
        int number;

        // 변수에 값 저장
        number = 100; // 변수가 왼쪽, 저장 대상이 오른쪽

        // 40 = number; // 안됨
        number = 300;
        number = 400;

        int number2;
        number2 = 64554; // 숫자 변수에 문자를 저장하려고 하면 안됨

        String str;
        str = "박소연";

        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number2);

        String name;
        name = "박소연";

        System.out.println(name);
        System.out.println(name);

        // 자기소개 10번 출력
        // 안녕하세요 00살 00입니다.

        int age;
        age = 28;

        String name3;
        name = "박소연";

        System.out.println("안녕하세요" + age + " 살" + name + " 입니다.");

    }
}
