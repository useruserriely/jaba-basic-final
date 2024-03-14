package DAY1;

public class Print {
    public static void main(String[] args) {
        // 숫자 출력
        System.out.println(100);
        System.out.println(200);

        // 문자(열) 출력
        System.out.println("박소연");
        System.out.println("박소연2");

        // 줄바꿈 문자 \n
        System.out.println("안녕하세요\n반갑습니다.");

        // 문자 연결
        System.out.println("안녕하세요. 박소연입니다. 반갑습니다.");
        System.out.println("안녕하세요" + "박소연입니다" + "반갑습니다");

        // 숫자 더하기
        System.out.println(100+200);
        System.out.println(1000+2000);

        // 숫자와 문자 구별하기
        System.out.println("100"); // 문자
        System.out.println(100); // 숫자

        // 문자와 숫자는 + 연산 결과가 다르므로 구별해서 사용해야 한다.
        System.out.println("100" + "200"); // 결과 100 200
        System.out.println(100 + 1000000); // 결과 10000100

        // 연산자는 왼쪽에서부터 오른쪽으로 수행
        // 먼저 연산하고 싶을 경우 () 사용
        System.out.println("12341234 + 12344533 = " + 12344 + 34354);
        System.out.println("12341234 + 12344533 = " + (12344 + 34354));

        // 출력문을 한개만 사용하여 구구단 2단 표현
        System.out.println("2 X 1 = " + (2 * 1) + "\n2 X 2 = " + (2 * 2) + "\n2 X 4 = " + (2 * 4) + "\n2 X 5 = " + (2 * 5) + "\n2 X 6 = " + (2 * 6) + "\n2 X 7 = " + (2 * 7) + "\n2 X 8 = " + (2 * 8) + "\n2 X 9 = " + (2 * 9));
    }
}
