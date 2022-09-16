package lec02.forlecture;

public class For01 {

    public static void main(String[] args) {

        int[] intArrData1 = new int[5];
        intArrData1[0] = 10;
        intArrData1[1] = 5;
        intArrData1[2] = 3;
        intArrData1[3] = 1;
        intArrData1[4] = 15;

        int intArrDataLength = intArrData1.length;

        for (int x = 0; x < intArrDataLength; x++) {
            int getIntData = intArrData1[x];
            System.out.print("getIntData : " + getIntData + "\t\t");
        }

        System.out.println("\n\n");

        for (int i = 1; i < intArrDataLength - 1; i++) {
            int getIntData = intArrData1[i];
            System.out.print("getIntData : " + getIntData + "\t\t");
        }

        System.out.println("\n\n");

        for (int i = 0; i < intArrDataLength; i+=3) {
            int getIntData = intArrData1[i];
            System.out.print("getIntData : " + getIntData + "\t\t");
        }


    }
}
