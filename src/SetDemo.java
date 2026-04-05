import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Tom");
        mySet.add("Thomas");
        mySet.add("Marry");
        mySet.add("Anna");
        mySet.add("Tom");

        //tinh chat Set ko cho phep phan tu trung lap
        System.out.println(mySet);

        System.out.println("Size: " + mySet.size());

        System.out.println("Remove item");
        mySet.remove("Tom");
        System.out.println(mySet);

        System.out.println("Duyet phan tu");
        //set khong co index
        for(String s : mySet)  {
            System.out.println(s);
        }

        //duyet bang iterator
        System.out.println("duyet bang iterator");
        Iterator<String> iter = mySet.iterator();
        while(iter.hasNext()) {
            String item = iter.next(); // lay gia tri ra
            System.out.println(item);
        }
    }
}
