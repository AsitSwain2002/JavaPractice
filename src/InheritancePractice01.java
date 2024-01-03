//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


abstract class Employee
{
    abstract public void work();
    abstract public int getSalary();
}
class HRManager extends Employee
{
    int salary;
    String EmployeeName;
    HRManager(int salary1 , String EmployeeName1)
    {
        this.salary = salary1;
        this.EmployeeName = EmployeeName1;
    }
    public void work()
    {
        System.out.println("Eployee working");
    }
    public int getSalary()
    {
        return salary;
    }
    public void getEmployee()
    {
        System.out.println(EmployeeName);
    }

}
class InheritancePractice01
{
    public static void main(String[] args)
    {
        HRManager h = new HRManager(25000,"Asit");
        h.getEmployee();
        System.out.println(h.getSalary());
        h.work();
    }
}