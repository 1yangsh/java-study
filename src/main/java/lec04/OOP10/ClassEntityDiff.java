package lec04.OOP10;

public class ClassEntityDiff {

    int normalValue = 10;
    static int staticValue = 20;

    int NormalValue2 = staticValue;
    // static 전역변수에는 일반 전역변수를 담을 수 없다
    // static staticValue2 = normlaValue;

    static void callStaticMethod() {
        // static method는 static 변수만 쓸 수 있다.
        System.out.println(staticValue);
//        System.out.println(normalValue);
    }

    void callNormalMethod() {
        System.out.println(staticValue);
        System.out.println(normalValue);
    }

    static void sampleStaticMethod() {
        System.out.println("스태틱 메서드.");

    }

    void sampleNormalMethod() {
        System.out.println("일반 메서드.");
    }

    static void doStaticMethod() {
        sampleStaticMethod();
    }

    void doNormalMethod() {
        // static, 일반 메서드 둘다 호출 가능
        sampleStaticMethod();
        sampleNormalMethod();
    }

}
