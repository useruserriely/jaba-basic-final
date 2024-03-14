package DAY1;

public class ConditionExam2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int result1 = 0;
        int result2 = 0;


        if(num1 >= num2) {
            result1 = num1 - num2;
        }
        if(num1 < num2) {
            result1 = num2 - num1;
        }

        System.out.println(result1);

        if(num1 > num2) {
            result2 = num1 - num2;
        }
        else {
            result2 = num2 - num1;
        }
        System.out.println(result2);
    }
}
