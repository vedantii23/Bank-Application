
interface  Account{
    final int a=2000,b=1000;
     void deposite();
     void withdraw();
    void checkBalance();
}
interface SavingsAccount extends Account
{
   
     void display();
}

interface CurrentAccount extends SavingsAccount
{
     void display1();
}

interface  BusinessAccount extends CurrentAccount
{
     void display2();
}
class Extra implements BusinessAccount{
    public int c=0;
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
    
    public void display(){
        System.out.println("Welcome to Saving Account");
    }
    
    public void display1(){
        System.out.println("Welcome to Current Account");
    }
    
    public void display2(){
        System.out.println("Welcome to Business Account");
    }

} 
class BankApplication2
{
    public static void main(String[] args) {
        Extra obj = new Extra();
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