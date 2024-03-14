package DAY5;

public class ConstructorChainExam {
    public static void main(String[] args) {
        new people();
        // 아래와 같이 출력되게 해주세요.

        // Animal(String 이름, int 나이) 실행됨!
        // 이름 : 홍길동
        // 나이 : 27
    }
}

class Animal {

    Animal(String 이름) {
        System.out.println("Animal(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    Animal(String 이름, int 나이) {
        System.out.println("Animal(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class people extends Animal {
    people() {
        super("홍길동", 27); // super는 하위클래스에서 상위 클래스의 생성자 또는 멤버에 접근할 때 사용됨
    }

}