package homework4;
/**
 * Java Prof. Homework #4
 *
 * @author Liudmyla Zhlobinska
 * @version 10.11 - 11.11
 */

import java.util.*;

public class homework4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("AAA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.remove("BB");
        list.add(2, "BB");
        list.add(2, "BB");

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        Map<String, String> map = new HashMap<>();
        map.put("Prague", "CZ");
        map.put("Berlin", "DE");
        System.out.println(map);
        System.out.println(map.get("Brno"));


    }
}
