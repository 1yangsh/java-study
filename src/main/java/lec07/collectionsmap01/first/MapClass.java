package lec07.collectionsmap01.first;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {

    public static void main(String[] args) {

        Map<String, Object> sampleMap = new HashMap<String, Object>();

        sampleMap.put("과일", "바나나");
        sampleMap.put("견과", "호두");
        sampleMap.put("곡물", "쌀");
        sampleMap.put("채소", "토마토");
        sampleMap.put("돈육", "삼겹살");

        System.out.println(sampleMap.toString());

        Object chicken = sampleMap.get("계육");
        System.out.println(chicken);

        boolean isChicken = sampleMap.containsKey("계육");
        boolean isFreshLeg = sampleMap.containsValue("다리살");

        System.out.println(isChicken);
        System.out.println(isFreshLeg);

        Set<Map.Entry<String, Object>> entries = sampleMap.entrySet();
        Set<String> keySetstrings = sampleMap.keySet();
        boolean isEmpty = sampleMap.isEmpty();
        Collection<Object> values = sampleMap.values();
        int size = sampleMap.size();

        System.out.println("entries : " + entries);
        System.out.println("keySetstrings : " + keySetstrings);
        System.out.println("isEmpty : " + isEmpty);
        System.out.println("values : " + values);
        System.out.println("size : " + size);

        System.out.println("================================================");

        Map<String, Object> copyMap = new HashMap<String, Object>();
        boolean empty = copyMap.isEmpty();
        System.out.println("copyMap is empty : " + empty);

        copyMap.putAll(sampleMap);
        boolean equals = sampleMap.equals(copyMap);

        System.out.println("is equaul : " + equals);

    }
}
