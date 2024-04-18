import java.util.*;


class ArrayListPrac1{

    public List commonAl(List al1,List al2)
    {
        ArrayList al = new ArrayList();
        for(int i=0;i<=al1.size()-1;i++)
        {
            for(int j=0;j<=al2.size()-1;j++)
            {
                if(al1.get(i).equals(al2.get(j)))
                {
                    al.add(al1.get(i));
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(40);
        al.add(60);
        al.add(10);
        al.add(50);
        ArrayList<Integer> al2 = new ArrayList<>();
        Integer max=  al.get(0);
//       for(int i= 1;i<=al.size()-1;i++)
//       {
//           if(max<al.get(i))
//           {
//               al2.add(al.get(i));
//           }
//       }
        Collections.sort(al);
        Collections.reverse(al);
//        System.out.println(al);
        System.out.println("Second Largest Number is : "+al.get(1));

    }
}
