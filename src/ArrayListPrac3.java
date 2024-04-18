import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac3 {
    public static void main(String[] args) {
        ArrayList<String > al = new ArrayList<>();
        al.add("Asit");
        al.add("Ram");
        al.add("Krishna");
        al.add("Sita");
        al.add("Laxman");

        Collections.sort(al);
        System.out.println(al);
    }
}
