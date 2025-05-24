package HashMapImplementation;

public class Client {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Anmol", 5);
        map.put("Rishyank", 8);
        map.put("Hello", 5);
        map.put("Ravi", 4);
        map.put("Om", 2);
        map.put("Hari", 4);

        System.out.println(map.get("Rishyank"));
        map.remove("Rishyank");
        System.out.println(map.get("Rishyank"));
    }
}
