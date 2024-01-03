//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
abstract class BankAccount
{
    abstract public void deposite(float value);
    abstract public void withdraw(float amount);
    abstract public float getBalance();
}
class SavingAccount extends BankAccount
{
    float balance;

    SavingAccount(float balance1)
    {
        this.balance += balance1;
    }
    public void deposite(float value)
    {
        System.out.println(value+" Deposited");
        balance+=value;
    }
    public void withdraw(float amount)
    {
        if (balance>=100){
            System.out.println(amount+" money withdraw");
            balance-= amount;
        }
        else {
            System.out.println("Balance is below minimum balance(100)");
        }
    }
    public float getBalance()
    {
        return balance;
    }
}
class InheritancePractice02
{
    public static void main(String[] args)
    {
        SavingAccount s = new SavingAccount(500);
        s.withdraw(200);
        s.deposite(750);
        System.out.println("Your Balance is : "+s.getBalance());
    }
}
