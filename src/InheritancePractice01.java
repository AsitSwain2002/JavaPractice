


class InheritancePractice01
{
    public static void main(String[] args)
    {
      SavingAccount s = new SavingAccount(500);
          s.withdraw(200);
          s.deposite(750);
        System.out.println("Your Balance is : "+s.getBalance());
    }
}