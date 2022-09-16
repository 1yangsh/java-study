package lec01.calculator04.first;

public class Calc01 {

    public static void main(String[] args) {

        byte sumByte1 = 2 + 2;
        short sumShor1 = 3 + 5;
        int sumInt1 = 1 + 2;
        float sumFloat1 = 1.23f + 2.345f;
        double sumDouble = 1.1 + 2.345;

        System.out.println("sumByte1 : " + sumByte1);
        System.out.println("sumShor1 : " + sumShor1);
        System.out.println("sumInt1 : " + sumInt1);
        System.out.println("sumFloat1 : " + sumFloat1);
        System.out.println("sumDouble : " + sumDouble);

        int minInt = 2 - 1;
        System.out.println("minInt : " + minInt);

        double mulDbl = 10.1 * 2;
        System.out.println("mulDbl : " + mulDbl);

        float divFlt1 = 10.0f / 3.0f;
        System.out.println("divFlt1 : " + divFlt1);  // 3.333333

        float divFlt2 = 10 / 3;  // 정수형으로 계산할 경우, 소수점까지 나오지 않는다
        System.out.println("divFlt2 : " + divFlt2);  // 3.0

        double restDbl = 10.0 % 3.0;
        System.out.println("restDbl : " + restDbl);

    }
}
