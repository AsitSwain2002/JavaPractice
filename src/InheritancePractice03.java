abstract class Animal
{
    abstract public void move();
}
class Cheetah extends Animal
{
    public void move()
    {
        System.out.println("Cheetah is running");
    }
}
public class InheritancePractice03 {
    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        c.move();
    }
}
