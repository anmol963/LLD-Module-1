package revision;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("India", 123);
        map.put(91, "India");

        for(Object key: map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
