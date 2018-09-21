import java.util.*;
public class UpdateArray {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Apple");
        l.add("Grape");
        l.add("Melon");
        l.add("Berry");
        System.out.println(l);
        int index1 = l.indexOf("Apple");
        int index2 = l.indexOf("Melon");
        l.set(index1, "Kiwi");
        l.set(index2, "Mango");
        System.out.println(l);
        l.clear();
        System.out.println(l);

    }


}
