package lec01.calculator04.sixth;

public class Calc06 {

    public static void main(String[] args) {
        int first = 10;
        int second = 50;

        boolean cmpOrCondition = (first == 10) || (second == 50);
        System.out.println("cmpOrCondition : " + cmpOrCondition);

        cmpOrCondition = (first == 20) || (second == 50);
        System.out.println("cmpOrCondition : " + cmpOrCondition); // second가 true -> True

        cmpOrCondition = (first == 20) || (second == 60);
        System.out.println("cmpOrCondition : " + cmpOrCondition); // 둘다 false -> False

        first = 10;
        second = 20;
        boolean cmpAndCondition = ((first < 9) && (second > 21));
        System.out.println("cmpAndCondition : " + cmpAndCondition);

        first = 1;
        second = 5;
        cmpAndCondition = ((first < 1) && (second > 6));
        System.out.println("cmpAndCondition : " + cmpAndCondition);

        cmpAndCondition = ((first < 2) && (second > 6));
        System.out.println("cmpAndCondition : " + cmpAndCondition);


        cmpAndCondition = (first == 10) && (second == 50);
        System.out.println("cmpAndCondition : " + cmpAndCondition);

        cmpAndCondition = (first == 20) && (second == 50);
        System.out.println("cmpAndCondition : " + cmpAndCondition);
    }
}
