public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] a = {21,52,88,6,2,75,85,65};
        double avg ,count=0;
        for (int i = 0;i< a.length;i++)
        {
            count+=a[i];
        }
        avg=(double)count/a.length;
        System.out.println(avg);
    }
}
