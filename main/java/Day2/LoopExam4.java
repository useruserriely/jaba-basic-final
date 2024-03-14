package Day2;

public class LoopExam4 {
    // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
    // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
// ex )
// 오름차순 :  1, 2, 3, 4, 5
// 내림차순 :  5, 4, 3, 2, 1
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
// v1
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
// v2
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

    }
}
