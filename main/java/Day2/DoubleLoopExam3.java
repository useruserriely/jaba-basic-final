package Day2;

public class DoubleLoopExam3 {
    public static void main(String[] args) {
        int y = 5;

        for(int i = 1; i <= y; i++) {
            for(int j = 1; j <= y-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
