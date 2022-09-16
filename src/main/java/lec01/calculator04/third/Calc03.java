package lec01.calculator04.third;

public class Calc03 {

    public static void main(String[] args) {

        int var1 = 10;
        int sum1 = var1++;
        System.out.println("sum1 : " + sum1); // 10 (변화 없음)

        int var2 = 10;
        int sum2 = ++var2;
        System.out.println("sum2 : " + sum2); // 11

        int var3 = 10;
        int min1 = var3--;

        int var4 = 10;
        int min2 = --var4;

        System.out.println("min1 : " + min1); // 10 (변화 없음)
        System.out.println("min2 : " + min2); // 9
    }
}
