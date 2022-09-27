package lec04.OOP01.createEntity;

public class HouseTest {
    public static void main(String[] args) {

        House house = new House(); // 만들어진 객체의 정보는 메모리에 저장, house 변수에는 메모리 주소값 저장
        House houseAnother = new House();
        System.out.println("에어컨 : " + house.airconStat);
        System.out.println("에어컨 Another : " + houseAnother.airconStat);

        house.airconOn();
        System.out.println("에어컨 : " + house.airconStat);
        System.out.println("에어컨 Another : " + houseAnother.airconStat);

        house.airconOff();
        System.out.println("에어컨 : " + house.airconStat);
        System.out.println("에어컨 Another : " + houseAnother.airconStat);

    }
}
