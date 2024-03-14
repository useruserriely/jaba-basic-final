package Day2;

public class ArrayExam1 {
    // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
    public static void main(String[] args) {
        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr2[i] = (i + 1) * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i]);
        }
// 배열을 두번 출력해주세요.
        int[] arr = {1,2,3,4,5};
        for(int j = 0; j < 2; j++) {
            for(int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        }
        // 배열에 5개 값을 입력하고 거꾸로 출력해주세요.
        // 순번. 순서 > 인덱스
        System.out.println(arr[4]);
        System.out.println(arr[3]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]);

        for(int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
