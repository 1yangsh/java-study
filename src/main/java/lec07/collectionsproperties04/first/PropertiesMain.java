package lec07.collectionsproperties04.first;

import java.util.Properties;
import java.util.Set;

public class PropertiesMain {

    public PropertiesMain() {
    }

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put(1, "LNG");
        properties.put(2, "LPG");
        properties.put(3, "석탄");
        properties.put(4, "석유");
        properties.put(5, "풍력");
        properties.put(6, "태양광");
        properties.put(7, "태양열");
        properties.put(8, "지열");
        System.out.println(properties);

        properties.put(2, "석유가스");
        System.out.println("수정된 데이터 확인");
        System.out.println(properties);

        properties.remove(2);
        System.out.println("삭제 후 데이터");
        System.out.println(properties);

        Object oneObject = properties.get(1);
        System.out.println("하나의 자료 : " + oneObject);

        int size = properties.size();
        for (int i = 0; i < size; i++) {
            Object o = properties.get(i);
            System.out.println("값 : " + 0);
        }

        properties = new Properties();

        properties.put("1", "생산");
        properties.put("2", "인사");
        properties.put("3", "회계");
        properties.put("4", "영업");
        properties.put("5", "구매");
        properties.put("6", "기획");
        properties.put("7", "재무");

        Set<Object> objects = properties.keySet();
        System.out.println("데이터 확인");
        for (Object o : objects) {
            String property = properties.getProperty((String) o);
            System.out.println("값 : " + property);
        }
    }
}
