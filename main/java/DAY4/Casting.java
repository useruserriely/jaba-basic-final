package DAY4;

public class Casting {
    public static void main(String[] args) {
        // 자바의 기본 타입 형변환
        // 자바의 대전제 > 변수에는 오직 변수와 일치하는 타입의 값만 저장 가능
        int a = 10; // 형변환 x
        double b = 10; // 형변환 o > int가 doouble로 바뀜 > 자바가 바꿔줌(자동형변환)

        int c = (int)3.14; // 형변환 o > double이 int로 바뀌려면 소수점 떼야됨(수도형변환)
        System.out.println(c);

        // 객체타입형변환
        // 자바상속 > 상위타입을 바탕으로 하위 타입 생성 > 동물을 바탕으로 고양이 생성
        // 상속관계에서 하위 타입은 상위타입으로 형변환 가능. 그 반대는 불가능

        Cat c1 = new Cat();
        c1.breathe();

        Animal a1 = new Animal();
        a1.breathe();

        Animal a2 = c1; // 하위타입이 상위타입으로 모습을 바꾸는 건 괜찮아서 자동형변환이 일어남
        a2.breathe();
        a2.eat();

        // a2 = new Dog()l

        Cat c2 = (Cat)a2; // 자동 형변환x, a2에는 cat과 dog가 들어있을 수 있기 때문에 cat이라고 확신할 수 없다
        c2.meow(); // 상위 타입을 하위 타입으로 바꾸는건 위험하기 때문에 개발자가 직접 수동형변환을 해야함.

    }
}
class Apple {

}
