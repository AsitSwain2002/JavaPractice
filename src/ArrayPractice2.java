import java.util.Scanner;
public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {24,25,4,2,6,9,8,7,55,421,88,33,66,44,88,22,66,75};
        System.out.println("Enter a number to check ");
        int x = sc.nextInt();
        int count=0;
        for (int x1:a) {
            if (x1 == x) {
                count++;
            }
        }
        if (count>0){
        System.out.println(x+" is present");
        }
        else
     {
        System.out.println(x+" is not present");
     }

    }
}
