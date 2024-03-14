package Day2;

public class LoopExam2 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i = i +2) {
            System.out.println(i);
        }

        for(int i = 1; i <=100; i++) {
            if(i % 2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }
    }
}
