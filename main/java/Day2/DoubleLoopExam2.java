package Day2;

public class DoubleLoopExam2 {

    // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */

    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */

    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */
    public static void main(String[] args) {
        int y = 5;

        for(int i = 1; i <= y; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
