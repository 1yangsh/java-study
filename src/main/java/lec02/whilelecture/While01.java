package lec02.whilelecture;

public class While01 {

    public static void main(String[] args){

        int markIndex = 0;
        while (markIndex < 5) {
            System.out.println(markIndex);
            markIndex++;
        }

        String[] strCountryArr = new String[] {"한국", "미국", "중국", "일본", "러시아", "베트남", "인도네시아", "필리핀"};
        markIndex = 0;

        int countryLength = strCountryArr.length;
        while (markIndex < countryLength) {
            System.out.println("index : " + markIndex + " 나라 이름 : " + strCountryArr[markIndex]);
            markIndex++;
        }
        System.out.println("\n\n");

        markIndex = 0;
        while (markIndex < countryLength) {
            if (markIndex == 2) {
                break;
            }
            String strCountry = strCountryArr[markIndex];
            System.out.println("country : " + strCountry);
            markIndex++;
        }

        System.out.println("\n\n");
        markIndex = 0;
        System.out.println("2의 배수에 continue를 수행합니다.");
        while (markIndex < countryLength) {
            if (markIndex % 2 == 0) {
                markIndex++;
                continue;
            }
            String strCountry = strCountryArr[markIndex];
            System.out.println("country : " + strCountry);
            markIndex++;
        }
    }
}
