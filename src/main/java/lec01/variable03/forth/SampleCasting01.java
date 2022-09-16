package lec01.variable03.forth;

public class SampleCasting01 {

    public static void main(String[] args) {

        double dbValue = 3.12341234;
        int intValue = (int) dbValue;  // 형변환

        System.out.println("intValue : " + intValue);

        int intValue1 = 3;
        double dbValue1 = (double) intValue1;

        System.out.println("dbValue1 : " + dbValue1);

        char smapleChar1 = 'a';
        System.out.println("sampleChar1 : " + smapleChar1);

        int sampleCharsInt = (int) smapleChar1;
        System.out.println("sampleCharsInt : " + sampleCharsInt);

        char sampleChar2 = '가';
        int sampleCharsInt2 = (int) sampleChar2;
        System.out.println("sampleCharsInt2 : " + sampleCharsInt2);

        int cvtInt1 = 97;
        char cvtChar1 = (char) cvtInt1;
        int cvtInt2 = 44032;
        char cvtChar2 = (char) cvtInt2;

        System.out.println("cvtChar1 : " + cvtChar1);
        System.out.println("cvtChar2 : " + cvtChar2);
     }
}
