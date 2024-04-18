import java.util.ArrayList;
import java.util.Iterator;

public class ArryListPrac2 {

    public int sumOfElement(ArrayList<Integer> al)
    {
        int sum=0;
        Iterator itr = al.listIterator();
        while (itr.hasNext())
        {
            int num=(int)itr.next();
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(50);
        al.add(22);

        ArryListPrac2 al2 = new ArryListPrac2();
        System.out.println(al2.sumOfElement(al));
    }
}
