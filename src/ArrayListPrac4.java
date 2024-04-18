import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPrac4 {
    public List removeDuplicate(ArrayList<Integer> al)
    {
        ArrayList<Integer> al1 = al;
        Integer num = al1.get(0);
        for(int i=0;i<=al.size()-1;i++) {
            num = al1.get(i);
            for (int j = i+1; j <= al1.size() - 1; j++) {
                if (num.equals(al1.get(j))) {
                    al1.remove(al1.get(j));
                }

            }
        }
        return al1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(60);
        al.add(40);
        al.add(60);
        al.add(10);
        al.add(50);

        ArrayListPrac4 alp = new ArrayListPrac4();
        System.out.println("Before removing duplicate");
        System.out.println(al);
        System.out.println("After removing duplicate");
        System.out.println(alp.removeDuplicate(al));
    }
}
