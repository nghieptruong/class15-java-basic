import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //khai bao array list
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Tom");
        listString.add("Thomas");
        listString.add("Anna");
        listString.add("John");

        System.out.println(listString);

        System.out.println("Remove item");
        listString.remove("Thomas");
        System.out.println("Size: " + listString.size());
        System.out.println(listString);

        System.out.println("Duyêt phan tu trong array list");
        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }

        System.out.println("Sap xep --> tang dan");
        Collections.sort(listString);
        System.out.println(listString);

        System.out.println("Duyet phan tu bang for each");
        for(String s : listString) {
            System.out.println(s);
        }

        System.out.println("Add duplicate item");
        listString.add("Tom");
        System.out.println(listString);
    }
}
