package lec07.collectionsarrays08;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 5, 3, 1, 2};
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int getValue = Arrays.binarySearch(arr, 1);
        System.out.println("1의 위치는 : " + getValue);
        getValue = Arrays.binarySearch(arr, 5);
        System.out.println("5의 위치는 : " + getValue);

        String[] strArr = new String[]{"서울", "경기", "인천", "전라", "경상", "충청", "강원", "제주"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        int whereIndex1 = Arrays.binarySearch(strArr, "경기");
        int whereIndex2 = Arrays.binarySearch(strArr, "인천");

        System.out.println("경기는 몇번쨰 : " + whereIndex1);
        System.out.println("인천은 몇번쨰 : " + whereIndex2);

        System.out.println();

        String[] strCompany = new String[]{"삼성생명", "한화생명", "교보생명", "DB생명"};
        System.out.println(Arrays.toString(strCompany));
        int whereIsInsu1 = Arrays.binarySearch(strCompany, "한화생명");
        int whereIsInsu2 = Arrays.binarySearch(strCompany, "DB생명");
        System.out.println("한화생명 : " + whereIsInsu1);
        System.out.println("DB생명 : " + whereIsInsu2);

        Arrays.sort(strCompany);
        int isInsu1 = Arrays.binarySearch(strCompany, "한화생명");
        int isInsu2 = Arrays.binarySearch(strCompany, "DB생명");
        System.out.println("한화생명 : " + isInsu1);
        System.out.println("DB생명 : " + isInsu2);

        int[] intArrAlpha = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(intArrAlpha));

        int[] arrCopyOf01 = Arrays.copyOf(intArrAlpha, 7);
        System.out.println("7의 길이까지 복사합니다.");
        System.out.println(Arrays.toString(arrCopyOf01));

        System.out.println("3의 길이까지 복사합니다.");
        int[] arrCopyOf02 = Arrays.copyOf(intArrAlpha, 3);
        System.out.println(Arrays.toString(arrCopyOf02));

        System.out.println();

        System.out.println(Arrays.toString(intArrAlpha));
        System.out.println("인덱스 0이상 3미만");
        int[] arrCopyOfRange1 = Arrays.copyOfRange(intArrAlpha, 0, 3);
        System.out.println(Arrays.toString(arrCopyOfRange1));
        System.out.println("인덱스 2이상 5미만");
        int[] arrCopyOfRange2 = Arrays.copyOfRange(intArrAlpha, 2, 5);
        System.out.println(Arrays.toString(arrCopyOfRange2));

        System.out.println();

        int[] arrFill = new int[3];
        System.out.println("fill() 수행하기 전");
        System.out.println(arrFill);
        Arrays.fill(arrFill, 3);
        System.out.println("fill() 수행 후");
        System.out.println(arrFill);

    }
}
