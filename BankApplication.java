

class Account{
    public int a=2000,b=1000,c=0;
    public void deposite(){
        System.out.println("amount deposited"+a);

    }
    public void withdraw(){
        System.out.println("amount withdrawn"+b);

    }
    
    public void checkBalance(){
        c=a-b;
        System.out.println("remaining balance"+c);

    }
}
class SavingsAccount extends Account
{
    public void display(){
        System.out.println("Welcome to Saving Account");
    }
}

class CurrentAccount extends SavingsAccount
{
    public void display1(){
        System.out.println("Welcome to Current Account");
    }
}

class BusinessAccount extends CurrentAccount
{
    public void display2(){
        System.out.println("Welcome to Business Account");
    }
}

class BankApplication
{
    public static void main(String[] args) {
        BusinessAccount obj = new BusinessAccount();
        obj.deposite();
        obj.withdraw();
        obj.display();
        obj.checkBalance();
        obj.display1();
        obj.checkBalance();
        obj.display2();
        obj.checkBalance();


        

    }
}