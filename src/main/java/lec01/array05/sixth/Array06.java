package lec01.array05.sixth;

import java.util.Arrays;

public class Array06 {

    public static void main(String[] args) {
        String[] strArry1 = new String[] {"서울", "경기", "인천"};

        int arrLength = strArry1.length;
        System.out.println("arrLength : " + arrLength);

        for (int i = 0; i < arrLength; i++) {
            String strValue = strArry1[i];
            System.out.println("strValue : " + strValue);
        }

        int[] intArr1 = new int[] {1, 2, 3};
        int intLength1 = intArr1.length;

        System.out.println("정수형 배열 값 출력 : " + Arrays.toString(intArr1));

        for (int i = 0; i < intLength1; i++) {
            intArr1[i] = i + 5;
        }
        System.out.println("정수형 배열 값 출력 : " + Arrays.toString(intArr1));

    }
}
