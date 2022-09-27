package lec04.OOP01.createEntity.entityArray;

import lec04.OOP01.createEntity.House;

import java.util.List;

public class EntityArrayTest {

    public static void main(String[] args) {
        House[] houseArray = new House[3];
        houseArray[0] = new House();
        houseArray[1] = new House();
        houseArray[2] = new House();

        houseArray[0].airconOn();
        houseArray[1].airconOff();

        System.out.println("0번째 배열 : " + houseArray[0].airconStat);
        System.out.println("1번째 배열 : " + houseArray[1].airconStat);

        House[] houses = new House[] {new House(), new House(), new House()};

        houses[0].airconOn();
        houses[1].airconOff();

        System.out.println("0번째 배열 : " + houses[0].airconStat);
        System.out.println("1번째 배열 : " + houses[1].airconStat);
    }
}
