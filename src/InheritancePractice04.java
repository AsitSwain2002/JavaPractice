class Person
{
    String FirstName;
    String LastName;
    Person( String FirstName1,String LastName1)
    {
        this.FirstName = FirstName1;
        this.LastName = LastName1;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
}
class Employee extends Person
{
    int id;
    String JobTitle;
    Employee(String FirstName1,String LastName1,int id1, String JobTitle1)
    {
        super(FirstName1,LastName1);
           this.id = id1;
           this.JobTitle = JobTitle1;
    }
    public String getLastName()
    {
        return super.LastName + " ( Job :"+JobTitle+")";
    }
    public int getEmployeeId() {
        return id;
    }
}

public class InheritancePractice04 {
    public static void main(String[] args) {
       Employee e = new Employee("Asit","Swain",101,"FullStack Devloder");
        System.out.print("id :"+e.getEmployeeId()+" ");
        System.out.print("Name :"+e.getFirstName()+" ");
        System.out.print(e.getLastName());
        System.out.println();
        Employee e1 = new Employee("Uzumaki","Naruto",102,"Frontend Devloder");
        System.out.print("id :"+e1.getEmployeeId()+" ");
        System.out.print("Name :"+e1.getFirstName()+" ");
        System.out.print(e1.getLastName());

    }
}
