import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("A", "Welcome");
        myMap.put("Hello", "ABC");
        myMap.put("123", "VN");
        myMap.put(null, "Hi");

        System.out.println("Truy cap phan tu có key la 'Hello' --> de lay gia tri ra");
        String item = myMap.get("Hello"); // ABC
        System.out.println(item);

        System.out.println("Truy cap phan tu có key la 'null' --> de lay gia tri ra");
        String item2 = myMap.get(null);
        System.out.println(item2); // Hi

        //Tinh chat Map la ko cho phep key trung lap
        myMap.put("A", "Tom"); // ko co loi --> ghi de gia tri
        System.out.println(myMap.get("A")); // Tom

        //Duyet map
        System.out.println("Duyet map");
        System.out.println("In ra tat ca cac keys");
        Set<String> myKeys = myMap.keySet();
        System.out.println(myKeys); // in ra tat ca keys

        System.out.println("In ra tat ca values");
        Collection<String> listValues = myMap.values(); // ep kieu sang ArrayList
        System.out.println(listValues);

        System.out.println("In ra tat ca keys va values");
        for(String key : myKeys) {
            System.out.println(key + " = " + myMap.get(key));
        }

        System.out.println("Duyet bang iterator");
        Set<Map.Entry<String,String>> myEntrySet = myMap.entrySet();
        for(Map.Entry<String,String> entry : myEntrySet) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
            System.out.println(entry);
        }

        System.out.println("Remove key");
        myMap.remove("A");
        System.out.println(myMap.get("A")); // null

        System.out.println("Kiem tra key");
        if(myMap.containsKey("A")) {
            System.out.println(myMap.get("A"));
        } else {
            System.out.println("Not contain key");
        }

    }
}
